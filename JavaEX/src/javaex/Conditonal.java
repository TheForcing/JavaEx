
public class Conditonal {
 import java.util.Scanner;
	public static void main(String[] args) {
//	ifElseEx();
	//	ifElsePractics();
	//	switchEx();
	//	switchEx2();
		ifElsePractics2();
		}
	    private static void switchEx2() {
	    	Scanner scanner= new Scanner(System.in);
	    	System.out.println("월을 입력하세요.");
	    	int month= scanner.nextInt();
	    	String days;
	    	switch (month) {
	    	
	    	case 2:
	        	days= "28일";
	        	break;
	    	case 1:
	    	case 3:
	    	case 5:
	    	case 7:
	    	case 8:
	    	case 10:
	    	case 12:
	    		days= 31;
	    		break;
	    	case 4:
	    	case 6:
	    	case 9:
	    	case 11:
	    		days= 30;
	    		break;
	    		
	    
	    	}
	    }
	    private static void ifElsePractics2() {
	    	Scanner scanner= new Scanner(System.in);
	    	
	    	System.out.println("점수를 입력하세요");
	    	int score= scanner.nextInt();
	    	
	    	if (score%3==0) {
	    		System.out.println("3의 배수입니다.")
	    		else 
	    		System.out.println("3의 배수가 아닙니다.")
	    	
	    	System.out.println(score);
	    	scanner.close();
	    		
	    	}
	    }
	    private static void ifElsePractics2( ) {
	    	Scanner scanner= new Scanner(System.in);
	    	
	    	System.out.println("점수를 입력하세요:");
	    	int score= scanner.nextInt();
	    	
	       if (score>=90); {
	    	   System.out.println("A등급");
	    	   else if (80<=score<90) {
	    	   System.out.println("B등급");
	    	   else if (70<=score<80) {
	    	   System.out.println("c등급");
	    	   else if	 (60<=score<70)  {
	    	   System.out.println("d등급");
	    		else
	    	   System.out.println("f등급");
	    		
	       System.out.println(score);
	       scanner.close();
	       
	    		
	    	}
	    	   }
	    	   }
	       }
	    }
	    	
	    }
	    private static void switchEx() {
           Scanner scanner= new Scanner(System.in);
			
			
			System.out.println("과목을 선택하세요");
			System.out.println("1.자바 2.C 3.C++ 4.파이썬");
			System.out.println("과목번호:"+ code );
			
			
			int code= scanner.nextInt();
			String message;
			
			switch (code) {
			case 1: // code==1
				message ="R101";
			case 2: // code==2
				message ="R202";
			case 3: // code==3
				message ="R303";
			case 4: // code==4
				message ="R405";
		    break;
			default:
		    	message ="상담사와 연락하세요.";
		    
			}
			System.out.println(message);
			scanner.close();
		}
		private static void ifElsePractics() {
			Scanner scanner= new Scanner(System.in);
			
			
			System.out.println("과목을 선택하세요");
			System.out.println("1.자바 2.C 3.C++ 4.파이썬");
			System.out.println("과목번호:"+ code );
			
			
			int code= scanner.nextInt();
			String message;
			//조건보기
			
			if (code==1) {
				System.out.println("R101호입니다."));
				else if (code==2) {
					System.out.println("R202호입니다."));
				else if (code==3) {
						System.out.println("R303호입니다."));
				else if (code==4) {
						System.out.println("R404호입니다."));
				else {
						System.out.println("상담원에게 문의하세요"));
							}
					}
				}
			}
		}
			System.out.println(message);
			scanner.close();
			
		}
		
		//중첩 if
		// 0체크 -> 0이 아닌 것 (양수, 음수)
		if (num==0)
			System.out.println("0입니다.");
		else { 
		
		}
			// 0이 아닌 것
			if (num>0) {
				System.out.println("양수입니다.");
			}
			else {
				System.out.println("음수입니다.");
			}
	
		
      scanner.close();
      
      private static void ifElseEx( ) {
    		// TODO Auto-generated method stub
  		Scanner scanner= new Scanner(System.in);
  		
  		String num= scanner.next();
  		int num= scanner.nextInt();
  		
  		
  		//조건 분기
  		// 양수 체크 -> 음수 체크 -> 0
  		/*
  		if (num>0) {
  			System.out.println("양수입니다.")
  			else if (num<0) {
  				System.out.println("음수입니다.")
  				else {
  					System.out.println("0입니다.")
  				}
  			}
      }
	}

}
