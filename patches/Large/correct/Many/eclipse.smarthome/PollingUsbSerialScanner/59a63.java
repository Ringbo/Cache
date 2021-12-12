diff --git a/bundles/config/org.eclipse.smarthome.config.discovery.usbserial.linuxsysfs/src/main/java/org/eclipse/smarthome/config/discovery/usbserial/linuxsysfs/internal/PollingUsbSerialScanner.java b/bundles/config/org.eclipse.smarthome.config.discovery.usbserial.linuxsysfs/src/main/java/org/eclipse/smarthome/config/discovery/usbserial/linuxsysfs/internal/PollingUsbSerialScanner.java
index 0114843..f7eeeb2 100644
--- a/bundles/config/org.eclipse.smarthome.config.discovery.usbserial.linuxsysfs/src/main/java/org/eclipse/smarthome/config/discovery/usbserial/linuxsysfs/internal/PollingUsbSerialScanner.java
+++ b/bundles/config/org.eclipse.smarthome.config.discovery.usbserial.linuxsysfs/src/main/java/org/eclipse/smarthome/config/discovery/usbserial/linuxsysfs/internal/PollingUsbSerialScanner.java
@@ -82,7 +82,7 @@
         }
 
         scheduler = Executors.newSingleThreadScheduledExecutor(
-                ThreadFactoryBuilder.create().withNamePrefix(THREAD_NAME).withDaemonThreads(true).build());
+                ThreadFactoryBuilder.create().withName(THREAD_NAME).withDaemonThreads(true).build());
     }
 
     @Deactivate
