package com.tambapps.fft4j.fourier.filtering;

import com.tambapps.fft4j.complex.Complex;

/**
 * A threshold filter. Filters values that are greater/lower than a threshold
 */
public class ThresholdFilter extends AbstractFilter {

  private final double threshold;
  private final boolean filterLower;

  /**
   * Creates a threshold filter
   *
   * @param threshold   the threshold
   * @param filterLower whether to filter values lower or greater than the threshold
   */
  protected ThresholdFilter(double threshold, boolean filterLower) {
    this.threshold = threshold;
    this.filterLower = filterLower;
  }

  @Override
  Complex apply(Complex c, int i, int j, int M, int N) {
    if (filterLower) {
      return c.abs() < threshold ? c : Complex.ZERO;
    } else {
      return c.abs() > threshold ? c : Complex.ZERO;
    }
  }
}
