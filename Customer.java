import java.util.Arrays;
class Customer{

     OrderDTO[] dtos;
	 
	 int index;
	 
	 public Customer(int size){
		 dtos = new OrderDTO[size];
		 System.out.println("Customer const created");
	 }
	 
	 public boolean creatOrder(OrderDTO dto){
		 System.out.println("inside creatOrder");
		 boolean isAdded = false ;
		 if(dto != null && dto.getName()!=null){
			 this.dtos[index++] = dto;
			 isAdded = true;
			System.out.println("Customer detail added"); 
		 }
		 else{
			 System.out.println("can not order  without customer detail");
		 }
		 
		 return isAdded;
		 
		 
	 }
	 
	 public void getOrder(){
		 System.out.println("inside getOrderDetails()");
		 
		 for (int i=0 ; i<dtos.length ;i++){
			 System.out.println(dtos[i].getId()+" "+dtos[i].getName()+" "+dtos[i].getOrderedDate()+" "+dtos[i].getAddress());
		 }
		 
	
	 }
	 
	 public boolean updateOrderNameById(int id ,String name){
		  System.out.println("inside updateOrderNameByIdNameById");
		  boolean updatedName=false;
		  for (int i=0 ; i<dtos.length ; i++){
			  if(dtos[i].getId() == id){
				  dtos[i].setName(name);
				  updatedName = true;
			  }
			  else{
				  System.out.println("Id is not matching");
			  }
		  }
		  
		  return updatedName;
	  }
	  
	  public boolean updateOrderAddressByName(String name , String address){
		  System.out.println("inside updateOrderAdderssByName");
		  boolean updatedAddress=false;
		  for(int i=0; i<dtos.length;i++){
		  if(dtos[i].getName().equals(name)){
			  dtos[i].setAddress(address);
			  updatedAddress = true;
		  }
		  else{
			  System.out.println("Name is not matching");
		  }
		 }
		 
		 return updatedAddress;
	  }
	  
	   public boolean deleteOrderByName(String name){
		  boolean orderdeleted = false;
		  System.out.println("inside deleteOrderByName");
		  int i,j;
		  for (i=0,j=0 ; j<dtos.length; j++){
			  if (!dtos[j].getName().equals(name)){
				 // dtos[i] = null ;
				 
				 dtos[i++] = dtos[j];
				 orderdeleted = true;
			  }
			  else{
				  System.out.println("Order name not found");
			  }
		  }
			  dtos =  Arrays.copyOf(dtos,i);
		   	  return orderdeleted;  
	 }
	 
	 public boolean deleteOrderById(int id){
		  boolean orderdeleted = false;
		  System.out.println("inside deleteOrderById");
		  int i,j;
		  for (i=0,j=0 ; j<dtos.length; j++){
			  if (!dtos[j].getId().equals(id)){
				 // dtos[i] = null ;
				 
				 dtos[i++] = dtos[j];
				 orderdeleted = true;
			  }
			  else{
				  System.out.println("Order id not found");
			  }
		  }
			  dtos =  Arrays.copyOf(dtos,i);
		   	  return orderdeleted;  
	 }
	 
}