diff --git a/src/main/java/org/jabref/gui/importer/ImportInspectionDialog.java b/src/main/java/org/jabref/gui/importer/ImportInspectionDialog.java
index 5906a0a..c668817 100644
--- a/src/main/java/org/jabref/gui/importer/ImportInspectionDialog.java
+++ b/src/main/java/org/jabref/gui/importer/ImportInspectionDialog.java
@@ -236,7 +236,7 @@
 
         popup.add(deleteListener);
         popup.addSeparator();
-        if (!newDatabase && (bibDatabaseContext != null)) {
+        if (!newDatabase && (bibDatabaseContext != null) && bibDatabaseContext.getMetaData().getGroups().isPresent()) {
             GroupTreeNode node = bibDatabaseContext.getMetaData().getGroups().get();
             JMenu groupsAdd = new JMenu(Localization.lang("Add to group"));
             groupsAdd.setEnabled(false); // Will get enabled if there are groups that can be added to.
