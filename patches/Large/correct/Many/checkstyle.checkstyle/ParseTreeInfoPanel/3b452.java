diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/gui/ParseTreeInfoPanel.java b/src/main/java/com/puppycrawl/tools/checkstyle/gui/ParseTreeInfoPanel.java
index cdd3f1f..8cc2ab4 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/gui/ParseTreeInfoPanel.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/gui/ParseTreeInfoPanel.java
@@ -223,7 +223,7 @@
         /**
          * Contstructor
          */
-        public FrameShower(Component parent, final String msg) {
+        FrameShower(Component parent, final String msg) {
             this.parent = parent;
             this.msg = msg;
         }
@@ -258,7 +258,7 @@
          */
         private static final long serialVersionUID = -1926935338069418119L;
 
-        public FileSelectionAction() {
+        FileSelectionAction() {
             super("Select Java File");
             putValue(Action.MNEMONIC_KEY, KeyEvent.VK_S);
         }
@@ -283,7 +283,7 @@
          */
         private static final long serialVersionUID = -1021880396046355863L;
 
-        public ReloadAction() {
+        ReloadAction() {
             super("Reload Java File");
             putValue(Action.MNEMONIC_KEY, KeyEvent.VK_R);
         }
@@ -299,7 +299,7 @@
     private class FileDropListener implements FileDrop.Listener {
         private final JScrollPane scrollPane;
 
-        public FileDropListener(JScrollPane scrollPane) {
+        FileDropListener(JScrollPane scrollPane) {
             this.scrollPane = scrollPane;
         }
 
