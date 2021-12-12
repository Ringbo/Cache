diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/configurable/VcsDirectoryConfigurationPanel.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/configurable/VcsDirectoryConfigurationPanel.java
index 264609f..c8b4d9e 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/configurable/VcsDirectoryConfigurationPanel.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/configurable/VcsDirectoryConfigurationPanel.java
@@ -327,7 +327,7 @@
     GridBag gb = new GridBag()
       .setDefaultInsets(new Insets(0, 0, DEFAULT_VGAP, DEFAULT_HGAP))
       .setDefaultWeightX(1)
-      .setDefaultWeightY(0.1)
+      .setDefaultWeightY(0)
       .setDefaultFill(GridBagConstraints.BOTH);
 
     panel.add(createMappingsTable(), gb.nextLine().next().fillCell().weighty(1));
