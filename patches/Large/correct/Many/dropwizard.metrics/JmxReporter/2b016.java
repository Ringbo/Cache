diff --git a/metrics-core/src/main/java/com/codahale/metrics/JmxReporter.java b/metrics-core/src/main/java/com/codahale/metrics/JmxReporter.java
index 7149219..e387a19 100644
--- a/metrics-core/src/main/java/com/codahale/metrics/JmxReporter.java
+++ b/metrics-core/src/main/java/com/codahale/metrics/JmxReporter.java
@@ -618,7 +618,7 @@
             try {
                 final ObjectName objectName = createName("timers", name);
                 mBeanServer.unregisterMBean(objectName);
-                registered.add(objectName);
+                registered.remove(objectName);
             } catch (InstanceNotFoundException e) {
                 LOGGER.debug("Unable to unregister timer", e);
             } catch (MBeanRegistrationException e) {
