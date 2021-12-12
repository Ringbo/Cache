diff --git a/modules/core/src/main/java/org/gridgain/grid/cache/store/GridCacheStoreBalancingWrapper.java b/modules/core/src/main/java/org/gridgain/grid/cache/store/GridCacheStoreBalancingWrapper.java
index 95fdb86..600ba16 100644
--- a/modules/core/src/main/java/org/gridgain/grid/cache/store/GridCacheStoreBalancingWrapper.java
+++ b/modules/core/src/main/java/org/gridgain/grid/cache/store/GridCacheStoreBalancingWrapper.java
@@ -103,7 +103,7 @@
 
             if (fut != null) {
                 if (pending == null)
-                    pending = new HashMap<>(keys.size());
+                    pending = new HashMap<>();
 
                 pending.put(key, fut);
             }
@@ -116,7 +116,7 @@
 
                 if (old != null) {
                     if (pending == null)
-                        pending = new HashMap<>(keys.size());
+                        pending = new HashMap<>();
 
                     pending.put(key, old);
                 }
