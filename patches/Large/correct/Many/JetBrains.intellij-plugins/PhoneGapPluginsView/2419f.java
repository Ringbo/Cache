diff --git a/phoneGap/src/com/github/masahirosuzuka/PhoneGapIntelliJPlugin/settings/ui/plugins/PhoneGapPluginsView.java b/phoneGap/src/com/github/masahirosuzuka/PhoneGapIntelliJPlugin/settings/ui/plugins/PhoneGapPluginsView.java
index 9bbf641..82ba5be 100644
--- a/phoneGap/src/com/github/masahirosuzuka/PhoneGapIntelliJPlugin/settings/ui/plugins/PhoneGapPluginsView.java
+++ b/phoneGap/src/com/github/masahirosuzuka/PhoneGapIntelliJPlugin/settings/ui/plugins/PhoneGapPluginsView.java
@@ -29,7 +29,7 @@
 
   public PhoneGapPluginsView(@NotNull Project project) {
     myProject = project;
-    packagesNotificationPanel = new PackagesNotificationPanel(project);
+    packagesNotificationPanel = new PackagesNotificationPanel();
     myPanel = new PhoneGapInstalledPluginsPanel(project, packagesNotificationPanel);
     myPanel.setPreferredSize(new Dimension(400, 400));
     JPanel wrapper = new JPanel(new BorderLayout());
