
	class Manager extends Employee {
		float pet_allow,food_allow,other_allow;
		Manager (){
			super();
			pet_allow=123.3f;
			food_allow=123.3f;
			other_allow=123.3f;
		}
		Manager(int emp_id,String name,double sal,float hra,float med,float pet_allow,float food_allow,float other_allow){
			super(emp_id,name,sal,hra,med);
			this.pet_allow=pet_allow;
			this.food_allow=food_allow;
			this.other_allow=other_allow;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString()+pet_allow+"\t"+food_allow+"\t"+other_allow;
		}
		void Calculate (){
			pet_allow=(float) (0.8*sal);
			food_allow=(float) (1.3*sal);
			other_allow=(float) (0.3*sal);
			pf=(float) (1.2*sal);
			gross_sal=(float) (sal+hra+med);
			net_sal=gross_sal-pf;
		}
		public static void main(String[] args) {
			Manager m=new Manager();
			System.out.println("Manager Details");
			System.out.println(m);
			Manager m2=new Manager(1,"cvc",5555.5f,14.f,1.5f,3.2f,4.4f,5.5f);
			System.out.println("Manager Details");
			System.out.println(m2);
		}
	}

