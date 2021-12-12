diff --git a/src/main/java/com/thinkaurelius/titan/graphdb/relations/AbstractTypedRelation.java b/src/main/java/com/thinkaurelius/titan/graphdb/relations/AbstractTypedRelation.java
index 5f5912e..ea2abab 100644
--- a/src/main/java/com/thinkaurelius/titan/graphdb/relations/AbstractTypedRelation.java
+++ b/src/main/java/com/thinkaurelius/titan/graphdb/relations/AbstractTypedRelation.java
@@ -47,7 +47,7 @@
 	}
 	
 	@Override
-	public void forceDelete() {
+	public synchronized void forceDelete() {
 		getTransaction().deletedRelation(this);
 	}
 	
