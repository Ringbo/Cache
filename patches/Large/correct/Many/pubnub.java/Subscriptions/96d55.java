diff --git a/java/srcPubnubApi/srcCore/com/pubnub/api/Subscriptions.java b/java/srcPubnubApi/srcCore/com/pubnub/api/Subscriptions.java
index a7a3b17..33cda35 100644
--- a/java/srcPubnubApi/srcCore/com/pubnub/api/Subscriptions.java
+++ b/java/srcPubnubApi/srcCore/com/pubnub/api/Subscriptions.java
@@ -29,7 +29,7 @@
     void runReconnectOnNewThread(final Callback callback, final String name, final JSONArray jsa) {
         Runnable r = new Runnable() {
             public void run() {
-                callback.disconnectCallback(name, jsa);
+                callback.reconnectCallback(name, jsa);
             }
         };
         PnThread thread = new PnThread(r);
@@ -40,7 +40,7 @@
     void runDisconnectOnNewThread(final Callback callback, final String name, final JSONArray jsa) {
         Runnable r = new Runnable() {
             public void run() {
-                callback.reconnectCallback(name, jsa);
+                callback.disconnectCallback(name, jsa);
             }
         };
         PnThread thread = new PnThread(r);
