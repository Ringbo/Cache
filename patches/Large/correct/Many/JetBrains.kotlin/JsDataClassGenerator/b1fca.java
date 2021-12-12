diff --git a/js/js.translator/src/org/jetbrains/kotlin/js/translate/declaration/JsDataClassGenerator.java b/js/js.translator/src/org/jetbrains/kotlin/js/translate/declaration/JsDataClassGenerator.java
index b9acc88..2896a85 100644
--- a/js/js.translator/src/org/jetbrains/kotlin/js/translate/declaration/JsDataClassGenerator.java
+++ b/js/js.translator/src/org/jetbrains/kotlin/js/translate/declaration/JsDataClassGenerator.java
@@ -51,7 +51,7 @@
         assert propertyDescriptor != null : "Property descriptor is expected to be non-null";
 
         JsFunction functionObject = generateJsMethod(function);
-        JsExpression returnExpression = JsAstUtils.fqnWithoutSideEffects(context.getNameForDescriptor(propertyDescriptor), JsLiteral.THIS);
+        JsExpression returnExpression = JsAstUtils.pureFqn(context.getNameForDescriptor(propertyDescriptor), JsLiteral.THIS);
         functionObject.getBody().getStatements().add(new JsReturn(returnExpression));
     }
 
