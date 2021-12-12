diff --git a/python/src/com/jetbrains/python/actions/AugmentedAssignmentQuickFix.java b/python/src/com/jetbrains/python/actions/AugmentedAssignmentQuickFix.java
index aa45be5..714498d 100644
--- a/python/src/com/jetbrains/python/actions/AugmentedAssignmentQuickFix.java
+++ b/python/src/com/jetbrains/python/actions/AugmentedAssignmentQuickFix.java
@@ -52,7 +52,7 @@
 
             PyElementGenerator elementGenerator = PyElementGenerator.getInstance(project);
             StringBuilder stringBuilder = new StringBuilder();
-            stringBuilder.append(target.getName()).append(" ").
+            stringBuilder.append(target.getText()).append(" ").
                 append(expression.getPsiOperator().getText()).append("= ").append(rightExpression.getText());
             PyAugAssignmentStatementImpl augAssignment = elementGenerator.createFromText(LanguageLevel.getDefault(),
                                                           PyAugAssignmentStatementImpl.class, stringBuilder.toString());
