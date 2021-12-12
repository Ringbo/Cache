diff --git a/hazelcast-wm/src/main/java/com/hazelcast/web/WebFilter.java b/hazelcast-wm/src/main/java/com/hazelcast/web/WebFilter.java
index 49468dd..26741a7 100644
--- a/hazelcast-wm/src/main/java/com/hazelcast/web/WebFilter.java
+++ b/hazelcast-wm/src/main/java/com/hazelcast/web/WebFilter.java
@@ -456,7 +456,7 @@
                         cacheEntry.value = value;
                         cacheEntry.reload = false;
                     }
-                    localCache.put(name, NULL_ENTRY);
+                    localCache.put(name, cacheEntry);
                 }
                 return cacheEntry != NULL_ENTRY ? cacheEntry.value : null;
             }
