package com.ali.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "ALI-PROVIDER",fallback = AliHystrix.class)
public interface AliService {
}
