diff --git a/modules/core/src/main/java/org/apache/ignite/internal/IgniteKernal.java b/modules/core/src/main/java/org/apache/ignite/internal/IgniteKernal.java
index ba42a95..bde7be2 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/IgniteKernal.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/IgniteKernal.java
@@ -2864,7 +2864,7 @@
             ctx.cache().dynamicStartCaches(cacheCfgs,
                 true,
                 true,
-                true).get();
+                false).get();
 
             List<IgniteCache> createdCaches = new ArrayList<>(cacheCfgs.size());
 
@@ -2955,7 +2955,7 @@
             ctx.cache().dynamicStartCaches(cacheCfgs,
                 false,
                 true,
-                true).get();
+                false).get();
 
             List<IgniteCache> createdCaches = new ArrayList<>(cacheCfgs.size());
 
