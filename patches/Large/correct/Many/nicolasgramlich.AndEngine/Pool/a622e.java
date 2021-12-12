diff --git a/src/org/anddev/andengine/util/pool/Pool.java b/src/org/anddev/andengine/util/pool/Pool.java
index c0eb325..2d8e90f 100644
--- a/src/org/anddev/andengine/util/pool/Pool.java
+++ b/src/org/anddev/andengine/util/pool/Pool.java
@@ -61,7 +61,7 @@
 	}
 
 	@Override
-	public synchronized void recylePoolItem(final T pPoolItem) {
+	public synchronized void recyclePoolItem(final T pPoolItem) {
 		if(pPoolItem.mParent == null) {
 			throw new IllegalArgumentException("PoolItem not assigned to a pool!");
 		} else if(!pPoolItem.isFromPool(this)) {
@@ -70,7 +70,7 @@
 			throw new IllegalArgumentException("PoolItem already recycled!");
 		} 
 		
-		super.recylePoolItem(pPoolItem);
+		super.recyclePoolItem(pPoolItem);
 	}
 
 	// ===========================================================
@@ -83,7 +83,7 @@
 
 	@SuppressWarnings("unchecked")
 	void recycle(final PoolItem pPoolItem) {
-		this.recylePoolItem((T) pPoolItem);
+		this.recyclePoolItem((T) pPoolItem);
 	}
 
 	// ===========================================================
