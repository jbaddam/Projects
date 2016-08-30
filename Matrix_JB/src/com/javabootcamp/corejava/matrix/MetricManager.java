package com.javabootcamp.corejava.matrix;


import java.util.Scanner;


/**
 * @author Jagan Reddy
 *
 */
public class MetricManager {
	static AppServers appserver;
	static DataBases database;
	static CodeRepos coderepo;
	static IDEs ide;
	static JDKs jdk;
	static Scanner sc = new Scanner(System.in);

	/**
	 * @param sc accepts user input from console to choose IDE, based on the User input, 
	 *          it again asks how many years info you want about that particular IDE
	 *          once we enter the number of  years, it fetches the data from different arrays which are in IDE's class         
	 */
	static void idesYearsInfo(Scanner sc) {
		System.out.println("Select to Get Information About following\n1.Eclipse\n2.NetBeans\n3.IntelliJ");
		System.out.println(".....................................");
		System.out.print("\n\nEnter Your Option(Numbers Only) : ");

		int chooseIde = sc.nextInt();
		switch (chooseIde) {
		case 1:
			System.out.print("How Many years of information you want (Numbers Only) : ");
			int eclipseyears = sc.nextInt();
			ide.eclipseInfo(eclipseyears);
			break;
		case 2:
			System.out.print("How Many years of information you want (Numbers Only) : ");
			int netBeansyears = sc.nextInt();
			ide.netBeansInfo(netBeansyears);
			break;
		case 3:
			System.out.print("How Many years of information you want (Numbers Only) : ");
			int intelliJyears = sc.nextInt();
			ide.intelliJInfo(intelliJyears);
			break;

		default:
			System.out.print("Choose valid IDE option (Numbers Only) : ");
			idesYearsInfo(sc);
			break;
		}

	}

	/**
	 * @param sc accepts user input from console to choose Application Servers, based on the User input, 
	 *          it again asks how many years info you want about that particular Application Servers
	 *          once we enter the number of  years, it fetches the data from different arrays which are in AppServer class         
	 */
	static void appServerYearsInfo(Scanner sc) {
		System.out.println("Select  to Get Information About Following\n1.TomCat\n2.GlassFish\n3.Weblogic");
		System.out.println(".....................................");
		System.out.print("\n\nEnter Your Option(Numbers Only) : ");
		int chooseAppServer = sc.nextInt();
		switch (chooseAppServer) {
		case 1:
			System.out.print("How Many years of information you want (Numbers Only) : ");
			int tomcatyears = sc.nextInt();
			appserver.tomcatInfo(tomcatyears);
			break;
		case 2:
			System.out.print("How Many years of information you want (Numbers Only) : ");
			int glassFishyears = sc.nextInt();
			appserver.glassFish(glassFishyears);
			break;
		case 3:
			System.out.print("How Many years of information you want (Numbers Only) : ");
			int weblogicyears = sc.nextInt();
			appserver.weblogicInfo(weblogicyears);
			break;

		default:
			System.out.print("Choose valid Application Server option (Numbers Only) : ");
			appServerYearsInfo(sc);
			break;
		}
	}

	/**
	 * @param sc accepts user input from console to choose Source Code Repositories, based on the User input, 
	 *          it again asks how many years info you want about that particular Code Repository
	 *          once we enter the number of  years, it fetches the data from different arrays which are in CodeRepos class         
	 */
	static void codeRepoYearsInfo(Scanner sc) {
		System.out.println("Select  to Get Information About following\n1.Git Hub\n2.SVN");
		System.out.println(".....................................");
		System.out.print("\n\nEnter Your Option(Numbers Only) : ");
		int chooseCodeRepo = sc.nextInt();
		switch (chooseCodeRepo) {
		case 1:
			System.out.print("How Many years of information you want (Numbers Only) : ");
			int gityears = sc.nextInt();
			coderepo.gitInfo(gityears);
			break;
		case 2:
			System.out.print("How Many years of information you want (Numbers Only) : ");
			int svnyears = sc.nextInt();
			coderepo.svnInfo(svnyears);
			break;
		default:
			System.out.print("Choose valid Application Server option (Numbers Only) : ");
			codeRepoYearsInfo(sc);
			break;
		}
	}

	/**
	 * @param sc accepts user input from console to choose Data Bases, based on the User input, 
	 *          it again asks how many years info you want about that particular Data Base
	 *          once we enter the number of  years, it fetches the data from different arrays which are in Databases class         
	 */
	static void databaseYearsInfo(Scanner sc) {
		System.out.println("Select  to Get Information About following\n1.Oracle \n2.My Sql \n3.Sql Server");
		System.out.println(".....................................");
		System.out.print("\n\nEnter Your Option(Numbers Only) : ");
		int choosedatabase = sc.nextInt();
		switch (choosedatabase) {
		case 1:
			System.out.print("How Many years of information you want (Numbers Only) : ");
			int oraclyears = sc.nextInt();
			database.oracleInfo(oraclyears);
			break;
		case 2:
			System.out.print("How Many years of information you want (Numbers Only) : ");
			int mysqlyears = sc.nextInt();
			database.mySqlInfo(mysqlyears);
			break;
		case 3:
			System.out.print("How Many years of information you want (Numbers Only) : ");
			int sqlserveryears = sc.nextInt();
			database.sqlServerInfo(sqlserveryears);
			break;
		default:
			System.out.print("Choose valid Application Server option (Numbers Only) : ");
			codeRepoYearsInfo(sc);
			break;
		}

	}

	/**
	 * @param sc  accepts user input from console to choose a metric,based on the choosen metric
	 *            it call the appropriate method to get the information
	 */
	static void showMetrics() {
		System.out.println(
				"Select Any of the Following to Get Information\n1.Jdk's\n2.IDE's\n3.Web Application Servers\n4.Code Repositories\n5.Data Bases\n-----------------------------------------------");
		System.out.print("Enter Your Option(Numbers Only) : ");
		int chooseMetric = sc.nextInt();
		switch (chooseMetric) {
		case 1:
			System.out.print("How Many years of information you want (Numbers Only) : ");
			int jdkyears = sc.nextInt();
			JDKs.jdkInfo(jdkyears);
			break;

		case 2:
			idesYearsInfo(sc);
			break;

		case 3:
			appServerYearsInfo(sc);
			break;

		case 4:
			codeRepoYearsInfo(sc);
			break;
		case 5:
			databaseYearsInfo(sc);
			break;

		default:
			System.out.println("\nX Choose valid Metrics Option X \n\n");
			showMetrics();
			break;
		}

		callAgain();

	}

	/**
	 * This method makes our application alive untill user kills by saying NO
	 */
	static void callAgain() {
		System.out.print("\nDo you Want to continue Yes/No : ");
		String s = sc.next().trim();
		
		if (s.equalsIgnoreCase("yes"))
			showMetrics();
		else if (s.equalsIgnoreCase("no"))
			System.out.println("Thank you !,\nHope you got the information What you Looking For");
		else
			System.out.println("You have to Enter either YES/NO\nRun Your Application Again");
	}

	public static void main(String[] args) {

		showMetrics();
	}

}
