package com.haneunjung.spring.temporage.controller

import com.haneunjung.spring.temporage.contract.SampleContract
import com.haneunjung.spring.temporage.service.SampleService
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController(
    private val sampleService: SampleService
) : SampleContract {
    // fun
}