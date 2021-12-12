diff --git a/src/java/net/sf/jabref/gui/MainTable.java b/src/java/net/sf/jabref/gui/MainTable.java
index 9fcf54d..638c274 100644
--- a/src/java/net/sf/jabref/gui/MainTable.java
+++ b/src/java/net/sf/jabref/gui/MainTable.java
@@ -68,7 +68,7 @@
         setModel(tableModel);
 
         tableColorCodes = Globals.prefs.getBoolean("tableColorCodesOn");
-        selectionModel = new EventSelectionModel(list);
+        selectionModel = new EventSelectionModel(sortedForGrouping);
         setSelectionModel(selectionModel);
         pane = new JScrollPane(this);
         pane.getViewport().setBackground(Globals.prefs.getColor("tableBackground"));
