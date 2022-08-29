package com.gxd.service;

import com.gxd.common.CommonResult;
import org.springframework.stereotype.Service;

public interface UmsMemberService {
    CommonResult generateAuthCode(String telephone);

    CommonResult verifyAuthCode(String telephone, String authCode);
}
