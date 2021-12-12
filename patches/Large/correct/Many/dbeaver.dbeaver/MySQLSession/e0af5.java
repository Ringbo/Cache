diff --git a/plugins/org.jkiss.dbeaver.ext.mysql/src/org/jkiss/dbeaver/ext/mysql/model/session/MySQLSession.java b/plugins/org.jkiss.dbeaver.ext.mysql/src/org/jkiss/dbeaver/ext/mysql/model/session/MySQLSession.java
index 9b71afb..33dc0a7 100644
--- a/plugins/org.jkiss.dbeaver.ext.mysql/src/org/jkiss/dbeaver/ext/mysql/model/session/MySQLSession.java
+++ b/plugins/org.jkiss.dbeaver.ext.mysql/src/org/jkiss/dbeaver/ext/mysql/model/session/MySQLSession.java
@@ -27,28 +27,28 @@
  * MySQL session
  */
 public class MySQLSession implements DBAServerSession {
-    private String pid;
+    private long pid;
     private String user;
     private String host;
     private String db;
     private String command;
-    private String time;
+    private long time;
     private String state;
     private String info;
 
     public MySQLSession(ResultSet dbResult) {
-        this.pid = JDBCUtils.safeGetString(dbResult, "id");
+        this.pid = JDBCUtils.safeGetLong(dbResult, "id");
         this.user = JDBCUtils.safeGetString(dbResult, "user");
         this.host = JDBCUtils.safeGetString(dbResult, "host");
         this.db = JDBCUtils.safeGetString(dbResult, "db");
         this.command = JDBCUtils.safeGetString(dbResult, "command");
-        this.time = JDBCUtils.safeGetString(dbResult, "time");
+        this.time = JDBCUtils.safeGetLong(dbResult, "time");
         this.state = JDBCUtils.safeGetString(dbResult, "state");
         this.info = JDBCUtils.safeGetString(dbResult, "info");
     }
 
     @Property(viewable = true, order = 1)
-    public String getPid()
+    public long getPid()
     {
         return pid;
     }
@@ -78,7 +78,7 @@
     }
 
     @Property(viewable = true, order = 6)
-    public String getTime()
+    public long getTime()
     {
         return time;
     }
