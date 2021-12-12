diff --git a/dexlib2/src/main/java/org/jf/dexlib2/writer/AnnotationSetRefPool.java b/dexlib2/src/main/java/org/jf/dexlib2/writer/AnnotationSetRefPool.java
index c4bd9b2..ab02fe0 100644
--- a/dexlib2/src/main/java/org/jf/dexlib2/writer/AnnotationSetRefPool.java
+++ b/dexlib2/src/main/java/org/jf/dexlib2/writer/AnnotationSetRefPool.java
@@ -69,7 +69,7 @@
 
     public int getOffset(@Nonnull Method method) {
         Key annotationSetRefKey = new Key(method);
-        Integer offset = internedAnnotationSetRefItems.put(annotationSetRefKey, 0);
+        Integer offset = internedAnnotationSetRefItems.get(annotationSetRefKey);
         if (offset == null) {
             throw new ExceptionWithContext("Annotation set ref not found.");
         }
