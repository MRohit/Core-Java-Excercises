class MarketingExecutive extends Employee {
		float km,tour_allow,tele_allow;
		MarketingExecutive(){
			super();
			km=123.f;
			tour_allow=123.4f;
			tele_allow=1500;
		}
		MarketingExecutive(int emp_id,String name,double sal,float hra,float med,float km,float tour_allow,float tele_allow){
			super(emp_id,name,sal,hra,med);
			this.km=km;
			this.tour_allow =tour_allow;
			this.tele_allow =tele_allow;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString()+km+"\t"+tour_allow+"\t"+tele_allow;		
		}
		void Calculate(){
			tele_allow=1500f;	
			pf=(float) (1.2*sal);
			gross_sal=(float) (sal+hra+med);
			net_sal=gross_sal-pf;
		}
		public static void main(String[] args) {
			MarketingExecutive e=new MarketingExecutive();
			e.Calculate();
			System.out.println("Marketing Details");
			
			System.out.println(e);
			MarketingExecutive e1=new MarketingExecutive(1,"asd",123,123.3f,1.5f,123.5f,1,1500f);
			e1.Calculate();
			System.out.println("Marketing Details");
			
			System.out.println(e1);
		}
		
}

