diff --git a/src/org/zaproxy/zap/extension/pscan/PolicyPassiveScanPanel.java b/src/org/zaproxy/zap/extension/pscan/PolicyPassiveScanPanel.java
index 72718df..9fa2957 100644
--- a/src/org/zaproxy/zap/extension/pscan/PolicyPassiveScanPanel.java
+++ b/src/org/zaproxy/zap/extension/pscan/PolicyPassiveScanPanel.java
@@ -99,7 +99,7 @@
             tableTest.setAutoCreateRowSorter(true);
             
             //Default sort by name (column 0)
-            List <RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();
+            List <RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>(1);
             sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
             tableTest.getRowSorter().setSortKeys(sortKeys);
             
