diff --git a/src/main/java/org/JesusFreke/dexlib/AnnotationDirectoryItem.java b/src/main/java/org/JesusFreke/dexlib/AnnotationDirectoryItem.java
index 1a104b3..7538b49 100644
--- a/src/main/java/org/JesusFreke/dexlib/AnnotationDirectoryItem.java
+++ b/src/main/java/org/JesusFreke/dexlib/AnnotationDirectoryItem.java
@@ -89,11 +89,11 @@
 
         classAnnotationsReferenceField.setReference(classAnnotations);
 
-        if (fieldAnnotationListField != null) {
+        if (fieldAnnotations != null) {
             fieldAnnotationList.addAll(fieldAnnotations);
         }
 
-        if (methodAnnotationListField != null) {
+        if (methodAnnotations != null) {
             methodAnnotationList.addAll(methodAnnotations);
         }
 
