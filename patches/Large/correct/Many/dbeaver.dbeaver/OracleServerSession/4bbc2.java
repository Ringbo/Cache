diff --git a/plugins/org.jkiss.dbeaver.ext.oracle/src/org/jkiss/dbeaver/ext/oracle/model/session/OracleServerSession.java b/plugins/org.jkiss.dbeaver.ext.oracle/src/org/jkiss/dbeaver/ext/oracle/model/session/OracleServerSession.java
index f398619..4c3b4c7 100644
--- a/plugins/org.jkiss.dbeaver.ext.oracle/src/org/jkiss/dbeaver/ext/oracle/model/session/OracleServerSession.java
+++ b/plugins/org.jkiss.dbeaver.ext.oracle/src/org/jkiss/dbeaver/ext/oracle/model/session/OracleServerSession.java
@@ -56,7 +56,7 @@
     private String module;
     private final String action;
     private final String clientInfo;
-    private final long process;
+    private final String process;
 
     private final long blockGets;
     private final long consistentGets;
@@ -88,7 +88,7 @@
         this.module = JDBCUtils.safeGetString(dbResult, "MODULE");
         this.action = JDBCUtils.safeGetString(dbResult, "ACTION");
         this.clientInfo = JDBCUtils.safeGetString(dbResult, "CLIENT_INFO");
-        this.process = JDBCUtils.safeGetLong(dbResult, "PROCESS");
+        this.process = JDBCUtils.safeGetString(dbResult, "PROCESS");
 
         this.blockGets = JDBCUtils.safeGetLong(dbResult, "BLOCK_GETS");
         this.consistentGets = JDBCUtils.safeGetLong(dbResult, "CONSISTENT_GETS");
@@ -201,7 +201,7 @@
         return clientInfo;
     }
     @Property(category = CAT_PROCESS, viewable = false, order = 32)
-    public long getProcess() {
+    public String getProcess() {
         return process;
     }
 
