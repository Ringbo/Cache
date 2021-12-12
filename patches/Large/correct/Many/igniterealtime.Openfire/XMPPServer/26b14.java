diff --git a/src/java/org/jivesoftware/openfire/XMPPServer.java b/src/java/org/jivesoftware/openfire/XMPPServer.java
index 41fb74b..a8625f9 100644
--- a/src/java/org/jivesoftware/openfire/XMPPServer.java
+++ b/src/java/org/jivesoftware/openfire/XMPPServer.java
@@ -1216,7 +1216,7 @@
      * @return the <code>AuditManager</code> registered with this server.
      */
     public AuditManager getAuditManager() {
-        return (AuditManager) modules.get(AuditManagerImpl.class.getName());
+        return (AuditManager) modules.get(AuditManager.class.getName());
     }
 
     /**
