diff --git a/java/org/apache/catalina/webresources/Cache.java b/java/org/apache/catalina/webresources/Cache.java
index 9ae6d51..b92f789 100644
--- a/java/org/apache/catalina/webresources/Cache.java
+++ b/java/org/apache/catalina/webresources/Cache.java
@@ -102,7 +102,7 @@
                         // Unable to create sufficient space for this resource
                         // Remove it from the cache
                         removeCacheEntry(path, true);
-                        log.warn(sm.getString("cache.addFail"));
+                        log.warn(sm.getString("cache.addFail", path));
                     }
                 }
             } else {
