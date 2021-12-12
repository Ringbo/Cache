diff --git a/java/org/apache/catalina/tribes/jmx/JmxRegistry.java b/java/org/apache/catalina/tribes/jmx/JmxRegistry.java
index 0233368..b4d4565 100644
--- a/java/org/apache/catalina/tribes/jmx/JmxRegistry.java
+++ b/java/org/apache/catalina/tribes/jmx/JmxRegistry.java
@@ -60,7 +60,10 @@
         // create registry
         registry = new JmxRegistry();
         registry.baseOname = baseOn;
-        registryCache.putIfAbsent(channel.getName(), registry);
+        // It doesn't matter if existing object gets over-written. This object
+        // holds minimal state and that state will be the same for all objects
+        // created for the same channel.
+        registryCache.put(channel.getName(), registry);
         return registry;
     }
 
