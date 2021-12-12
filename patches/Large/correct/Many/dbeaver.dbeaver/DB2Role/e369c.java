diff --git a/plugins/org.jkiss.dbeaver.db2/src/org/jkiss/dbeaver/ext/db2/model/security/DB2Role.java b/plugins/org.jkiss.dbeaver.db2/src/org/jkiss/dbeaver/ext/db2/model/security/DB2Role.java
index 0a7d29a..3201e2c 100644
--- a/plugins/org.jkiss.dbeaver.db2/src/org/jkiss/dbeaver/ext/db2/model/security/DB2Role.java
+++ b/plugins/org.jkiss.dbeaver.db2/src/org/jkiss/dbeaver/ext/db2/model/security/DB2Role.java
@@ -62,7 +62,7 @@
     {
         super(VoidProgressMonitor.INSTANCE, dataSource, resultSet);
 
-        this.name = JDBCUtils.safeGetString(resultSet, "ROLENAME");
+        this.name = JDBCUtils.safeGetStringTrimmed(resultSet, "ROLENAME");
         this.id = JDBCUtils.safeGetInteger(resultSet, "ROLEID");
         this.createTime = JDBCUtils.safeGetTimestamp(resultSet, "CREATE_TIME");
         // DB2 v10 this.auditPolicyId = JDBCUtils.safeGetInteger(resultSet, "AUDITPOLICYID");
