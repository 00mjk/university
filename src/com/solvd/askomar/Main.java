package com.solvd.askomar;

import com.solvd.askomar.university.*;
import com.solvd.askomar.university.impl.EnrollmentServiceImpl;
import com.solvd.askomar.university.impl.InformationCommiteeServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.setProperty("log4j.configurationFile", "log4j2.xml");

        Logger logger = LogManager.getLogger(Main.class);

        City[] cities = new City[3];
        cities[0] = new City("Minsk");
        cities[1] = new City("Pinsk");
        cities[2] = new City("Brest");

        Subject[] subjects = new Subject[5];
        subjects[0] = new Subject("Mathematics");
        subjects[1] = new Subject("Russian Language");
        subjects[2] = new Subject("Belarussian Language");
        subjects[3] = new Subject("History");
        subjects[4] = new Subject("Informatics");

        Department[] departments = new Department[2];

        Specialization[] specializations = new Specialization[6];
        try {
            specializations[0] =
                    new Specialization("Automation of technological processes and productions");
            specializations[1] = new Specialization("Intelligent devices, machines and production");
            specializations[2] = new Specialization("Computer mechatronics");
            specializations[3] = new Specialization("Design and operation of nuclear power plants");
            specializations[4] = new Specialization("Industrial thermal power engineering");
            specializations[5] = new Specialization("Relay protection sand automation");
        } catch (SpecialisationInvalidDataException e) {
            logger.error("Exception when try to initialise specialisation array", e);
        } finally {
            logger.debug("Finish specialisation's array initialisation");
        }
        departments[0] =
                new Department(
                        "Automative",
                        new Specialization[]{specializations[0], specializations[1], specializations[2]}
                );
        departments[1] =
                new Department(
                        "Mechanical Engineering",
                        new Specialization[]{specializations[3], specializations[4], specializations[5]}
                );

        University university =
                new University("Garvard", new Date("03/04/1988"), cities[0], departments);

        SpecializationPlan[] specializationPlans = new SpecializationPlan[specializations.length];
        specializationPlans[0] = new FullTimeSpecializationPlan(specializations[0], 10, 200);
        specializationPlans[1] = new FullTimeSpecializationPlan(specializations[1], 0, 140);
        specializationPlans[2] = new FullTimeSpecializationPlan(specializations[2], 40, 230);
        specializationPlans[3] = new FullTimeSpecializationPlan(specializations[3], 20, 240);
        specializationPlans[4] =
                new FullTimeSpecializationPlan(specializations[4], 15, 3000.21, 54, 300);
        specializationPlans[5] = new DistanceSpecializationPlan(specializations[5], 50, 433.99);

        Certificate[] certificates = new Certificate[4];
        certificates[0] = new CentralizeTestingCertificate(2307342, subjects[0], 70);
        certificates[1] = new CentralizeTestingCertificate(35225, subjects[1], 40);
        certificates[2] = new CentralizeTestingCertificate(8492, subjects[4], 55);
        certificates[3] = new HighSchoolCertificate(5902, 7);

        EmployeePosition employeePosition = new EmployeePosition("Manager");
        // TODO Resolve
        Person employee = null;
        Entrant entrant = null;
        try {
            employee = new Employee("Kamarouski", "Andrei", "Sergeevich", employeePosition);
            entrant = new Entrant("Kamarouski", "Andrei", "Sergeevich", LocalDate.of(1998, 4, 27));
        } catch (PersonInvalidDataException e) {
            logger.error("Entrant initialisation failed", e);
        } finally {
            logger.debug("Finish entrant initialisation");
        }
        EntrantForm bachelorEntrantForm =
                new BachelorEntrantForm(1234124, entrant, specializationPlans[0], true, (Employee) employee, LocalDate.of(2021, 10, 2), certificates);

        EntrantForm masterEntrantForm =
                new MasterEntrantForm(
                        1355235,
                        entrant,
                        specializationPlans[2],
                        false,
                        (Employee) employee,
                        LocalDate.of(2020, 6, 30),
                        specializations[1],
                        LocalDate.now()
                );

        EnrollmentService enrollmentService = new EnrollmentServiceImpl(specializationPlans);
        InformationCommiteeService informationCommiteeService = new InformationCommiteeServiceImpl();
        System.out.println("Available specialisations:");
        System.out.println(Arrays.toString(enrollmentService.getAvailableSpecialisations("distance")));

        try {
            Person dekan = new Employee("Kolesnikov", "Mikhail", new EmployeePosition("Dekan"));
            Person abiturient = new Entrant("Pupkin", "Vasya", LocalDate.of(1999, 5, 26));
        } catch (PersonInvalidDataException e) {
            logger.error("Person data is not valid", e);
        } finally {
            logger.debug("Finish entrant initialisation");
        }

        System.out.println("\n##### example of the operation of the control class #####");
        System.out.println(informationCommiteeService.getEducationIntstituteInfo(university));
        System.out.println(
                informationCommiteeService.getSpecializationPlanInfo(specializationPlans[3]));
        System.out.println(informationCommiteeService.getPersonShortName(employee));

        System.out.println("###### Interface using example ######");
        Accessible[] accessible = specializationPlans;
        for (Accessible a : accessible) {
            System.out.println(String.format("Is free places accessible: ", a.isFreePlacesAccessible()));
            System.out.println(String.format("Is paid places accessible: ", a.isPaidPlacesAccessible()));
        }

        boolean validationResult = informationCommiteeService.isValidDocument(bachelorEntrantForm);
        System.out.println(String.format("Baachelor's entrant form is: %s", validationResult ? "VALID" : "INVALID"));

        System.out.println(informationCommiteeService.askAboutCurrentDateTime(entrant));

        System.out.println(String.format("Can entrable to high education: %b", enrollmentService.canEntrableToHighEducation(entrant)));

        System.out.println("Abbreviation: " + informationCommiteeService.getAbbreviation(university));
    }
}
