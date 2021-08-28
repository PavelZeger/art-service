package com.artservice.config;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Pavel Zeger
 * @implNote art-service
 * @since 28/08/2021
 */
@Configuration
public class JasyptConfig {

    @Value("${jasypt.encryptor.password}")
    private String jasyptEncryptorPassword;

    @Value("${jasypt.encryptor.algorithm}")
    private String jasyptEncryptorAlgorithm;

    @Value("${jasypt.encryptor.iv-generator-classname}")
    private String jasyptEncryptorIvGeneratorClassname;

    @Value("${jasypt.encryptor.salt-generator-classname}")
    private String jasyptEncryptorSaltGeneratorClassname;

    @Value("${jasypt.encryptor.key-obtention-iterations}")
    private String jasyptEncryptorKeyObtentionIterations;

    @Value("${jasypt.encryptor.pool-size}")
    private String jasyptEncryptorPoolSize;

    @Value("${jasypt.encryptor.provider-name}")
    private String jasyptEncryptorProviderName;

    @Value("${jasypt.encryptor.string-output-type}")
    private String jasyptEncryptorStringOutputType;

    @Bean(name = "jasyptStringEncryptor")
    public StringEncryptor stringEncryptor() {
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword(jasyptEncryptorPassword);
        config.setAlgorithm(jasyptEncryptorAlgorithm);
        config.setKeyObtentionIterations(jasyptEncryptorKeyObtentionIterations);
        config.setPoolSize(jasyptEncryptorPoolSize);
        config.setProviderName(jasyptEncryptorProviderName);
        config.setSaltGeneratorClassName(jasyptEncryptorSaltGeneratorClassname);
        config.setIvGeneratorClassName(jasyptEncryptorIvGeneratorClassname);
        config.setStringOutputType(jasyptEncryptorStringOutputType);

        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        encryptor.setConfig(config);
        return encryptor;
    }

}
