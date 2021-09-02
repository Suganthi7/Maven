package org.datadrive;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class Question3PojoClass extends BaseClass {
	
	public Question3PojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//u[text()='Greens Technologys Software Training Centers in Chennai']")
	private WebElement scrollDown;
	
	
	@FindBy(xpath="//h1[text()='No 1 Software Training Institutes in Chennai with Placements']")
	private WebElement scrollUp;


	public WebElement getScrollDown() {
		return scrollDown;
	}


	public WebElement getScrollUp() {
		return scrollUp;
	}
	
	@FindBy(xpath="//a[text()='Certifications']")
	private WebElement crtfctnClick;
	
	@FindBy(xpath="//a[text()='Course Content']")
    private List<WebElement> courseContent;
    
	@FindBy(xpath="//a[text()='TESTIMONIALS']")
    private WebElement testimonial;
	
	public WebElement getCrtfctnClick() {
		return crtfctnClick;
	}

	public List<WebElement> getCourseContent() {
		return courseContent;
	}

	public WebElement getTestimonial() {
		return testimonial;
	}
	
	
	@FindBy(xpath="//div[@class='container']")
	private List<WebElement> cotainer;
	
	

	public List<WebElement> getCotainer() {
		return cotainer;
	}
     
	
	@FindBy(xpath="//a[text()='COURSES']")
	private WebElement courses;
	
	
	public WebElement getCourses() {
		return courses;
	}


	public WebElement getJavaTraining() {
		return javaTraining;
	}


	public WebElement getCoreJavaTraining() {
		return coreJavaTraining;
	}

	@FindBy(xpath="//span[text()='Java Training']")
	private WebElement javaTraining;
	
	
	@FindBy(xpath="//span[text()='Core Java Training']")
	private WebElement coreJavaTraining;
	
	
	@FindBy(xpath="//p[contains(text(),' was looking out')]")
	private WebElement anithReview;

	public WebElement getAnithReview() {
		return anithReview;
	}
	
	
	
	
	

	
		
		
	
	

}
