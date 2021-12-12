diff --git a/src/main/java/com/thinkaurelius/titan/graphdb/relations/persist/PersistSimpleTitanEdge.java b/src/main/java/com/thinkaurelius/titan/graphdb/relations/persist/PersistSimpleTitanEdge.java
index 9e2001d..0085a5e 100644
--- a/src/main/java/com/thinkaurelius/titan/graphdb/relations/persist/PersistSimpleTitanEdge.java
+++ b/src/main/java/com/thinkaurelius/titan/graphdb/relations/persist/PersistSimpleTitanEdge.java
@@ -42,7 +42,7 @@
 	}
 	
 	@Override
-	public void forceDelete() {
+	public synchronized void forceDelete() {
 		super.forceDelete();
 		entity.remove();
 	}
