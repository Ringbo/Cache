diff --git a/components/camel-activemq/src/test/java/org/apache/camel/component/activemq/AMQ2240Test.java b/components/camel-activemq/src/test/java/org/apache/camel/component/activemq/AMQ2240Test.java
index 3ecbb58..824544b 100644
--- a/components/camel-activemq/src/test/java/org/apache/camel/component/activemq/AMQ2240Test.java
+++ b/components/camel-activemq/src/test/java/org/apache/camel/component/activemq/AMQ2240Test.java
@@ -52,7 +52,7 @@
             LOG.info("creating context with bad URI: " + vmUri);
             ActiveMQComponent amq = ActiveMQComponent.activeMQComponent(vmUri);
 
-            amq.getConfiguration().getConnectionFactory();
+            amq.getConfiguration().getOrCreateConnectionFactory();
 
             fail("Should have received an exception from the bad URI.");
         } catch (Exception e) {
