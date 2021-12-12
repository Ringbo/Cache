diff --git a/fab/fabric-fab-osgi/src/main/java/org/fusesource/fabric/fab/osgi/url/internal/FabClassPathResolver.java b/fab/fabric-fab-osgi/src/main/java/org/fusesource/fabric/fab/osgi/url/internal/FabClassPathResolver.java
index 676035a..b25456e 100644
--- a/fab/fabric-fab-osgi/src/main/java/org/fusesource/fabric/fab/osgi/url/internal/FabClassPathResolver.java
+++ b/fab/fabric-fab-osgi/src/main/java/org/fusesource/fabric/fab/osgi/url/internal/FabClassPathResolver.java
@@ -184,7 +184,7 @@
                 moduleProperties.setProperty(FAB_MODULE_NAME, model.getArtifactId());
             }
             if( !moduleProperties.containsKey(FAB_MODULE_DESCRIPTION) ) {
-                moduleProperties.setProperty(FAB_MODULE_NAME, model.getDescription());
+                moduleProperties.setProperty(FAB_MODULE_DESCRIPTION, model.getDescription());
             }
 
             ModuleDescriptor descriptor = ModuleDescriptor.fromProperties(moduleProperties);
