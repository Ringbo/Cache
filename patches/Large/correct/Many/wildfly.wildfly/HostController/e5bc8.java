diff --git a/host-controller/src/main/java/org/jboss/as/host/controller/HostController.java b/host-controller/src/main/java/org/jboss/as/host/controller/HostController.java
index 04058eb..42e15b8 100644
--- a/host-controller/src/main/java/org/jboss/as/host/controller/HostController.java
+++ b/host-controller/src/main/java/org/jboss/as/host/controller/HostController.java
@@ -230,7 +230,7 @@
             }
         });
 
-        final ServiceActivatorContext serviceActivatorContext = new ServiceActivatorContextImpl(batchBuilder);
+        final ServiceActivatorContext serviceActivatorContext = new ServiceActivatorContextImpl(batchBuilder, serviceContainer);
 
         // Always activate the management port
         activateManagementCommunication(serviceActivatorContext);
