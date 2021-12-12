diff --git a/components/camel-chronicle/src/main/java/org/apache/camel/component/chronicle/engine/ChronicleEngineProducer.java b/components/camel-chronicle/src/main/java/org/apache/camel/component/chronicle/engine/ChronicleEngineProducer.java
index 4473031..9d41799 100644
--- a/components/camel-chronicle/src/main/java/org/apache/camel/component/chronicle/engine/ChronicleEngineProducer.java
+++ b/components/camel-chronicle/src/main/java/org/apache/camel/component/chronicle/engine/ChronicleEngineProducer.java
@@ -40,7 +40,7 @@
     private WeakRef<QueueView<Object, Object>> queueView;
     private AssetTree client;
 
-    public ChronicleEngineProducer(ChronicleEngineEnpoint endpoint) {
+    public ChronicleEngineProducer(ChronicleEngineEndpoint endpoint) {
         super(endpoint, ChronicleEngineConstants.ACTION, endpoint.getConfiguration().getAction());
 
         this.uri = endpoint.getUri();
@@ -62,7 +62,7 @@
             throw new IllegalStateException("AssetTree already configured");
         }
 
-        client = ((ChronicleEngineEnpoint)getEndpoint()).createRemoteAssetTree();
+        client = ((ChronicleEngineEndpoint)getEndpoint()).createRemoteAssetTree();
     }
 
     @Override
