diff --git a/src/edu/stanford/nlp/pipeline/AbstractInputStreamAnnotationCreator.java b/src/edu/stanford/nlp/pipeline/AbstractInputStreamAnnotationCreator.java
index ca4bed3..ed97ea3 100644
--- a/src/edu/stanford/nlp/pipeline/AbstractInputStreamAnnotationCreator.java
+++ b/src/edu/stanford/nlp/pipeline/AbstractInputStreamAnnotationCreator.java
@@ -27,7 +27,7 @@
 
   @Override
   public Annotation createFromFile(File file) throws IOException {
-    return createFromFile(file.getAbsoluteFile());
+    return createFromFile(file.getAbsolutePath());
   }
 
   @Override
