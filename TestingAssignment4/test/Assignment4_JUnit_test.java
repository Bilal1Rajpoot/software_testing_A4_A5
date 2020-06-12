

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import testingassignment4.Scholarship;

public class Assignment4_JUnit_test {
    
    private Scholarship obj=new Scholarship();
    public Assignment4_JUnit_test() {    
    }
    
    
    @Test
    public void testPath(){
        
        // path 1
        // 123
        assertEquals(85, obj.scholarship(90, 80, true));
        // path 2
        // 1245
        assertEquals(85, obj.scholarship(85, 70, false));
        //path 3
        // 1246
        assertEquals(-1, obj.scholarship(60, 70, true));
    }
    
}
