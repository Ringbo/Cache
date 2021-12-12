diff --git a/components/camel-blueprint/src/main/java/org/apache/camel/blueprint/handler/CamelNamespaceHandler.java b/components/camel-blueprint/src/main/java/org/apache/camel/blueprint/handler/CamelNamespaceHandler.java
index 7470f1a..d810f05 100644
--- a/components/camel-blueprint/src/main/java/org/apache/camel/blueprint/handler/CamelNamespaceHandler.java
+++ b/components/camel-blueprint/src/main/java/org/apache/camel/blueprint/handler/CamelNamespaceHandler.java
@@ -1053,7 +1053,8 @@
             // because the factory has already been instantiated
             try {
                 for (String component : components) {
-                    if (camelContext.getComponent(component) == null) {
+                    if (camelContext.getComponent(component, false) == null) {
+                        // component not already in camel-context so resolve an OSGi reference to it
                         getComponentResolverReference(context, component);
                     } else {
                         LOG.debug("Not creating a service reference for component {} because a component already exists in the Camel Context", component);
