diff --git a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/gui/MainMenuBar.java b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/gui/MainMenuBar.java
index f1a7158..838c1d3 100644
--- a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/gui/MainMenuBar.java
+++ b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/gui/MainMenuBar.java
@@ -36,7 +36,7 @@
   // File:
   private String openText;
   private String checkClipboardText;
-  private String docktoTrayText;
+  private String dockToTrayText;
   private String optionsText;
   private String quitText;
   // Help:
@@ -66,7 +66,7 @@
     checkClipboardItem.addActionListener(this);
     fileMenu.add(checkClipboardItem);
     // "Hide to System Tray":
-    JMenuItem dockToTrayItem = new JMenuItem(docktoTrayText);
+    JMenuItem dockToTrayItem = new JMenuItem(dockToTrayText);
     dockToTrayItem.setMnemonic('d');
     dockToTrayItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, Event.CTRL_MASK));
     dockToTrayItem.addActionListener(this);
@@ -98,7 +98,7 @@
     // File:
     openText = messages.getString("guiMenuOpen");
     checkClipboardText = messages.getString("guiMenuCheckClipboard");
-    docktoTrayText = messages.getString("guiMenuHide");
+    dockToTrayText = messages.getString("guiMenuHide");
     optionsText = messages.getString("guiMenuOptions");
     quitText = messages.getString("guiMenuQuit");
     // Help:
@@ -110,7 +110,7 @@
       prg.loadFile();
     } else if (e.getActionCommand().equals(checkClipboardText)) {
       prg.checkClipboardText();
-    } else if (e.getActionCommand().equals(docktoTrayText)) {
+    } else if (e.getActionCommand().equals(dockToTrayText)) {
       prg.hideToTray();
     } else if (e.getActionCommand().equals(optionsText)) {
       prg.showOptions();
