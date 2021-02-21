package revision;

import java.io.*;
import java.util.*;

public class OperationsOnStringList {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		ArrayList <String> al = new ArrayList<String>();
		boolean flag = true;
		while(flag) {
			System.out.println("1. Insert");
			System.out.println("2. Search");
			System.out.println("3. Delete");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			
			int option = sc.nextInt();
			
			if(option >= 1 && option <=5) {
				switch(option) {
				case 1:
					System.out.println("Enter element to add: ");
					al.add(br.readLine());
					System.out.println("Added !");
					break;
				case 2:
					System.out.println("Enter element to search: ");
					String se  = br.readLine();
					if(al.contains(se)) {
						System.out.println("Element is at Index: "+al.indexOf(se));
					}
					else {
						System.out.println("No Such Element in the List !");
					}
					break;
				case 3:
					System.out.println("Enter which element to delete: ");
					String re = br.readLine();
					if(al.contains(re)) {
						al.remove(re);
						System.out.println("Removed !");
					}
					else {
						System.out.println("No such element in the List !");
					}
					break;
				case 4:
					if(al.size()==0) {
						System.out.println("Empty List !");
					}
					else {
						System.out.println(al);
					}
					break;
				default:
					flag = false;
				}
			}
			else {
				System.out.println("Invalid option");
			}
		}
		sc.close();
	}
}
