diff --git a/plugins/org.jkiss.dbeaver.debug.core/src/org/jkiss/dbeaver/debug/jdbc/DBGJDBCSession.java b/plugins/org.jkiss.dbeaver.debug.core/src/org/jkiss/dbeaver/debug/jdbc/DBGJDBCSession.java
index 5965f1d..e419952 100644
--- a/plugins/org.jkiss.dbeaver.debug.core/src/org/jkiss/dbeaver/debug/jdbc/DBGJDBCSession.java
+++ b/plugins/org.jkiss.dbeaver.debug.core/src/org/jkiss/dbeaver/debug/jdbc/DBGJDBCSession.java
@@ -113,7 +113,7 @@
         try (JDBCSession session = getControllerConnection().openSession(monitor, DBCExecutionPurpose.UTIL, "Add breakpoint")) {
             try (Statement stmt = session.createStatement()) {
                 String sqlQuery = composeAddBreakpointCommand(descriptor);
-                stmt.executeQuery(sqlQuery);
+                stmt.execute(sqlQuery);
             } catch (SQLException e) {
                 throw new DBGException("SQL error", e);
             }
@@ -128,7 +128,7 @@
         try (JDBCSession session = getControllerConnection().openSession(monitor, DBCExecutionPurpose.UTIL, "Remove breakpoint")) {
             try (Statement stmt = session.createStatement()) {
                 String sqlCommand = composeRemoveBreakpointCommand(bp);
-                stmt.executeQuery(sqlCommand);
+                stmt.execute(sqlCommand);
             } catch (SQLException e) {
                 throw new DBGException("SQL error", e);
             }
