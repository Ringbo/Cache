diff --git a/components/camel-facebook/src/main/java/org/apache/camel/component/facebook/FacebookComponent.java b/components/camel-facebook/src/main/java/org/apache/camel/component/facebook/FacebookComponent.java
index fb45b71..43e281e 100644
--- a/components/camel-facebook/src/main/java/org/apache/camel/component/facebook/FacebookComponent.java
+++ b/components/camel-facebook/src/main/java/org/apache/camel/component/facebook/FacebookComponent.java
@@ -66,7 +66,7 @@
 
         // create endpoint configuration with component properties
         FacebookEndpointConfiguration config = new FacebookEndpointConfiguration();
-        IntrospectionSupport.setProperties(config, componentProperties, null);
+        IntrospectionSupport.setProperties(config, componentProperties);
         return config;
     }
 
