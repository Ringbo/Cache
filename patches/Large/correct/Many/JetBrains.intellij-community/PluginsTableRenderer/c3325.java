diff --git a/platform/platform-impl/src/com/intellij/ide/plugins/PluginsTableRenderer.java b/platform/platform-impl/src/com/intellij/ide/plugins/PluginsTableRenderer.java
index 04daa90..174ca5a 100644
--- a/platform/platform-impl/src/com/intellij/ide/plugins/PluginsTableRenderer.java
+++ b/platform/platform-impl/src/com/intellij/ide/plugins/PluginsTableRenderer.java
@@ -131,7 +131,7 @@
           if (!isSelected) {
             myName.setForeground(JBColor.RED);
           }
-          myName.setIcon(AllIcons.Nodes.Pluginobsolete);
+          myStatus.setIcon(AllIcons.Nodes.Pluginobsolete);
         }
         //todo[kb] set proper icon
         //myStatus.setText("v." + pluginNode.getInstalledVersion() + (hasNewerVersion ? (" -> " + pluginNode.getVersion()) : ""));
