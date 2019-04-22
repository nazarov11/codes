package com.class23;

public class Test {
	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println("--------------Creating Employee object");
		System.out.println(Employee.department);
		Employee.work();
		emp.salary = 90000;
		emp.getPaid();

		System.out.println("-------------Creating scrumteam object");
		ScrumTeam st = new ScrumTeam();
		ScrumTeam.work();
		
		st.salary = 100000;
		st.getPaid();
		st.artifacts = "Product Backlog, Sprint Backlog, BurnDown Chart";
		st.ceremonies = "Sprint Grooming, Sprint Planning, Daily StandUp, " + "Sprint demo, Sprint Retro";
		st.attendScrumMeetings();
		st.workOnArtifacts();

		System.out.println("----------Creating Developer object");
		Developer dev = new Developer();
		dev.salary = 120000;
		dev.getPaid();
		dev.ceremonies = "Sprint Grooming, Sprint Planning, Daily StandUp, " + "Sprint demo, Sprint Retro";
		dev.attendScrumMeetings();
		dev.code();

		System.out.println("----------Creating Tester object");
		Tester qa = new Tester();
		qa.salary = 120000;
		qa.getPaid();
		qa.ceremonies = "Sprint Grooming, Sprint Planning, Daily StandUp, " + "Sprint demo, Sprint Retro";
		qa.attendScrumMeetings();
		qa.test();
				
				System.out.println("----------Creating Manual Tester object");
				ManualTester qam = new ManualTester();
				qam.manualTest();
				qam.ceremonies = "Sprint Grooming, Sprint Planning, Daily StandUp, " + "Sprint demo, Sprint Retro";
				qam.salary = 90000;
				qam.getPaid();
				
				System.out.println("----------Creating Automation Tester object");
				AutoTester at = new AutoTester();
				at.salary = 100000;
				at.codeInJava();
				at.ceremonies = "Sprint Grooming, Sprint Planning, Daily StandUp, " + "Sprint demo, Sprint Retro";
				at.attendScrumMeetings();
				
				
		System.out.println("----------Creating Business Analyst object");
		BusinessAnalyst ba = new BusinessAnalyst();
		ba.salary = 120000;
		ba.getPaid();
		ba.ceremonies = "Sprint Grooming, Sprint Planning, Daily StandUp, " + "Sprint demo, Sprint Retro";
		ba.attendScrumMeetings();
		ba.writeUserStories();

		System.out.println("----------Creating Scrum Master object");
		ScrumMaster sm = new ScrumMaster();
		sm.salary = 120000;
		sm.getPaid();
		sm.ceremonies = "Sprint Grooming, Sprint Planning, Daily StandUp, " + "Sprint demo, Sprint Retro";
		sm.attendScrumMeetings();
		sm.scrumMeetings();
		
		System.out.println("----------Creating Product Owner object");
		ProductOwner po = new ProductOwner();
		po.salary = 120000;
		po.getPaid();
		po.artifacts = "Product Backlog, Sprint Backlog, BurnDown Chart";
		po.ceremonies = "Sprint Grooming, Sprint Planning, Daily StandUp, "
				+ "Sprint demo, Sprint Retro";
		po.attendScrumMeetings();
		po.prioritizeBacklog();
		po.talkToTheClient();
		po.workOnArtifacts();

	}

}
