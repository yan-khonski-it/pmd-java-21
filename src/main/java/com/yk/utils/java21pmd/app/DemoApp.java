package com.yk.utils.java21pmd.app;

import com.yk.utils.java21pmd.app.core.SomeClass;
import com.yk.utils.java21pmd.app.utils.NumberUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// UnnecessaryImport
//  import java.util.ArrayList;

// Either a utility class or a normal class with a non private constructor.
@SuppressWarnings("PMD.UseUtilityClass")
public class DemoApp {

  private static final Logger LOGGER = LogManager.getLogger(DemoApp.class);

  public static void main(String[] args) {
    // a - ShortVariable
    int aVariable = 5;

    @SuppressWarnings("PMD.ShortVariable") // Here PMD ignores short name.
    int b = 6;

    int cResult = aVariable + b;
    LOGGER.info("c: {}", cResult);
    int id = 15; // id name is allowed by exception
    LOGGER.info("id: {}", id);

    // SystemPrintln
    // System.out.println("Using system out println");

    // SomeClass someClass = new SomeClass(); - LocalVariableCouldBeFinal
    SomeClass someClass = new SomeClass();
    LOGGER.info("someClass: {}", someClass);

    int number = 10;
    String convertedNumber = NumberUtils.convertNumberToString(number);
    LOGGER.info("Converted number: {} is string: {}.", number, convertedNumber);

    boolean isOddPositive = NumberUtils.isSpecialNumber(number);
    LOGGER.info("isOddPositive: {}", isOddPositive);
  }
}
