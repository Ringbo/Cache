diff --git a/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/olap/job/GhostVertexRemover.java b/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/olap/job/GhostVertexRemover.java
index 5ae6bb2..7cdc3c6 100644
--- a/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/olap/job/GhostVertexRemover.java
+++ b/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/olap/job/GhostVertexRemover.java
@@ -32,7 +32,7 @@
 
     private static final int RELATION_COUNT_LIMIT = 10000;
 
-    private static final SliceQuery EVERYTHING_QUERY = new SliceQuery(BufferUtil.zeroBuffer(4),BufferUtil.oneBuffer(4));
+    private static final SliceQuery EVERYTHING_QUERY = new SliceQuery(BufferUtil.zeroBuffer(1),BufferUtil.oneBuffer(4));
 
     public static final String REMOVED_RELATION_COUNT = "removed-relations";
     public static final String REMOVED_VERTEX_COUNT = "removed-vertices";
