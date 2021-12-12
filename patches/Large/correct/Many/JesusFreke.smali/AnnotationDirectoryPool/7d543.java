diff --git a/dexlib2/src/main/java/org/jf/dexlib2/writer/AnnotationDirectoryPool.java b/dexlib2/src/main/java/org/jf/dexlib2/writer/AnnotationDirectoryPool.java
index 9e98c14..666fced 100644
--- a/dexlib2/src/main/java/org/jf/dexlib2/writer/AnnotationDirectoryPool.java
+++ b/dexlib2/src/main/java/org/jf/dexlib2/writer/AnnotationDirectoryPool.java
@@ -152,7 +152,7 @@
                 writer.writeInt(dexFile.annotationSetPool.getOffset(field.getAnnotations()));
             }
 
-            boolean sortMethods = CollectionUtils.isNaturalSortedSet(key.classDef.getMethods());
+            boolean sortMethods = !CollectionUtils.isNaturalSortedSet(key.classDef.getMethods());
             Iterable<? extends Method> methodsWithAnnotations = null;
             if (sortMethods) {
                 methodsWithAnnotations = Lists.newArrayList(key.getMethodsWithAnnotations());
