diff --git a/h2/src/main/org/h2/index/RangeIndex.java b/h2/src/main/org/h2/index/RangeIndex.java
index 977efcc..1244535 100644
--- a/h2/src/main/org/h2/index/RangeIndex.java
+++ b/h2/src/main/org/h2/index/RangeIndex.java
@@ -108,7 +108,7 @@
 
     @Override
     public long getRowCount(Session session) {
-        return rangeTable.getRowCountApproximation();
+        return rangeTable.getRowCount(session);
     }
 
     @Override
