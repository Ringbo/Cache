diff --git a/core/java/android/service/notification/ZenModeConfig.java b/core/java/android/service/notification/ZenModeConfig.java
index 8763496..6da9019 100644
--- a/core/java/android/service/notification/ZenModeConfig.java
+++ b/core/java/android/service/notification/ZenModeConfig.java
@@ -364,7 +364,7 @@
     private static long tryParseLong(String value, long defValue) {
         if (TextUtils.isEmpty(value)) return defValue;
         try {
-            return Long.valueOf(value);
+            return Long.parseLong(value);
         } catch (NumberFormatException e) {
             return defValue;
         }
