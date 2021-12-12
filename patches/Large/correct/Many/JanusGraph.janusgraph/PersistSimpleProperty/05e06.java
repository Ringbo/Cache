diff --git a/src/main/java/com/thinkaurelius/titan/graphdb/relations/persist/PersistSimpleProperty.java b/src/main/java/com/thinkaurelius/titan/graphdb/relations/persist/PersistSimpleProperty.java
index 6b14729..bfb2624 100644
--- a/src/main/java/com/thinkaurelius/titan/graphdb/relations/persist/PersistSimpleProperty.java
+++ b/src/main/java/com/thinkaurelius/titan/graphdb/relations/persist/PersistSimpleProperty.java
@@ -40,7 +40,7 @@
 	}
 	
 	@Override
-	public void forceDelete() {
+	public synchronized void forceDelete() {
 		super.forceDelete();
 		entity.remove();
 	}
