diff --git a/fabric/fabric-rest/src/main/java/io/fabric8/rest/VersionResource.java b/fabric/fabric-rest/src/main/java/io/fabric8/rest/VersionResource.java
index 2b61355..366345b 100644
--- a/fabric/fabric-rest/src/main/java/io/fabric8/rest/VersionResource.java
+++ b/fabric/fabric-rest/src/main/java/io/fabric8/rest/VersionResource.java
@@ -44,7 +44,7 @@
     private final Version version;
 
     public VersionResource(FabricResource fabricResource, Version version) {
-        super(fabricResource, "/version/" + version.toString() + "/");
+        super(fabricResource, "/version/" + version.getId() + "/");
         this.fabricResource = fabricResource;
         this.version = version;
     }
