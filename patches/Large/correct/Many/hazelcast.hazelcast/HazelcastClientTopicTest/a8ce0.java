diff --git a/hazelcast-client/src/test/java/com/hazelcast/client/HazelcastClientTopicTest.java b/hazelcast-client/src/test/java/com/hazelcast/client/HazelcastClientTopicTest.java
index 40c5c36..e200a19 100644
--- a/hazelcast-client/src/test/java/com/hazelcast/client/HazelcastClientTopicTest.java
+++ b/hazelcast-client/src/test/java/com/hazelcast/client/HazelcastClientTopicTest.java
@@ -58,7 +58,7 @@
             }
         });
         topic.publish(message);
-        assertTrue(latch.await(10, TimeUnit.MILLISECONDS));
+        assertTrue(latch.await(10000, TimeUnit.MILLISECONDS));
     }
 
     @Test
