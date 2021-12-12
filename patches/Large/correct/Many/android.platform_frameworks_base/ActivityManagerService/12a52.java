diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index f6f3295..1587516 100644
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -13227,10 +13227,11 @@
                     // Merge several logcat streams, and take the last N lines
                     InputStreamReader input = null;
                     try {
-                        java.lang.Process logcat = new ProcessBuilder("/system/bin/logcat",
-                                "-v", "time", "-b", "events", "-b", "system", "-b", "main",
-                                "-b", "crash",
-                                "-t", String.valueOf(lines)).redirectErrorStream(true).start();
+                        java.lang.Process logcat = new ProcessBuilder(
+                                "/system/bin/timeout", "-k", "15s", "10s",
+                                "/system/bin/logcat", "-v", "time", "-b", "events", "-b", "system",
+                                "-b", "main", "-b", "crash", "-t", String.valueOf(lines))
+                                        .redirectErrorStream(true).start();
 
                         try { logcat.getOutputStream().close(); } catch (IOException e) {}
                         try { logcat.getErrorStream().close(); } catch (IOException e) {}
