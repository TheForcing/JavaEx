package com.javaex;

public class OperatorEx {
	public OperatorEx() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		arithOperEx();

	private static void logicOperEx() {
		// TODO Auto-generated method stub
		bitShiftOperEx();
	}
	// 산술 연산
	private static void arithOperEx() {
		int a=7, b=3;
		
		// 부호 연산자; +, -
		System.out.println(-a);
		
		// 사칙연산; +, -, *, / 
		System.out.println(a/b);  // int/ int => int
		System.out.println(a%b); // 정수 나눗셈의 나머지
		
	    // 실제 해 구하기
		System.out.println((float)a/(float)b);
		System.out.println((float)a/b);
		
		// 증감 연산자 ++, --
		// 전치 증감 (++a 등) 후치 증감 (b--) 혼동하지 말자
	    
	
		int num = 10;
		System.out.println("num :"+num);
		System.out.println("++num :" + ++num);
		System.out.println("num :" + num);
	    
		// 후치 증감
		System.out.println("num:" + num);
		System.out.println("num++:" + num++);
		System.out.println("num:" + num);
		
		
		// 나눗셈 보충
	//	System.out.println(4/0); // ArithmeticException
		System.out.println(4.0/0);  //infinity
		System.out.println(4.0/0+10); //infinity포함됨 연산-> infinity
		System.out.println(0.0/0.0);   // NaN(Not a Number)
		
		// 우리의 연산식의 결과가 Infinity인지 확인
		System.out.println(Double.isInfinite(4.0/0));
		System.out.println(Double.isNaN(0.0/0.0));	
		System.out.println("End of code");
		
		// 비교 연산과 논리 연산

		    
		    //비교연산자 : >=, <=, !=, ==
		    System.out.println(("a>b?") + (a>b));
		    System.out.println("a와 b가 같습니까?" + (a==b));
		    System.out.println("a와 b가 다릅니까?" + (a!=b));
		    
		// 논리 연산자: 논리곱 (And:&&) 논리합(or:::), 논리부정(Not:!)
		    
		   int num1= 5;
		// num: 0초과 10미만의 값인가?
		//  조건1: num>0
		//  조건2: num<10
		// 결과 조건1 and 조건2
		   boolean r1= num1>0;
		   boolean r2= num1<10;
		   boolean r1andr2 = r1 && r2;
		   // num1>0 && num1<10
		   System.out.println("r1 && r2=:" + r1andr2);

		   // num1: 0이하이거나 10이상의 값인가?
		   //   조건1= num1<=0 ?
		   //   조건2= num1>=10?
		   //  결과: 조건1 or 조건2 (논리합 : 합집합)
		   boolean r3= num1<=0;
		   boolean r4= num1>=10;
		   boolean r3orr4 = r3||r4;
		   // num1 <=0 :: num1>=10
		   System.out.println("r3||r4=" + r3orr4);
		   
		   // 논리부정:
		   // num1>0 && num1<10 -> 논리 부정
		   // num1<=0 || num1 >= 19
		   boolean rnot= !(num1>0 && num1<10);
		   System.out.println("num1가 0초과 , 10미만 이외의 값인가?" + rnot);
		   
		   //논리 연산자
		   private static void bitOperEx(); {
			   //하드웨어 제어, 이미지 처리 등
			   // 미세하게 비트 단위 데이터 제어에 활용
			   byte b1= 0b1101;
			   byte b2= 0b0111;
		   System.out.println("b1:" + Integer.toBinaryString(b1)):
		   System.out.println("b2:" + Integer.toBinaryString(b2)):
		   int result = b1&b2;  // 비트 논리곱
	       System.out.println("b1&b2:" + Integer.toBinaryString(result):
	    	   
		   result = b1||b2; // 비트 논리합
	       System.out.println("b1||b2:" + Integer.toBinaryString(result):
		   
	       result = ~b1: // 비트 논리부정
	       System.out.println("~b1:" + Integer.toBinaryString(result):
		   
		   result = b1 ^ b2; // 배타적 논리합
	       System.out.println("b1^b2:" + Integer.toBinaryString(result):
		   
	    	   
	    	// 비트 시프트 전산자
	    	   private static void bitShhiftOperEx() {
	    	   // 비트단위로 이동
	    	   int val=1;
	    	   // 좌측 시프트(<<)
	    	   System.out.println(val);
	    	   System.out.println(Integer.toBinaryString(val<<1)); //왼쪽 1비트
	    	   System.out.println(Integer.toBinaryString(val<<4)); //왼쪽 4비트
	    	   
	    	   
	    	   // 우측 시프트(>>)
	    	   val= -2021;
	    	   System.out.println(Integer.toBinaryString(val>>2)); //우측 2비트
	    	   System.out.println(Integer.toBinaryString(val);
	    	   
	    	   // 우측 시프트(>>>)
	    	   
	       }
		   }
		   
		
	}
	
		
	}

	private static void bitOperEx() {
		// TODO Auto-generated method stub
		
	}

	private static void arithOperEx() {
		// TODO Auto-generated method stub
		
	}
	
		

}