import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
 * 3. Write a java program to implement the following Consider vehicle parking application 
 * where each vehicle information which enters into the parking location stored in 2 lists.
 * at the end of each day these lists to be merged into single list and 
 * one vehicle information which has highest parked hour should be retrieved,
 * where each vehicle information has vehicle number, vehicle model, total duration parked in minutes.

 */
public class VechicleList_03 {
	
	String VNo, vModel;
	int parkedMins;
	
	VechicleList_03(){
		
	}
	VechicleList_03(String VNo, String vModel, int parkedMins){
		this.VNo = VNo;
		this.vModel = vModel;
		this.parkedMins = parkedMins;
		
		
	}
	
	public static Comparator<VechicleList_03> parkingMins = new Comparator<>() {
		public int compare(VechicleList_03 v1, VechicleList_03 v2) {
		   int time1 = v1.parkedMins;
		   int time2 = v2.parkedMins;		  	   
		   return time2-time1;  //For descending order
	   }};
	   

	public static void main(String[] args) {
		
		ArrayList<VechicleList_03> list1 = new ArrayList<>();
		
		list1.add(new VechicleList_03("TX09Q", "Tesla ",90));
		list1.add(new VechicleList_03("OR66A", "Prius",30));
		list1.add(new VechicleList_03("CA23Z", "CRV",35));
		list1.add(new VechicleList_03("WA354", "Honda",60));
		
		System.out.println("\nVehicle  Information with parking mins in List 1 :");
		for(VechicleList_03 vc: list1) 
			System.out.println("Vehicle Number =" + vc.VNo + ", Model =" + vc.vModel + ", Parking Mins =" + vc.parkedMins);		
		
		
		ArrayList<VechicleList_03> list2 = new ArrayList<>();
		
		list2.add(new VechicleList_03("IL888", "Tesla ",70));
		list2.add(new VechicleList_03("MI324", "Camry",45));
		list2.add(new VechicleList_03("NJ66T", "CRV",95));
		list2.add(new VechicleList_03("PI6GF", "Nissan",120));
		
		System.out.println("\nVehicle  Information with parking mins in List 2 :");
		for(VechicleList_03 vc: list2) 
			System.out.println("Vehicle Number =" + vc.VNo + ", Model =" + vc.vModel + ", Parking Mins =" + vc.parkedMins);	
		
		list1.addAll(list2);
		System.out.println("\nVehicle  Information with parking mins after merging the lists :");
		for(VechicleList_03 vc: list1) 
			System.out.println("Vehicle Number =" + vc.VNo + ", Model =" + vc.vModel + ", Parking Mins =" + vc.parkedMins);	
			
		Collections.sort(list1, VechicleList_03.parkingMins);
		
		
		System.out.println("\nHighest Parking Vehicle (in miutes) from both the list : ");
		System.out.println("Vehicle Number =" + list1.get(0).VNo + ", Model =" + list1.get(0).vModel + ", Parking Mins =" + list1.get(0).parkedMins);	
	
		
		
	}
}
	
	