diff --git a/hazelcast-wm/src/main/java/com/hazelcast/web/WebFilter.java b/hazelcast-wm/src/main/java/com/hazelcast/web/WebFilter.java
index c3e1c82..6883615 100644
--- a/hazelcast-wm/src/main/java/com/hazelcast/web/WebFilter.java
+++ b/hazelcast-wm/src/main/java/com/hazelcast/web/WebFilter.java
@@ -742,7 +742,7 @@
                 entry.value = value;
                 entry.dirty = true;
             } else {
-                getClusterMap().put(buildAttributeName(name), value);
+                getClusterMap().set(buildAttributeName(name), value);
             }
         }
 
@@ -828,7 +828,7 @@
                             clusterMap.delete(buildAttributeName(entry.getKey()));
                             iterator.remove();
                         } else {
-                            clusterMap.put(buildAttributeName(entry.getKey()), cacheEntry.value);
+                            clusterMap.set(buildAttributeName(entry.getKey()), cacheEntry.value);
                             cacheEntry.dirty = false;
                         }
                     }
