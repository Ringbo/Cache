diff --git a/src/org/jetbrains/plugins/ipnb/editor/panels/IpnbFilePanel.java b/src/org/jetbrains/plugins/ipnb/editor/panels/IpnbFilePanel.java
index c47444d..0523a8e 100644
--- a/src/org/jetbrains/plugins/ipnb/editor/panels/IpnbFilePanel.java
+++ b/src/org/jetbrains/plugins/ipnb/editor/panels/IpnbFilePanel.java
@@ -101,7 +101,7 @@
       c.gridy = addCellToPanel(cell, c);
     }
 
-    if (myIpnbPanels.size() > myInitialSelection) {
+    if (myInitialSelection >= 0 && myIpnbPanels.size() > myInitialSelection) {
       final IpnbEditablePanel toSelect = myIpnbPanels.get(myInitialSelection);
       setSelectedCell(toSelect);
       myParent.getScrollPane().getViewport().setViewPosition(new Point(0, myInitialPosition));
