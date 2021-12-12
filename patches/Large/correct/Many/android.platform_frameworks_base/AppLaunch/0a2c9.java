diff --git a/tests/AppLaunch/src/com/android/tests/applaunch/AppLaunch.java b/tests/AppLaunch/src/com/android/tests/applaunch/AppLaunch.java
index 272653f..4d2f97f 100644
--- a/tests/AppLaunch/src/com/android/tests/applaunch/AppLaunch.java
+++ b/tests/AppLaunch/src/com/android/tests/applaunch/AppLaunch.java
@@ -664,7 +664,8 @@
                     if (lineCount == 2 && line.contains(SUCCESS_MESSAGE)) {
                         launchSuccess = true;
                     }
-                    if (launchSuccess && lineCount == 4) {
+                    // Parse TotalTime which is the launch time
+                    if (launchSuccess && lineCount == 5) {
                         String launchSplit[] = line.split(":");
                         launchTime = launchSplit[1].trim();
                     }
