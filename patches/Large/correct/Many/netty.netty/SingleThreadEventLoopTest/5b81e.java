diff --git a/transport/src/test/java/io/netty/channel/SingleThreadEventLoopTest.java b/transport/src/test/java/io/netty/channel/SingleThreadEventLoopTest.java
index d2f5109..7aa7904 100644
--- a/transport/src/test/java/io/netty/channel/SingleThreadEventLoopTest.java
+++ b/transport/src/test/java/io/netty/channel/SingleThreadEventLoopTest.java
@@ -137,7 +137,7 @@
                 timestamps.add(System.nanoTime());
                 if (empty) {
                     try {
-                        Thread.sleep(400);
+                        Thread.sleep(401);
                     } catch (InterruptedException e) {
                         // Ignore
                     }
@@ -176,7 +176,7 @@
             public void run() {
                 timestamps.add(System.nanoTime());
                 try {
-                    Thread.sleep(50);
+                    Thread.sleep(51);
                 } catch (InterruptedException e) {
                     // Ignore
                 }
