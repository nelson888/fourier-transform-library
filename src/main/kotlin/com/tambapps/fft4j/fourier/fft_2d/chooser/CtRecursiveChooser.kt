package com.tambapps.fft4j.fourier.fft_2d.chooser

import com.tambapps.fft4j.fourier.fft_1d.FFTAlgorithm
import com.tambapps.fft4j.fourier.fft_1d.FourierAlgorithms
import com.tambapps.fft4j.fourier.util.Utils.is2Power

/**
 * This chooser returns the Cooley Tukey algorithm when both dimensions are a power of two, else
 * it returns the basic fft
 */
class CtRecursiveChooser : AlgorithmChooser {

    override fun getAlgorithm(M: Int, N: Int): FFTAlgorithm {
        return if (is2Power(M) && is2Power(N)) FourierAlgorithms.CT_RECURSIVE
        else FourierAlgorithms.BASIC
    }

}