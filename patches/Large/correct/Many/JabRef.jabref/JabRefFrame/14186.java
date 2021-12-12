diff --git a/src/main/java/net/sf/jabref/JabRefFrame.java b/src/main/java/net/sf/jabref/JabRefFrame.java
index e189c5e..f4e3be9 100644
--- a/src/main/java/net/sf/jabref/JabRefFrame.java
+++ b/src/main/java/net/sf/jabref/JabRefFrame.java
@@ -1686,7 +1686,7 @@
     protected void initActions() {
         openDatabaseOnlyActions = new LinkedList<Object>();
         openDatabaseOnlyActions.addAll(Arrays.asList(manageSelectors,
-                mergeDatabaseAction, newSubDatabaseAction, close, save, saveAs, saveSelectedAs, undo,
+                mergeDatabaseAction, newSubDatabaseAction, close, save, saveAs, saveSelectedAs, saveSelectedAsPlain, undo,
                 redo, cut, delete, copy, paste, mark, unmark, unmarkAll, editEntry,
                 selectAll, copyKey, copyCiteKey, copyKeyAndTitle, editPreamble, editStrings, toggleGroups, toggleSearch,
                 makeKeyAction, normalSearch,
