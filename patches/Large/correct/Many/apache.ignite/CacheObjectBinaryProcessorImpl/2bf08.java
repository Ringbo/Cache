diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/binary/CacheObjectBinaryProcessorImpl.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/binary/CacheObjectBinaryProcessorImpl.java
index 3250636..8dcc510 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/binary/CacheObjectBinaryProcessorImpl.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/binary/CacheObjectBinaryProcessorImpl.java
@@ -574,7 +574,7 @@
         }
 
         if (holder != null) {
-            if (curThread instanceof IgniteDiscoveryThread)
+            if (curThread instanceof IgniteDiscoveryThread || (curThread != null && curThread.isForbiddenToRequestBinaryMetadata()))
                 return holder.metadata();
 
             if (holder.pendingVersion() - holder.acceptedVersion() > 0) {
