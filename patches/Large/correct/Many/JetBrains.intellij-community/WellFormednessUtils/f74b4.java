diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/psiutils/WellFormednessUtils.java b/plugins/InspectionGadgets/src/com/siyeh/ig/psiutils/WellFormednessUtils.java
index 638237d..7915c18 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/psiutils/WellFormednessUtils.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/psiutils/WellFormednessUtils.java
@@ -13,12 +13,12 @@
     public static boolean isWellFormed(PsiBinaryExpression expression)
     {
         final PsiExpression lhs = expression.getLOperand();
-        if(lhs == null)
+        if(lhs == null || !lhs.isValid())
         {
             return false;
         }
         final PsiExpression rhs = expression.getROperand();
-        if(rhs == null)
+        if(rhs == null || !rhs.isValid())
         {
             return false;
         }
@@ -28,11 +28,11 @@
 
     public static boolean isWellFormed(PsiAssignmentExpression expression){
         final PsiExpression lhs = expression.getLExpression();
-        if(lhs == null){
+        if(lhs == null || !lhs.isValid()){
             return false;
         }
         final PsiExpression rhs = expression.getRExpression();
-        if(rhs == null){
+        if(rhs == null || !rhs.isValid()){
             return false;
         }
         final PsiJavaToken operationSign = expression.getOperationSign();
