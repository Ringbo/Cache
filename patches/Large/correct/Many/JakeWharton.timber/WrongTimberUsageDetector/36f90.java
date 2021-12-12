diff --git a/timber-lint/src/main/java/timber/lint/WrongTimberUsageDetector.java b/timber-lint/src/main/java/timber/lint/WrongTimberUsageDetector.java
index ac15122..1f5fdf5 100644
--- a/timber-lint/src/main/java/timber/lint/WrongTimberUsageDetector.java
+++ b/timber-lint/src/main/java/timber/lint/WrongTimberUsageDetector.java
@@ -110,7 +110,7 @@
         String message = String.format(
             "The logging tag can be at most 23 characters, was %1$d (%2$s)",
             tag.length(), tag);
-        context.report(ISSUE_TAG_LENGTH, node, context.getLocation(node), message);
+        context.report(ISSUE_TAG_LENGTH, node, context.getLocation(argument), message);
       }
     } else {
       if (node.astOperand() instanceof VariableReference) {
