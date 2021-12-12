diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index 6ac5612..16b81f9 100755
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -4873,7 +4873,7 @@
         try {
             File tracesDir = tracesFile.getParentFile();
             if (!tracesDir.exists()) {
-                tracesFile.mkdirs();
+                tracesDir.mkdirs();
                 if (!SELinux.restorecon(tracesDir)) {
                     return null;
                 }
@@ -4983,7 +4983,7 @@
             final File tracesTmp = new File(tracesDir, "__tmp__");
             try {
                 if (!tracesDir.exists()) {
-                    tracesFile.mkdirs();
+                    tracesDir.mkdirs();
                     if (!SELinux.restorecon(tracesDir.getPath())) {
                         return;
                     }
