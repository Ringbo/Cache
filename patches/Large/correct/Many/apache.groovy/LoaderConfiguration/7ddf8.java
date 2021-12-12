diff --git a/src/main/org/codehaus/groovy/tools/LoaderConfiguration.java b/src/main/org/codehaus/groovy/tools/LoaderConfiguration.java
index 573b9ca..d9f1830 100644
--- a/src/main/org/codehaus/groovy/tools/LoaderConfiguration.java
+++ b/src/main/org/codehaus/groovy/tools/LoaderConfiguration.java
@@ -174,7 +174,7 @@
     private void findMatchingFiles(File[] files, Pattern pattern) {
         for (int i = 0; i < files.length; i++) {
             File file = files[i];
-            Matcher m = pattern.matcher(getSlashyPath(file.getAbsolutePath()));
+            Matcher m = pattern.matcher(getSlashyPath(file.getPath()));
             if (m.matches() && file.isFile()) {
                 addFile(file);
             }
