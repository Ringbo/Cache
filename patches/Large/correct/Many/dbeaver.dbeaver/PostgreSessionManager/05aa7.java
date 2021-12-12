diff --git a/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/session/PostgreSessionManager.java b/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/session/PostgreSessionManager.java
index 2cb93b4..07241a5 100644
--- a/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/session/PostgreSessionManager.java
+++ b/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/session/PostgreSessionManager.java
@@ -75,7 +75,7 @@
     {
         try {
             try (JDBCPreparedStatement dbStat = ((JDBCSession) session).prepareStatement("SELECT pg_catalog.pg_terminate_backend(?)")) {
-                dbStat.setLong(1, sessionType.getPid());
+                dbStat.setInt(1, sessionType.getPid());
                 dbStat.execute();
             }
         }
