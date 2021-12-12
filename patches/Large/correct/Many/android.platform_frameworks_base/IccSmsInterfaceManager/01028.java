diff --git a/telephony/java/com/android/internal/telephony/IccSmsInterfaceManager.java b/telephony/java/com/android/internal/telephony/IccSmsInterfaceManager.java
index 9763265..5fef6de 100644
--- a/telephony/java/com/android/internal/telephony/IccSmsInterfaceManager.java
+++ b/telephony/java/com/android/internal/telephony/IccSmsInterfaceManager.java
@@ -112,7 +112,7 @@
      */
     public void sendText(String destAddr, String scAddr,
             String text, PendingIntent sentIntent, PendingIntent deliveryIntent) {
-        mPhone.getContext().enforceCallingOrSelfPermission(
+        mPhone.getContext().enforceCallingPermission(
                 "android.permission.SEND_SMS",
                 "Sending SMS message");
         if (Log.isLoggable("SMS", Log.VERBOSE)) {
