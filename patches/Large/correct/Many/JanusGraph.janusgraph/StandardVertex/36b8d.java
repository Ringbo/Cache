diff --git a/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/vertices/StandardVertex.java b/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/vertices/StandardVertex.java
index 0d4e0d4..931ba79 100644
--- a/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/vertices/StandardVertex.java
+++ b/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/vertices/StandardVertex.java
@@ -22,7 +22,7 @@
 public class StandardVertex extends AbstractVertex {
 
     private byte lifecycle;
-    private AddedRelationsContainer addedRelations=AddedRelationsContainer.EMPTY;
+    private volatile AddedRelationsContainer addedRelations=AddedRelationsContainer.EMPTY;
 
     public StandardVertex(final StandardTitanTx tx, final long id, byte lifecycle) {
         super(tx, id);
