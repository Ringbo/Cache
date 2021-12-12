diff --git a/plugins/org.jkiss.dbeaver.ext.oracle/src/org/jkiss/dbeaver/ext/oracle/edit/OracleTableManager.java b/plugins/org.jkiss.dbeaver.ext.oracle/src/org/jkiss/dbeaver/ext/oracle/edit/OracleTableManager.java
index cc163d9..632323c 100644
--- a/plugins/org.jkiss.dbeaver.ext.oracle/src/org/jkiss/dbeaver/ext/oracle/edit/OracleTableManager.java
+++ b/plugins/org.jkiss.dbeaver.ext.oracle/src/org/jkiss/dbeaver/ext/oracle/edit/OracleTableManager.java
@@ -112,7 +112,7 @@
         actions.add(
             new SQLDatabasePersistAction(
                 "Rename table",
-                "ALTER TABLE " + DBUtils.getQuotedIdentifier(command.getObject().getSchema()) + "." + DBUtils.getQuotedIdentifier(command.getObject().getDataSource(), command.getNewName()) + //$NON-NLS-1$
+                "ALTER TABLE " + DBUtils.getQuotedIdentifier(command.getObject().getSchema()) + "." + DBUtils.getQuotedIdentifier(command.getObject().getDataSource(), command.getOldName()) + //$NON-NLS-1$
                     " RENAME TO " + DBUtils.getQuotedIdentifier(command.getObject().getDataSource(), command.getNewName())) //$NON-NLS-1$
         );
     }
