diff --git a/plugins/org.jkiss.dbeaver.ext.generic/src/org/jkiss/dbeaver/ext/generic/edit/GenericProcedureManager.java b/plugins/org.jkiss.dbeaver.ext.generic/src/org/jkiss/dbeaver/ext/generic/edit/GenericProcedureManager.java
index 55b86e3..b79351f 100644
--- a/plugins/org.jkiss.dbeaver.ext.generic/src/org/jkiss/dbeaver/ext/generic/edit/GenericProcedureManager.java
+++ b/plugins/org.jkiss.dbeaver.ext.generic/src/org/jkiss/dbeaver/ext/generic/edit/GenericProcedureManager.java
@@ -38,7 +38,7 @@
 /**
  * Generic procedure manager
  */
-public class GenericProcedureManager extends SQLObjectEditor<GenericProcedure, GenericObjectContainer> {
+public class GenericProcedureManager extends SQLObjectEditor<GenericProcedure, GenericStructContainer> {
 
     @Override
     public long getMakerOptions(DBPDataSource dataSource) {
@@ -55,7 +55,7 @@
 
     @Override
     protected GenericProcedure createDatabaseObject(
-        DBRProgressMonitor monitor, DBECommandContext context, final GenericObjectContainer parent,
+        DBRProgressMonitor monitor, DBECommandContext context, final GenericStructContainer parent,
         Object from)
     {
         throw new IllegalStateException("Not implemented");
@@ -79,7 +79,7 @@
     }
 
     @Override
-    public boolean canCreateObject(GenericObjectContainer parent) {
+    public boolean canCreateObject(GenericStructContainer parent) {
         return false;
     }
 
