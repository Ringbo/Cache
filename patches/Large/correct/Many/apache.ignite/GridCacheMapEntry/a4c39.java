diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheMapEntry.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheMapEntry.java
index ddec684..856ac993 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheMapEntry.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheMapEntry.java
@@ -4767,7 +4767,7 @@
             }
             else
                 assert entry.isStartVersion() || ATOMIC_VER_COMPARATOR.compare(entry.ver, newVer) <= 0 :
-                    "Invalid version for inner update [isNew=" + entry.isStartVersion() + ", entry=" + this + ", newVer=" + newVer + ']';
+                    "Invalid version for inner update [isNew=" + entry.isStartVersion() + ", entry=" + entry + ", newVer=" + newVer + ']';
         }
 
         /**
