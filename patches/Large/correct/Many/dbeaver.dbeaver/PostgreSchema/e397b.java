diff --git a/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreSchema.java b/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreSchema.java
index e4b6b00..622a33a 100644
--- a/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreSchema.java
+++ b/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreSchema.java
@@ -243,24 +243,24 @@
     }
 
     @Override
-    public Collection<PostgreTableReal> getChildren(@NotNull DBRProgressMonitor monitor)
+    public Collection<PostgreTableBase> getChildren(@NotNull DBRProgressMonitor monitor)
         throws DBException
     {
-        return tableCache.getTypedObjects(monitor, this, PostgreTableReal.class);
+        return tableCache.getAllObjects(monitor, this);
     }
 
     @Override
-    public PostgreTableReal getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName)
+    public PostgreTableBase getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName)
         throws DBException
     {
-        return tableCache.getObject(monitor, this, childName, PostgreTableReal.class);
+        return tableCache.getObject(monitor, this, childName);
     }
 
     @Override
     public Class<? extends DBSEntity> getChildType(@NotNull DBRProgressMonitor monitor)
         throws DBException
     {
-        return PostgreTable.class;
+        return PostgreTableBase.class;
     }
 
     @Override
