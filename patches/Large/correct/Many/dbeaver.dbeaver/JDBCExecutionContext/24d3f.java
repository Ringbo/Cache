diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/JDBCExecutionContext.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/JDBCExecutionContext.java
index f494af7..1ce6dfe 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/JDBCExecutionContext.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/JDBCExecutionContext.java
@@ -87,14 +87,14 @@
                 connection.setAutoCommit(autoCommit);
                 this.autoCommit = autoCommit;
             } catch (Throwable e) {
-                log.warn("Can't set auto-commit state: " + e.getMessage()); //$NON-NLS-1$
+                log.debug("Can't set auto-commit state: " + e.getMessage()); //$NON-NLS-1$
             }
             {
                 // Cache auto-commit
                 try {
                     this.autoCommit = connection.getAutoCommit();
                 } catch (Throwable e) {
-                    log.warn("Can't check auto-commit state", e); //$NON-NLS-1$
+                    log.debug("Can't check auto-commit state", e); //$NON-NLS-1$
                     this.autoCommit = false;
                 }
             }
@@ -104,7 +104,7 @@
                     connection.setTransactionIsolation(txnLevel);
                     this.transactionIsolationLevel = txnLevel;
                 } catch (Throwable e) {
-                    log.warn("Can't set transaction isolation level", e); //$NON-NLS-1$
+                    log.debug("Can't set transaction isolation level", e); //$NON-NLS-1$
                 }
             }
 
