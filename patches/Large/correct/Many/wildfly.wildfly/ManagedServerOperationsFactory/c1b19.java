diff --git a/host-controller/src/main/java/org/jboss/as/host/controller/ManagedServerOperationsFactory.java b/host-controller/src/main/java/org/jboss/as/host/controller/ManagedServerOperationsFactory.java
index 53d4699..462b542 100644
--- a/host-controller/src/main/java/org/jboss/as/host/controller/ManagedServerOperationsFactory.java
+++ b/host-controller/src/main/java/org/jboss/as/host/controller/ManagedServerOperationsFactory.java
@@ -285,7 +285,7 @@
         if (source.hasDefined(SYSTEM_PROPERTY)) {
             for (Property prop : source.get(SYSTEM_PROPERTY).asPropertyList()) {
                 ModelNode propResource = prop.getValue();
-                if (boottimeOnly && !propResource.get(BOOT_TIME).asBoolean()) {
+                if (boottimeOnly && !propResource.get(BOOT_TIME).asBoolean(false)) {
                     continue;
                 }
                 String val = propResource.hasDefined(VALUE) ? propResource.get(VALUE).asString() : null;
