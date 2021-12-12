diff --git a/src/main/java/com/thinkaurelius/titan/graphdb/relations/SimpleTitanEdge.java b/src/main/java/com/thinkaurelius/titan/graphdb/relations/SimpleTitanEdge.java
index af80b3a..6c66b48 100644
--- a/src/main/java/com/thinkaurelius/titan/graphdb/relations/SimpleTitanEdge.java
+++ b/src/main/java/com/thinkaurelius/titan/graphdb/relations/SimpleTitanEdge.java
@@ -97,7 +97,7 @@
 	}
 
 	@Override
-	public void forceDelete() {
+	public synchronized void forceDelete() {
 		start.removeRelation(this);
 		if (!isUnidirected())
 			end.removeRelation(this);
