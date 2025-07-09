/*******************************************************
 * Title      : Control Statements
 * Author     : Sarju S
 * Date       : 09-07-2025
 * Description: if Statement Implementation
 *******************************************************/
public class ControlStatementsDemo_If {

	public static void main(String[] args) {
		float attendancePercentage = 92.12f;
		float internalMarksForAttendance=0f;;
		if(attendancePercentage>=90) {
			internalMarksForAttendance = 10;
		}
		System.out.println("Internal marks for the attendance: "+ internalMarksForAttendance);
		

	}

}
