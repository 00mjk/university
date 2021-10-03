package com.solvd.askomar;

import com.solvd.askomar.university.*;

import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        City[] cities = new City[2];
        cities[0] = new City("Minsk");
        cities[1] = new City("Pinsk");

        Subject[] subjects = new Subject[5];
        subjects[0] = new Subject("Mathematics");
        subjects[1] = new Subject("Russian Language");
        subjects[2] = new Subject("Belarussian Language");
        subjects[3] = new Subject("History");
        subjects[4] = new Subject("Informatics");

        EmployeePosition employeePosition = new EmployeePosition("Manager");
        Employee employee = new Employee("Kamarouski", "Andrei", "Sergeevich", employeePosition);
        employee.printFullNameToConsole();

        University university = new University("Garvard", cities[0], new Date("03/04/1988"));

        Department[] departments = new Department[2];
        departments[0] = new Department("Automative");
        departments[1] = new Department("Mechanical Engineering");

        university.setDepartaments(departments);

        Specialization[] specializations = new Specialization[6];
        specializations[0] = new Specialization("Automation of technological processes and productions");
        specializations[1] = new Specialization("Intelligent devices, machines and production");
        specializations[2] = new Specialization("Computer mechatronics");
        specializations[3] = new Specialization("Design and operation of nuclear power plants");
        specializations[4] = new Specialization("Industrial thermal power engineering");
        specializations[5] = new Specialization("Relay protection sand automation");

        departments[0].setSpecializations(new Specialization[] {specializations[0], specializations[1], specializations[2]});
        departments[1].setSpecializations(new Specialization[] {specializations[3], specializations[4], specializations[5]});

        SpecializationPlan[] specializationPlans = new SpecializationPlan[specializations.length];
        specializationPlans[0] = new SpecializationPlan(specializations[0], 10, 200);
        specializationPlans[1] = new SpecializationPlan(specializations[1], 20, 140);
        specializationPlans[2] = new SpecializationPlan(specializations[2], 40, 31, 500.12);
        specializationPlans[3] = new SpecializationPlan(specializations[3], 20, 5, 1000.99);
        specializationPlans[4] = new SpecializationPlan(specializations[4], 15, 3, 300.77);
        specializationPlans[5] = new SpecializationPlan(specializations[5], 50, 20, 433.99);

        EnrollmentService enrollmentService = new EnrollmentService(specializationPlans);

        Certificate[] certificates = new Certificate[4];
        certificates[0] = new Certificate(2307342, subjects[0], 70);
        certificates[1] = new Certificate(35225, subjects[1], 40);
        certificates[2] = new Certificate(8492, subjects[4], 55);
        certificates[3] = new Certificate(5902, subjects[3], 77);

        Entrant entrant = new Entrant("Kamarouski", "Andrei", "Sergeevich", LocalDateTime.of(1998, 4, 27, 12, 9, 2), certificates);

        System.out.println("Entrant amount: " + Entrant.getEntrantAmount());

        SpecializationPlan[] availableFreeSpecialisations = enrollmentService.getAvailableSpecialisations(entrant);
        for(int i = 0; i < availableFreeSpecialisations.length; i++) {
            if(availableFreeSpecialisations[i] != null) {
                System.out.println(availableFreeSpecialisations[i].getSpecialization().getName());
            }
        }

        System.out.println("Can entrant go to: "  + specializationPlans[2].getSpecialization().getName() + " - " + enrollmentService.isCanEnrollToSpecialisation(entrant, specializationPlans[2]));
        System.out.println("\n");
        System.out.println(university.getFullUnivercityInfo());
        System.out.println(university.getDepartamentsByString());
    }
}
