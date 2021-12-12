diff --git a/jacorb/src/main/java/org/jboss/as/jacorb/JacORBExtension.java b/jacorb/src/main/java/org/jboss/as/jacorb/JacORBExtension.java
index 855617d..d990b1e 100644
--- a/jacorb/src/main/java/org/jboss/as/jacorb/JacORBExtension.java
+++ b/jacorb/src/main/java/org/jboss/as/jacorb/JacORBExtension.java
@@ -55,7 +55,7 @@
 
     @Override
     public void initialize(ExtensionContext context) {
-        final SubsystemRegistration subsystem = context.registerSubsystem(SUBSYSTEM_NAME, 1, 0);
+        final SubsystemRegistration subsystem = context.registerSubsystem(SUBSYSTEM_NAME, 1, 1);
         final ManagementResourceRegistration subsystemRegistration = subsystem.registerSubsystemModel(JacORBSubsystemResource.INSTANCE);
         subsystemRegistration.registerOperationHandler(DESCRIBE, GenericSubsystemDescribeHandler.INSTANCE, GenericSubsystemDescribeHandler.INSTANCE, false, OperationEntry.EntryType.PRIVATE);
         subsystem.registerXMLElementWriter(PARSER);
