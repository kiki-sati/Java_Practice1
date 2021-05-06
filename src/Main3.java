// DataType 3.
// 10진수를 8진수 혹은 16진수로 바꾸어 출력.

public class Main3 {

	public static void main(String[] args) {
	
		int a =200;
		System.out.println("10진수 : " +a);
		System.out.format("8진수 : %o\n", a); 
//				"\n 한칸 바꿈 
		// %o : 형식지정자. 어떠한 10수 정수를8진수로 출력하는 그러한 과정을 처리해라!
		System.out.format("1진수 : %x", a); 

	}

}
