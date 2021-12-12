diff --git a/src/org/anddev/andengine/util/cache/LRUCache.java b/src/org/anddev/andengine/util/cache/LRUCache.java
index 88801c2..c8e0a83 100644
--- a/src/org/anddev/andengine/util/cache/LRUCache.java
+++ b/src/org/anddev/andengine/util/cache/LRUCache.java
@@ -69,7 +69,7 @@
 	}
 
 	@Override
-	public V get(final Object pKey) {
+	public synchronized V get(final Object pKey) {
 		final V value = super.get(pKey);
 		if (value != null) {
 			this.updateKey(pKey);
