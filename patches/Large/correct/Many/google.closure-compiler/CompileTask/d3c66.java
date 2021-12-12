diff --git a/src/com/google/javascript/jscomp/ant/CompileTask.java b/src/com/google/javascript/jscomp/ant/CompileTask.java
index e6c737b..dc58ffa 100644
--- a/src/com/google/javascript/jscomp/ant/CompileTask.java
+++ b/src/com/google/javascript/jscomp/ant/CompileTask.java
@@ -750,7 +750,7 @@
   /**
    * Returns the last modified timestamp of the given File.
    */
-  private long getLastModifiedTime(File file) {
+  private static long getLastModifiedTime(File file) {
     long fileLastModified = file.lastModified();
     // If the file is absent, we don't know if it changed (maybe was deleted),
     // so assume it has just changed.
