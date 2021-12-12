diff --git a/fabric/fabric-cxf-registry/src/main/java/io/fabric8/cxf/registry/FabricCxfRegistrationHandler.java b/fabric/fabric-cxf-registry/src/main/java/io/fabric8/cxf/registry/FabricCxfRegistrationHandler.java
index 46766b4..3360364 100644
--- a/fabric/fabric-cxf-registry/src/main/java/io/fabric8/cxf/registry/FabricCxfRegistrationHandler.java
+++ b/fabric/fabric-cxf-registry/src/main/java/io/fabric8/cxf/registry/FabricCxfRegistrationHandler.java
@@ -408,7 +408,7 @@
         if (name.startsWith("\"") && name.endsWith("\"")) {
             name = name.substring(1, name.length() - 1);
         }
-        String version = container.getVersion().toString();
+        String version = container.getVersion().getId();
         String endpointPath = address;
         if (isFullAddress(address)) {
             // lets remove the prefix "http://localhost:8181/cxf/"
