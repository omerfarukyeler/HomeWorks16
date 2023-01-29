package Home_Works16;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Question1 {

	public static void main(String[] args) {
	NavigableMap<Integer,String>treemap =new TreeMap<Integer,String>();	

	///***ceilingEntry kullanımı ***///
//	treemap.put(1, "A");
//	treemap.put(2, "B");
//	treemap.put(3, "C");
//	treemap.put(4, "D");
//	treemap.put(6, "E");
//	treemap.put(7, "F");
//	
//	System.out.println("Ceiling key entry for 5: "
//            + treemap.ceilingEntry(5));//5 den büyük en küçük değer 6yı döndürür.
//	
	
	///***descendingKeySet kullanımı ***///
	
	
//	treemap.put(1, "A");
//	treemap.put(2, "B");
//	treemap.put(3, "C");
//	treemap.put(4, "D");
//	treemap.put(6, "E");
//	treemap.put(7, "F");
//	
//	
//	System.out.println(treemap.descendingKeySet());//büyükten küçüğe doğru yazdırdı.
//	
	
	///***firstEntry kullanımı ***///
	
//	treemap.put(2, "Java"); 
//    treemap.put(4, "CPP"); 
//    treemap.put(5, "PHP"); 
//    treemap.put(1, "Python"); 
//    treemap.put(3, "C"); 
//
//    
//    System.out.println("Lowest Entry is: " + treemap.firstEntry());//En düşük değeri yazdırır.
//	
	
	//***floorEntry(key)  kullanımı ***///
	
//	 treemap.put(10, "ten");
//	 treemap.put(7, "seven");
//	 treemap.put(19, "nineteen");
//	 treemap.put(3, "three");
//
//    
//     System.out.println("The greatest key-value less than 6 is : " //girilen sayıdan küçük en büyük sayıyı yazdırır.
//     + treemap.floorEntry(6));
	
	
	
	//***headMap(key)  kullanımı ***///
	
//	treemap.put(1, "OMER");
//	treemap.put(3, "ALI");
//	treemap.put(4, "VELI");
//	treemap.put(5, "MEHMET");
//
//    // Returning map with key less than H
//    System.out.print("Last Key in the map is : "
//                     + treemap.headMap(5));//Girilen değerden daha küçük hepsini yazdırır.
//	
	
	
	
	//***headMap(key,true) kullanımı  ***///
	
//	  treemap.put(2, "two");
//      treemap.put(1, "one");
//      treemap.put(3, "three");
//      treemap.put(6, "six");
//      treemap.put(5, "five");
//
//      System.out.println("Value is: "+ treemap.headMap(3,true));//girilen değerden eşit ve küçükleri yazdırır. 
//	
//      


	//***tailMap(key) kullanımı   ***///
	
//	   treemap.put(2, "two");
//     treemap.put(1, "one");
//     treemap.put(3, "three");
//     treemap.put(6, "six");
//     treemap.put(5, "five"); 
//     
//     
//     System.out.println(treemap.tailMap(3));//girilen değere eşit ve üstündekileri döndürür.
//	
	
	//***tailMap(key,false)   kullanımı   ***///
	
	
//	treemap.put(2, "two");
//	treemap.put(1, "one");
//	treemap.put(3, "three");
//	treemap.put(6, "six");
//	treemap.put(5, "five");
//	
//	
//	System.out.println(treemap.tailMap(3, false));// girilen değerin üstündekileri yazdırır. 
//      
	}

}
