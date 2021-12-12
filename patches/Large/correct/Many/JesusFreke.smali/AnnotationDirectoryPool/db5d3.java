diff --git a/dexlib2/src/main/java/org/jf/dexlib2/writer/AnnotationDirectoryPool.java b/dexlib2/src/main/java/org/jf/dexlib2/writer/AnnotationDirectoryPool.java
index 666fced..d22b788 100644
--- a/dexlib2/src/main/java/org/jf/dexlib2/writer/AnnotationDirectoryPool.java
+++ b/dexlib2/src/main/java/org/jf/dexlib2/writer/AnnotationDirectoryPool.java
@@ -266,7 +266,7 @@
         public int compareTo(Key o) {
             // compareTo will only be called on keys of the same internability. An internable key will not be compared
             // with a non-internable one.
-            if (hasClassAnnotations()) {
+            if (hasNonClassAnnotations()) {
                 return classDef.getType().compareTo(o.classDef.getType());
             }
             return CollectionUtils.compareAsSet(classDef.getAnnotations(), o.classDef.getAnnotations());
