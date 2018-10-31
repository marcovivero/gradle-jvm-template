package com.github.marcovivero;

public class LookAndSayJava {

  final public static String nthTerm(int n, int seed)
  {
      String output = String.format("%s", seed);
      for (int i = 0; i < n; i++)
      {
          int oldCount = 0;
          String oldVal = "";
          String result = "";
          for (String newVal : output.split(""))
          {
              if (oldVal.equals(newVal)) {
                  oldCount += 1;
              } else {
                  String appendResult = (oldCount == 0) ? "" : String.format("%s%s", oldCount, oldVal);
                  result += appendResult;
                  oldCount = 1;
                  oldVal = newVal;
              }
          }
          result += String.format("%s%s", oldCount, oldVal);
          output = result;
      }

      return output;
  }

  public static void main(String[] args)
  {
      for (int i = 0; i < 10; i ++) {
          System.out.println(nthTerm(i, 1));
      }
  }
}
