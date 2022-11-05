package com.neutron.youchat_backend.controller;

import com.neutron.youchat_backend.common.RSAUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RSAController {

    /**
     * 向前端返回rsa公钥
     * @return rsa公钥
     */
    @GetMapping("/getPublicKey")
    public String getPublicKey(){
        RSAUtils rsaUtils = RSAUtils.getRsaUtils();
        return rsaUtils.getPublicKey();
    }

}
