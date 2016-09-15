/*
A really cool example using conditions!!!
*/

public class PhoneNumber
{   
    /////////////////////////////////////////
    //Field Vars :: variable for to store phone number
    private String phoneNumber;
    
    ////////////////////////****************
    //Constructor :: construct the object of PhoneNumber and 
    //               initialize as 100-100-1000
    public PhoneNumber()
    {
    phoneNumber = "100-100-1000";
    }
    //************************************//
    //Method
    public void changeNumber(int areaCode, int numBegin, int numEnd)
    {
        //if areaCode is bad,tell user to input something else.
        if(areaCode<100 || areaCode>999)
        {
            System.err.println("Please use a valid number");
        }
        //if numBegin is bad,tell user to input something else.
        else if(numBegin<100 || numBegin>999)
        {
            System.err.println("Please use a valid number");
        }
        //if numEnd is bad,tell user to input something else.
        else if(numEnd<1000 || numEnd>9999)
        {
            System.err.println("Please use a valid number");
        }
        //Input PhoneNumber
        else
            phoneNumber = areaCode + "-" + numBegin + "-" + numEnd;
    }
    
    



}