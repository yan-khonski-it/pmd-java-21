package com.yk.utils.java21pmd.app.utils;

public final class NumberUtils {

  private NumberUtils() {
    throw new AssertionError("Instance is not allowed.");
  }

  // try to rename it to fo(n)
  public static String convertNumberToString(int number) {
    return "[" + number + "]";
  }

  public static boolean isSpecialNumber(int number) {
    if (number <= 0) {
      return false;
    }

    if (number % 2 == 0) {
      return false;
    }

    int digitSum = 0;
    int remainingDigits = number;
    while (remainingDigits > 0) {
      digitSum += remainingDigits % 10;
      remainingDigits /= 10;
    }

    return digitSum % 2 != 0 && number < digitSum * digitSum;
  }
}
