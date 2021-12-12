diff --git a/core/java/android/service/notification/ZenModeConfig.java b/core/java/android/service/notification/ZenModeConfig.java
index 3e25edb..ddc781b 100644
--- a/core/java/android/service/notification/ZenModeConfig.java
+++ b/core/java/android/service/notification/ZenModeConfig.java
@@ -387,7 +387,7 @@
     private static long tryParseLong(String value, long defValue) {
         if (TextUtils.isEmpty(value)) return defValue;
         try {
-            return Long.valueOf(value);
+            return Long.parseLong(value);
         } catch (NumberFormatException e) {
             return defValue;
         }
