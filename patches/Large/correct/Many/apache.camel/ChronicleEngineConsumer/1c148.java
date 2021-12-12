diff --git a/components/camel-chronicle/src/main/java/org/apache/camel/component/chronicle/engine/ChronicleEngineConsumer.java b/components/camel-chronicle/src/main/java/org/apache/camel/component/chronicle/engine/ChronicleEngineConsumer.java
index 4cf79d4..52bd453 100644
--- a/components/camel-chronicle/src/main/java/org/apache/camel/component/chronicle/engine/ChronicleEngineConsumer.java
+++ b/components/camel-chronicle/src/main/java/org/apache/camel/component/chronicle/engine/ChronicleEngineConsumer.java
@@ -38,7 +38,7 @@
     private final String path;
     private AssetTree client;
 
-    public ChronicleEngineConsumer(ChronicleEngineEnpoint endpoint, Processor processor) {
+    public ChronicleEngineConsumer(ChronicleEngineEndpoint endpoint, Processor processor) {
         super(endpoint, processor);
 
         this.path = endpoint.getPath();
@@ -50,7 +50,7 @@
             throw new IllegalStateException("AssetTree already configured");
         }
 
-        ChronicleEngineEnpoint endpoint = (ChronicleEngineEnpoint)getEndpoint();
+        ChronicleEngineEndpoint endpoint = (ChronicleEngineEndpoint)getEndpoint();
         ChronicleEngineConfiguration conf = endpoint.getConfiguration();
         client = endpoint.createRemoteAssetTree();
 
