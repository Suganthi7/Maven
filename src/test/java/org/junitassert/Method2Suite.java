package org.junitassert;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Method2Suite {
	@Test
	public void tc1() {
		Result r = JUnitCore.runClasses(FlipcartAssert.class,FbAssert.class);
		System.out.println("Run Count :"+r.getRunCount());
		System.out.println("Failure Count :"+r.getFailureCount());
		System.out.println("Ignore Count :"+r.getIgnoreCount());
		System.out.println("Status :"+r.wasSuccessful());
		System.out.println("Run Time :"+r.getRunTime());
		List<Failure> allFail = r.getFailures();
		System.out.println("Failed TestCases");
		for (Failure fail : allFail) {
			System.out.println(fail);
	}
		System.out.println("Passed Count :"+(r.getRunCount()-r.getFailureCount()));
		System.out.println("Total No of tc:"+(r.getRunCount()-r.getIgnoreCount()));
		
		

	}

}
