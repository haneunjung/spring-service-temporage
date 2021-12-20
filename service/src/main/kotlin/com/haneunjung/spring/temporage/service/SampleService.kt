package com.haneunjung.spring.temporage.service

import com.haneunjung.spring.temporage.repository.SampleRepository
import org.springframework.stereotype.Service

@Service
class SampleService(
    private val sampleRepository: SampleRepository
) {
    // fun
}