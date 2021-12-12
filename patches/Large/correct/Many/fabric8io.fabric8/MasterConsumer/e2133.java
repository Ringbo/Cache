diff --git a/fabric/fabric-camel/src/main/java/org/fusesource/fabric/camel/MasterConsumer.java b/fabric/fabric-camel/src/main/java/org/fusesource/fabric/camel/MasterConsumer.java
index 25e5819..60e5bef 100644
--- a/fabric/fabric-camel/src/main/java/org/fusesource/fabric/camel/MasterConsumer.java
+++ b/fabric/fabric-camel/src/main/java/org/fusesource/fabric/camel/MasterConsumer.java
@@ -52,7 +52,7 @@
     protected void doStart() throws Exception {
         super.doStart();
         singleton.start();
-        CamelNodeState state = new CamelNodeState(endpoint.getSingletonId(), System.getProperty("karaf.name"));
+        CamelNodeState state = new CamelNodeState(endpoint.getSingletonId());
         LOG.debug("Attempting to become master for endpoint: " + endpoint + " in " + endpoint.getCamelContext() + " with singletonID: " + endpoint.getSingletonId());
         singleton.update(state);
     }
