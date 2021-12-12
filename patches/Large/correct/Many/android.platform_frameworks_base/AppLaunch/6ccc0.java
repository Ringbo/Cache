diff --git a/tests/AppLaunch/src/com/android/tests/applaunch/AppLaunch.java b/tests/AppLaunch/src/com/android/tests/applaunch/AppLaunch.java
index 83354d5..2a13093 100644
--- a/tests/AppLaunch/src/com/android/tests/applaunch/AppLaunch.java
+++ b/tests/AppLaunch/src/com/android/tests/applaunch/AppLaunch.java
@@ -477,7 +477,7 @@
 
         if (mSimplePerfCmd != null && mSimplePerfAppOnly) {
             Log.w(TAG, String.format("Passing both %s and %s is not supported, ignoring %s",
-                KEY_SIMPLEPERF_CMD, KEY_SIMPLEPERF_APP));
+                KEY_SIMPLEPERF_CMD, KEY_SIMPLEPERF_APP, KEY_SIMPLEPERF_CMD));
         }
     }
 
