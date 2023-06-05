package Misc;

public class RemoveWhitespaces {

	public static void main(String[] args) {
		String str="I  am Software    Quality   Engg";
        String[] split = str.split(" ");

        for(int i= 0; i< split.length; i++){
            System.out.print(split[i]);
        }


    }

}

