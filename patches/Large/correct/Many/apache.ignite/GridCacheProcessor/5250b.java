diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheProcessor.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheProcessor.java
index b623aa3..a64dcf9 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheProcessor.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheProcessor.java
@@ -448,7 +448,7 @@
      */
     private List<GridCacheManager> dhtManagers(GridCacheContext ctx) {
         return F.asList(ctx.store(), ctx.events(), ctx.evicts(), ctx.queries(), ctx.continuousQueries(),
-            ctx.dr());
+            ctx.dr(), ctx.offheap());
     }
 
     /**
