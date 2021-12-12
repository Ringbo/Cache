diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/metrics/BooleanExpressionComplexityCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/metrics/BooleanExpressionComplexityCheck.java
index 17327c3..cc9a7a2 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/metrics/BooleanExpressionComplexityCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/metrics/BooleanExpressionComplexityCheck.java
@@ -229,7 +229,7 @@
          * Creates new instance.
          * @param checking should we check in current context or not.
          */
-        public Context(boolean checking) {
+        Context(boolean checking) {
             this.checking = checking;
             count = 0;
         }
