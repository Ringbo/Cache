diff --git a/grails-plugin-controllers/src/main/groovy/org/codehaus/groovy/grails/compiler/web/MethodActionTransformer.java b/grails-plugin-controllers/src/main/groovy/org/codehaus/groovy/grails/compiler/web/MethodActionTransformer.java
index 1706921..5ffa289 100644
--- a/grails-plugin-controllers/src/main/groovy/org/codehaus/groovy/grails/compiler/web/MethodActionTransformer.java
+++ b/grails-plugin-controllers/src/main/groovy/org/codehaus/groovy/grails/compiler/web/MethodActionTransformer.java
@@ -291,7 +291,7 @@
         final MethodCallExpression validateMethodCallExpression = new MethodCallExpression(
                 new VariableExpression(paramName), "validate", EMPTY_TUPLE);
         MethodNode validateMethod =
-                classNode.getMethod("validate", new Parameter[0]);
+                paramTypeClassNode.getMethod("validate", new Parameter[0]);
         if (validateMethod != null) {
             validateMethodCallExpression.setMethodTarget(validateMethod);
         }
