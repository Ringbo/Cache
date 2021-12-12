diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCCallableStatementImpl.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCCallableStatementImpl.java
index 384b658..e421d61 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCCallableStatementImpl.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCCallableStatementImpl.java
@@ -109,7 +109,7 @@
                     }
                 }
             } catch (DBException e) {
-                log.warn("Error extracting callable results", e);
+                log.debug("Error extracting callable results", e);
             }
         } else {
             // Try to make columns from parameters meta
@@ -132,7 +132,7 @@
                     }
                 }
             } catch (Throwable e) {
-                log.error("Error extracting parameters meta data", e);
+                log.debug("Error extracting parameters meta data", e);
             }
         }
         procResults.addRow();
@@ -149,7 +149,7 @@
                     divChar = ((SQLDataSource) dataSource).getSQLDialect().getStructSeparator();
                 }
                 if (procName.indexOf(divChar) != -1) {
-                    return findProcedureByNames(session, procName.split("\\" + divChar));
+                    return findProcedureByNames(session, procName.split(String.valueOf(divChar)));
                 } else {
                     return findProcedureByNames(session, procName);
                 }
