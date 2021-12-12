diff --git a/src/main/java/com/thinkaurelius/titan/graphdb/relations/persist/PersistLabeledTitanEdge.java b/src/main/java/com/thinkaurelius/titan/graphdb/relations/persist/PersistLabeledTitanEdge.java
index 6b019e9..f6365ff 100644
--- a/src/main/java/com/thinkaurelius/titan/graphdb/relations/persist/PersistLabeledTitanEdge.java
+++ b/src/main/java/com/thinkaurelius/titan/graphdb/relations/persist/PersistLabeledTitanEdge.java
@@ -45,7 +45,7 @@
 	 */
 	
 	@Override
-	public void forceDelete() {
+	public synchronized void forceDelete() {
 		super.forceDelete();
 		entity.remove();
 	}
