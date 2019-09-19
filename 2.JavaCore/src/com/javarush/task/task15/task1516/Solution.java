package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {
    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;
    public Solution solution;
    public static void main(String[] args) {
      /*  try {
            Solution solution = new Solution();
            Field[] fields = solution.getClass().getFields();

            for (Field field : fields)
                System.out.println(field.get(solution));
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }*/
        Solution sol = new Solution();
        System.out.println(sol.intVar);
        System.out.println(sol.doubleVar);
        System.out.println(sol.DoubleVar);
        System.out.println(sol.booleanVar);
        System.out.println(sol.ObjectVar);
        System.out.println(sol.ExceptionVar);
        System.out.println(sol.StringVar);
        System.out.println(sol.solution);
    }
}
