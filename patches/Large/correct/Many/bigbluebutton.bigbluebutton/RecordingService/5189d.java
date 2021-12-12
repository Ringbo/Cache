diff --git a/bigbluebutton-web/src/java/org/bigbluebutton/api/RecordingService.java b/bigbluebutton-web/src/java/org/bigbluebutton/api/RecordingService.java
index 3f66ebf..55c8c3c 100755
--- a/bigbluebutton-web/src/java/org/bigbluebutton/api/RecordingService.java
+++ b/bigbluebutton-web/src/java/org/bigbluebutton/api/RecordingService.java
@@ -200,7 +200,7 @@
 
     private void createDirectory(File directory) {
         if (!directory.exists())
-            directory.mkdir();
+            directory.mkdirs();
     }
 
     private void deleteDirectory(File directory) {
@@ -325,7 +325,7 @@
                             return;
                         }
                         if (!dest.exists())
-                            dest.mkdir();
+                            dest.mkdirs();
                         boolean moved = recordings.get(f).renameTo(new File(dest, recordings.get(f).getName()));
                         if (moved) {
                             log.debug("Recording successfully moved!");
