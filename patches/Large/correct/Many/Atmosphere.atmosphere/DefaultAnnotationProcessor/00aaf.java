diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultAnnotationProcessor.java b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultAnnotationProcessor.java
index 41e2135..e105a63 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultAnnotationProcessor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultAnnotationProcessor.java
@@ -67,7 +67,7 @@
 
         Map<Class<? extends Annotation>, Set<Class<?>>> annotations = (Map<Class<? extends Annotation>, Set<Class<?>>>) sc.getAttribute(ANNOTATION_ATTRIBUTE);
 
-        if (annotations == null) {
+        if (annotations == null || annotations.isEmpty()) {
             delegate = new BytecodeBasedAnnotationProcessor();
         } else {
             delegate = new ServletContainerInitializerAnnotationProcessor(annotations, framework);
