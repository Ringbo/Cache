diff --git a/AndroidAsyncTest/src/com/koushikdutta/async/test/SocketIOTests.java b/AndroidAsyncTest/src/com/koushikdutta/async/test/SocketIOTests.java
index e2ae3ff..4c8ec66 100644
--- a/AndroidAsyncTest/src/com/koushikdutta/async/test/SocketIOTests.java
+++ b/AndroidAsyncTest/src/com/koushikdutta/async/test/SocketIOTests.java
@@ -173,7 +173,7 @@
                             @Override
                             public void run() {
                                 // this will trigger a reconnect
-                                client.getWebSocket().close();
+                                client.getTransport().disconnect();
                             }
                         }, 200);
                     }
