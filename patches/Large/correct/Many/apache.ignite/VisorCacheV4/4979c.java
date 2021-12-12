diff --git a/modules/core/src/main/java/org/apache/ignite/internal/visor/cache/VisorCacheV4.java b/modules/core/src/main/java/org/apache/ignite/internal/visor/cache/VisorCacheV4.java
index 81dbacb..a5f66be 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/visor/cache/VisorCacheV4.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/visor/cache/VisorCacheV4.java
@@ -86,7 +86,7 @@
 
     /** {@inheritDoc} */
     @Override public VisorCache history() {
-        return initHistory(new VisorCacheV3());
+        return initHistory(new VisorCacheV4());
     }
 
     /**
