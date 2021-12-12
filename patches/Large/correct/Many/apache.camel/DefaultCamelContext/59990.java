diff --git a/camel-core/src/main/java/org/apache/camel/impl/DefaultCamelContext.java b/camel-core/src/main/java/org/apache/camel/impl/DefaultCamelContext.java
index 1953adf..532bb7b 100644
--- a/camel-core/src/main/java/org/apache/camel/impl/DefaultCamelContext.java
+++ b/camel-core/src/main/java/org/apache/camel/impl/DefaultCamelContext.java
@@ -205,7 +205,7 @@
                     component = getComponentResolver().resolveComponent(name, this);
                     if (component != null) {
                         addComponent(name, component);
-                        if (isStarted()) {
+                        if (isStarted() || isStarting()) {
                             // If the component is looked up after the context is started,
                             // lets start it up.
                             startServices(component);
