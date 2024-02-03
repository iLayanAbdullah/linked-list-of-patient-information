
public class Hospital {
	
	PatientInfo front,last;
	Hospital() {  // constructor to set front and last as null
		front=null;
		last=null; }
	// 
	public void insert(PatientInfo node)  {//method for inserting nodes
		PatientInfo temp=front;  //set the temprory variable as the front
	while(temp!=null) //while temp is not null keep moving to the next
		temp=temp.next;
	if(front==null) //if the front equals to null set front and last as null
	{ front=node;
	last=node;
	} 
	else {//if else let last.next be the last node
		last.next=node;
		last=node; 
		} 
	System.out.println("Inserted Successfully");
	}
	public void remove(String id_no) { // method for removing node by the given ID
		//intialize two objects one for the previous one as the front node

		PatientInfo prev=null;
		PatientInfo node=front; 
	 while(node!=null && !node.id_num.equals(id_no)) {//if the node is not null ID of the node is not as the given id put prev as node and go forward
		 prev=node;
		 node=node.next; 
		 } 
	 if(node==null)//if node is null do the print statement
		 System.out.println("ID number not found");
	 else if(prev==null) {//if prev is null move front to the next
		 
		 front=front.next;
		 if(front==null) // if front equals to null set last as null
			 last=null;
		 System.out.println("Deleted Successfully"); 
		 }
	 else //if else set prev.next equals to node.next
		 {
		 prev.next=node.next;
		 System.out.println("Deleted Successfully");
		 } 
	 }
	 
	 
	public void update(String first_name,String last_name,String phone_number,String address,String id_no){  // method for updating persons info by ID
	
		boolean found=false;
	PatientInfo node=front;
	while(node!=null) {
		if(node.id_num.equals(id_no)) {//if ID found update


	node.first_name=first_name; 
	node.last_name=last_name;
	node.phone_number=phone_number;
	node.address=address;
	found=true;
	}
	node=node.next;
	}
	if(!found) //if no ID found
		System.out.println("No person found with given Id Number");
	else
		System.out.println("Updated Successfully");
	}
	public void display() { //displaying nodes

		PatientInfo node=front;
	while(node!=null) {
		System.out.println(node.toString());
		node=node.next; 
		} }

	public void search(String id) // method for searching for a person given ID
	{ 
		PatientInfo node=front;
	boolean found=false;
	while(node!=null) {//if node is not null search for the ID 
		if(node.id_num.equals(id)) {//checking 
			System.out.println(node.toString()); 
			found=true; 
			}
		node=node.next;
		}
	if(!found) System.out.println("No person found with given ID ");//if ID not exist
	}

	public void sort() // method for sorting data in alphabetical order 
	{
		PatientInfo node1=front;
	while(node1!=null) {
		PatientInfo node2=node1.next; 
		while(node2!=null) {
			if(node1.first_name.compareTo(node2.first_name)>0) {//compare between two nodes by their first names
				swap(node1,node2);//swaping method 
			} 
			node2=node2.next;// then put the first and secound node to next
			}
		node1=node1.next; 
			}
	System.out.println("Sorted Successfully"); }

	public void swap(PatientInfo n1,PatientInfo n2) {// swaping the info between two nodes
		String temp="";

		//first name swaping
	temp=n1.first_name;
	n1.first_name=n2.first_name; 
	n2.first_name=temp;
	//last name swaping
	temp=n1.last_name; 
	n1.last_name=n2.last_name;
	n2.last_name=temp;
	
	//swaping phone numbers
	 temp=n1.phone_number;
	 n1.phone_number=n2.phone_number; 
	 n2.phone_number=temp;
	 
	 //swaping the address
	temp=n1.address;
	n1.address=n2.address;
	n2.address=temp;
	
	//swaping the ID
	temp=n1.id_num; 
	n1.id_num=n2.id_num;
	n2.id_num=temp;
	
	//swaping the gender
	char t=n1.gender;
	n1.gender=n2.gender; 
	n2.gender=t; 
	}}


