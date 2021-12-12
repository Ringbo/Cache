diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/bugs/ImplicitArrayToStringInspection.java b/plugins/InspectionGadgets/src/com/siyeh/ig/bugs/ImplicitArrayToStringInspection.java
index 8782599..f2600b5 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/bugs/ImplicitArrayToStringInspection.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/bugs/ImplicitArrayToStringInspection.java
@@ -54,8 +54,7 @@
 
     @Nullable
     protected InspectionGadgetsFix buildFix(PsiElement location) {
-        final PsiReferenceExpression expression =
-                (PsiReferenceExpression) location;
+        final PsiExpression expression = (PsiExpression)location;
         final PsiArrayType type = (PsiArrayType) expression.getType();
         if (type != null) {
             final PsiType componentType = type.getComponentType();
@@ -88,8 +87,8 @@
 
         protected void doFix(Project project, ProblemDescriptor descriptor)
                 throws IncorrectOperationException {
-            final PsiReferenceExpression expression =
-                    (PsiReferenceExpression) descriptor.getPsiElement();
+            final PsiExpression expression =
+                    (PsiExpression)descriptor.getPsiElement();
             final String expressionText = expression.getText();
             @NonNls final String newExpressionText;
             if (deepString) {
@@ -133,7 +132,7 @@
             if (!isImplicitArrayToStringCall(expression)) {
                 return;
             }
-            registerMethodCallError(expression, expression);
+            registerError(expression, expression);
         }
 
         private static boolean isImplicitArrayToStringCall(
