diff --git a/telephony/java/com/android/internal/telephony/SmsMessageBase.java b/telephony/java/com/android/internal/telephony/SmsMessageBase.java
index 3f0213b..3c2f2ed 100644
--- a/telephony/java/com/android/internal/telephony/SmsMessageBase.java
+++ b/telephony/java/com/android/internal/telephony/SmsMessageBase.java
@@ -383,7 +383,7 @@
          * 2. [x@y][ ]/[body]
          */
          String[] parts = messageBody.split("( /)|( )", 2);
-         if (parts.length < 1) return;
+         if (parts.length < 2) return;
          emailFrom = parts[0];
          emailBody = parts[1];
          isEmail = true;
