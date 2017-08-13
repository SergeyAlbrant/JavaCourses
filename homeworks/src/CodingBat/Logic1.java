package CodingBat;

public class Logic1 {

	public static boolean cigarParty(int cigars, boolean isWeekend) {
		  if ((isWeekend && cigars>=40) || (cigars>=40 && cigars<=60)) {
		    return true;
		  }
		  return false;

		}

	
	public static int dateFashion(int you, int date) {
		  if (you<=2 || date<=2) {
		    return 0;
		  }
		  
		  if (you>=8 || date>=8) {
		    return 2;
		  }
		  
		  return 1;
		}

	
	public static boolean squirrelPlay(int temp, boolean isSummer) {
		  if ((isSummer && temp>=60 && temp<=100) || (temp>=60 && temp<=90)){
		    return true;
		  }
		  return false;
		}

	
	public static int caughtSpeeding(int speed, boolean isBirthday) {
		  if ((isBirthday && speed<=65) || (speed<=60)){
		    return 0;
		  }
		  if ((isBirthday && speed<=85  && speed>60) || (speed<=80 && speed>60)){
		    return 1;
		  }
		  return 2;
		}

	
	public static int sortaSum(int a, int b) {
		  int sum = a+b;
		  if (sum<=19 && sum>=10){
		    return 20;
		  }
		  return sum;
		}

	
	public static String alarmClock(int day, boolean vacation) {
		  if ((vacation && day<6 && day>0) || (!vacation && (day==6 || day==0))){
		    return "10:00";
		  }
		  if (vacation && (day==6 || day==0)){
		    return "off";
		  }
		  
		  return "7:00";
		  
		}

	
	public static boolean love6(int a, int b) {

		  if (a==6 || b==6 || a+b==6 || Math.abs(a-b)==6) {
		    return true;
		  }
		  return false;
		}

	
	public static boolean in1To10(int n, boolean outsideMode) {
		  if ((outsideMode && (n>=10 || n<=1)) || (!outsideMode && n>=1 && n<=10)){
		    return true;
		  }
		  return false;
		}

	
	public static boolean specialEleven(int n) {
		  return (n % 11 == 0 || (n-1) % 11 == 0);
		}

	
	public static boolean more20(int n) {
		  return (n-1)%20==0 || (n-2)%20==0;
		}

	
	public static boolean old35(int n) {
		  return !(n % 3 == 0 && n % 5 == 0) && (n % 3 == 0 || n % 5 == 0);
		}

	
	public static boolean less20(int n) {
		  return (n+1)%20==0 || (n+2)%20==0;
		}

	
	public static boolean nearTen(int num) {
		  return num%10<3 || num%10>7;
		}

	
	public static int teenSum(int a, int b) {
		  if ((a>=13 && a<=19) || (b>=13 && b<=19)) {
		    return 19;
		  }
		  return a+b;
		}

	
	public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		  if ((isAsleep) || (!isMom && isMorning)) return false;
		  return true;
		  
		}

	
	public static int teaParty(int tea, int candy) {
		  if (tea<5 || candy<5) {
		    return 0;
		  }
		  
		  if (tea>=2*candy || candy>=2*tea) {
		    return 2;
		  }
		  
		  return 1;

		}

	
	public static String fizzString(String str) {
		  String res="";
		  if (str.substring(0,1).equals("f")){
		    res+="Fizz";
		  }
		  
		  if (str.substring(str.length()-1,str.length()).equals("b")){
		    res+="Buzz";
		  }
		  return res=="" ? str : res;
		  
		}

	
	public static String fizzString2(int n) {
		  String res="";
		  if (n % 3 == 0){
		    res+="Fizz";
		  }
		  
		  if (n % 5 == 0){
		    res+="Buzz";
		  }
		  res+="!";
		  if (res.equals("!")){
		    res=n+"!";
		  }
		  return res;
		  
		}

	
	public static boolean twoAsOne(int a, int b, int c) {
		  if ((a+b==c) || (a+c==b) || (c+b==a)){
		    return true;
		  }
		  return false;
		}

	
	public static boolean inOrder(int a, int b, int c, boolean bOk) {
		  if ((bOk && c>b) || (b>a && c>b)) {
		    return true;
		  }
		  return false;
		}

	
	public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		  if ((a<b && b<c) || (equalOk && a<=b && b<=c)){
		    return true;
		  }
		  return false;
		}

	
	public static boolean lastDigit(int a, int b, int c) {
		  if (a%10==b%10 || b%10==c%10 || a%10==c%10){
		    return true;
		  }
		  return false;
		}

	
	public static boolean lessBy10(int a, int b, int c) {
		  return Math.abs(a-b)>=10 || Math.abs(b-c)>=10 || Math.abs(a-c)>=10;
		}

	
	public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
		  if (noDoubles && die1==die2){
		    if (die1==6) {
		      die1=1;
		    }
		    else {
		      die1++;
		    };
		  }
		  return die1+die2;
		}

	
	public static int maxMod5(int a, int b) {
		  if (a==b) return 0;
		  if (a%5 == b%5){
		    return a>b ? b : a;
		  }
		  
		  return a>b ? a : b;
		}

	
	public static int redTicket(int a, int b, int c) {
		  if (a==2 && b==2 && c==2) {
		    return 10;
		  }
		  if (a==b && b==c) {
		    return 5;
		  }
		  if (a!=b && a!=c) {
		    return 1;
		  }
		  return 0;
		  
		}

	
	public static int greenTicket(int a, int b, int c) {
		  
		  if (a==b && b==c) {
		    return 20;
		  }
		  
		  if (a==b || b==c || a==c) {
		    return 10;
		  }
		  
		  return 0;
		}

	
	public static int blueTicket(int a, int b, int c) {
		  if (a+b==10 || c+b==10 || a+c==10) {
		    return 10;
		  }
		  
		  if ((a+b)-(b+c)==10 || (a+b)-(a+c)==10) {
		    return 5;
		  }
		  
		  return 0;
		}

	
	public static boolean shareDigit(int a, int b) {
		  if (a%10==b/10 || a%10==b%10 || b%10==a/10 || a/10==b/10){
		    return true;
		  }
		  return false;
		}

	
	public static int sumLimit(int a, int b) {
		  if (String.valueOf(a).length()==String.valueOf(a+b).length()){
		    return a+b;
		  }
		  return a;
		}

	
	
	
}
