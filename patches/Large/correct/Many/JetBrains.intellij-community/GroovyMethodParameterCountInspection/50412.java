diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/codeInspection/metrics/GroovyMethodParameterCountInspection.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/codeInspection/metrics/GroovyMethodParameterCountInspection.java
index 15fd9f3..d58e432 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/codeInspection/metrics/GroovyMethodParameterCountInspection.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/codeInspection/metrics/GroovyMethodParameterCountInspection.java
@@ -54,7 +54,7 @@
       super.visitMethod(grMethod);
       final GrParameter[] parameters = grMethod.getParameters();
       final int limit = getLimit();
-      if (parameters == null || parameters.length < limit) {
+      if (parameters == null || parameters.length <= limit) {
         return;
       }
       if (LibraryUtil.isOverrideOfLibraryMethod(grMethod)) {
