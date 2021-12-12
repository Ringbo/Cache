diff --git a/security/src/main/java/org/jboss/as/security/SecurityExtension.java b/security/src/main/java/org/jboss/as/security/SecurityExtension.java
index 4b6b566..dece3b8 100644
--- a/security/src/main/java/org/jboss/as/security/SecurityExtension.java
+++ b/security/src/main/java/org/jboss/as/security/SecurityExtension.java
@@ -61,7 +61,7 @@
 
         final boolean registerRuntimeOnly = context.isRuntimeOnlyRegistrationValid();
 
-        final SubsystemRegistration subsystem = context.registerSubsystem(SUBSYSTEM_NAME, 1, 0);
+        final SubsystemRegistration subsystem = context.registerSubsystem(SUBSYSTEM_NAME, 1, 1);
         final ManagementResourceRegistration registration = subsystem.registerSubsystemModel(SecuritySubsystemRootResourceDefinition.INSTANCE);
         registration.registerOperationHandler(DESCRIBE, GenericSubsystemDescribeHandler.INSTANCE, GenericSubsystemDescribeHandler.INSTANCE, false, OperationEntry.EntryType.PRIVATE);
 
