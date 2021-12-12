diff --git a/library/src/main/java/com/orm/util/ReflectionUtil.java b/library/src/main/java/com/orm/util/ReflectionUtil.java
index dd24981..1458a30 100644
--- a/library/src/main/java/com/orm/util/ReflectionUtil.java
+++ b/library/src/main/java/com/orm/util/ReflectionUtil.java
@@ -306,7 +306,8 @@
             while (urls.hasMoreElements()) {
                 List<String> fileNames = new ArrayList<String>();
                 String classDirectoryName = urls.nextElement().getFile();
-                if (classDirectoryName.contains("bin") || classDirectoryName.contains("classes")) {
+                if (classDirectoryName.contains("bin") || classDirectoryName.contains("classes")
+                        || classDirectoryName.contains("retrolambda")) {
                     File classDirectory = new File(classDirectoryName);
                     for (File filePath : classDirectory.listFiles()) {
                         populateFiles(filePath, fileNames, "");
