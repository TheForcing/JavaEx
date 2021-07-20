
public class Conditonal {
 import java.util.Scanner;
	public static void main(String[] args) {
//	ifElseEx();
		ifElsePractics();
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
