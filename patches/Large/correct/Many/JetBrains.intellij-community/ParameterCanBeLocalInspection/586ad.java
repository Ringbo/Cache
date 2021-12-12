diff --git a/java/java-impl/src/com/intellij/codeInspection/varScopeCanBeNarrowed/ParameterCanBeLocalInspection.java b/java/java-impl/src/com/intellij/codeInspection/varScopeCanBeNarrowed/ParameterCanBeLocalInspection.java
index b763cb9..43a95af 100644
--- a/java/java-impl/src/com/intellij/codeInspection/varScopeCanBeNarrowed/ParameterCanBeLocalInspection.java
+++ b/java/java-impl/src/com/intellij/codeInspection/varScopeCanBeNarrowed/ParameterCanBeLocalInspection.java
@@ -65,7 +65,7 @@
     final List<ProblemDescriptor> result = new ArrayList<ProblemDescriptor>();
     for (PsiParameter parameter : getWriteBeforeRead(parameters, body)) {
       final PsiIdentifier identifier = parameter.getNameIdentifier();
-      if (identifier != null) {
+      if (identifier != null && identifier.isPhysical()) {
         result.add(createProblem(manager, identifier, isOnTheFly));
       }
     }
