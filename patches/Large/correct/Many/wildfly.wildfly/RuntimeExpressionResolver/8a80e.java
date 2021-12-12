diff --git a/server/src/main/java/org/jboss/as/server/RuntimeExpressionResolver.java b/server/src/main/java/org/jboss/as/server/RuntimeExpressionResolver.java
index 446dcb6..7e4f2f6 100644
--- a/server/src/main/java/org/jboss/as/server/RuntimeExpressionResolver.java
+++ b/server/src/main/java/org/jboss/as/server/RuntimeExpressionResolver.java
@@ -40,7 +40,7 @@
     protected void resolvePluggableExpression(ModelNode node) {
         String expression = node.asString();
         if (expression.length() > 3) {
-            expression = expression.substring(2, expression.length() -2);
+            expression = expression.substring(2, expression.length() -1);
             if (vaultReader != null && vaultReader.isVaultFormat(expression)) {
                 node.set(vaultReader.retrieveFromVault(expression));
             }
