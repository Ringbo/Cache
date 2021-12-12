diff --git a/telephony/java/com/android/internal/telephony/cdma/CdmaSMSDispatcher.java b/telephony/java/com/android/internal/telephony/cdma/CdmaSMSDispatcher.java
index 2bb17e4..a3d00d7 100644
--- a/telephony/java/com/android/internal/telephony/cdma/CdmaSMSDispatcher.java
+++ b/telephony/java/com/android/internal/telephony/cdma/CdmaSMSDispatcher.java
@@ -138,7 +138,7 @@
             byte[][] pdus = new byte[1][];
             pdus[0] = sms.getPdu();
 
-            if (smsHeader.portAddrs != null) {
+            if (smsHeader != null && smsHeader.portAddrs != null) {
                 if (smsHeader.portAddrs.destPort == SmsHeader.PORT_WAP_PUSH) {
                     // GSM-style WAP indication
                     mWapPush.dispatchWapPdu(sms.getUserData());
