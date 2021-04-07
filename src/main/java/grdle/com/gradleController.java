package grdle.com;

import java.util.Scanner;

public class gradleController {
    public boolean returnType() {
        System.out.println("gradleController returnType() 실행");
    	int aNum = 0;
    	boolean type = false;
    	Scanner input = new Scanner(System.in);
    	try{
        	aNum = input.nextInt();
    	} catch(Exception e){
            System.out.println("only int type!!!");
    	}
        if(aNum == 1){
        	type = true;
        }
        System.out.println("the type is : " + type );
        input.close();
        return type;
    }
}
