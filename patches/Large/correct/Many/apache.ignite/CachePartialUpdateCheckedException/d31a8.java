diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/CachePartialUpdateCheckedException.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/CachePartialUpdateCheckedException.java
index fc846f1..ab38e5f 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/CachePartialUpdateCheckedException.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/CachePartialUpdateCheckedException.java
@@ -49,7 +49,7 @@
      */
     @SuppressWarnings("unchecked")
     public synchronized <K> Collection<K> failedKeys() {
-        return new HashSet<>((Collection<K>)failedKeys);
+        return new LinkedHashSet<>((Collection<K>)failedKeys);
     }
 
     /**
