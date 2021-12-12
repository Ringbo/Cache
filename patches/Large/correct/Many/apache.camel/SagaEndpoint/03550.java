diff --git a/camel-core/src/main/java/org/apache/camel/component/saga/SagaEndpoint.java b/camel-core/src/main/java/org/apache/camel/component/saga/SagaEndpoint.java
index 96cd167..a0f3114 100644
--- a/camel-core/src/main/java/org/apache/camel/component/saga/SagaEndpoint.java
+++ b/camel-core/src/main/java/org/apache/camel/component/saga/SagaEndpoint.java
@@ -26,7 +26,7 @@
 import org.apache.camel.util.ObjectHelper;
 
 /**
- * The default saga endpoint.
+ * The saga component provides access to advanced options for managing the flow in the Saga EIP.
  */
 @UriEndpoint(firstVersion = "2.21.0", scheme = "saga", title = "Saga", syntax = "saga:action", producerOnly = true, label = "core,endpoint")
 public class SagaEndpoint extends DefaultEndpoint {
@@ -63,7 +63,7 @@
 
     @Override
     public boolean isSingleton() {
-        return false;
+        return true;
     }
 
 }
