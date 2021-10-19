package com.solvd.university;

import com.solvd.university.impl.EnrollmentServiceImpl;
import com.solvd.university.impl.InformationCommiteeServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) throws PersonInvalidDataException {
        Logger logger = LogManager.getLogger(Main.class);

        List<City> cities = new ArrayList<>();
        cities.add(new City("Minsk"));
        cities.add(new City("Pinsk"));
        cities.add(new City("Brest"));

        List<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject("Mathematics"));
        subjects.add(new Subject("Russian Language"));
        subjects.add(new Subject("Belarussian Language"));
        subjects.add(new Subject("History"));
        subjects.add(new Subject("Informatics"));

        List<Department> departments = new ArrayList<>();

        List<Specialization> specializations = new ArrayList<>();
        try {
            specializations.add(new Specialization("Automation of technological processes and productions"));
            specializations.add(new Specialization("Intelligent devices, machines and production"));
            specializations.add(new Specialization("Computer mechatronics"));
            specializations.add(new Specialization("Design and operation of nuclear power plants"));
            specializations.add(new Specialization("Industrial thermal power engineering"));
            specializations.add(new Specialization("Relay protection sand automation"));
        } catch (SpecialisationInvalidDataException e) {
            logger.error("Exception when try to initialise specialisation array", e);
        } finally {
            logger.debug("Finish specialisation's array initialisation");
        }

        List<Specialization> automativeSpecialisations = new ArrayList<>();
        automativeSpecialisations.add(specializations.get(0));
        automativeSpecialisations.add(specializations.get(1));
        automativeSpecialisations.add(specializations.get(2));

        List<Specialization> mechEngineerSpec = new ArrayList<>();
        mechEngineerSpec.add(specializations.get(3));
        mechEngineerSpec.add(specializations.get(4));
        mechEngineerSpec.add(specializations.get(5));

        departments.add(new Department("Automative", automativeSpecialisations));
        departments.add(
                new Department(
                        "Mechanical Engineering",
                        mechEngineerSpec
                )
        );

        University university =
                new University("Garvard", new Date("03/04/1988"), cities.get(0), departments);

        List<SpecializationPlan> specializationPlans = new ArrayList<>();
        specializationPlans.add(new FullTimeSpecializationPlan(specializations.get(0), 10, 200));
        specializationPlans.add(new FullTimeSpecializationPlan(specializations.get(1), 0, 140));
        specializationPlans.add(new FullTimeSpecializationPlan(specializations.get(1), 40, 230));
        specializationPlans.add(new FullTimeSpecializationPlan(specializations.get(2), 20, 240));
        specializationPlans.add(new FullTimeSpecializationPlan(specializations.get(3), 15, 3000.21, 54, 300));
        specializationPlans.add(new DistanceSpecializationPlan(specializations.get(5), 50, 433.99));

        List<Certificate> certificates = new ArrayList<>();
        certificates.add(new CentralizeTestingCertificate(100000000, subjects.get(0), 70));
        certificates.add(new CentralizeTestingCertificate(153663000, subjects.get(1), 40));
        certificates.add(new CentralizeTestingCertificate(646577800, subjects.get(4), 55));
        certificates.add(new HighSchoolCertificate(816247800, 7));

        EmployeePosition employeePosition = new EmployeePosition("Manager");

        Employee employee = null;
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
                new BachelorEntrantForm(65, entrant, specializationPlans.get(0), true, employee, LocalDate.of(2021, 8, 2), certificates);

        EntrantForm masterEntrantForm =
                new MasterEntrantForm(
                        1355235,
                        entrant,
                        specializationPlans.get(2),
                        false,
                        employee,
                        LocalDate.of(2020, 6, 30),
                        specializations.get(1),
                        LocalDate.now()
                );

        EnrollmentService enrollmentService = new EnrollmentServiceImpl(specializationPlans);
        InformationCommiteeService informationCommiteeService = new InformationCommiteeServiceImpl();
        logger.info("Available specialisations:");
        logger.info(enrollmentService.getAvailableSpecialisations("distance").toString());

        try {
            Person dekan = new Employee("Kolesnikov", "Mikhail", new EmployeePosition("Dekan"));
            Person abiturient = new Entrant("Pupkin", "Vasya", LocalDate.of(1999, 5, 26));
        } catch (PersonInvalidDataException e) {
            logger.error("Person data is not valid", e);
        } finally {
            logger.debug("Finish entrant initialisation");
        }

        logger.info("\n##### example of the operation of the control class #####");
        logger.info(informationCommiteeService.getEducationIntstituteInfo(university));
        logger.info(
                informationCommiteeService.getSpecializationPlanInfo(specializationPlans.get(3)));
        logger.info(informationCommiteeService.getPersonShortName(employee));

        logger.info("###### Interface using example ######");
        for (Accessible a : specializationPlans) {
            logger.info(String.format("Is free places accessible: %b", a.isFreePlacesAccessible()));
            logger.info(String.format("Is paid places accessible: %b", a.isPaidPlacesAccessible()));
        }

        boolean validationResult = informationCommiteeService.isValidDocument(bachelorEntrantForm);
        logger.info(String.format("Baachelor's entrant form is: %s", validationResult ? "VALID" : "INVALID"));

        logger.info(informationCommiteeService.askAboutCurrentDateTime(entrant));

        logger.info(String.format("Can entrable to high education: %b", enrollmentService.canEntrableToHighEducation(entrant)));

        logger.info("Abbreviation: " + informationCommiteeService.getAbbreviation(university));

        logger.info("Example with try with resourcces");
        try (Unnessesary unnessesary = new Unnessesary()) {
            logger.debug("Do something in try with resources");
        }

        logger.info("##### Generics using example #####");
        Folder<EntrantForm> entrantFormFolder2021 = new Folder<>();
        entrantFormFolder2021.addDocument(bachelorEntrantForm);
        entrantFormFolder2021.addDocument(masterEntrantForm);

        Map<Employee, String> employeeAnswers = new HashMap<>();
        employeeAnswers.put(new Employee("Vasya", "Pupkin", employeePosition), "We can upgrade our computers");
        employeeAnswers.put(new Employee("Inna", "Ivanovna", employeePosition), "We can improve our skills");
        Survey<Employee> employeesSurvey = new Survey<>("What can be improved", "All)", employeeAnswers);
        logger.debug(employeesSurvey.getResults());

        Set<FullTimeSpecializationPlan> fullTimeSpecializationPlans = new HashSet<>();
        fullTimeSpecializationPlans.add(new FullTimeSpecializationPlan(specializations.get(4), 40, 3));
        fullTimeSpecializationPlans.add((FullTimeSpecializationPlan) specializationPlans.get(1));
        FinalEntrantPlan<FullTimeSpecializationPlan> fullTimePlan2021 = new FinalEntrantPlan<>(fullTimeSpecializationPlans, LocalDate.of(2021, 1, 1), employee);
        logger.debug(fullTimePlan2021.getYearPlan());
    }
}
