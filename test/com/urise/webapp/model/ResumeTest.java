package com.urise.webapp.model;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class ResumeTest {
    public static void main(String[] args) {
        Resume R1 = new Resume("uuid1", "Name1");
        Resume R2 = new Resume("uuid2", "Name2");
        Resume R3 = new Resume("uuid3", "Name3");
        Resume R4 = new Resume("uuid4", "Name4");

        R1.addContact(ContactType.MAIL, "mail1@ya.ru");
        R1.addContact(ContactType.PHONE, "11111");
        R1.addSection(SectionType.OBJECTIVE, new TextSection("Objective1"));
        R1.addSection(SectionType.PERSONAL, new TextSection("Personal data"));
        R1.addSection(SectionType.ACHIEVEMENT, new ListSection("Achivment11", "Achivment12", "Achivment13"));
        R1.addSection(SectionType.QUALIFICATIONS, new ListSection("Java", "SQL", "JavaScript"));
        R1.addSection(SectionType.EXPERIENCE,
                new OrganizationSection(
                        new Organization("Organization11", "http://Organization11.ru",
                                new Organization.Position(2005, Month.JANUARY, "position1", "content1"),
                                new Organization.Position(2001, Month.MARCH, 2005, Month.JANUARY, "position2", "content2"))));
        R1.addSection(SectionType.EDUCATION,
                new OrganizationSection(
                        new Organization("Institute", null,
                                new Organization.Position(1996, Month.JANUARY, 2000, Month.DECEMBER, "aspirant", null),
                                new Organization.Position(2001, Month.MARCH, 2005, Month.JANUARY, "student", "IT facultet")),
                        new Organization("Organization12", "http://Organization12.ru")));
        R2.addContact(ContactType.SKYPE, "skype2");
        R2.addContact(ContactType.PHONE, "22222");
        R1.addSection(SectionType.EXPERIENCE,
                new OrganizationSection(
                        new Organization("Organization2", "http://Organization2.ru",
                                new Organization.Position(2015, Month.JANUARY, "position1", "content1"))));
    }

//        Resume resume = new Resume("uuid", "Григорий Кислин");
//        //  System.out.println(resume);
//
//        Map<ContactType, String> contacts = new EnumMap<>(ContactType.class);
//        contacts.put(ContactType.PHONE, "+7(921) 855-0482");
//        contacts.put(ContactType.SKYPE, "grigory.kislin");
//        contacts.put(ContactType.MAIL, "gkislin@yandex.ru");
//        contacts.put(ContactType.LINKEDIN, "https://www.linkedin.com/in/gkislin/");
//        contacts.put(ContactType.GITHUB, "https://github.com/gkislin");
//        contacts.put(ContactType.STACKOVERFLOW, "https://stackoverflow.com/users/548473/grigory-kislin");
//        contacts.put(ContactType.HOME_PAGE, "http://gkislin.ru/");
//
//        resume.setContacts(contacts);
//
//       /* for (Map.Entry<ContactType, String> c : contacts.entrySet()) {
//            System.out.println(c);
//        }*/
//
//        Map<SectionType, Section> sections = new EnumMap<>(SectionType.class);
//        Section objective = new TextSection("Ведущий стажировок и корпоративного обучения по Java Web и Enterprise технологиям");
//        sections.put(SectionType.OBJECTIVE, objective);
//
//        Section personalQualities = new TextSection("Аналитический склад ума, " + "сильная логика, " + "креативность");
//        sections.put(SectionType.PERSONAL, personalQualities);
//
//        List<String> listAchievements = new ArrayList<>();
//        listAchievements.add("С 2013 года: разработка проектов \"Разработка Web приложения\"");
//        listAchievements.add("Реализация двухфакторной аутентификации для онлайн платформы");
//        listAchievements.add("Реализация c нуля Rich Internet Application");
//
//        ListSection achievements = new ListSection(listAchievements);
//        sections.put(SectionType.ACHIEVEMENT, achievements);
//
//        List<String> listQualifications = new ArrayList<>();
//        listQualifications.add("С 2013 года: разработка проектов \"Разработка Web приложения\"");
//        listQualifications.add("Реализация двухфакторной аутентификации для онлайн платформы");
//        listQualifications.add("Реализация c нуля Rich Internet Application");
//
//        ListSection qualifications = new ListSection(listQualifications);
//        sections.put(SectionType.QUALIFICATIONS, qualifications);
//
//        Organization java = new Organization("Java Project", "http://javaops.ru/", LocalDate.of(2013, 10, 1), LocalDate.now(), "Автор проекта.", "Создание, организация и проведение Java онлайн проектов и стажировок.");
//
//        List<Organization> listExperience = new ArrayList<>();
//        listExperience.add(java);
//
//        OrganizationSection experience = new OrganizationSection(listExperience);
//        sections.put(SectionType.EXPERIENCE, experience);
//
//
//        Organization coursera = new Organization("Coursera", "https://www.coursera.org/course/progfun", LocalDate.of(2013, 3, 2), LocalDate.of(2013, 5, 3), "\"Functional Programming Principles in Scala\" by Martin Odersky", "");
//        List<Organization> listEducation = new ArrayList<>();
//        listEducation.add(coursera);
//
//        OrganizationSection education = new OrganizationSection(listEducation);
//        sections.put(SectionType.EDUCATION, education);
//
//        resume.setSections(sections);
//
//        System.out.println(resume.getUuid());
//        System.out.println(resume.getFullName());
//
//        System.out.println("Contacts");
//       // for (Map.Entry<ContactType, String> c : resume.getContacts().entrySet()) {
//            System.out.println(c);
//        }
//
//        System.out.println("Sections");
//    //    for (Map.Entry<SectionType, Section> c : resume.getSections().entrySet()) {
//            System.out.println(c);
//        }
//    }

}
