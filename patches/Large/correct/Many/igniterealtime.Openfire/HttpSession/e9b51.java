diff --git a/src/java/org/jivesoftware/openfire/http/HttpSession.java b/src/java/org/jivesoftware/openfire/http/HttpSession.java
index 2c74f72..3828891 100644
--- a/src/java/org/jivesoftware/openfire/http/HttpSession.java
+++ b/src/java/org/jivesoftware/openfire/http/HttpSession.java
@@ -51,7 +51,7 @@
     private int maxPollingInterval;
     private long lastPoll = -1;
     private Set<SessionListener> listeners = new CopyOnWriteArraySet<SessionListener>();
-    private boolean isClosed;
+    private volatile boolean isClosed;
     private int inactivityTimeout;
     private long lastActivity;
     private long lastRequestID;
@@ -124,7 +124,7 @@
      * Closes the session. After a session has been closed it will no longer accept new connections
      * on the session ID.
      */
-    public synchronized void close() {
+    public void close() {
         if (isClosed) {
             return;
         }
