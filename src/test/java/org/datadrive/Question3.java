package org.datadrive;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.utility.BaseClass;

public class Question3 extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		chromeBrowser();
		launchUrl("http://www.greenstechnologys.com/");
		maxBrowser();
		
		Question3PojoClass q3=new Question3PojoClass();
		
//		WebElement scrollDown = q3.getScrollDown();
//		scrollUpDown(scrollDown, true);
//		String t1 = scrollDown.getText();
//		System.out.println(t1);
//			
//		threadWait();
//		
//		WebElement scrollUp = q3.getScrollUp();
//		scrollUpDown(scrollUp, false);
//		String t2 = scrollUp.getText();
//		System.out.println(t2);
//		
//		
//		WebElement crtfctnClick = q3.getCrtfctnClick();
//		btnClick(crtfctnClick);
//		
//		threadWait(); 
//		 
//		
//		WebElement courseContent = q3.getCourseContent().get(40);
//		btnClick(courseContent);
//		
//		threadWait();
//		
//		
//		
//		
//		WebElement testimonial = q3.getTestimonial();
//		btnClick(testimonial);
//		
//		threadWait();
//		 
//		System.out.println( q3.getCotainer().get(4).getText());
//		System.out.println( q3.getCotainer().get(3).getText());
//		
		
		
	WebElement courses = q3.getCourses();
	moveHover(courses);
	threadWait();
	WebElement javaTraining = q3.getJavaTraining();
	moveHover(javaTraining);
	threadWait();
	WebElement coreJavaTraining = q3.getCoreJavaTraining();
	btnClick(coreJavaTraining);
	
	System.out.println(q3.getAnithReview().getText());
		
		
		
		
		
		
		
		
		
	}

}
