package test.com.company; 

import com.company.Solution_33;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Solution_33 Tester. 
* 
* @author <Authors name> 
* @since <pre>二月 26, 2018</pre> 
* @version 1.0 
*/ 
public class Solution_33Test { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: search(int[] A, int target) 
* 
*/ 
@Test
public void testSearch() throws Exception {
    int[] A = { 3, 4, 5,1,2};
    Solution_33 sol = new Solution_33();
    System.out.println(sol.search(A,5));
} 


} 
