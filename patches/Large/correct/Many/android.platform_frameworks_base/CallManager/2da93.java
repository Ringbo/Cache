diff --git a/telephony/java/com/android/internal/telephony/CallManager.java b/telephony/java/com/android/internal/telephony/CallManager.java
index 7a026fa..b09df82 100644
--- a/telephony/java/com/android/internal/telephony/CallManager.java
+++ b/telephony/java/com/android/internal/telephony/CallManager.java
@@ -925,7 +925,7 @@
         }
 
         if (hasActiveFgCall()) {
-            getActiveFgCall().getPhone().sendDtmf(c);
+            getActiveFgCall().getPhone().startDtmf(c);
             result = true;
         }
 
