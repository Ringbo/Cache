diff --git a/java/org/apache/juli/ClassLoaderLogManager.java b/java/org/apache/juli/ClassLoaderLogManager.java
index d7b9e93..248334f 100644
--- a/java/org/apache/juli/ClassLoaderLogManager.java
+++ b/java/org/apache/juli/ClassLoaderLogManager.java
@@ -568,7 +568,7 @@
         String result = str;
         int pos_start = result.indexOf("${");
         if (pos_start != -1) {
-            int pos_end = result.indexOf('}');
+            int pos_end = result.indexOf('}', pos_start);
             if (pos_end != -1) {
                 String propName = result.substring(pos_start + 2, pos_end);
                 String replacement = System.getProperty(propName);
