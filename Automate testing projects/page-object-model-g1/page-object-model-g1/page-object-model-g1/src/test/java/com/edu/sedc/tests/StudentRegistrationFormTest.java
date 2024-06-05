//package com.edu.sedc.tests;
//
//import com.edu.sedc.pages.StudentRegistrationFormPage;
//import com.edu.sedc.pages.TextBoxPage;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class StudentRegistrationFormTest extends BaseTest {
//
//    @Test
//    public void studentRegistrationFormTest(){
//    StudentRegistrationFormPage studentRegistrationFormPage = new StudentRegistrationFormPage(driver, wait);
//        studentRegistrationFormPage.navigateToRegistrationFormUrl();
//        studentRegistrationFormPage.studentName("Ime Prezime");
//        studentRegistrationFormPage.studentEmail("test@mail.com");
//        studentRegistrationFormPage.studentGender("female");
//        studentRegistrationFormPage.studentMobile("0000000000");
//        studentRegistrationFormPage.studentAddress("Ul.Ime br.3");
//        studentRegistrationFormPage.subjectForStudies("Computer science");
//        studentRegistrationFormPage.studentHobbies("music");
//        studentRegistrationFormPage.stateAndCity("country and city");
//
//        js.executeScript("window.scrollBy(0,500)","");
//        studentRegistrationFormPage.clickSubmitButton();
//
//        Assert.assertEquals(studentRegistrationFormPage.getTextForStudentName(), "Name:Ime Prezime");
//        Assert.assertEquals(studentRegistrationFormPage.getTextForStudentEmail(), "Email:test@mail.com");
//        Assert.assertEquals(studentRegistrationFormPage.getTextForStudentGender(), "Gender :female");
//        Assert.assertEquals(studentRegistrationFormPage.getTextForStudentAddress(), "Address :Ul. Ulica br.1");
//        Assert.assertEquals(studentRegistrationFormPage.getTextForStudentEmail(), "Email :mail@mail.com");
//        Assert.assertEquals(studentRegistrationFormPage.getTextForSubjectForStudies(), "Studies :Computer science");
//        Assert.assertEquals(studentRegistrationFormPage.getTextForStudentHobbies(), "Hobbies :sports");
//        Assert.assertEquals(studentRegistrationFormPage.getTextForStateAndCity(),"State and City :NCR Gurgaon");
//    }
//}
//
//
