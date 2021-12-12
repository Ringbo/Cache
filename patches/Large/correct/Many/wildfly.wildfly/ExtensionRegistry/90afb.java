diff --git a/controller/src/main/java/org/jboss/as/controller/extension/ExtensionRegistry.java b/controller/src/main/java/org/jboss/as/controller/extension/ExtensionRegistry.java
index 4fc5cca..3330e6b 100644
--- a/controller/src/main/java/org/jboss/as/controller/extension/ExtensionRegistry.java
+++ b/controller/src/main/java/org/jboss/as/controller/extension/ExtensionRegistry.java
@@ -350,7 +350,7 @@
         final Map<String, SubsystemInformation> subsystemsInfo = getAvailableSubsystems(moduleName);
         if(subsystemsInfo != null && ! subsystemsInfo.isEmpty()) {
             for(final Map.Entry<String, SubsystemInformation> entry : subsystemsInfo.entrySet()) {
-                subsystems.add(entry.getKey(), entry.getValue().getManagementInterfaceMajorVersion() +"."+ entry.getValue().getManagementInterfaceMinorVersion());
+                subsystems.add(entry.getKey(), entry.getValue().getManagementInterfaceMajorVersion() +"."+ entry.getValue().getManagementInterfaceMicroVersion());
             }
         }
     }
