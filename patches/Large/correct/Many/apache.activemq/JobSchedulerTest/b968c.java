diff --git a/activemq-core/src/test/java/org/apache/activemq/broker/scheduler/JobSchedulerTest.java b/activemq-core/src/test/java/org/apache/activemq/broker/scheduler/JobSchedulerTest.java
index 8d936af..ccd71e1 100644
--- a/activemq-core/src/test/java/org/apache/activemq/broker/scheduler/JobSchedulerTest.java
+++ b/activemq-core/src/test/java/org/apache/activemq/broker/scheduler/JobSchedulerTest.java
@@ -78,7 +78,8 @@
         String str = new String("test1");
         scheduler.schedule("id:1", new ByteSequence(str.getBytes()), cronTab, 0, 0, 0);
 
-        assertTrue(latch.await(60, TimeUnit.SECONDS));
+        // need a little slack so go over 60 seconds
+        assertTrue(latch.await(70, TimeUnit.SECONDS));
         assertEquals(0, latch.getCount());
     }
 
