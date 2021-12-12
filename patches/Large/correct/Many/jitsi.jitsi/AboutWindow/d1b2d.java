diff --git a/src/net/java/sip/communicator/plugin/branding/AboutWindow.java b/src/net/java/sip/communicator/plugin/branding/AboutWindow.java
index 669d924..281c4da 100644
--- a/src/net/java/sip/communicator/plugin/branding/AboutWindow.java
+++ b/src/net/java/sip/communicator/plugin/branding/AboutWindow.java
@@ -70,13 +70,14 @@
         int logoAreaFontSize
             = resources.getSettingsInt("plugin.branding.ABOUT_LOGO_FONT_SIZE");
 
+        // FIXME: the message exceeds the window length
         JTextArea logoArea =
             new JTextArea(resources.getI18NString("plugin.branding.LOGO_MESSAGE"));
         logoArea.setFont(
             logoArea.getFont().deriveFont(Font.BOLD, logoAreaFontSize));
         logoArea.setForeground(Constants.TITLE_COLOR);
         logoArea.setOpaque(false);
-        logoArea.setLineWrap(true);
+        logoArea.setLineWrap(false);
         logoArea.setWrapStyleWord(true);
         logoArea.setEditable(false);
         logoArea.setPreferredSize(new Dimension(100, 20));
