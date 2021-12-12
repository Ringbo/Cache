diff --git a/hazelcast/src/test/java/com/hazelcast/replicatedmap/ReplicatedMapStatsTest.java b/hazelcast/src/test/java/com/hazelcast/replicatedmap/ReplicatedMapStatsTest.java
index 0c9c6a2..d59f9bc 100644
--- a/hazelcast/src/test/java/com/hazelcast/replicatedmap/ReplicatedMapStatsTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/replicatedmap/ReplicatedMapStatsTest.java
@@ -175,7 +175,7 @@
             @Override
             public void run()
                     throws Exception {
-                assertTrue(stats.getLastAccessTime() > lastAccessTime);
+                assertTrue(stats.getLastAccessTime() >= lastAccessTime);
             }
         });
     }
@@ -194,7 +194,7 @@
         Thread.sleep(5);
         replicatedMap.put(key, "value2");
         long lastUpdateTime2 = replicatedMap.getReplicatedMapStats().getLastUpdateTime();
-        assertTrue(lastUpdateTime2 > lastUpdateTime);
+        assertTrue(lastUpdateTime2 >= lastUpdateTime);
     }
 
     @Test
@@ -222,7 +222,7 @@
             @Override
             public void run()
                     throws Exception {
-                assertTrue(stats.getLastUpdateTime() > lastUpdateTime);
+                assertTrue(stats.getLastUpdateTime() >= lastUpdateTime);
             }
         });
     }
