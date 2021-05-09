package com.urise.webapp.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;


public class ResumeTest {
    public static void main(String[] args) {

        Resume resume = new Resume("uuid", "Григорий Кислин");
      //  System.out.println(resume);

        Map<ContactType, String> contacts = new EnumMap<>(ContactType.class);
        contacts.put(ContactType.PHONE, "+7(921) 855-0482");
        contacts.put(ContactType.SKYPE, "grigory.kislin");
        contacts.put(ContactType.EMAIL, "gkislin@yandex.ru");
        contacts.put(ContactType.LINKEDIN, "https://www.linkedin.com/in/gkislin/");
        contacts.put(ContactType.GITHUB, "https://github.com/gkislin");
        contacts.put(ContactType.STACKOVERFLOW, "https://stackoverflow.com/users/548473/grigory-kislin");
        contacts.put(ContactType.HOME_PAGE, "http://gkislin.ru/");

        resume.setContacts(contacts);

       /* for (Map.Entry<ContactType, String> c : contacts.entrySet()) {
            System.out.println(c);
        }*/

        Map<SectionType, Section> sections = new EnumMap<>(SectionType.class);
        Section objective = new TextSection("Ведущий стажировок и корпоративного обучения по Java Web и Enterprise технологиям");
        sections.put(SectionType.OBJECTIVE, objective);

        Section personalQualities = new TextSection("Аналитический склад ума, " + "сильная логика, " + "креативность");
        sections.put(SectionType.PERSONAL, personalQualities);

        List<String> listAchievements = new ArrayList<>();
        listAchievements.add("С 2013 года: разработка проектов \"Разработка Web приложения\"");
        listAchievements.add("Реализация двухфакторной аутентификации для онлайн платформы");
        listAchievements.add("Реализация c нуля Rich Internet Application");

        ListSection achievements = new ListSection(listAchievements);
        sections.put(SectionType.ACHIEVEMENT, achievements);

        List<String> listQualifications = new ArrayList<>();
        listQualifications.add("С 2013 года: разработка проектов \"Разработка Web приложения\"");
        listQualifications.add("Реализация двухфакторной аутентификации для онлайн платформы");
        listQualifications.add("Реализация c нуля Rich Internet Application");

        ListSection qualifications = new ListSection(listQualifications);
        sections.put(SectionType.QUALIFICATIONS, qualifications);

        Organisation java = new Organisation("Java Project", "http://javaops.ru/", LocalDate.of(2013, 10, 1), LocalDate.now(), "Автор проекта.", "Создание, организация и проведение Java онлайн проектов и стажировок.");

        List<Organisation> listExperience = new ArrayList<>();
        listExperience.add(java);

        OrganisationSection experience = new OrganisationSection(listExperience);
        sections.put(SectionType.EXPERIENCE, experience);


        Organisation coursera = new Organisation("Coursera", "https://www.coursera.org/course/progfun", LocalDate.of(2013, 3, 2), LocalDate.of(2013, 5, 3), "\"Functional Programming Principles in Scala\" by Martin Odersky", "");
        List<Organisation> listEducation = new ArrayList<>();
        listEducation.add(coursera);

        OrganisationSection education = new OrganisationSection(listEducation);
        sections.put(SectionType.EDUCATION, education);

        resume.setSections(sections);

        /*for (Map.Entry<SectionType, Section> c : sections.entrySet()) {
            System.out.println(c);
        }*/
        System.out.println(resume.getUuid());
        System.out.println(resume.getFullName());

        System.out.println("Contacts");
        for (Map.Entry<ContactType, String> c : resume.getContacts().entrySet()) {
            System.out.println(c);
        }

        System.out.println("Sections");
        for (Map.Entry<SectionType, Section> c : resume.getSections().entrySet()) {
            System.out.println(c);
        }
    }
}