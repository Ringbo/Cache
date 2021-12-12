diff --git a/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreDatabase.java b/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreDatabase.java
index 57bb0e3..ad30f04 100644
--- a/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreDatabase.java
+++ b/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/PostgreDatabase.java
@@ -107,7 +107,7 @@
         super(monitor, dataSource, false);
         // We need to set name first
         this.name = databaseName;
-        initializeMainContext(monitor);
+        checkDatabaseConnection(monitor);
 
         try (JDBCSession session = getDefaultContext(true).openSession(monitor, DBCExecutionPurpose.META, "Load database info")) {
             try (JDBCPreparedStatement dbStat = session.prepareStatement("SELECT db.oid,db.*" +
