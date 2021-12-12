diff --git a/java/java-impl/src/com/intellij/codeInsight/completion/JavaCompletionContributor.java b/java/java-impl/src/com/intellij/codeInsight/completion/JavaCompletionContributor.java
index 61fef1b..4480f31 100644
--- a/java/java-impl/src/com/intellij/codeInsight/completion/JavaCompletionContributor.java
+++ b/java/java-impl/src/com/intellij/codeInsight/completion/JavaCompletionContributor.java
@@ -204,7 +204,7 @@
     final CompletionResultSet result = JavaCompletionSorting.addJavaSorting(parameters, _result);
 
     if (ANNOTATION_ATTRIBUTE_NAME.accepts(position) && !JavaCompletionData.isAfterPrimitiveOrArrayType(position)) {
-      JavaCompletionData.addExpectedTypeMembers(parameters, result, position);
+      JavaCompletionData.addExpectedTypeMembers(parameters, result);
       completeAnnotationAttributeName(result, position, parameters);
       result.stopHere();
       return;
