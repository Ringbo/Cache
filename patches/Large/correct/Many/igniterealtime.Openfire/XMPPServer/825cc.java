diff --git a/xmppserver/src/main/java/org/jivesoftware/openfire/XMPPServer.java b/xmppserver/src/main/java/org/jivesoftware/openfire/XMPPServer.java
index 02953ce..2e7f94a 100644
--- a/xmppserver/src/main/java/org/jivesoftware/openfire/XMPPServer.java
+++ b/xmppserver/src/main/java/org/jivesoftware/openfire/XMPPServer.java
@@ -401,7 +401,7 @@
 
         JiveGlobals.migrateProperty(Log.LOG_DEBUG_ENABLED);
         Log.setDebugEnabled(JiveGlobals.getBooleanProperty(Log.LOG_DEBUG_ENABLED, false));
-        Log.setDebugEnabled(JiveGlobals.getBooleanProperty(Log.LOG_TRACE_ENABLED, false));
+        Log.setTraceEnabled(JiveGlobals.getBooleanProperty(Log.LOG_TRACE_ENABLED, false));
 
         // Update server info
         xmppServerInfo = new XMPPServerInfoImpl(new Date());
