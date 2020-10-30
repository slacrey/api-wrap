package com.seelyn.apiwrap;

import java.util.concurrent.TimeUnit;

/**
 * API包裹存储接口
 *
 * @author linfeng-eqxiu
 */
public interface WrapStore {

    /**
     * 存入appKey及appSecret
     *
     * @param appKey    应用Key
     * @param appSecret 应用密钥
     */
    void putSecret(String appKey, String appSecret);

    /**
     * 取出存储的密钥
     *
     * @param appKey 应用Key
     * @return 密钥
     */
    String getSecret(String appKey);

    /**
     * @param appKey    应用Key
     * @param timestamp 时间戳
     * @param nonce     随机数
     * @param signature 签名字符串
     * @param time      时间
     * @param unit      时间单位
     */
    void putSign(String appKey, long timestamp, int nonce,
                 String signature, Long time, TimeUnit unit);

    /**
     * 取出签名字符串
     *
     * @param appKey    应用Key
     * @param timestamp 时间戳
     * @param nonce     随机数
     * @return 签名字符串
     */
    String getSign(String appKey, long timestamp, int nonce);

}