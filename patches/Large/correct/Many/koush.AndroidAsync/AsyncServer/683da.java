diff --git a/AndroidAsync/src/com/koushikdutta/async/AsyncServer.java b/AndroidAsync/src/com/koushikdutta/async/AsyncServer.java
index 1b8ab50..7245d79 100644
--- a/AndroidAsync/src/com/koushikdutta/async/AsyncServer.java
+++ b/AndroidAsync/src/com/koushikdutta/async/AsyncServer.java
@@ -361,11 +361,11 @@
                     ckey.attach(cancel);
                     socket.connect(address);
                 }
-                catch (IOException e) {
+                catch (Throwable e) {
                     if (ckey != null)
                         ckey.cancel();
                     StreamUtility.closeQuietly(socket);
-                    cancel.setComplete(e);
+                    cancel.setComplete(new RuntimeException(e));
                 }
             }
         });
