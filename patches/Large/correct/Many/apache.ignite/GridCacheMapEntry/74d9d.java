diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheMapEntry.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheMapEntry.java
index 64cfd01..ae40295 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheMapEntry.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheMapEntry.java
@@ -2135,7 +2135,7 @@
                         null,
                         null,
                         false,
-                        updateCntr0 == null ? 0 : updateCntr);
+                        updateCntr0 == null ? 0 : updateCntr0);
                 }
             }
             else
@@ -2431,7 +2431,7 @@
             enqueueVer,
             conflictCtx,
             true,
-            updateCntr0);
+            updateCntr0 == null ? 0 : updateCntr0);
     }
 
     /**
