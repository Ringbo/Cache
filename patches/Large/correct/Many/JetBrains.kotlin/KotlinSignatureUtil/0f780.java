diff --git a/idea/src/org/jetbrains/jet/plugin/codeInsight/ktSignature/KotlinSignatureUtil.java b/idea/src/org/jetbrains/jet/plugin/codeInsight/ktSignature/KotlinSignatureUtil.java
index 6baff6d..6c878c6 100644
--- a/idea/src/org/jetbrains/jet/plugin/codeInsight/ktSignature/KotlinSignatureUtil.java
+++ b/idea/src/org/jetbrains/jet/plugin/codeInsight/ktSignature/KotlinSignatureUtil.java
@@ -94,7 +94,7 @@
         PsiModifierListOwner annotationOwner = getAnnotationOwner(element);
         PsiAnnotation annotation = findKotlinSignatureAnnotation(element);
         assert annotation != null;
-        if (annotation.getContainingFile() != annotationOwner.getContainingFile()) {
+        if (annotation.getContainingFile() == annotationOwner.getContainingFile()) {
             return annotation.isWritable();
         } else {
             ExternalAnnotationsManager annotationsManager = ExternalAnnotationsManager.getInstance(element.getProject());
