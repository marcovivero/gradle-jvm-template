package com.github.marcovivero;

public class SampleJava {

  private static String message;

  public SampleJava(String message)
  {
      this.message = message;
  }

  final public String getMessage()
  {
      return this.message;
  }

  public static void main(String[] args)
  {
      final SampleJava sampleJava = new SampleJava("Sample Java Application");
      System.out.println(sampleJava.message);
  }
}
