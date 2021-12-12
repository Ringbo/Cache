diff --git a/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/olap/VertexJobConverter.java b/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/olap/VertexJobConverter.java
index 32ad698..a536a6d 100644
--- a/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/olap/VertexJobConverter.java
+++ b/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/olap/VertexJobConverter.java
@@ -36,7 +36,7 @@
     private static final Logger log =
             LoggerFactory.getLogger(VertexJobConverter.class);
 
-    protected static final SliceQuery VERTEX_EXISTS_QUERY = new SliceQuery(BufferUtil.zeroBuffer(4),BufferUtil.oneBuffer(4)).setLimit(1);
+    protected static final SliceQuery VERTEX_EXISTS_QUERY = new SliceQuery(BufferUtil.zeroBuffer(1),BufferUtil.oneBuffer(4)).setLimit(1);
 
     public static final String GHOST_VERTEX_COUNT = "ghost-vertices";
     /**
