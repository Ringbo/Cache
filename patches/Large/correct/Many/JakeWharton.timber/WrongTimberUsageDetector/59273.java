diff --git a/timber-lint/src/main/java/timber/lint/WrongTimberUsageDetector.java b/timber-lint/src/main/java/timber/lint/WrongTimberUsageDetector.java
index 64f9ad9..a176e0c 100644
--- a/timber-lint/src/main/java/timber/lint/WrongTimberUsageDetector.java
+++ b/timber-lint/src/main/java/timber/lint/WrongTimberUsageDetector.java
@@ -110,7 +110,7 @@
     } else if (node.astOperand() instanceof VariableReference) {
       VariableReference ref = (VariableReference) node.astOperand();
       if ("Log".equals(ref.astIdentifier().astValue())) {
-        context.report(ISSUE_LOG, node, context.getLocation(node),
+        context.report(ISSUE_LOG, node, context.getRangeLocation(node, 0, node.astName(), 0),
             "Using 'Log' instead of 'Timber'");
         return;
       }
