diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/numeric/ImplicitNumericConversionInspection.java b/plugins/InspectionGadgets/src/com/siyeh/ig/numeric/ImplicitNumericConversionInspection.java
index 959ec33..d110701 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/numeric/ImplicitNumericConversionInspection.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/numeric/ImplicitNumericConversionInspection.java
@@ -73,7 +73,7 @@
     @NotNull
     public String buildErrorString(Object... infos) {
         final PsiType type = (PsiType) infos[1];
-        final PsiType expectedType = (PsiType)infos[1];
+        final PsiType expectedType = (PsiType)infos[2];
         return InspectionGadgetsBundle.message(
                 "implicit.numeric.conversion.problem.descriptor",
                 type.getPresentableText(), expectedType.getPresentableText());
