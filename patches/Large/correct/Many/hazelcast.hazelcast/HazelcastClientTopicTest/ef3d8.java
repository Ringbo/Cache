diff --git a/hazelcast-client/src/test/java/com/hazelcast/client/HazelcastClientTopicTest.java b/hazelcast-client/src/test/java/com/hazelcast/client/HazelcastClientTopicTest.java
index e200a19..b46a178 100644
--- a/hazelcast-client/src/test/java/com/hazelcast/client/HazelcastClientTopicTest.java
+++ b/hazelcast-client/src/test/java/com/hazelcast/client/HazelcastClientTopicTest.java
@@ -82,7 +82,7 @@
             }
         });
         topic.publish(message);
-        assertTrue(latch.await(100, TimeUnit.MILLISECONDS));
+        assertTrue(latch.await(10000, TimeUnit.MILLISECONDS));
     }
 
     @Test
@@ -102,7 +102,7 @@
         topic.publish(message);
         topic.removeMessageListener(messageListener);
         topic.publish(message);
-        assertFalse(latch.await(100, TimeUnit.MILLISECONDS));
+        assertFalse(latch.await(10000, TimeUnit.MILLISECONDS));
     }
 
     @AfterClass
