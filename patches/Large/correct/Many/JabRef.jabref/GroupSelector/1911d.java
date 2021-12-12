diff --git a/src/java/net/sf/jabref/groups/GroupSelector.java b/src/java/net/sf/jabref/groups/GroupSelector.java
index 86f7abd..dcc2bd3 100644
--- a/src/java/net/sf/jabref/groups/GroupSelector.java
+++ b/src/java/net/sf/jabref/groups/GroupSelector.java
@@ -1226,10 +1226,10 @@
     
     /**
      * Highlight all groups that contain any/all of the specified entries.
-     * If entries is null, highlight is cleared. 
+     * If entries is null or has zero length, highlight is cleared. 
      */
     public void showMatchingGroups(BibtexEntry[] entries, boolean requireAll) {
-        if (entries == null) { // nothing selected
+        if (entries == null || entries.length == 0) { // nothing selected
             groupsTree.setHighlight3Cells(null);
             groupsTree.revalidate();
             return;
