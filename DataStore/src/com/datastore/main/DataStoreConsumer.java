package com.datastore.main;
import java.util.*;
import org.json.simple.JSONObject;


public class DataStoreConsumer {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			System.out.println("1.Create");
			System.out.println("2.Read");
			System.out.println("3.Delete");
			
			while(true)
			{
				System.out.println("Select Option");

			int option = sc.nextInt();
			DataStore myDataStore = new DataStore(
					"C:\\Users\\divya\\Documents\\DataStore");
			switch(option)
			{
				case 1:
					// Create Operation
					// DataStore myDataStore = new DataStore();
				System.out.println("Enter Key");
				String key = sc.next();
				System.out.println("Enter Value(First Name)");
				String Fname= sc.next();
				System.out.println("Enter Value(Last Name)");
				String Lname= sc.next();

				System.out.println("Enter Value(Address)");
				String address= sc.next();

				JSONObject jsonObject = new JSONObject();
				jsonObject.put("firstName", Fname);
				jsonObject.put("lastName", Lname);
				jsonObject.put("address", address);
				
				System.out.println("Do you want to enter Time-To-Live");
				System.out.println("Press Y or N");

				String Status = sc.next();
				
				if(Status.equals("y")|| Status.equals("Y")) {
					System.out.println("Enter Time-To-Live");
					int TTL = sc.nextInt();
					System.out.println(myDataStore.create(key, jsonObject, TTL));// success
					
					
					
					break;
				}
				else
				{
					System.out.println(myDataStore.create(key, jsonObject));// success
					break;
				}
				
					//System.out.println(myDataStore.create(
					//		"helloDataStoreThisIsKeyNameValidation", new JSONObject()));// failure
				
				case 2:
					System.out.println("Enter Key");
					String key2 = sc.next();
					System.out.println(myDataStore.read(key2));// success
				
					break;
				case 3:
					System.out.println("Enter Key");
					String key3 = sc.next();
					System.out.println(myDataStore.delete(key3));// failure
				
					break;
				default:
					System.out.println("Invalid option");
					System.exit(0);
			}
		
	

		
	}
	}
}
