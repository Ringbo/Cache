diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/shelf/ShelfManagerConfigurationMerger.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/shelf/ShelfManagerConfigurationMerger.java
index 82355dc..7597e69 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/shelf/ShelfManagerConfigurationMerger.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/shelf/ShelfManagerConfigurationMerger.java
@@ -29,16 +29,16 @@
 
 public class ShelfManagerConfigurationMerger implements XmlConfigurationMerger {
   private final String myConfigPath;
-  private final CompoundShelfFileProcesor myFileProcessor;
+  private final CompoundShelfFileProcessor myFileProcessor;
 
   public ShelfManagerConfigurationMerger() {
     myConfigPath = PathManager.getConfigPath()+ "/shelf";
-    myFileProcessor = new CompoundShelfFileProcesor("shelf");
+    myFileProcessor = new CompoundShelfFileProcessor("shelf");
   }
 
   public ShelfManagerConfigurationMerger(final String configPath, final StreamProvider[] streamProviders) {
     myConfigPath = configPath;
-    myFileProcessor = new CompoundShelfFileProcesor(streamProviders, configPath);
+    myFileProcessor = new CompoundShelfFileProcessor(streamProviders, configPath);
   }
 
   public Element merge(final Element serverElement, final Element localElement) {
