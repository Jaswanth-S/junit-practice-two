package com.stackroute;

public class StudentGrades {
    public String checkStudentGrades(int[] grades)
    {
        for(int i=0;i<grades.length;i++)
        {
            if(grades[i]<0&&grades[i]>100)
            {
                return "grades out of range";
            }
        }
        return "all grades are between 0 to 100";
    }
}
