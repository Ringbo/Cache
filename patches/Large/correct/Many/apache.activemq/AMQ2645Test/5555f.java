diff --git a/activemq-core/src/test/java/org/apache/activemq/bugs/AMQ2645Test.java b/activemq-core/src/test/java/org/apache/activemq/bugs/AMQ2645Test.java
index d745c3b..dea6e77 100644
--- a/activemq-core/src/test/java/org/apache/activemq/bugs/AMQ2645Test.java
+++ b/activemq-core/src/test/java/org/apache/activemq/bugs/AMQ2645Test.java
@@ -93,7 +93,7 @@
             assertTrue("Consumer is deadlocked!", twoNewMessages.await(60, TimeUnit.SECONDS));
 
             producer.send(session.createTextMessage("test 3"));
-            assertTrue("Consumer got third message after block", twoNewMessages.await(60, TimeUnit.SECONDS));
+            assertTrue("Consumer got third message after block", thirdMessageReceived.await(60, TimeUnit.SECONDS));
 
         } finally {
             broker.stop();
