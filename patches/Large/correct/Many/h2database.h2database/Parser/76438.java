diff --git a/h2/src/main/org/h2/command/Parser.java b/h2/src/main/org/h2/command/Parser.java
index 4cff015..c22ed7b 100644
--- a/h2/src/main/org/h2/command/Parser.java
+++ b/h2/src/main/org/h2/command/Parser.java
@@ -1175,7 +1175,7 @@
             } while (readIfMore(true));
             read(EQUAL);
             Expression expression = readExpression();
-            if (columns.size() == 1) {
+            if (columns.size() == 1 && expression.getType().getValueType() != Value.ROW) {
                 // the expression is parsed as a simple value
                 command.setAssignment(columns.get(0), expression);
             } else {
