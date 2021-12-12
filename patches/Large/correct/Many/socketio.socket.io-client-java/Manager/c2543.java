diff --git a/src/main/java/com/github/nkzawa/socketio/client/Manager.java b/src/main/java/com/github/nkzawa/socketio/client/Manager.java
index dd57a36..63f2c1d 100644
--- a/src/main/java/com/github/nkzawa/socketio/client/Manager.java
+++ b/src/main/java/com/github/nkzawa/socketio/client/Manager.java
@@ -248,7 +248,7 @@
             @Override
             public void run() {
                 logger.fine(String.format("readyState %s", Manager.this.readyState));
-                if (Manager.this.readyState == ReadyState.OPEN) return;
+                if (Manager.this.readyState == ReadyState.OPEN || Manager.this.readyState == ReadyState.OPENING) return;
 
                 logger.fine(String.format("opening %s", Manager.this.uri));
                 Manager.this.engine = new Engine(Manager.this.uri, Manager.this.opts);
