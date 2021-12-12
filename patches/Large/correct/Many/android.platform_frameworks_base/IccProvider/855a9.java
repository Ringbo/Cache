diff --git a/telephony/java/com/android/internal/telephony/IccProvider.java b/telephony/java/com/android/internal/telephony/IccProvider.java
index 8b54ca8..ff0eca9 100644
--- a/telephony/java/com/android/internal/telephony/IccProvider.java
+++ b/telephony/java/com/android/internal/telephony/IccProvider.java
@@ -273,7 +273,7 @@
             }
         }
 
-        if (TextUtils.isEmpty(tag)) {
+        if (TextUtils.isEmpty(number)) {
             return 0;
         }
 
