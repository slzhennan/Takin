/*
 * Copyright 2021 Shulie Technology, Co.Ltd
 * Email: shulie@shulie.io
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.shulie.amdb.exception;

/**
 * @Author: xingchen
 * @ClassName: AmdbExcetion
 * @Package: io.shulie.amdb.exception
 * @Date: 2020/10/1914:26
 * @Description:
 */
public class AmdbExcetion extends RuntimeException{
    public AmdbExcetion() {
    }

    public AmdbExcetion(String message) {
        super(message);
    }

    public AmdbExcetion(String message, Throwable cause) {
        super(message, cause);
    }

    public AmdbExcetion(Throwable cause) {
        super(cause);
    }

    public AmdbExcetion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
