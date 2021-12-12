diff --git a/UIDesignerCore/src/com/intellij/uiDesigner/compiler/AsmCodeGenerator.java b/UIDesignerCore/src/com/intellij/uiDesigner/compiler/AsmCodeGenerator.java
index c52fec8..9ba226a 100644
--- a/UIDesignerCore/src/com/intellij/uiDesigner/compiler/AsmCodeGenerator.java
+++ b/UIDesignerCore/src/com/intellij/uiDesigner/compiler/AsmCodeGenerator.java
@@ -241,7 +241,8 @@
                                      final String signature,
                                      final String[] exceptions) {
 
-      if (name.equals(SETUP_METHOD_NAME) || name.equals(GET_ROOT_COMPONENT_METHOD_NAME)) {
+      if (name.equals(SETUP_METHOD_NAME) || name.equals(GET_ROOT_COMPONENT_METHOD_NAME) ||
+          name.equals(LOAD_BUTTON_TEXT_METHOD) || name.equals(LOAD_LABEL_TEXT_METHOD)) {
         return null;
       }
       if (name.equals(CREATE_COMPONENTS_METHOD_NAME) && desc.equals("()V")) {
