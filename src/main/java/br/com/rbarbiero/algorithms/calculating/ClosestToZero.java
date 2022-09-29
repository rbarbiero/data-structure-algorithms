package br.com.rbarbiero.algorithms.calculating;

public class ClosestToZero {

  public int execute(int[] ints) {

    int aboveZero = 0;
    int belowZero = 0;

    for (int value : ints) {

      if (value >= 0 && (aboveZero == 0 || value < aboveZero)) {
        aboveZero = value;
      }

      if (value <= 0 && (belowZero == 0 || value > belowZero)) {
        belowZero = value;
      }
    }

    int positiveValue = belowZero * -1;

    if (positiveValue == aboveZero) {
      return aboveZero;
    } else {
      return (positiveValue > aboveZero)
          ? aboveZero
          : belowZero;
    }
  }
}
