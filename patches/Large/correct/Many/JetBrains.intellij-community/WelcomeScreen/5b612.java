diff --git a/source/com/intellij/openapi/wm/impl/welcomeScreen/WelcomeScreen.java b/source/com/intellij/openapi/wm/impl/welcomeScreen/WelcomeScreen.java
index cd5e9ba..d939512 100644
--- a/source/com/intellij/openapi/wm/impl/welcomeScreen/WelcomeScreen.java
+++ b/source/com/intellij/openapi/wm/impl/welcomeScreen/WelcomeScreen.java
@@ -205,7 +205,7 @@
     JPanel topPanel = createCaptionPane();
 
     // Create Main Panel for Quick Start and Documentation
-    myMainPanel = new PluginsPanel(new GridBagLayout());
+    myMainPanel = new WelcomeScrollablePanel(new GridBagLayout());
     myMainPanel.setBackground(MAIN_PANEL_COLOR);
     // Create QuickStarts group of actions
     ActionGroupDescriptor quickStarts = new ActionGroupDescriptor("Quick Start", 0);
@@ -380,14 +380,14 @@
   }
 
   private JScrollPane createPluginsPanel() {
-    myPluginsPanel = new PluginsPanel(new GridBagLayout());
+    myPluginsPanel = new WelcomeScrollablePanel(new GridBagLayout());
     myPluginsPanel.setBackground(PLUGINS_PANEL_COLOR);
 
     JLabel pluginsCaption = new JLabel("Plugins");
     pluginsCaption.setFont(GROUP_CAPTION_FONT);
     pluginsCaption.setForeground(CAPTION_COLOR);
 
-    JLabel installedPluginsCaption = new JLabel("User-Installed Plugins:");
+    JLabel installedPluginsCaption = new JLabel("My Plugins:");
     installedPluginsCaption.setFont(LINK_FONT);
     installedPluginsCaption.setForeground(CAPTION_COLOR);
 
