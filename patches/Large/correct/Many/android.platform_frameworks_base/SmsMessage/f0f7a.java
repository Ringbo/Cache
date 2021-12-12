diff --git a/telephony/java/com/android/internal/telephony/gsm/SmsMessage.java b/telephony/java/com/android/internal/telephony/gsm/SmsMessage.java
index ea030e6..2da9642 100644
--- a/telephony/java/com/android/internal/telephony/gsm/SmsMessage.java
+++ b/telephony/java/com/android/internal/telephony/gsm/SmsMessage.java
@@ -300,8 +300,8 @@
                 return null;
             }
             // TP-Data-Coding-Scheme
-            // Class 3, UCS-2 encoding, uncompressed
-            bo.write(0x0b);
+            // UCS-2 encoding, uncompressed
+            bo.write(0x08);
         }
 
         // (no TP-Validity-Period)
