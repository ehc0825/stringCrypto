package com.hc.stringCrypto.controller;

import com.hc.stringCrypto.config.JasyptConfig;
import com.hc.stringCrypto.dto.Param;
import com.hc.stringCrypto.service.StringCryptoService;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringCryptoController {


    @Autowired
    StringCryptoService stringCryptoService;

    @PostMapping("/encrypted")
    public Param encrypted(@RequestBody Param param)
    {
        return stringCryptoService.encrypted(param);
    }

    @PostMapping("/decrypted")
    public Param decrypted(@RequestBody Param param)
    {
        return stringCryptoService.decrypted(param);
    }

}
