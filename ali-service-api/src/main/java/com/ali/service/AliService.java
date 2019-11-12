package com.ali.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "ALI-PROVIDER",fallback = AliHystrix.class)
public interface AliService {

    @GetMapping("test")
    String test();
}
