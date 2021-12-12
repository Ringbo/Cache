diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/codeInspection/assignment/GroovyResultOfAssignmentUsedInspection.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/codeInspection/assignment/GroovyResultOfAssignmentUsedInspection.java
index e44dd7a..101b1f1 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/codeInspection/assignment/GroovyResultOfAssignmentUsedInspection.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/codeInspection/assignment/GroovyResultOfAssignmentUsedInspection.java
@@ -50,7 +50,7 @@
 
     public void visitAssignmentExpression(GrAssignmentExpression grAssignmentExpression) {
       super.visitAssignmentExpression(grAssignmentExpression);
-      if (PsiUtil.resultOfExpressionUsed(grAssignmentExpression)) {
+      if (PsiUtil.isExpressionUsed(grAssignmentExpression)) {
         registerError(grAssignmentExpression);
       }
     }
