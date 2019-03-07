import java.util.Scanner;

class TotalAndAverageOfStudentMarks {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int numberOfStudents;
		int numberOfSubjects;
		numberOfStudents = sc.nextInt();
		numberOfSubjects = sc.nextInt();
		int marksOfStudents[][] = new int[numberOfStudents][numberOfSubjects];
		for (int i = 0; i < numberOfStudents; ++i) {
			for (int j = 0; j < numberOfSubjects; ++j) {
				marksOfStudents[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < numberOfStudents; ++i) {
			int totalMarksOfStudent = 0;
			int totalMarksInSubject = 0;
			for (int j = 0; j < numberOfSubjects; ++j) {
				totalMarksOfStudent += marksOfStudents[i][j];
				totalMarksInSubject += marksOfStudents[j][i];
			}
			System.out.println("total marks of student " + (i + 1) + "=" + totalMarksOfStudent);
			System.out.println("total marks in subject " + (i + 1) + "=" + totalMarksInSubject);
			System.out.println("average marks of student " + (i + 1) + "=" + totalMarksOfStudent / numberOfSubjects);
			System.out.println("average marks in subject " + (i + 1) + "=" + totalMarksInSubject / numberOfStudents);
		}

		sc.close();
	}
}