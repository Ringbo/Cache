diff --git a/components/camel-box/src/main/java/org/apache/camel/component/box/BoxConsumer.java b/components/camel-box/src/main/java/org/apache/camel/component/box/BoxConsumer.java
index f0da8a5..6b6fabf 100644
--- a/components/camel-box/src/main/java/org/apache/camel/component/box/BoxConsumer.java
+++ b/components/camel-box/src/main/java/org/apache/camel/component/box/BoxConsumer.java
@@ -56,7 +56,7 @@
     public BoxConsumer(BoxEndpoint endpoint, Processor processor) {
         super(endpoint, processor);
 
-        apiMethod = ApiConsumerHelper.findMethod(endpoint, this, log);
+        apiMethod = ApiConsumerHelper.findMethod(endpoint, this);
 
         properties = new HashMap<String, Object>();
         properties.putAll(endpoint.getEndpointProperties());
