diff --git a/translator/src/main/java/com/google/devtools/j2objc/gen/ObjectiveCImplementationGenerator.java b/translator/src/main/java/com/google/devtools/j2objc/gen/ObjectiveCImplementationGenerator.java
index 806d2b0..b4871c6 100644
--- a/translator/src/main/java/com/google/devtools/j2objc/gen/ObjectiveCImplementationGenerator.java
+++ b/translator/src/main/java/com/google/devtools/j2objc/gen/ObjectiveCImplementationGenerator.java
@@ -1065,7 +1065,7 @@
     } else if (value instanceof String) {
       StringLiteral node = ast.newStringLiteral();
       node.setLiteralValue((String) value);
-      printf(StatementGenerator.generateStringLiteral(node));
+      print(StatementGenerator.generateStringLiteral(node));
     } else if (value instanceof Number || value instanceof Character || value instanceof Boolean) {
       print(value.toString());
     } else if (value.getClass().isArray()) {
