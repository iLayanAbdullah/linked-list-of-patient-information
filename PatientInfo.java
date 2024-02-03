
public class PatientInfo {
		String first_name,last_name,phone_number,address,id_num;
		char gender; 
		PatientInfo next=null;
		PatientInfo(String first_name,String last_name,String phone_number,String address,char gender,String id_num) { 
		this.first_name=first_name;
		this.last_name=last_name;
		this.phone_number=phone_number;
		this.address=address;
		this.gender=gender; 
		this.id_num=id_num; }
	public String toString() {
	return
			"\nFirst Name: "+this.first_name+"\nLast Name:"+this.last_name+
			"\nPhone Number: "+this.phone_number+ "\nAddress: "+this.address+
			"\nGender: "+this.gender+"\nID Number:"+this.id_num+"\n" ;}
	

}
