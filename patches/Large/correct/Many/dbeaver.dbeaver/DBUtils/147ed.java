diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/DBUtils.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/DBUtils.java
index ed816bf..da60d96 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/DBUtils.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/DBUtils.java
@@ -308,7 +308,7 @@
     {
         if (!CommonUtils.isEmpty(catalogName)) {
             Class<? extends DBSObject> childType = rootSC.getChildType(monitor);
-            if (DBSSchema.class.isAssignableFrom(childType)) {
+            if (DBSSchema.class.isAssignableFrom(childType) || DBSEntity.class.isAssignableFrom(childType)) {
                 // Datasource supports only schemas. Do not use catalog
                 catalogName = null;
             }
