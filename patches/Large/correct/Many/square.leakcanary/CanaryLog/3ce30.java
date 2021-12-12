diff --git a/leakcanary-android/src/main/java/com/squareup/leakcanary/CanaryLog.java b/leakcanary-android/src/main/java/com/squareup/leakcanary/CanaryLog.java
index b4e288d..9db42e5 100644
--- a/leakcanary-android/src/main/java/com/squareup/leakcanary/CanaryLog.java
+++ b/leakcanary-android/src/main/java/com/squareup/leakcanary/CanaryLog.java
@@ -20,7 +20,7 @@
       if (formatted.length() < 4000) {
         Log.d("LeakCanary", formatted);
       } else {
-        String[] lines = formatted.split("\n");
+        String[] lines = formatted.split("\n", -1);
         for (String line : lines) {
           Log.d("LeakCanary", line);
         }
