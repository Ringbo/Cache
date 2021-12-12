diff --git a/sql/src/main/java/io/crate/operation/projectors/FilterProjector.java b/sql/src/main/java/io/crate/operation/projectors/FilterProjector.java
index 83ab741..5f794a4 100644
--- a/sql/src/main/java/io/crate/operation/projectors/FilterProjector.java
+++ b/sql/src/main/java/io/crate/operation/projectors/FilterProjector.java
@@ -51,7 +51,7 @@
     }
 
     @Override
-    public boolean setNextRow(Object... row) {
+    public synchronized boolean setNextRow(Object... row) {
         for (CollectExpression<?> collectExpression : collectExpressions) {
             collectExpression.setNextRow(row);
         }
