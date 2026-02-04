/*
 * Copyright (C) 2026 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.internal.telephony.metrics;

public final class TelephonyMetrics {
    private static final TelephonyMetrics INSTANCE = new TelephonyMetrics();

    private TelephonyMetrics() {
        // No-op
    }
    public static TelephonyMetrics getInstance() {
        return INSTANCE;
    }
    public void writeOnRilTimeoutResponse(int serial, int request, int phoneId) {
        // No-op
    }
    public void writeOnRilSolicitedResponse(int serial, int request, int error,
            int phoneId, Object response) {
        // No-op
    }
    public void writeRilAnswer(int phoneId, int token) {
        // No-op
    }
    public void writeRilSendSms(int phoneId, int token, int msgRef, int error,
            long messageId) {
        // No-op
    }
}
