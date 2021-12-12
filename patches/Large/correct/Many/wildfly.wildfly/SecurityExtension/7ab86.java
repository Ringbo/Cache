diff --git a/security/subsystem/src/main/java/org/jboss/as/security/SecurityExtension.java b/security/subsystem/src/main/java/org/jboss/as/security/SecurityExtension.java
index 6ee4835..176fd8e 100644
--- a/security/subsystem/src/main/java/org/jboss/as/security/SecurityExtension.java
+++ b/security/subsystem/src/main/java/org/jboss/as/security/SecurityExtension.java
@@ -50,7 +50,7 @@
 
     private static final String RESOURCE_NAME = SecurityExtension.class.getPackage().getName() + ".LocalDescriptions";
 
-    private static final ModelVersion CURRENT_MODEL_VERSION = ModelVersion.create(3, 0, 0);
+    private static final ModelVersion CURRENT_MODEL_VERSION = ModelVersion.create(2, 0, 0);
 
     static final PathElement ACL_PATH = PathElement.pathElement(Constants.ACL, Constants.CLASSIC);
     static final PathElement PATH_IDENTITY_TRUST_CLASSIC = PathElement.pathElement(Constants.IDENTITY_TRUST, Constants.CLASSIC);
@@ -119,6 +119,6 @@
         context.setSubsystemXmlMapping(SUBSYSTEM_NAME, Namespace.SECURITY_1_0.getUriString(), SecuritySubsystemParser::new);
         context.setSubsystemXmlMapping(SUBSYSTEM_NAME, Namespace.SECURITY_1_1.getUriString(), SecuritySubsystemParser::new);
         context.setSubsystemXmlMapping(SUBSYSTEM_NAME, Namespace.SECURITY_1_2.getUriString(), SecuritySubsystemParser::new);
-        context.setSubsystemXmlMapping(SUBSYSTEM_NAME, Namespace.SECURITY_3_0.getUriString(), SecuritySubsystemParser_3_0::new);
+        context.setSubsystemXmlMapping(SUBSYSTEM_NAME, Namespace.SECURITY_2_0.getUriString(), SecuritySubsystemParser_3_0::new);
     }
 }
\ No newline at end of file
