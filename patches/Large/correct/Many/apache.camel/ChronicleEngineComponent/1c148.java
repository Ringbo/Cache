diff --git a/components/camel-chronicle/src/main/java/org/apache/camel/component/chronicle/engine/ChronicleEngineComponent.java b/components/camel-chronicle/src/main/java/org/apache/camel/component/chronicle/engine/ChronicleEngineComponent.java
index bbc6975..06d7d7d 100644
--- a/components/camel-chronicle/src/main/java/org/apache/camel/component/chronicle/engine/ChronicleEngineComponent.java
+++ b/components/camel-chronicle/src/main/java/org/apache/camel/component/chronicle/engine/ChronicleEngineComponent.java
@@ -24,16 +24,16 @@
 import org.apache.camel.util.ObjectHelper;
 
 /**
- * Represents the component that manages {@link ChronicleEngineEnpoint}.
+ * Represents the component that manages {@link ChronicleEngineEndpoint}.
  */
 public class ChronicleEngineComponent extends UriEndpointComponent {
     
     public ChronicleEngineComponent() {
-        super(ChronicleEngineEnpoint.class);
+        super(ChronicleEngineEndpoint.class);
     }
 
     public ChronicleEngineComponent(CamelContext context) {
-        super(context, ChronicleEngineEnpoint.class);
+        super(context, ChronicleEngineEndpoint.class);
     }
 
     @Override
@@ -45,6 +45,6 @@
 
         setProperties(configuration, parameters);
 
-        return new ChronicleEngineEnpoint(uri, this, configuration);
+        return new ChronicleEngineEndpoint(uri, this, configuration);
     }
 }
