package sept17;

//Vickie Wu
//9/17/19

public class OrdArrayTester
{
    public static void main(String[] args)
    {
        int maxSize = 100;             // array size
        OrdArray arr;                  // reference to array
        arr = new OrdArray(maxSize);   // create the array

        arr.insert(77);                // insert 10 items
        //arr.display();
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        //arr.insert(88);
        arr.display();

        int searchKey = 55;            // search for item
        System.out.println("Looking for " + searchKey);
        if( arr.find(searchKey) != arr.size() )
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        arr.display();                 // display items

        System.out.println("Deleting 00, 55, 99");
        arr.delete(00);                // delete 3 items
        arr.delete(55);
        arr.delete(99);

        arr.display();                 // display items again

       //System.out.println("\narr1:");
       OrdArray arr1= new OrdArray(5);//{1,3,15,27};
       arr1.insert(1);                // insert 10 items
       arr1.insert(3);
       arr1.insert(15);
       arr1.insert(27);
       //arr1.insert(8);
       
       //System.out.println("\narr2:");
       OrdArray arr2=new OrdArray(100);//{2,4,20,25,27,29};
       arr2.insert(2);                // insert 10 items
       arr2.insert(4);
       arr2.insert(20);
       arr2.insert(25);
       arr2.insert(27);
       /**arr2.insert(44);
       arr2.insert(55);
       arr2.insert(22);
       arr2.insert(88);
       arr2.insert(11);
       arr2.insert(00);**/
       arr2.insert(29);
       
       System.out.println("\narr1:");
       arr1.display();
       System.out.println("\narr2:");
       arr2.display();
      
     
       OrdArray mergedArr1 = arr1.merge(arr2);
       System.out.println("\narr1.merge(arr2):");
       mergedArr1.display();
       
       OrdArray mergedArr2 = arr2.merge(arr1);
       System.out.println("\narr2.merge(arr1):");
       mergedArr2.display();
    	
    }
}