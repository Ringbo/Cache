diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/verbose/ForCanBeForeachInspection.java b/plugins/InspectionGadgets/src/com/siyeh/ig/verbose/ForCanBeForeachInspection.java
index 0c49db0..c86b6a0 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/verbose/ForCanBeForeachInspection.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/verbose/ForCanBeForeachInspection.java
@@ -378,7 +378,7 @@
             final String baseName;
             final CodeStyleManager codeStyleManager =
                     CodeStyleManager.getInstance(project);
-            if(containerName == null){
+            if(containerName != null){
                 baseName = StringUtils.createSingularFromName(containerName);
             } else{
 
@@ -534,9 +534,8 @@
         if(!"iterator".equals(initialCallName)){
             return false;
         }
-        final PsiExpression qualifier =
-                initialMethodExpression.getQualifierExpression();
-        final PsiType qualifierType = qualifier.getType();
+        final PsiExpression qualifier = initialMethodExpression.getQualifierExpression();
+        final PsiType qualifierType = qualifier == null ? null : qualifier.getType();
         if(!(qualifierType instanceof PsiClassType)){
             return false;
         }
