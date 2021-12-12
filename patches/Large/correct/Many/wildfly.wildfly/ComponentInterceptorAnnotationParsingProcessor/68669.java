diff --git a/ee/src/main/java/org/jboss/as/ee/component/ComponentInterceptorAnnotationParsingProcessor.java b/ee/src/main/java/org/jboss/as/ee/component/ComponentInterceptorAnnotationParsingProcessor.java
index 677c109..f8aeeba 100644
--- a/ee/src/main/java/org/jboss/as/ee/component/ComponentInterceptorAnnotationParsingProcessor.java
+++ b/ee/src/main/java/org/jboss/as/ee/component/ComponentInterceptorAnnotationParsingProcessor.java
@@ -97,7 +97,7 @@
         //process the ExcludeClassInterceptors annotation
         final List<AnnotationInstance> excludeClassAnnotations = classAnnotations.get(EXCLUDE_CLASS_ANNOTATION_NAME);
         if(excludeClassAnnotations != null ) {
-            for(AnnotationInstance annotation : excludeDefaultAnnotations) {
+            for(AnnotationInstance annotation : excludeClassAnnotations) {
                 final AnnotationTarget target = annotation.target();
                 if (target instanceof MethodInfo) {
                     final MethodInfo methodInfo = MethodInfo.class.cast(target);
