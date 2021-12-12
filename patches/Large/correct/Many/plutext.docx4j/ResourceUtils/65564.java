diff --git a/src/main/java/org/docx4j/utils/ResourceUtils.java b/src/main/java/org/docx4j/utils/ResourceUtils.java
index 6e1ca7d..4310f39 100644
--- a/src/main/java/org/docx4j/utils/ResourceUtils.java
+++ b/src/main/java/org/docx4j/utils/ResourceUtils.java
@@ -37,7 +37,7 @@
         java.net.URL url = loader.getResource(filename);
                 
         if (url == null) {
-        	log.error("Couldn't get resource: " + filename);
+        	log.warn("Couldn't get resource: " + filename);
         }
         
         // Get the jar file
