diff --git a/hutool-cache/src/main/java/com/xiaoleilu/hutool/cache/impl/LFUCache.java b/hutool-cache/src/main/java/com/xiaoleilu/hutool/cache/impl/LFUCache.java
index 4a60fc8..77efcc5 100644
--- a/hutool-cache/src/main/java/com/xiaoleilu/hutool/cache/impl/LFUCache.java
+++ b/hutool-cache/src/main/java/com/xiaoleilu/hutool/cache/impl/LFUCache.java
@@ -35,7 +35,7 @@
 	public LFUCache(int capacity, long timeout) {
 		this.capacity = capacity;
 		this.timeout = timeout;
-		cacheMap = new HashMap<K, CacheObj<K, V>>(capacity + 1);
+		cacheMap = new HashMap<K, CacheObj<K, V>>(capacity + 1, 1.0f);
 	}
 
 	// ---------------------------------------------------------------- prune
