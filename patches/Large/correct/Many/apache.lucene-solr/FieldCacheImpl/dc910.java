diff --git a/src/java/org/apache/lucene/search/FieldCacheImpl.java b/src/java/org/apache/lucene/search/FieldCacheImpl.java
index bafa0d3..1ca0222 100644
--- a/src/java/org/apache/lucene/search/FieldCacheImpl.java
+++ b/src/java/org/apache/lucene/search/FieldCacheImpl.java
@@ -62,7 +62,7 @@
         }
         if (value == null) {
           value = new CreationPlaceholder();
-          innerCache.put(reader, value);
+          innerCache.put(key, value);
         }
       }
       if (value instanceof CreationPlaceholder) {
