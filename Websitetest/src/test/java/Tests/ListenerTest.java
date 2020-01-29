package Tests;

import org.testng.ITestContext ;		
import org.testng.ITestListener ;		
import org.testng.ITestResult ;		

public class ListenerTest implements ITestListener						
{		

    @Override		
    public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		System.out.println("listener");
    }		

    @Override		
    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        log("F");

    }		

    @Override		
    public void onTestFailure(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub				
    	 log("S");
    }		

    @Override		
    public void onTestStart(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult arg0) {					
        // TODO Auto-generated method stub				
    	 log(".");
    }	
    private void log(String string) {
        System.out.print(string);
       
        }
}		