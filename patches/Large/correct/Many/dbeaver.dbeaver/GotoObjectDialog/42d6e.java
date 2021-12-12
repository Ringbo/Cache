diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/dialogs/GotoObjectDialog.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/dialogs/GotoObjectDialog.java
index 08b42ab..9500e31 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/dialogs/GotoObjectDialog.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/dialogs/GotoObjectDialog.java
@@ -129,7 +129,7 @@
             }
 
             ObjectFinder objectFinder = new ObjectFinder(structureAssistant, monitor, typesToSearch, nameMask);
-            DBUtils.tryExecuteRecover(monitor, container.getDataSource(), objectFinder);
+            DBUtils.tryExecuteRecover(monitor, context.getDataSource(), objectFinder);
 
             DBPDataSourceContainer dsContainer = context.getDataSource().getContainer();
             for (DBSObjectReference ref : objectFinder.getResult()) {
