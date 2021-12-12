diff --git a/src/it/java/com/google/checkstyle/test/chapter2filebasic/rule231filetab/FileTabCharacterTest.java b/src/it/java/com/google/checkstyle/test/chapter2filebasic/rule231filetab/FileTabCharacterTest.java
index 3ac4b49..214ee8f 100644
--- a/src/it/java/com/google/checkstyle/test/chapter2filebasic/rule231filetab/FileTabCharacterTest.java
+++ b/src/it/java/com/google/checkstyle/test/chapter2filebasic/rule231filetab/FileTabCharacterTest.java
@@ -56,7 +56,7 @@
     /**
      * Creates a configuration that is functionally close to that in the docs.
      */
-    private DefaultConfiguration createConfig(boolean verbose)
+    private static DefaultConfiguration createConfig(boolean verbose)
     {
         final DefaultConfiguration checkConfig =
             createCheckConfig(FileTabCharacterCheck.class);
