diff --git a/plugins/javaFX/src/org/jetbrains/plugins/javaFX/fxml/codeInsight/inspections/JavaFxUnresolvedFxIdReferenceInspection.java b/plugins/javaFX/src/org/jetbrains/plugins/javaFX/fxml/codeInsight/inspections/JavaFxUnresolvedFxIdReferenceInspection.java
index 07a8adc..9c9e256 100644
--- a/plugins/javaFX/src/org/jetbrains/plugins/javaFX/fxml/codeInsight/inspections/JavaFxUnresolvedFxIdReferenceInspection.java
+++ b/plugins/javaFX/src/org/jetbrains/plugins/javaFX/fxml/codeInsight/inspections/JavaFxUnresolvedFxIdReferenceInspection.java
@@ -59,7 +59,7 @@
       public void visitXmlAttribute(XmlAttribute attribute) {
         if (FxmlConstants.FX_ID.equals(attribute.getName())) {
           final XmlAttributeValue valueElement = attribute.getValueElement();
-          if (valueElement != null) {
+          if (valueElement != null && valueElement.getTextLength() > 0) {
             final PsiClass controllerClass = JavaFxPsiUtil.getControllerClass(attribute.getContainingFile());
             if (controllerClass != null) {
               final PsiReference reference = valueElement.getReference();
