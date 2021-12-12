diff --git a/src/test/java/org/redisson/RedissonTopicTest.java b/src/test/java/org/redisson/RedissonTopicTest.java
index 5d1d09e..7373a53 100644
--- a/src/test/java/org/redisson/RedissonTopicTest.java
+++ b/src/test/java/org/redisson/RedissonTopicTest.java
@@ -105,7 +105,8 @@
         });
         topic1.removeListener(listenerId);
         topic1.removeListener(listenerId2);
-        l.await();
+        
+        Assert.assertTrue(l.await(5, TimeUnit.SECONDS));
     }
 
     @Test
@@ -166,7 +167,7 @@
         });
         topic2.publish(new Message("123"));
 
-        messageRecieved.await();
+        Assert.assertTrue(messageRecieved.await(5, TimeUnit.SECONDS));
 
         redisson1.shutdown();
         redisson2.shutdown();
@@ -231,7 +232,7 @@
             }
         });
 
-        for (int i = 0; i < 500; i++) {
+        for (int i = 0; i < 5000; i++) {
             topic2.publish(new Message("123"));
         }
 
@@ -239,7 +240,7 @@
 
         Thread.sleep(1000);
 
-        Assert.assertEquals(500, counter);
+        Assert.assertEquals(5000, counter);
 
         redisson1.shutdown();
         redisson2.shutdown();
