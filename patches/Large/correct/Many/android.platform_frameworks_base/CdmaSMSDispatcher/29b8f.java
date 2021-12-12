diff --git a/telephony/java/com/android/internal/telephony/cdma/CdmaSMSDispatcher.java b/telephony/java/com/android/internal/telephony/cdma/CdmaSMSDispatcher.java
index 1f1f7c1..88cccd3 100644
--- a/telephony/java/com/android/internal/telephony/cdma/CdmaSMSDispatcher.java
+++ b/telephony/java/com/android/internal/telephony/cdma/CdmaSMSDispatcher.java
@@ -91,7 +91,8 @@
         int teleService = sms.getTeleService();
         boolean handled = false;
 
-        if ((sms.getUserData() == null) && (SmsEnvelope.TELESERVICE_MWI != teleService)) {
+        if ((sms.getUserData() == null) && (SmsEnvelope.TELESERVICE_MWI != teleService) &&
+            (SmsEnvelope.TELESERVICE_VMN != teleService)) {
             if (Config.LOGD) {
                 Log.d(TAG, "Received SMS without user data");
             }
