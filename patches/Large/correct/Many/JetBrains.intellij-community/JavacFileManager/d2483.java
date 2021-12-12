diff --git a/jps/jps-builders/src/org/jetbrains/jps/javac/JavacFileManager.java b/jps/jps-builders/src/org/jetbrains/jps/javac/JavacFileManager.java
index e28ebba..3154add 100644
--- a/jps/jps-builders/src/org/jetbrains/jps/javac/JavacFileManager.java
+++ b/jps/jps-builders/src/org/jetbrains/jps/javac/JavacFileManager.java
@@ -71,7 +71,7 @@
   }
 
   public boolean isSameFile(FileObject a, FileObject b) {
-    if (a instanceof OutputFileObject && b instanceof OutputFileObject) {
+    if (a instanceof OutputFileObject || b instanceof OutputFileObject) {
       return a.equals(b);
     }
     return super.isSameFile(a, b);
