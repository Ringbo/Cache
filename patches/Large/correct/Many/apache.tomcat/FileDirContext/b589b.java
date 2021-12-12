diff --git a/java/org/apache/naming/resources/FileDirContext.java b/java/org/apache/naming/resources/FileDirContext.java
index 7163530..6b57f24 100644
--- a/java/org/apache/naming/resources/FileDirContext.java
+++ b/java/org/apache/naming/resources/FileDirContext.java
@@ -872,7 +872,7 @@
             Object object = null;
             if (currentFile.isDirectory()) {
                 FileDirContext tempContext = new FileDirContext(env);
-                tempContext.setDocBase(file.getPath());
+                tempContext.setDocBase(currentFile.getPath());
                 tempContext.setAllowLinking(getAllowLinking());
                 object = tempContext;
             } else {
