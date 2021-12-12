diff --git a/components/camel-zookeeper-master/src/test/java/org/apache/camel/component/zookeepermaster/MasterEndpointFailoverTest.java b/components/camel-zookeeper-master/src/test/java/org/apache/camel/component/zookeepermaster/MasterEndpointFailoverTest.java
index ea8118a..da80a16 100644
--- a/components/camel-zookeeper-master/src/test/java/org/apache/camel/component/zookeepermaster/MasterEndpointFailoverTest.java
+++ b/components/camel-zookeeper-master/src/test/java/org/apache/camel/component/zookeepermaster/MasterEndpointFailoverTest.java
@@ -57,7 +57,7 @@
 
         // Need to bind the zookeeper client with the name "curator"
         SimpleRegistry registry = new SimpleRegistry();
-        registry.put("curator", client);
+        registry.bind("curator", client);
 
         producerContext = new DefaultCamelContext(registry);
         // Add the vm:start endpoint to avoid the NPE before starting the consumerContext1
