diff --git a/idea/src/org/jetbrains/jet/plugin/codeInsight/codeTransformations/branchedTransformations/BranchedUnfoldingUtils.java b/idea/src/org/jetbrains/jet/plugin/codeInsight/codeTransformations/branchedTransformations/BranchedUnfoldingUtils.java
index 074f383..3ded7e1 100644
--- a/idea/src/org/jetbrains/jet/plugin/codeInsight/codeTransformations/branchedTransformations/BranchedUnfoldingUtils.java
+++ b/idea/src/org/jetbrains/jet/plugin/codeInsight/codeTransformations/branchedTransformations/BranchedUnfoldingUtils.java
@@ -79,7 +79,7 @@
     public static void unfoldAssignmentToWhen(@NotNull JetBinaryExpression assignment) {
         Project project = assignment.getProject();
         String op = assignment.getOperationReference().getText();
-        JetExpression lhs = (JetExpression)assignment.getLeft().copy();
+        String lhsText = assignment.getLeft().getText();
         JetWhenExpression whenExpression = (JetWhenExpression)assignment.getRight();
 
         assert whenExpression != null : UNFOLD_WITHOUT_CHECK;
@@ -91,7 +91,7 @@
 
             assert currExpr != null : UNFOLD_WITHOUT_CHECK;
 
-            currExpr.replace(JetPsiFactory.createBinaryExpression(project, lhs, op, currExpr));
+            currExpr.replace(JetPsiFactory.createBinaryExpression(project, JetPsiFactory.createExpression(project, lhsText), op, currExpr));
         }
     }
 
