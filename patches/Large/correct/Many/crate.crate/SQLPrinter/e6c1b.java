diff --git a/sql/src/main/java/io/crate/analyze/SQLPrinter.java b/sql/src/main/java/io/crate/analyze/SQLPrinter.java
index fe92369..250b7af 100644
--- a/sql/src/main/java/io/crate/analyze/SQLPrinter.java
+++ b/sql/src/main/java/io/crate/analyze/SQLPrinter.java
@@ -91,9 +91,9 @@
 
         @Override
         public Void visitUnionSelect(UnionSelect unionSelect, StringBuilder sb) {
-            printSelect(unionSelect.left(), sb);
+            process(unionSelect.left(), sb);
             sb.append(" UNION ALL ");
-            printSelect(unionSelect.right(), sb);
+            process(unionSelect.right(), sb);
             return null;
         }
 
