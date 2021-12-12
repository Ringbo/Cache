diff --git a/plugins/org.jkiss.dbeaver.db2/src/org/jkiss/dbeaver/ext/db2/model/DB2DataType.java b/plugins/org.jkiss.dbeaver.db2/src/org/jkiss/dbeaver/ext/db2/model/DB2DataType.java
index 2bdb0de..de8df4d 100644
--- a/plugins/org.jkiss.dbeaver.db2/src/org/jkiss/dbeaver/ext/db2/model/DB2DataType.java
+++ b/plugins/org.jkiss.dbeaver.db2/src/org/jkiss/dbeaver/ext/db2/model/DB2DataType.java
@@ -91,7 +91,7 @@
       this.owner = JDBCUtils.safeGetString(dbResult, "OWNER");
       this.ownerType = CommonUtils.valueOf(DB2OwnerType.class, JDBCUtils.safeGetString(dbResult, "OWNERTYPE"));
       this.moduleName = JDBCUtils.safeGetString(dbResult, "TYPEMODULENAME");
-      this.sourceSchema = JDBCUtils.safeGetString(dbResult, "SOURCESCHEMA");
+      this.sourceSchema = JDBCUtils.safeGetStringTrimmed(dbResult, "SOURCESCHEMA");
       this.sourceModuleName = JDBCUtils.safeGetStringTrimmed(dbResult, "SOURCEMODULENAME");
       this.sourceName = JDBCUtils.safeGetString(dbResult, "SOURCENAME");
       this.metaType = CommonUtils.valueOf(DB2DataTypeMetaType.class, JDBCUtils.safeGetString(dbResult, "METATYPE"));
