import java.math.BigDecimal;

class FloatingPointPrecision
{
	//Create two BigDecimal
	static BigDecimal b1;
	static BigDecimal b2;	
	
	//Create scale
	static int DEF_DIV_SCALE = 10;
	
	//Create no-arg constructor
	public FloatingPointPrecision(){
		
	}
	
	//Add method
	public static double add(double d1,double d2){

		b1 = new BigDecimal(Double.toString(d1));
		b2 = new BigDecimal(Double.toString(d2));

		return b1.add(b2).doubleValue();	
	}
	
	//Subtract method
	public static double sub(double d1,double d2){

		b1 = new BigDecimal(Double.toString(d1));
		b2 = new BigDecimal(Double.toString(d2));

		return b1.subtract(b2).doubleValue();
	}
	
	//Multiply method
	public static double mul(double d1,double d2){

		b1 = new BigDecimal(Double.toString(d1));
		b2 = new BigDecimal(Double.toString(d2));

		return b1.multiply(b2).doubleValue();
	}
	
	//Divide method
	public static double div(double d1,double d2,int scale){
		
		b1 = new BigDecimal(Double.toString(d1));
		b2 = new BigDecimal(Double.toString(d2));
				
		if(scale<0){			
			return b1.divide(b2).doubleValue();
		}else			
			return b1.divide(b2,scale,BigDecimal.ROUND_HALF_UP).doubleValue();

	}
}
