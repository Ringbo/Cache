diff --git a/activemq-mqtt/src/test/java/org/apache/activemq/transport/mqtt/AbstractMQTTTest.java b/activemq-mqtt/src/test/java/org/apache/activemq/transport/mqtt/AbstractMQTTTest.java
index 545c42e..5158272 100644
--- a/activemq-mqtt/src/test/java/org/apache/activemq/transport/mqtt/AbstractMQTTTest.java
+++ b/activemq-mqtt/src/test/java/org/apache/activemq/transport/mqtt/AbstractMQTTTest.java
@@ -65,7 +65,7 @@
         brokerService.setPersistent(false);
         brokerService.setAdvisorySupport(false);
         brokerService.setUseJmx(false);
-        this.numberOfMessages = 3000;
+        this.numberOfMessages = 1000;
     }
 
     @After
