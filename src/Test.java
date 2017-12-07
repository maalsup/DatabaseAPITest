import java.util.ArrayList;
import java.util.Scanner;

public class Test 
{
	public static Scanner scan = new Scanner(System.in);
	public static Controller c = new Controller();
	public static ArrayList<Student> s = new ArrayList<Student>();
	public static ArrayList<String> cl = new ArrayList<String>();
	public static ArrayList<Module> m = new ArrayList<Module>();
	public static ArrayList<StudentInClub> sic = new ArrayList<StudentInClub>();

	
	public static void addStudent()
	{
		String AsuriteId = "";
		String tenDigitId = "";
		boolean isInt = false;
		
		System.out.println();
		System.out.println("Enter their ASURITE ID.");
		AsuriteId = scan.nextLine();
		
		System.out.println("Enter their 10 digit ID.");
		while (!isInt)
		{
			tenDigitId = scan.nextLine();
			try
			{
				Integer.parseInt(tenDigitId);
				isInt = true;
			}
			
			catch (Exception e)
			{
				System.out.println("Please enter a valid integer.");
			}
		}
		
		c.insertStudent(AsuriteId, tenDigitId);
		
		System.out.println();
		System.out.println("Student successfully added to database.");
	}
	
	public static void deleteStudent()
	{
		String AsuriteId = "";
		
		System.out.println();
		System.out.println("Enter their ASURITE ID.");
		AsuriteId = scan.nextLine();
		
		boolean found = c.deleteStudent(AsuriteId);
		
		if (found)
		{
			System.out.println();
			System.out.println("Student successfully deleted from database.");
		}
		
		else
		{
			System.out.println();
			System.out.println("ERROR: Student not found!");
		}
		
	}
	
	public static void searchStudent()
	{
		String AsuriteId = "";
		
		System.out.println();
		System.out.println("Enter their ASURITE ID.");
		AsuriteId = scan.nextLine();
		
		s = c.getStudents(AsuriteId);
		
		if (s.isEmpty())
		{
			System.out.println();
			System.out.println("ERROR: Student not found!");
		}
		
		else
		{
			System.out.println();
			System.out.println("SEARCH RESULTS");
			
			for (int i=0; i<s.size(); i++)
			{
				System.out.println();
				System.out.println("ASURITE ID: " + s.get(i).getName());
				System.out.println("10 DIGIT ID: " + s.get(i).getID());
			}
		}
	}
	
	public static void printStudent()
	{
		s = c.getStudents();
		
		if (s.isEmpty())
		{
			System.out.println();
			System.out.println("ERROR: Student not found!");
		}
		
		else
		{
			System.out.println();
			System.out.println("SEARCH RESULTS");
			
			for (int i=0; i<s.size(); i++)
			{
				System.out.println();
				System.out.println("ASURITE ID: " + s.get(i).getName());
				System.out.println("10 DIGIT ID: " + s.get(i).getID());
			}
		}
	}
	
	
	public static void addAdmin()
	{
		String AsuriteId = "";
		String tenDigitId = "";
		boolean isInt = false;
		
		System.out.println();
		System.out.println("Enter their ASURITE ID.");
		AsuriteId = scan.nextLine();
		
		System.out.println("Enter their 10 digit ID.");
		while (!isInt)
		{
			tenDigitId = scan.nextLine();
			try
			{
				Integer.parseInt(tenDigitId);
				isInt = true;
			}
			
			catch (Exception e)
			{
				System.out.println("Please enter a valid integer.");
			}
		}
		
		c.insertAdmin(AsuriteId, tenDigitId);
		
		System.out.println();
		System.out.println("Admin successfully added to database.");
	}
	
	public static void deleteAdmin()
	{
		String AsuriteId = "";
		
		System.out.println();
		System.out.println("Enter their ASURITE ID.");
		AsuriteId = scan.nextLine();
		
		boolean found = c.deleteAdmin(AsuriteId);
		
		if (found)
		{
			System.out.println();
			System.out.println("Admin successfully deleted from database.");
		}
		
		else
		{
			System.out.println();
			System.out.println("ERROR: Admin not found!");
		}
		
	}
	
	public static void searchAdmin()
	{
		String AsuriteId = "";
		
		System.out.println();
		System.out.println("Enter their ASURITE ID.");
		AsuriteId = scan.nextLine();
		
		s = c.getAdmins(AsuriteId);
		
		if (s.isEmpty())
		{
			System.out.println();
			System.out.println("ERROR: Admin not found!");
		}
		
		else
		{
			System.out.println();
			System.out.println("SEARCH RESULTS");
			
			for (int i=0; i<s.size(); i++)
			{
				System.out.println();
				System.out.println("ASURITE ID: " + s.get(i).getName());
				System.out.println("10 DIGIT ID: " + s.get(i).getID());
			}
		}
	}
	
	public static void printAdmin()
	{	
		s = c.getAdmins();
		
		if (s.isEmpty())
		{
			System.out.println();
			System.out.println("ERROR: Admin not found!");
		}
		
		else
		{
			System.out.println();
			System.out.println("SEARCH RESULTS");
			
			for (int i=0; i<s.size(); i++)
			{
				System.out.println();
				System.out.println("ASURITE ID: " + s.get(i).getName());
				System.out.println("10 DIGIT ID: " + s.get(i).getID());
			}
		}
	}
	
	
	public static void addClub()
	{
		String clubName = "";
		
		System.out.println();
		System.out.println("Enter the club name.");
		clubName = scan.nextLine();
		
		c.insertClub(clubName);
		
		System.out.println();
		System.out.println("Club successfully added to database.");
	}
	
	public static void deleteClub()
	{
		String clubName = "";
		
		System.out.println();
		System.out.println("Enter the club name.");
		clubName = scan.nextLine();
		
		boolean found = c.deleteClub(clubName);
		
		if (found)
		{
			System.out.println();
			System.out.println("Club successfully deleted from database.");
		}
		
		else
		{
			System.out.println();
			System.out.println("ERROR: Club not found!");
		}
		
	}
	
	public static void searchClub()
	{
		String clubName = "";
		
		System.out.println();
		System.out.println("Enter club name.");
		clubName = scan.nextLine();
		
		cl = c.getClubs(clubName);
		
		if (cl.isEmpty())
		{
			System.out.println();
			System.out.println("ERROR: Club not found!");
		}
		
		else
		{
			System.out.println();
			System.out.println("SEARCH RESULTS");
			
			for (int i=0; i<cl.size(); i++)
			{
				System.out.println();
				System.out.println("CLUB NAME: " + cl.get(i));
			}
		}
	}
	
	public static void printClub()
	{	
		cl = c.getClubs();
		
		if (cl.isEmpty())
		{
			System.out.println();
			System.out.println("ERROR: Club not found!");
		}
		
		else
		{
			System.out.println();
			System.out.println("SEARCH RESULTS");
			
			for (int i=0; i<cl.size(); i++)
			{
				System.out.println();
				System.out.println("CLUB NAME: " + cl.get(i));
			}
		}
	}
	
	
	public static void addStudentInClub()
	{
		String clubName = "";
		String tenDigitId = "";
		boolean isInt = false;
		
		System.out.println();
		System.out.println("Enter the club name.");
		clubName = scan.nextLine();
		
		System.out.println("Enter student's 10 digit ID.");
		while (!isInt)
		{
			tenDigitId = scan.nextLine();
			try
			{
				Integer.parseInt(tenDigitId);
				isInt = true;
			}
			
			catch (Exception e)
			{
				System.out.println("Please enter a valid integer.");
			}
		}
		
		c.insertStudentInClub(tenDigitId, clubName);
		
		System.out.println();
		System.out.println("Student In Club successfully added to database.");
	}
	
	public static void deleteStudentInClub()
	{
		String clubName = "";
		String tenDigitId = "";
		boolean isInt = false;
		
		System.out.println();
		System.out.println("Enter the club name.");
		clubName = scan.nextLine();
		
		System.out.println("Enter student's 10 digit ID.");
		while (!isInt)
		{
			tenDigitId = scan.nextLine();
			try
			{
				Integer.parseInt(tenDigitId);
				isInt = true;
			}
			
			catch (Exception e)
			{
				System.out.println("Please enter a valid integer.");
			}
		}
		
		boolean found = c.deleteStudentInClub(tenDigitId, clubName);
		
		
		if (found)
		{
			System.out.println();
			System.out.println("Student In Club successfully deleted from database.");
		}
		
		else
		{
			System.out.println();
			System.out.println("ERROR: Student In Club not found!");
		}
		
	}
	
	public static void searchStudentInClubByClub()
	{
		String clubName = "";
		
		System.out.println();
		System.out.println("Enter the club name.");
		clubName = scan.nextLine();
		
		sic = c.getStudentInClubs(clubName);
		
		if (sic.isEmpty())
		{
			System.out.println();
			System.out.println("ERROR: Student In Club not found!");
		}
		
		else
		{
			System.out.println();
			System.out.println("SEARCH RESULTS");
			
			for (int i=0; i<sic.size(); i++)
			{
				System.out.println();
				System.out.println("Student ID: " + sic.get(i).getStudentId());
				System.out.println("Club name: " + sic.get(i).getClubName());
			}
		}
	}
	
	public static void searchStudentInClubByID()
	{
		String tenDigitId = "";
		boolean isInt = false;
		
		System.out.println();
		System.out.println("Enter student's 10 digit ID.");
		while (!isInt)
		{
			tenDigitId = scan.nextLine();
			try
			{
				Integer.parseInt(tenDigitId);
				isInt = true;
			}
			
			catch (Exception e)
			{
				System.out.println("Please enter a valid integer.");
			}
		}
		
		sic = c.getStudentInClubs(Integer.parseInt(tenDigitId));
		
		if (sic.isEmpty())
		{
			System.out.println();
			System.out.println("ERROR: Student In Club not found!");
		}
		
		else
		{
			System.out.println();
			System.out.println("SEARCH RESULTS");
			
			for (int i=0; i<sic.size(); i++)
			{
				System.out.println();
				System.out.println("Student ID: " + sic.get(i).getStudentId());
				System.out.println("Club name: " + sic.get(i).getClubName());
			}
		}
	}
	
	public static void printStudentInClub()
	{	
		sic = c.getStudentInClubs();
		
		if (sic.isEmpty())
		{
			System.out.println();
			System.out.println("ERROR: Student In Club not found!");
		}
		
		else
		{
			System.out.println();
			System.out.println("SEARCH RESULTS");
			
			for (int i=0; i<sic.size(); i++)
			{
				System.out.println();
				System.out.println("Student ID: " + sic.get(i).getStudentId());
				System.out.println("Club name: " + sic.get(i).getClubName());
			}
		}
	}
	
	
	public static void addModule()
	{
		String moduleName = "";
		String timeValidInMonths = "";
		boolean isInt = false;
		
		System.out.println();
		System.out.println("Enter the module name.");
		moduleName = scan.nextLine();
		
		System.out.println("Enter time valid in months.");
		while (!isInt)
		{
			timeValidInMonths = scan.nextLine();
			try
			{
				Integer.parseInt(timeValidInMonths);
				isInt = true;
			}
			
			catch (Exception e)
			{
				System.out.println("Please enter a valid integer.");
			}
		}
		
		c.insertModule(moduleName, Integer.parseInt(timeValidInMonths));
		
		System.out.println();
		System.out.println("Module successfully added to database.");
	}
	
	public static void deleteModule()
	{
		String moduleName = "";
		
		System.out.println();
		System.out.println("Enter the module name.");
		moduleName = scan.nextLine();
		
		boolean found = c.deleteModule(moduleName);
		
		if (found)
		{
			System.out.println();
			System.out.println("Module successfully deleted from database.");
		}
		
		else
		{
			System.out.println();
			System.out.println("ERROR: Module not found!");
		}
		
	}
	
	public static void searchModule()
	{
		String moduleName = "";
		
		System.out.println();
		System.out.println("Enter the module name.");
		moduleName = scan.nextLine();
		
		m = c.getModules(moduleName);
		
		if (m.isEmpty())
		{
			System.out.println();
			System.out.println("ERROR: Module not found!");
		}
		
		else
		{
			System.out.println();
			System.out.println("SEARCH RESULTS");
			
			for (int i=0; i<m.size(); i++)
			{
				System.out.println();
				System.out.println("Module Name: " + m.get(i).getName());
				System.out.println("Module Time Valid (Months): " + m.get(i).getTime());
			}
		}
	}
	
	public static void printModule()
	{
		m = c.getModules();
		
		if (m.isEmpty())
		{
			System.out.println();
			System.out.println("ERROR: Module not found!");
		}
		
		else
		{
			System.out.println();
			System.out.println("SEARCH RESULTS");
			
			for (int i=0; i<m.size(); i++)
			{
				System.out.println();
				System.out.println("Module Name: " + m.get(i).getName());
				System.out.println("Module Time Valid (Months): " + m.get(i).getTime());
			}
		}
	}
	
	
	
	public static void main(String[] args)
	{
		String input = "-1";
		
		System.out.println("--- KIST BACKEND/DATABASE DEMO ---");
		System.out.println();
		
		while (input != "22")
		{
			System.out.println("What would you like to do?");
			System.out.println("[1] Add student to database..");
			System.out.println("[2] Delete student from database.");
			System.out.println("[3] Search for student in database.");
			System.out.println("[4] Print all students in database.");
			System.out.println("[5] Add admin to database..");
			System.out.println("[6] Delete admin from database.");
			System.out.println("[7] Search for admin in database.");
			System.out.println("[8] Print all admins in database.");
			System.out.println("[9] Add club to database..");
			System.out.println("[10] Delete club from database.");
			System.out.println("[11] Search for club in database.");
			System.out.println("[12] Print all clubs in database.");
			System.out.println("[13] Add module to database..");
			System.out.println("[14] Delete module from database.");
			System.out.println("[15] Search for module in database.");
			System.out.println("[16] Print all modules in database.");
			System.out.println("[17] Add student to club in database..");
			System.out.println("[18] Delete student from club in database.");
			System.out.println("[19] Search for student in club in database by club name.");
			System.out.println("[20] Search for student in club in database by student ID.");
			System.out.println("[21] Print all students in clubs from database.");
			System.out.println("[22] Quit program");
			
			input = scan.nextLine();
				
			switch (input)
			{
				case "1": addStudent(); break;
				case "2": deleteStudent(); break;
				case "3": searchStudent(); break;
				case "4": printStudent(); break;
				case "5": addAdmin(); break;
				case "6": deleteAdmin(); break;
				case "7": searchAdmin(); break;
				case "8": printAdmin(); break;
				case "9": addClub(); break;
				case "10": deleteClub(); break;
				case "11": searchClub(); break;
				case "12": printClub(); break;
				case "13": addModule(); break;
				case "14": deleteModule(); break;
				case "15": searchModule(); break;
				case "16": printModule(); break;
				case "17": addStudentInClub(); break;
				case "18": deleteStudentInClub(); break;
				case "19": searchStudentInClubByClub(); break;
				case "20": searchStudentInClubByID(); break;
				case "21": printStudentInClub(); break;
				case "22": System.exit(0); break;
				default: System.out.println("\nInvalid input. Please select a number between 1 and 21.\n");
			}
		}
	}
}
