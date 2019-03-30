package com.stackroute;

public class ConsecutiveNumbers {
    public String checkConsecutiveNumbers(String numbers)
    {
        String[] num = numbers.split(",");

        int res[] = new int[num.length];
        for(int i=0;i<res.length;i++)
        {
            res[i]=Integer.parseInt(num[i]);
        }
        int sum=0;
        for(int i=0;i<res.length-1;i++)
        {
            int temp = res[i+1]-res[i];
            if(temp>0)
                sum+=temp;
            else
                sum-=temp;
        }
        if(sum==res.length-1)
            return "consecutive numbers";
        else
            return "not consecutive numbers";
    }
}
