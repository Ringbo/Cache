diff --git a/flex/pluginSrc/com/intellij/lang/javascript/uml/actions/JSCreateFieldDialog.java b/flex/pluginSrc/com/intellij/lang/javascript/uml/actions/JSCreateFieldDialog.java
index 8334c62..d02468b 100644
--- a/flex/pluginSrc/com/intellij/lang/javascript/uml/actions/JSCreateFieldDialog.java
+++ b/flex/pluginSrc/com/intellij/lang/javascript/uml/actions/JSCreateFieldDialog.java
@@ -121,7 +121,7 @@
       return Pair.create(JSBundle.message("invalid.identifier.value.0", getFieldName()), true);
     }
     String type = getFieldType().trim();
-    if ("void".equals(type) || type.contains(" ") || JSRefactoringUtil.createTypeElement(myTargetClass.getProject(), type) == null) {
+    if ("void".equals(type) || type.contains(" ") || JSRefactoringUtil.createTypeElement(myTargetClass.getProject(), type, JavaScriptSupportLoader.ECMA_SCRIPT_L4) == null) {
       return Pair.create(JSBundle.message("invalid.field.type.expression", type), true);
     }
     if (isConstant() && StringUtil.isEmpty(getInitializer())) {
