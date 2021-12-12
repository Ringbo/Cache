diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/style/UnnecessarilyQualifiedStaticUsageInspection.java b/plugins/InspectionGadgets/src/com/siyeh/ig/style/UnnecessarilyQualifiedStaticUsageInspection.java
index 07310d1..f83d8b3 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/style/UnnecessarilyQualifiedStaticUsageInspection.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/style/UnnecessarilyQualifiedStaticUsageInspection.java
@@ -61,10 +61,10 @@
     final PsiJavaCodeReferenceElement element = (PsiJavaCodeReferenceElement)infos[0];
     final PsiElement parent = element.getParent();
     if (parent instanceof PsiMethodCallExpression) {
-      return InspectionGadgetsBundle.message("unnecessarily.qualified.static.usage.problem.descriptor");
+      return InspectionGadgetsBundle.message("unnecessarily.qualified.static.usage.problem.descriptor", element.getText());
     }
     else {
-      return InspectionGadgetsBundle.message("unnecessarily.qualified.static.usage.problem.descriptor1");
+      return InspectionGadgetsBundle.message("unnecessarily.qualified.static.usage.problem.descriptor1", element.getText());
     }
   }
 
