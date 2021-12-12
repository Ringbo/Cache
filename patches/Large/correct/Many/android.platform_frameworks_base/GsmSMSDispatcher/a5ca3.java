diff --git a/telephony/java/com/android/internal/telephony/gsm/GsmSMSDispatcher.java b/telephony/java/com/android/internal/telephony/gsm/GsmSMSDispatcher.java
index 2fce188..699142a 100644
--- a/telephony/java/com/android/internal/telephony/gsm/GsmSMSDispatcher.java
+++ b/telephony/java/com/android/internal/telephony/gsm/GsmSMSDispatcher.java
@@ -122,7 +122,7 @@
             byte[][] pdus = new byte[1][];
             pdus[0] = sms.getPdu();
 
-            if (smsHeader.portAddrs != null) {
+            if (smsHeader != null && smsHeader.portAddrs != null) {
                 if (smsHeader.portAddrs.destPort == SmsHeader.PORT_WAP_PUSH) {
                     mWapPush.dispatchWapPdu(sms.getUserData());
                 }
