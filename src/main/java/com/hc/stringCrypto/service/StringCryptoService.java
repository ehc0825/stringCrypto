package com.hc.stringCrypto.service;

import com.hc.stringCrypto.config.JasyptConfig;
import com.hc.stringCrypto.dto.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StringCryptoService {


    @Autowired
    JasyptConfig jasyptConfig;

    public Param encrypted(Param param)
    {
        param.setStr(jasyptConfig.encryptor().encrypt(param.getStr()));
        return param;
    }

    public Param decrypted(Param param)
    {
        param.setStr(jasyptConfig.encryptor().decrypt(param.getStr()));
        return param;
    }


}
