package org.ycpait.studentmanagementapp.entity;

public class Student {

		private int rollNumber;
		
		//This is a has-a-relationship
		private Address postalAddress;
		
		
		private Trainer instructor;


		public Student(int rollNumber, Address postalAddress) {
			super();
			this.rollNumber = rollNumber;
			this.postalAddress = postalAddress;
		}

		public Address getPostalAddress() {
			return postalAddress;
		}
		
		
		public void setPostalAddress(Address postalAddress) {
			this.postalAddress = postalAddress;
		}

		public Trainer getInstructor() {
			return instructor;
		}


		public void setInstructor(Trainer instructor) {
			this.instructor = instructor;
		}


		
		
		
		
		
	

}
