diff --git a/fab/fab-osgi/src/main/java/org/fusesource/fabric/fab/osgi/internal/FabConnection.java b/fab/fab-osgi/src/main/java/org/fusesource/fabric/fab/osgi/internal/FabConnection.java
index c35ed81..4c1726b 100644
--- a/fab/fab-osgi/src/main/java/org/fusesource/fabric/fab/osgi/internal/FabConnection.java
+++ b/fab/fab-osgi/src/main/java/org/fusesource/fabric/fab/osgi/internal/FabConnection.java
@@ -267,7 +267,7 @@
                     // we may be dependent on the actual service it exposes rather than packages we import...
                     boolean hasNoPendingPackagesOrServices = false;
                     if (missing.isEmpty()) {
-                        String services = dependency.getManfiestEntry("Export-Service");
+                        String services = dependency.getManifestEntry("Export-Service");
 
                         // TODO DIRTY HACK!
                         // we should be comparing the export services statement with the Import-Service
