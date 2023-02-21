package org.ssglobal.training.codes.streams;

public class TestScoreInfos {

	public static void main(String[] args) {
		
		Score[] scoreData = {new Score("Smith","John",70),
							 new Score("Doe","Mary",85),
							 new Score("Page","Alice",82),
							 new Score("Cooper","Jill",97),
							 new Score("Flintstone","Fred",66),
							 new Score("Rubble","Barney",80),
							 new Score("Smith","Judy",48),
							 new Score("Dean","James",90),
							 new Score("Russ","Joe",55),
							 new Score("Wolfe","Bill",73),
							 new Score("Dart","Mary",54),
							 new Score("Rogers","Chris",78),
							 new Score("Toole","Pat",51),
							 new Score("Khan","Omar",93),
							 new Score("Smith","Ann",95)
		};
		
		ScoreInfos scoreInfo = new ScoreInfos(scoreData);

		System.out.println("Number of Students: %d".formatted(scoreInfo.getNumScores()));
		System.out.println("Average Scores: %f".formatted(scoreInfo.getAverage()));
		System.out.println("Number of A lister Studends: %d".formatted(scoreInfo.getNumberALister()));
		System.out.println("----------------Failing students---------------------");
		System.out.println(scoreInfo.getFailingStudentList());
		System.out.println("-----------------Passing Students--------------------");
		scoreInfo.printPassingStudents();
		System.out.println("-----------------All Students ordered by last name--------------------");
		scoreInfo.displayAllStudents();
		System.out.println("------------------Student Records ordered by score-------------------");
		System.out.println(scoreInfo.getStudentsRecord());
		System.out.println("----------------Display all students---------------------");
		scoreInfo.displayAllStudents();
		System.out.println("---------------Save to File----------------------");
		System.out.println(scoreInfo.saveAllRecords());
	}

}
