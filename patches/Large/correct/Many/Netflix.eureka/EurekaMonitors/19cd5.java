diff --git a/eureka-core/src/main/java/com/netflix/eureka/util/EurekaMonitors.java b/eureka-core/src/main/java/com/netflix/eureka/util/EurekaMonitors.java
index e64dbe3..b8a706c 100644
--- a/eureka-core/src/main/java/com/netflix/eureka/util/EurekaMonitors.java
+++ b/eureka-core/src/main/java/com/netflix/eureka/util/EurekaMonitors.java
@@ -181,7 +181,7 @@
     public static void shutdown() {
         for (EurekaMonitors c : EurekaMonitors.values()) {
             DefaultMonitorRegistry.getInstance().unregister(
-                    Monitors.newObjectMonitor(c.name(), c));
+                    Monitors.newObjectMonitor(c.getName(), c));
         }
     }
 }
