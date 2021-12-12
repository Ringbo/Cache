diff --git a/services/java/com/android/server/am/ActivityManagerService.java b/services/java/com/android/server/am/ActivityManagerService.java
index ec209ed..4d18191 100644
--- a/services/java/com/android/server/am/ActivityManagerService.java
+++ b/services/java/com/android/server/am/ActivityManagerService.java
@@ -9538,7 +9538,7 @@
             sb.append("Subject: ").append(subject).append("\n");
         }
         sb.append("Build: ").append(Build.FINGERPRINT).append("\n");
-        if (crashInfo.durationMillis != -1) {
+        if (crashInfo != null && crashInfo.durationMillis != -1) {
             sb.append("Duration-Millis: ").append(crashInfo.durationMillis).append("\n");
         }
         sb.append("\n");
