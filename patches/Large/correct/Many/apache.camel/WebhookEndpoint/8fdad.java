diff --git a/components/camel-webhook/src/main/java/org/apache/camel/component/webhook/WebhookEndpoint.java b/components/camel-webhook/src/main/java/org/apache/camel/component/webhook/WebhookEndpoint.java
index a8f3adb..391e299 100644
--- a/components/camel-webhook/src/main/java/org/apache/camel/component/webhook/WebhookEndpoint.java
+++ b/components/camel-webhook/src/main/java/org/apache/camel/component/webhook/WebhookEndpoint.java
@@ -27,9 +27,10 @@
 import org.apache.camel.support.DefaultEndpoint;
 
 /**
- * A meta-endpoint that pushes webhook data into a delegate {@code WebhookCapableEndpoint}.
+ * The webhook component allows other Camel components that can receive push notifications to expose
+ * webhook endpoints and automatically register them with their own webhook provider.
  */
-@UriEndpoint(firstVersion = "3.0.0", scheme = "webhook", title = "Webhook", syntax = "webhook:endpointUri", label = "cloud", lenientProperties = true)
+@UriEndpoint(firstVersion = "3.0.0", scheme = "webhook", title = "Webhook", syntax = "webhook:endpointUri", consumerOnly = true, label = "cloud", lenientProperties = true)
 public class WebhookEndpoint extends DefaultEndpoint implements DelegateEndpoint {
 
     private WebhookCapableEndpoint delegateEndpoint;
@@ -73,7 +74,7 @@
         super.doStart();
 
         if (configuration.isWebhookAutoRegister()) {
-            log.info("Registering webhook for endpoint " + delegateEndpoint);
+            log.info("Registering webhook for endpoint {}", delegateEndpoint);
             delegateEndpoint.registerWebhook();
         }
     }
@@ -83,7 +84,7 @@
         super.doStop();
 
         if (configuration.isWebhookAutoRegister()) {
-            log.info("Unregistering webhook for endpoint " + delegateEndpoint);
+            log.info("Unregistering webhook for endpoint {}", delegateEndpoint);
             delegateEndpoint.unregisterWebhook();
         }
     }
@@ -99,6 +100,6 @@
 
     @Override
     public boolean isSingleton() {
-        return false;
+        return true;
     }
 }
