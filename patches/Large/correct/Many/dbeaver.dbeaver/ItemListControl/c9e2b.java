diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/itemlist/ItemListControl.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/itemlist/ItemListControl.java
index 11c9ca3..76e3831 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/itemlist/ItemListControl.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/itemlist/ItemListControl.java
@@ -105,7 +105,7 @@
 
         // Object operations
 
-        if (rootNode instanceof DBNDatabaseNode) {
+        if (rootNode instanceof DBNDatabaseFolder) {
             contributionManager.add(new Separator());
             contributionManager.add(ActionUtils.makeCommandContribution(
                 workbenchSite,
