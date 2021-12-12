diff --git a/src/main/java/net/sf/jabref/gui/JabRefFrame.java b/src/main/java/net/sf/jabref/gui/JabRefFrame.java
index 36b8dd0..ddfde1c 100644
--- a/src/main/java/net/sf/jabref/gui/JabRefFrame.java
+++ b/src/main/java/net/sf/jabref/gui/JabRefFrame.java
@@ -1932,7 +1932,7 @@
 
         @Override
         public void actionPerformed(ActionEvent e) {
-            JDialog dl = new EntryCustomizationDialog2(JabRefFrame.this);
+            JDialog dl = new EntryCustomizationDialog(JabRefFrame.this);
             PositionWindow.placeDialog(dl, JabRefFrame.this);
             dl.setVisible(true);
         }
