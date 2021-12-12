diff --git a/python/src/com/jetbrains/python/actions/AugmentedAssignmentQuickFix.java b/python/src/com/jetbrains/python/actions/AugmentedAssignmentQuickFix.java
index bc6874f..37a8d38 100644
--- a/python/src/com/jetbrains/python/actions/AugmentedAssignmentQuickFix.java
+++ b/python/src/com/jetbrains/python/actions/AugmentedAssignmentQuickFix.java
@@ -33,7 +33,7 @@
   public void applyFix(@NotNull Project project, @NotNull ProblemDescriptor descriptor) {
     PsiElement element = descriptor.getPsiElement();
 
-    if (element != null && element instanceof PyAssignmentStatement && element.isWritable()) {
+    if (element instanceof PyAssignmentStatement && element.isWritable()) {
       PyAssignmentStatement statement = (PyAssignmentStatement)element;
 
       PyExpression target = statement.getLeftHandSideExpression();
@@ -56,7 +56,7 @@
             StringBuilder stringBuilder = new StringBuilder();
             stringBuilder.append(target.getText()).append(" ").
                 append(expression.getPsiOperator().getText()).append("= ").append(rightExpression.getText());
-            PyAugAssignmentStatementImpl augAssignment = elementGenerator.createFromText(LanguageLevel.getDefault(),
+            PyAugAssignmentStatementImpl augAssignment = elementGenerator.createFromText(LanguageLevel.forElement(element),
                                                           PyAugAssignmentStatementImpl.class, stringBuilder.toString());
             statement.replace(augAssignment);
           }
