diff --git a/src/main/java/com/thinkaurelius/titan/graphdb/relations/SimpleProperty.java b/src/main/java/com/thinkaurelius/titan/graphdb/relations/SimpleProperty.java
index a1189ff..93661b6 100644
--- a/src/main/java/com/thinkaurelius/titan/graphdb/relations/SimpleProperty.java
+++ b/src/main/java/com/thinkaurelius/titan/graphdb/relations/SimpleProperty.java
@@ -79,7 +79,7 @@
 	}
 
 	@Override
-	public void forceDelete() {
+	public synchronized void forceDelete() {
 		super.forceDelete();
 		node.removeRelation(this);
 	}
