package com.hc.stringCrypto.service;

import com.hc.stringCrypto.config.JasyptConfig;
import com.hc.stringCrypto.dto.Param;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.stereotype.Service;

@Service
public class StringCryptoService {


    private StringEncryptor encryptor;

    StringCryptoService(JasyptConfig jasyptConfig)
    {
        this.encryptor= jasyptConfig.jasyptStringEncryptor();
    }

    public Param encrypted(Param param)
    {
        param.setStr(encryptor.encrypt(param.getStr()));
        return param;
    }

    public Param decrypted(Param param)
    {
        param.setStr(encryptor.decrypt(param.getStr()));
        return param;
    }


}
