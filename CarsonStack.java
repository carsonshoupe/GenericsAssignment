import java.util.HashMap;
import java.util.Map;

public class CarsonStack {
	//Variables:
	public static Map<Integer, Integer> carsonMap;  
	
	CarsonStack(){
		this.carsonMap = new HashMap<Integer, Integer>();
	}
  
	public void push(int a){
		int newKey = 0;  
		newKey = carsonMap.size(); 
		carsonMap.put(newKey, a); 
	}
	public int pop() {
		int outputKey = carsonMap.size()-1;
		int outputValue = carsonMap.get(outputKey);
		carsonMap.remove(outputKey);
		return outputValue;
	}


	
public static void main(String args[]){
	CarsonStack s = new CarsonStack();
	  
	s.push(1);
	s.push(2);
	s.push(3);
	
	System.out.println(CarsonStack.carsonMap.entrySet());
	  
	System.out.println("a = " + s.pop());
	System.out.println("b = " + s.pop());
	System.out.println("c = " + s.pop());
}
}