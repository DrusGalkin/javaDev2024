//import java.util.Scanner;
//
//public class CityListGame {
//	Scanner scan = new Scanner(System.in);
//	String temp;
//	int sum;
//
//	City A = new City("A");
//	City B = new City("B");
//	City C = new City("C");
//	City D = new City("D");
//	City E = new City("E");
//	City F = new City("F");
//
//	static {
//		System.out.print("Введите горд - ");
//	}
//
//	public CityListGame() {
//
//		A.addEdge(B, 5);
//		A.addEdge(F, 1);
//		A.addEdge(D, 6);
//
//		F.addEdge(B, 1);
//		F.addEdge(E, 2);
//
//		B.addEdge(A, 5);
//		B.addEdge(C, 3);
//
//		C.addEdge(B, 3);
//		C.addEdge(D, 4);
//
//		D.addEdge(A, 6);
//		D.addEdge(E, 2);
//
//		E.addEdge(F, 2);
//
//
//
//		sum = 0;
//	}
//
//	public void Start() {
//		boolean inGame = true;
//		this.temp = scan.nextLine();
//
//		while(inGame)
//		{
//			switch(temp)
//			{
//				case "A" ->
//					{
//						A.paintCloseCitizens();
//						inGame = false;
//						System.out.println("\n\n\n\n\n\n");
//						Start();
//						break;
//					}
//				case "B" ->
//					{
//						B.paintCloseCitizens();
//						inGame = false;
//						System.out.println("\n\n\n\n\n\n");
//						Start();
//						break;
//					}
//				case "C" ->
//					{
//						C.paintCloseCitizens();
//						inGame = false;
//						System.out.println("\n\n\n\n\n\n");
//						Start();
//						break;
//					}
//				case "D" ->
//					{
//						D.paintCloseCitizens();
//						inGame = false;
//						System.out.println("\n\n\n\n\n\n");
//						Start();
//						break;
//					}
//				case "E" ->
//					{
//						E.paintCloseCitizens();
//						inGame = false;
//						System.out.println("\n\n\n\n\n\n");
//						Start();
//						break;
//					}
//				case "F" ->
//					{
//						F.paintCloseCitizens();
//						inGame = false;
//						System.out.println("\n\n\n\n\n\n");
//						Start();
//						break;
//					}
//
//				default -> {
//					inGame = false;
//					break;
//				}
//			}
//		}
//	}
//
//}
