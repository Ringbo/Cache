diff --git a/subprojects/core/src/main/java/org/gradle/api/internal/changedetection/state/DefaultFileSystemSnapshotter.java b/subprojects/core/src/main/java/org/gradle/api/internal/changedetection/state/DefaultFileSystemSnapshotter.java
index 8af7b10..bff60e8 100644
--- a/subprojects/core/src/main/java/org/gradle/api/internal/changedetection/state/DefaultFileSystemSnapshotter.java
+++ b/subprojects/core/src/main/java/org/gradle/api/internal/changedetection/state/DefaultFileSystemSnapshotter.java
@@ -52,7 +52,7 @@
 
     @Override
     public FileSnapshot snapshotFile(File file) {
-        FileSnapshot snapshot = fileSystemMirror.getFile(file.getPath());
+        FileSnapshot snapshot = fileSystemMirror.getFile(file.getAbsolutePath());
         if (snapshot == null) {
             snapshot = calculateDetails(file);
             fileSystemMirror.putFile(snapshot);
