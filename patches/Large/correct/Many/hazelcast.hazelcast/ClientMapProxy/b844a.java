diff --git a/hazelcast-client/src/main/java/com/hazelcast/client/proxy/ClientMapProxy.java b/hazelcast-client/src/main/java/com/hazelcast/client/proxy/ClientMapProxy.java
index ec449b8..39f7144 100644
--- a/hazelcast-client/src/main/java/com/hazelcast/client/proxy/ClientMapProxy.java
+++ b/hazelcast-client/src/main/java/com/hazelcast/client/proxy/ClientMapProxy.java
@@ -561,10 +561,9 @@
                     void invalidate(EntryEvent<K, V> event){
                         System.err.println("invalidate");
                         final Data key = toData(event.getKey());
-//                        nearCache.invalidate(key);
-                        nearCache.put(key, event.getValue());
+                        nearCache.invalidate(key);
                     }
-                }, true);
+                }, false);
             }
         }
     }
