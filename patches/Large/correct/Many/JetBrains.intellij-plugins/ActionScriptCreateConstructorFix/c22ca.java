diff --git a/flex/src/com/intellij/lang/javascript/validation/fixes/ActionScriptCreateConstructorFix.java b/flex/src/com/intellij/lang/javascript/validation/fixes/ActionScriptCreateConstructorFix.java
index 765e4a0..48b23be 100644
--- a/flex/src/com/intellij/lang/javascript/validation/fixes/ActionScriptCreateConstructorFix.java
+++ b/flex/src/com/intellij/lang/javascript/validation/fixes/ActionScriptCreateConstructorFix.java
@@ -341,7 +341,7 @@
         newConstuctorText.append("public ");
       }
       newConstuctorText.append("function ").append(jsClass.getName());
-      JSChangeSignatureDialog.buildParameterListText(Arrays.asList(myParameters), newConstuctorText, true, DialectDetector.dialectOfElement(
+      JSChangeSignatureDialog.buildParameterListText(Arrays.asList(myParameters), newConstuctorText, DialectDetector.dialectOfElement(
         jsClass));
       newConstuctorText.append("{}");
       JSFunction constructorPrototype = (JSFunction)JSChangeUtil.createStatementFromText(myProject, newConstuctorText.toString(),
