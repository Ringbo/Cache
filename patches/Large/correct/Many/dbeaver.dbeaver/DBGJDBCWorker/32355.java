diff --git a/plugins/org.jkiss.dbeaver.debug.core/src/org/jkiss/dbeaver/debug/jdbc/DBGJDBCWorker.java b/plugins/org.jkiss.dbeaver.debug.core/src/org/jkiss/dbeaver/debug/jdbc/DBGJDBCWorker.java
index 76af28e..bef07c8 100644
--- a/plugins/org.jkiss.dbeaver.debug.core/src/org/jkiss/dbeaver/debug/jdbc/DBGJDBCWorker.java
+++ b/plugins/org.jkiss.dbeaver.debug.core/src/org/jkiss/dbeaver/debug/jdbc/DBGJDBCWorker.java
@@ -53,7 +53,7 @@
             monitor.subTask(sql);
             try (Statement stmt = session.createStatement()) {
                 debugSession.fireEvent(before);
-                stmt.executeQuery(sql);
+                stmt.execute(sql);
                 debugSession.fireEvent(after);
                 return Status.OK_STATUS;
             }
