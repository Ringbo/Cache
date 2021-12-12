diff --git a/host-controller/src/main/java/org/jboss/as/host/controller/ManagedServerBootCmdFactory.java b/host-controller/src/main/java/org/jboss/as/host/controller/ManagedServerBootCmdFactory.java
index d494871..98f7b79 100644
--- a/host-controller/src/main/java/org/jboss/as/host/controller/ManagedServerBootCmdFactory.java
+++ b/host-controller/src/main/java/org/jboss/as/host/controller/ManagedServerBootCmdFactory.java
@@ -255,7 +255,7 @@
         if (source.hasDefined(SYSTEM_PROPERTY)) {
             for (Property prop : source.get(SYSTEM_PROPERTY).asPropertyList()) {
                 ModelNode propResource = prop.getValue();
-                if (boottimeOnly && !propResource.get(BOOT_TIME).asBoolean()) {
+                if (boottimeOnly && !propResource.get(BOOT_TIME).asBoolean(false)) { //TODO SystemPropertyResourceDefinition.BOOT_TIME.resolveModelAttribute
                     continue;
                 }
                 String val = propResource.hasDefined(VALUE) ? propResource.get(VALUE).asString() : null;
