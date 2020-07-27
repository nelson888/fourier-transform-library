package com.tambapps.fft4j.fourier.fft_2d.task

import com.tambapps.fft4j.complex.array2d.CArray2D
import com.tambapps.fft4j.complex.vector.CVector
import com.tambapps.fft4j.fourier.fft_1d.FFTAlgorithm

class FourierTransformRowTask(algorithm: FFTAlgorithm, data: CArray2D, index: Int) : AbstractFourierRowTask(algorithm, data, index) {

    override fun computeVector(vector: CVector) {
        algorithm.compute(vector)
    }
}