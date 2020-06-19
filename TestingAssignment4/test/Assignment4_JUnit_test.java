

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import testingassignment4.Scholarship;

public class Assignment4_JUnit_test {
    
    private Scholarship obj=new Scholarship();
    public Assignment4_JUnit_test() {    
    }
    
    @Test
    public void path1(){
        int fscMarks=90;
        int entryTestMarks= 80;
        boolean hafizQuran=true;
        int expected_output=85;
        assertEquals(expected_output, obj.scholarship(fscMarks, entryTestMarks, hafizQuran));
    
    }
    
    @Test
    public void path2(){
        int fscMarks=85;
        int entryTestMarks= 70;
        boolean hafizQuran=false;
        int expected_output=85;
        assertEquals(expected_output, obj.scholarship(fscMarks, entryTestMarks, hafizQuran));
    
    }
    @Test
    public void path3(){
        int fscMarks=60;
        int entryTestMarks= 70;
        boolean hafizQuran=true;
        int expected_output=-1;
        assertEquals(expected_output, obj.scholarship(fscMarks, entryTestMarks, hafizQuran));
    
    }
    
    
}
