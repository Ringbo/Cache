diff --git a/src/org/zaproxy/zap/extension/ascan/PolicyCategoryPanel.java b/src/org/zaproxy/zap/extension/ascan/PolicyCategoryPanel.java
index e6d2a6d..49e9a20 100644
--- a/src/org/zaproxy/zap/extension/ascan/PolicyCategoryPanel.java
+++ b/src/org/zaproxy/zap/extension/ascan/PolicyCategoryPanel.java
@@ -91,7 +91,7 @@
             tableTest.setAutoCreateRowSorter(true);
             
             //Default sort by name (column 0)
-            List <RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();
+            List <RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>(1);
             sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
             tableTest.getRowSorter().setSortKeys(sortKeys);
             
