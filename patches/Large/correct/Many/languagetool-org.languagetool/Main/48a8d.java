diff --git a/languagetool-standalone/src/main/java/org/languagetool/gui/Main.java b/languagetool-standalone/src/main/java/org/languagetool/gui/Main.java
index 380fe35..6f3ec36 100644
--- a/languagetool-standalone/src/main/java/org/languagetool/gui/Main.java
+++ b/languagetool-standalone/src/main/java/org/languagetool/gui/Main.java
@@ -344,7 +344,7 @@
     autoDetectBox.addItemListener(new ItemListener() {
       @Override
       public void itemStateChanged(ItemEvent e) {
-        boolean selected = (e.getStateChange() == ItemEvent.SELECTED);
+        boolean selected = e.getStateChange() == ItemEvent.SELECTED;
         languageBox.setEnabled(!selected);
         ltSupport.getConfig().setAutoDetect(selected);
         if (selected) {
@@ -843,7 +843,7 @@
     final Main prg = new Main();
     if (args.length == 1 && (args[0].equals("-t") || args[0].equals("--tray"))) {
       // dock to systray on startup
-      javax.swing.SwingUtilities.invokeLater(new Runnable() {
+      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
           try {
@@ -857,7 +857,7 @@
         }
       });
     } else if (args.length == 0 || args.length == 1) {
-      javax.swing.SwingUtilities.invokeLater(new Runnable() {
+      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
           try {
@@ -1010,7 +1010,7 @@
 
   class OpenAction extends AbstractAction {
 
-    public OpenAction() {
+    OpenAction() {
       super(getLabel("guiMenuOpen"));
       putValue(Action.SHORT_DESCRIPTION, messages.getString("guiMenuOpenShortDesc"));
       putValue(Action.LONG_DESCRIPTION, messages.getString("guiMenuOpenLongDesc"));
@@ -1028,7 +1028,7 @@
 
   class SaveAction extends AbstractAction {
 
-    public SaveAction() {
+    SaveAction() {
       super(getLabel("guiMenuSave"));
       putValue(Action.SHORT_DESCRIPTION, messages.getString("guiMenuSaveShortDesc"));
       putValue(Action.LONG_DESCRIPTION, messages.getString("guiMenuSaveLongDesc"));
@@ -1046,7 +1046,7 @@
 
   class SaveAsAction extends AbstractAction {
 
-    public SaveAsAction() {
+    SaveAsAction() {
       super(getLabel("guiMenuSaveAs"));
       putValue(Action.SHORT_DESCRIPTION, messages.getString("guiMenuSaveAsShortDesc"));
       putValue(Action.LONG_DESCRIPTION, messages.getString("guiMenuSaveAsLongDesc"));
@@ -1063,7 +1063,7 @@
 
   class CheckClipboardAction extends AbstractAction {
 
-    public CheckClipboardAction() {
+    CheckClipboardAction() {
       super(getLabel("guiMenuCheckClipboard"));
       putValue(Action.MNEMONIC_KEY, getMnemonic("guiMenuCheckClipboard"));
       putValue(Action.ACCELERATOR_KEY, getMenuKeyStroke(KeyEvent.VK_Y));
@@ -1077,7 +1077,7 @@
 
   class TagTextAction extends AbstractAction {
 
-    public TagTextAction() {
+    TagTextAction() {
       super(getLabel("guiTagText"));
       putValue(Action.MNEMONIC_KEY, getMnemonic("guiTagText"));
       putValue(Action.ACCELERATOR_KEY, getMenuKeyStroke(KeyEvent.VK_T));
@@ -1091,7 +1091,7 @@
 
   class AddRulesAction extends AbstractAction {
 
-    public AddRulesAction() {
+    AddRulesAction() {
       super(getLabel("guiMenuAddRules"));
       putValue(Action.MNEMONIC_KEY, getMnemonic("guiMenuAddRules"));
     }
@@ -1108,7 +1108,7 @@
 
   class OptionsAction extends AbstractAction {
 
-    public OptionsAction() {
+    OptionsAction() {
       super(getLabel("guiMenuOptions"));
       putValue(Action.MNEMONIC_KEY, getMnemonic("guiMenuOptions"));
       putValue(Action.ACCELERATOR_KEY, getMenuKeyStroke(KeyEvent.VK_S));
@@ -1122,7 +1122,7 @@
   
   class SelectFontAction extends AbstractAction {
 
-    public SelectFontAction() {
+    SelectFontAction() {
       super(getLabel("guiSelectFont"));
     }
 
@@ -1136,7 +1136,7 @@
 
     private final UIManager.LookAndFeelInfo lf;
     
-    public SelectLFAction(UIManager.LookAndFeelInfo lf) {
+    SelectLFAction(UIManager.LookAndFeelInfo lf) {
       super(lf.getName());
       this.lf = lf;
     }
@@ -1157,7 +1157,7 @@
 
   class HideAction extends AbstractAction {
 
-    public HideAction() {
+    HideAction() {
       super(getLabel("guiMenuHide"));
       putValue(Action.MNEMONIC_KEY, getMnemonic("guiMenuHide"));
       putValue(Action.ACCELERATOR_KEY, getMenuKeyStroke(KeyEvent.VK_D));
@@ -1171,7 +1171,7 @@
 
   class QuitAction extends AbstractAction {
 
-    public QuitAction() {
+    QuitAction() {
       super(getLabel("guiMenuQuit"));
       putValue(Action.MNEMONIC_KEY, getMnemonic("guiMenuQuit"));
       putValue(Action.ACCELERATOR_KEY, getMenuKeyStroke(KeyEvent.VK_Q));
@@ -1185,7 +1185,7 @@
 
   class AboutAction extends AbstractAction {
 
-    public AboutAction() {
+    AboutAction() {
       super(getLabel("guiMenuAbout"));
       putValue(Action.MNEMONIC_KEY, getMnemonic("guiMenuAbout"));
     }
@@ -1199,7 +1199,7 @@
  
   class CheckAction extends AbstractAction {
 
-    public CheckAction() {
+    CheckAction() {
       super(getLabel("checkText"));
       putValue(Action.SHORT_DESCRIPTION, messages.getString("checkTextShortDesc"));
       putValue(Action.LONG_DESCRIPTION, messages.getString("checkTextLongDesc"));
@@ -1218,7 +1218,7 @@
 
     private boolean enable;
 
-    public AutoCheckAction(boolean initial) {
+    AutoCheckAction(boolean initial) {
       super(getLabel("autoCheckText"));
       putValue(Action.SHORT_DESCRIPTION, messages.getString("autoCheckTextShortDesc"));
       putValue(Action.LONG_DESCRIPTION, messages.getString("autoCheckTextLongDesc"));
@@ -1239,7 +1239,7 @@
 
   class ClearTextAction extends AbstractAction {
 
-    public ClearTextAction() {
+    ClearTextAction() {
       super(getLabel("clearText"));
       putValue(Action.SHORT_DESCRIPTION, messages.getString("clearText"));
       putValue(Action.SMALL_ICON, getImageIcon("sc_closedoc.png"));
