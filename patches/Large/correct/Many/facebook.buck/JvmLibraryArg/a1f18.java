diff --git a/src/com/facebook/buck/jvm/java/JvmLibraryArg.java b/src/com/facebook/buck/jvm/java/JvmLibraryArg.java
index 0abf44d..4ee927f 100644
--- a/src/com/facebook/buck/jvm/java/JvmLibraryArg.java
+++ b/src/com/facebook/buck/jvm/java/JvmLibraryArg.java
@@ -56,7 +56,9 @@
       ProjectFilesystem filesystem,
       BuildRuleResolver resolver,
       Set<String> safeAnnotationProcessors) {
-    if (annotationProcessors.isEmpty() && plugins.isEmpty()) {
+    if (annotationProcessors.isEmpty() &&
+        plugins.isEmpty() &&
+        annotationProcessorDeps.isEmpty()) {
       return AnnotationProcessingParams.EMPTY;
     }
 
