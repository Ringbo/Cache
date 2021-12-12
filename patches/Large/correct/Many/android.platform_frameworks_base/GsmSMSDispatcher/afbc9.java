diff --git a/telephony/java/com/android/internal/telephony/gsm/GsmSMSDispatcher.java b/telephony/java/com/android/internal/telephony/gsm/GsmSMSDispatcher.java
index 347b3af..8bf5d19 100644
--- a/telephony/java/com/android/internal/telephony/gsm/GsmSMSDispatcher.java
+++ b/telephony/java/com/android/internal/telephony/gsm/GsmSMSDispatcher.java
@@ -152,7 +152,13 @@
             concatRef.refNumber = refNumber;
             concatRef.seqNumber = i + 1;  // 1-based sequence
             concatRef.msgCount = msgCount;
-            concatRef.isEightBits = false;
+            // TODO: We currently set this to true since our messaging app will never
+            // send more than 255 parts (it converts the message to MMS well before that).
+            // However, we should support 3rd party messaging apps that might need 16-bit
+            // references
+            // Note:  It's not sufficient to just flip this bit to true; it will have
+            // ripple effects (several calculations assume 8-bit ref).
+            concatRef.isEightBits = true;
             SmsHeader smsHeader = new SmsHeader();
             smsHeader.concatRef = concatRef;
 
