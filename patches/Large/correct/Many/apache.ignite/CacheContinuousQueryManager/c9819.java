diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/query/continuous/CacheContinuousQueryManager.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/query/continuous/CacheContinuousQueryManager.java
index 2dd8830..97fd7f3 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/query/continuous/CacheContinuousQueryManager.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/query/continuous/CacheContinuousQueryManager.java
@@ -745,7 +745,7 @@
         /** {@inheritDoc} */
         @SuppressWarnings("unchecked")
         @Override public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
-            impl = (CacheEntryEventSerializableFilter)in.readObject();
+            impl = (CacheEntryEventFilter)in.readObject();
             types = in.readByte();
         }
 
