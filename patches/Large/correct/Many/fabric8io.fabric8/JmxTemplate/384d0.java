diff --git a/fabric-core/src/main/java/org/fusesource/fabric/service/JmxTemplate.java b/fabric-core/src/main/java/org/fusesource/fabric/service/JmxTemplate.java
index d5c11e2..1515c6c 100644
--- a/fabric-core/src/main/java/org/fusesource/fabric/service/JmxTemplate.java
+++ b/fabric-core/src/main/java/org/fusesource/fabric/service/JmxTemplate.java
@@ -30,7 +30,7 @@
     }
 
     public <T> T execute(JmxConnectorCallback<T> callback) {
-        JMXConnector connector = createConnector();
+        JMXConnector connector = getConnector();
         try {
             return callback.doWithJmxConnector(getConnector());
         } catch (FabricException e) {
