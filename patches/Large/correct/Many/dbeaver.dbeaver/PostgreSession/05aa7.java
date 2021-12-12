diff --git a/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/session/PostgreSession.java b/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/session/PostgreSession.java
index 9c223b1..45f72ac 100644
--- a/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/session/PostgreSession.java
+++ b/plugins/org.jkiss.dbeaver.ext.postgresql/src/org/jkiss/dbeaver/ext/postgresql/model/session/PostgreSession.java
@@ -32,7 +32,7 @@
     private static final String CAT_CLIENT = "Client";
     private static final String CAT_TIMING = "Timings";
 
-    private long pid;
+    private int pid;
     private String user;
     private String clientHost;
     private String clientPort;
@@ -46,7 +46,7 @@
     private String appName;
 
     public PostgreSession(ResultSet dbResult) {
-        this.pid = JDBCUtils.safeGetLong(dbResult, "pid");
+        this.pid = JDBCUtils.safeGetInt(dbResult, "pid");
         this.user = JDBCUtils.safeGetString(dbResult, "usename");
         this.clientHost = JDBCUtils.safeGetString(dbResult, "client_hostname");
         if (CommonUtils.isEmpty(this.clientHost)) {
@@ -66,7 +66,7 @@
     }
 
     @Property(viewable = true, order = 1)
-    public long getPid()
+    public int getPid()
     {
         return pid;
     }
