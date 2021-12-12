diff --git a/nifi-nar-bundles/nifi-jms-bundle/nifi-jms-processors/src/test/java/org/apache/nifi/jms/processors/PublishJMSTest.java b/nifi-nar-bundles/nifi-jms-bundle/nifi-jms-processors/src/test/java/org/apache/nifi/jms/processors/PublishJMSTest.java
index 1964ce9..06bd775 100644
--- a/nifi-nar-bundles/nifi-jms-bundle/nifi-jms-processors/src/test/java/org/apache/nifi/jms/processors/PublishJMSTest.java
+++ b/nifi-nar-bundles/nifi-jms-bundle/nifi-jms-processors/src/test/java/org/apache/nifi/jms/processors/PublishJMSTest.java
@@ -73,7 +73,7 @@
         assertEquals("cooQueue", ((Queue) message.getJMSReplyTo()).getQueueName());
         assertEquals("foo", message.getStringProperty("foo"));
 
-        runner.run(1, true); // Run once just so that we can trigger the shutdown of the Connection Factory
+        runner.run(1, true, false); // Run once just so that we can trigger the shutdown of the Connection Factory
     }
 
     @Test
@@ -111,7 +111,7 @@
         assertEquals("cooQueue", ((Queue) message.getJMSReplyTo()).getQueueName());
         assertEquals("foo", message.getStringProperty("foo"));
 
-        runner.run(1, true); // Run once just so that we can trigger the shutdown of the Connection Factory
+        runner.run(1, true, false); // Run once just so that we can trigger the shutdown of the Connection Factory
     }
 
     @Test
