import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class details{
	int houseID;
	int flatNumber;
	int floorNumber;
	int streetNumber;
	String fullAddress;
	public int getHouseID() {
		return houseID;
	}
	public void setHouseID(int houseID) {
		this.houseID = houseID;
	}
	public int getFlatNumber() {
		return flatNumber;
	}
	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}
	public int getFloorNumebr() {
		return floorNumber;
	}
	public void setFloorNumebr(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	public int getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
}
public class Solve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<details> list = new ArrayList<>();
		int flag = 1;
		 @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		 
		 System.out.println("IF you want to enter new house detials enter 1 else enter 2  : ");
		 flag = scan.nextInt();
		 while (flag == 1) {
			 System.out.println("Enter the Hose ID : ");
			 int houseID = scan.nextInt();
			 System.out.println("Enter the Flat Number: ");
			 int flatNumber = scan.nextInt();
			 System.out.println("Enter the Floor Number : ");
			 int floorNumber = scan.nextInt();
			 System.out.println("Enter the street Number : ");
			 int streetNumber = scan.nextInt();
			 System.out.println("Enter the Full address details/if needed : ");
			 scan.nextLine();
			 String fullAddress = scan.nextLine();
			 
			 // get object from our details class
			 details obj = new details();
			obj.setHouseID(houseID);
			obj.setFlatNumber(flatNumber);
			obj.setFloorNumebr(floorNumber);
			obj.setStreetNumber(streetNumber);
			obj.setFullAddress(fullAddress);
			
			// add our object in the arrayList;
			 list.add(obj);
			 System.out.println("IF you want to Continue enter new house detials enter 1 else enter 2  : ");
			 flag = scan.nextInt();
		 }
		 
		 
		 // finished and want to loop on our list
		 System.out.println("\n\n\n\n\n");
		 
		 for (int i = 0 ; i < list.size() ; i++) {
			 details obj = list.get(i);
			 
			 System.out.println("Object number : " + i);
			 System.out.println("Full Address : " + obj.getFullAddress());
			 System.out.println(" House ID : " + obj.getHouseID());
			 System.out.println("Flat Number: " + obj.getFlatNumber());
			 System.out.println("Floor Number: " + obj.getFloorNumebr());
			 System.out.println("Street Number: " + obj.getStreetNumber());
			 System.out.println("------------------------------------");
		 }
		
	}

}
