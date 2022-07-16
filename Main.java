import java.util.Scanner;

class Main {
	public static void problem1_calculate() {
		Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first integer: ");
        int a = input.nextInt();
        System.out.print("Please enter the second integer: ");
        int b = input.nextInt();

        System.out.printf("%-15s %7s %n", "Sum: ", a + b);
        System.out.printf("%-15s %7s %n", "Difference: ", a - b);
        System.out.printf("%-15s %7s %n", "Product: ", a * b);
        System.out.printf("%-15s %9s %n", "Average: ", (double) (a + b) / 2);
        System.out.printf("%-15s %7s %n", "Distance: ", Math.abs(a - b));
        System.out.printf("%-15s %7s %n", "Maximum: ", Math.max(a, b));
        System.out.printf("%-15s %7s %n", "Minimum: ", Math.min(a, b));
	}
	public static void problem2_removeCommas() {
		Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer between 1,000 and 999,999, using a comma after the thousands: ");
        String a = input.next();
        
        System.out.println(a.replace(",", ""));  
        
        input.close();
	} 
	public static String problem3_printDigits(int number) {
		String a = String.valueOf(number);
		char[] b = a.toCharArray();
		StringBuilder tool = new StringBuilder();
		
		for(int i = 0; i < b.length; i++) {
			tool.append(b[i]);
			tool.append(" ");
		}
		
		return tool.toString();
	} 
	
	public static double problem6_getNumericGrade(String letterGrade) {
		char[] process = letterGrade.toCharArray();
		double gpa = 0.0;	
		
		switch(process[0]) {
        case 'A' :
            gpa = 4.0;
            break;
        case 'a' :
        	gpa = 4.0;
            break;
        case 'B' :
        	gpa = 3.0;
            break;
        case 'b' :
        	gpa = 3.0;
            break;
        case 'C' :
        	gpa = 2.0;
            break;
        case 'c' :
        	gpa = 2.0;
            break;
        case 'D' :
        	gpa = 1.0;
            break;
        case 'd' :
        	gpa = 1.0;
            break;	
        case 'F' :
        	gpa = 0.0;
            break;
        case 'f' :
        	gpa = 0.0;
            break;
        default :
           return -1.0;
		}
		
		if(process.length == 1) {
			return gpa;
		}
		else if(process[1] == '+') {
			gpa = gpa + 0.3;
		}
		else if(process[1] == '-') {
			gpa = gpa - 0.3;
		}	
		
		return gpa; 
	} 
	public static String problem6_getLetterGrade(double numericGrade) {
		if(numericGrade == 4.0) {
			return "A+";
		}
		else if(numericGrade < 4.0 && numericGrade >= 3.85) {
			return "A";
		}
		else if(numericGrade < 3.85 && numericGrade >= 3.5) {
			return "A-";
		}
		else if(numericGrade < 3.5 && numericGrade >= 3.15) {
			return "B+";
		}
		else if(numericGrade < 3.15 && numericGrade >= 2.85) {
			return "B";
		}
		else if(numericGrade < 2.85 && numericGrade >= 2.5) {
			return "B-";
		}		
		else if(numericGrade < 2.5 && numericGrade >= 2.15) {
			return "C+";
		}		
		else if(numericGrade < 2.15 && numericGrade >= 1.85) {
			return "C";
		}
		else if(numericGrade < 1.85 && numericGrade >= 1.5) {
			return "C-";
		}
		else if(numericGrade < 1.5 && numericGrade >= 1.15) {
			return "D+";
		}		
		else if(numericGrade < 1.15 && numericGrade >= 0.85) {
			return "D";
		}
		else if(numericGrade < 0.85 && numericGrade >= 0.5) {
			return "D-";
		}
		else if(numericGrade < 0.5 && numericGrade >= 0 ) {
			return "F";
		}
		
		return "Error"; 
	}	
	public static String problem7_withoutX2(String str) {
		str = str.replace("x", "");
		
		return str; 
	} 
	public static String problem10_getRomanNumerals(int integer) {
		if(integer < 1 || integer >= 4000) {
			return "Error";
		}
		
		String rom = "";
		
		while(1000 <= integer) {
			rom = rom + "M";
	        integer = integer - 1000;        
	    }
	    while(900 <= integer) {
	    	rom = rom + "CM";
	        integer = integer - 900;
	    }
	    while(500 <= integer) {
	    	rom = rom + "D";
	        integer = integer - 500;
	    }
	    while(400 <= integer) {
	    	rom = rom + "CD";
	        integer = integer - 400;
	    }
	    while(100 <= integer) {
	    	rom = rom + "C";
	        integer = integer - 100;
	    }
	    while(90 <= integer) {
	    	rom = rom + "XC";
	        integer = integer - 90;
	    }
	    while(50 <= integer) {
	    	rom = rom + "L";
	        integer = integer - 50;
	    }
	    while(40 <= integer) {
	    	rom = rom + "XL";
	        integer = integer - 40;
	    }
	    while(10 <= integer) {
	    	rom = rom + "X";
	        integer = integer - 10;
	    }
	    while(9 <= integer) {
	    	rom = rom + "IX";
	        integer = integer - 9;
	    }
	    while(5 <= integer) {
	    	rom = rom + "V";
	        integer = integer - 5;
	    }
	    while(4 <= integer) {
	    	rom = rom + "IV";
	        integer = integer - 4;
	    }
	    while(1 <= integer) {
	    	rom = rom + "I";
	        integer = integer - 1;
	    }    
		  		
		return rom;
	}

	public static void main(String[] args) {
		problem1_calculate();
		
		problem2_removeCommas();
		
		System.out.println(problem3_printDigits(16384)); 
		// returns "1 6 3 8 4"
		System.out.println(problem3_printDigits(22250));
		// returns "2 2 2 5 0"
		
		Easter myEaster = new Easter(2001);
		System.out.println("Month: " + myEaster.getEasterSundayMonth()); 
		// 4
		System.out.println("Day: " + myEaster.getEasterSundayDay()); 
		// 15
		
		Triangle triangle = new Triangle(0, 5, 1.5, 2, 8, 25.92);
		System.out.println(triangle.getSide1Length()); 
		// 3.3541019662496847
		System.out.println(triangle.getSide2Length()); 
		// 22.39746414217467
		System.out.println(triangle.getSide3Length()); 
		// 24.787424230847385
		System.out.println(triangle.getAngle1()); 
		// 2.312694531902217
		System.out.println(triangle.getAngle2()); 
		// 0.7289796952097912
		System.out.println(triangle.getAngle3()); 
		// 0.09991842647778622
		System.out.println(triangle.getPerimeter());
		// 50.53899033927174
		System.out.println(triangle.getArea()); 
		// 27.690000000000044  
		
		System.out.println(problem6_getNumericGrade("G")); 
		// returns -1.0
		System.out.println(problem6_getNumericGrade("a-")); 
		// returns 3.7
		System.out.println(problem6_getNumericGrade("C+")); 
		// returns 2.3
		System.out.println(problem6_getNumericGrade("B")); 
		// returns 3.0
		
		System.out.println(problem6_getLetterGrade(2.85)); 
		// returns "B"
		System.out.println(problem6_getLetterGrade(0.51)); 
		// returns "D-"
		System.out.println(problem6_getLetterGrade(4.0)); 
		// returns "A+"
		System.out.println(problem6_getLetterGrade(8.3)); 
		// returns "Error"
		
		System.out.println(problem7_withoutX2("xHi")); 
		// returns "Hi"
		System.out.println(problem7_withoutX2("Hxi")); 
		// returns "Hi"
		System.out.println(problem7_withoutX2("Hi")); 
		// returns "Hi"
		System.out.println(problem7_withoutX2("XHi")); 
		// returns "XHi" 
		
		Paycheck p1 = new Paycheck(10.5, 42);
		System.out.println(p1.getPay()); 
		// 451.5
		Paycheck p2 = new Paycheck(20, 50);
		System.out.println(p2.getPay()); 
		// 1100.0
		Paycheck p3 = new Paycheck(20, 39.5);
		System.out.println(p3.getPay()); 
		// 790.0
			
		Year y = new Year(1980);
		System.out.println(y.isLeapYear()); 
		// true
		y = new Year(1900);
		System.out.println(y.isLeapYear()); 
		// false
		y = new Year(1500);
		System.out.println(y.isLeapYear()); 
		// true
		y = new Year(1501);
		System.out.println(y.isLeapYear()); 
		// false 
		
		System.out.println(problem10_getRomanNumerals(1978)); 
		// returns "MCMLXXVIII"
		System.out.println(problem10_getRomanNumerals(29)); 
		// returns "XXIX"
		System.out.println(problem10_getRomanNumerals(4000)); 
		// returns "Error"
	}
}
