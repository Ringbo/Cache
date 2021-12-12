diff --git a/rt/transports/http-hc/src/main/java/org/apache/cxf/transport/http/asyncclient/Activator.java b/rt/transports/http-hc/src/main/java/org/apache/cxf/transport/http/asyncclient/Activator.java
index 682071f..32f4321 100644
--- a/rt/transports/http-hc/src/main/java/org/apache/cxf/transport/http/asyncclient/Activator.java
+++ b/rt/transports/http-hc/src/main/java/org/apache/cxf/transport/http/asyncclient/Activator.java
@@ -63,7 +63,7 @@
         private BundleContext context;
         private ServiceRegistration reg;
         
-        public ConduitConfigurer(BundleContext context, ServiceTracker busTracker) {
+        ConduitConfigurer(BundleContext context, ServiceTracker busTracker) {
             this.context = context;
             this.busTracker = busTracker;
         }
