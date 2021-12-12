diff --git a/plugins/org.jkiss.dbeaver.net.ssh/src/org/jkiss/dbeaver/model/net/ssh/SSHImplementationAbstract.java b/plugins/org.jkiss.dbeaver.net.ssh/src/org/jkiss/dbeaver/model/net/ssh/SSHImplementationAbstract.java
index bca2ea5..9169776 100644
--- a/plugins/org.jkiss.dbeaver.net.ssh/src/org/jkiss/dbeaver/model/net/ssh/SSHImplementationAbstract.java
+++ b/plugins/org.jkiss.dbeaver.net.ssh/src/org/jkiss/dbeaver/model/net/ssh/SSHImplementationAbstract.java
@@ -36,7 +36,7 @@
     private static final Log log = Log.getLog(SSHImplementationAbstract.class);
 
     // Saved config - used for tunnel invalidate
-    private transient int savedLocalPort;
+    private transient int savedLocalPort = 0;
     protected transient DBWHandlerConfiguration savedConfiguration;
     protected transient DBPConnectionConfiguration savedConnectionInfo;
 
@@ -108,7 +108,7 @@
             throw new DBException("Bad database port number: " + dbPortString);
         }
         int localPort = savedLocalPort;
-        if (platform != null) {
+        if (localPort == 0 && platform != null) {
             localPort = SSHUtils.findFreePort(platform);
         }
         if (!CommonUtils.isEmpty(sshLocalPort)) {
