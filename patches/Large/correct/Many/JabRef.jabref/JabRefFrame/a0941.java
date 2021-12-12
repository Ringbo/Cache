diff --git a/src/java/net/sf/jabref/JabRefFrame.java b/src/java/net/sf/jabref/JabRefFrame.java
index 2ca1e6d..f10a041 100644
--- a/src/java/net/sf/jabref/JabRefFrame.java
+++ b/src/java/net/sf/jabref/JabRefFrame.java
@@ -1854,7 +1854,7 @@
      */
   public void addBibEntries(ArrayList bibentries, String filename,
                              boolean intoNew) {
-    if (bibentries.size() == 0) {
+  	if (bibentries == null || bibentries.size() == 0) {
       // No entries found. We need a message for this.
       JOptionPane.showMessageDialog(ths, Globals.lang("No entries found. Please make sure you are "
                                                       +"using the correct import filter."), Globals.lang("Import failed"),
