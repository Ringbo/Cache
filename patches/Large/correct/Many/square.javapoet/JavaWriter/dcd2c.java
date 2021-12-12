diff --git a/src/main/java/com/squareup/javawriter/JavaWriter.java b/src/main/java/com/squareup/javawriter/JavaWriter.java
index bd3d0a9..adb26cc 100644
--- a/src/main/java/com/squareup/javawriter/JavaWriter.java
+++ b/src/main/java/com/squareup/javawriter/JavaWriter.java
@@ -152,7 +152,7 @@
       }
     }
 
-    if (importedClassIndex.isEmpty()) {
+    if (!importedClassIndex.isEmpty()) {
       appendable.append('\n');
     }
 
