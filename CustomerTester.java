import java.util.Scanner;

class CustomerTester{
	
	 public static void main(String args[]){
		 
		 Scanner sc = new Scanner(System.in);
		 
		   System.out.println("Enter no of order");
			    int size = sc.nextInt();
				
			Customer cus = new Customer(size);

            for (int i=0; i<size ;i++){
				OrderDTO dto = new OrderDTO();
				
		  System.out.println("Enter order ID");
		    int id = sc.nextInt();
		  System.out.println("Enter orderer Name");
            String name = sc.next(); 
          System.out.println("Enter ordered date ");
            String orderedDate = sc.next();	
		  System.out.println("Enter order Address");
		    String address = sc.next();
			
		  dto.setId(id);
          dto.setName(name);
          dto.setOrderedDate(orderedDate);
          dto.setAddress(address);		
       
          cus.creatOrder(dto);	   
			}			
			
		 cus.getOrder();
		 System.out.println("Enter the existing id for update Name");
		 int existingId = sc.nextInt();
		 System.out.println("Enter the Name to be update");
		 String updatedName = sc.nextLine();
		 cus.updateOrderNameById(existingId,updatedName);
         cus.getOrder();
		 
		 cus.getOrder();
		 System.out.println("enter the existing name for update Address");
		 String existingName = sc.next();
		 System.out.println("Enter the Address to be update");
		 String updatedAuthor = sc.next();
		 cus.updateOrderAddressByName(existingName,updatedAddress);
		 cus.getOrder();
		 
		 System.out.println("enter the Name to be delete");
		 String existingName1 = sc.next();
		 cus.deleteOrderByName(existingName1);
		 cus.getOrder();
		 
		 System.out.println("enter the Id of order to be delete");
		 int existingId = sc.nextInt();
		 cus.deleteOrderById(existingId);
		 cus.getOrder();
	 }
}