diff --git a/python/ipnb/src/org/jetbrains/plugins/ipnb/editor/panels/IpnbFilePanel.java b/python/ipnb/src/org/jetbrains/plugins/ipnb/editor/panels/IpnbFilePanel.java
index d4653a5..4c3f569 100644
--- a/python/ipnb/src/org/jetbrains/plugins/ipnb/editor/panels/IpnbFilePanel.java
+++ b/python/ipnb/src/org/jetbrains/plugins/ipnb/editor/panels/IpnbFilePanel.java
@@ -261,7 +261,7 @@
     if (currentCellPanel == null) return;
 
     if (below) {
-      selectNext(currentCellPanel);
+      selectNext(currentCellPanel, false);
     }
     else {
       selectPrev(currentCellPanel);
@@ -279,7 +279,7 @@
 
     currentCellPanel.repaint();
     deleteCell(currentCellPanel);
-    saveToFile();
+    saveToFile(false);
   }
 
   private static ArrayList<String> mergeCellsSource(@NotNull List<String> currentCellSource,
@@ -333,7 +333,7 @@
     panel = createPanel(cell, newCellSource);
     addCell(panel, true);
 
-    saveToFile();
+    saveToFile(false);
   }
 
   @NotNull
@@ -382,7 +382,7 @@
 
     int indexToSelect = index < myIpnbPanels.size() ? index : index-1;
     final IpnbEditablePanel panel = myIpnbPanels.get(indexToSelect);
-    setSelectedCell(panel);
+    setSelectedCell(panel, false);
   }
 
   public void saveToFile(boolean synchronize) {
