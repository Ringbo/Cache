diff --git a/src/main/java/org/apache/hadoop/hbase/master/handler/OpenedRegionHandler.java b/src/main/java/org/apache/hadoop/hbase/master/handler/OpenedRegionHandler.java
index 5913058..c478ab7 100644
--- a/src/main/java/org/apache/hadoop/hbase/master/handler/OpenedRegionHandler.java
+++ b/src/main/java/org/apache/hadoop/hbase/master/handler/OpenedRegionHandler.java
@@ -93,7 +93,7 @@
     }
     // Code to defend against case where we get SPLIT before region open
     // processing completes; temporary till we make SPLITs go via zk -- 0.92.
-    if (this.assignmentManager.isRegionInTransition(regionInfo) == null) {
+    if (this.assignmentManager.isRegionInTransition(regionInfo) != null) {
       this.assignmentManager.regionOnline(regionInfo, serverInfo);
     } else {
       LOG.warn("Skipping the onlining of " + regionInfo.getRegionNameAsString() +
