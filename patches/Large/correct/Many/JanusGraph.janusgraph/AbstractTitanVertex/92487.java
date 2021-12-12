diff --git a/src/main/java/com/thinkaurelius/titan/graphdb/vertices/AbstractTitanVertex.java b/src/main/java/com/thinkaurelius/titan/graphdb/vertices/AbstractTitanVertex.java
index 8d05f56..162133e 100644
--- a/src/main/java/com/thinkaurelius/titan/graphdb/vertices/AbstractTitanVertex.java
+++ b/src/main/java/com/thinkaurelius/titan/graphdb/vertices/AbstractTitanVertex.java
@@ -89,7 +89,7 @@
 	}
 
 	@Override
-	public void remove() {
+	public synchronized void remove() {
 		VertexUtil.checkAvailability(this);
         VertexUtil.prepareForRemoval(this);
         tx.deleteVertex(this);
