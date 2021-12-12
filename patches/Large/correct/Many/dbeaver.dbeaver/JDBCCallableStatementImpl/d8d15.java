diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCCallableStatementImpl.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCCallableStatementImpl.java
index 5dec044..c85e337 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCCallableStatementImpl.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCCallableStatementImpl.java
@@ -59,7 +59,7 @@
         // Find procedure definition
         try {
             procedure = DBUtils.findProcedure(connection, query);
-        } catch (DBException e) {
+        } catch (Throwable e) {
             log.debug(e);
         }
 
@@ -69,14 +69,14 @@
             if (paramsMeta != null) {
                 bindProcedureFromJDBC(paramsMeta);
             }
-        } catch (Exception e) {
+        } catch (Throwable e) {
             log.debug(e.getMessage());
             // Try to bind parameters from procedure meta info
             try {
                 if (procedure != null) {
                     bindProcedureFromMeta();
                 }
-            } catch (Exception e1) {
+            } catch (Throwable e1) {
                 log.debug(e1);
             }
         }
