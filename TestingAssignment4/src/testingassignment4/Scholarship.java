
package testingassignment4;


public class Scholarship {
    
    public int scholarship(int fscMarks, int entryTestMarks , boolean hafizQuran){
        if ( (fscMarks >=80 && entryTestMarks >=50) && hafizQuran ){
            System.out.print("85% scholarship");
            return 85;
        }
        else if ((fscMarks >=80 && entryTestMarks >=50) && !hafizQuran){
            System.out.print("70% scholarship");
            return 85;
        }
        else{
            System.out.print("you are not eligible for scholarship");
            return -1;
        }

    }
}
