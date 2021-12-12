diff --git a/camel-core/src/main/java/org/apache/camel/management/ManagementStrategyFactory.java b/camel-core/src/main/java/org/apache/camel/management/ManagementStrategyFactory.java
index 7987e77..b10f8ed 100644
--- a/camel-core/src/main/java/org/apache/camel/management/ManagementStrategyFactory.java
+++ b/camel-core/src/main/java/org/apache/camel/management/ManagementStrategyFactory.java
@@ -35,9 +35,9 @@
             log.info("JMX is disabled.");
         } else {
             try {
-                ManagedManagementStrategy jmx = new ManagedManagementStrategy(new DefaultManagementAgent(context));
+                answer = new ManagedManagementStrategy(new DefaultManagementAgent(context));
                 // must start it to ensure JMX works and can load needed Spring JARs
-                ServiceHelper.startService(jmx);
+                ServiceHelper.startService(answer);
                 // prefer to have it at first strategy
                 context.getLifecycleStrategies().add(0, new DefaultManagementLifecycleStrategy(context));
                 log.info("JMX enabled.");
