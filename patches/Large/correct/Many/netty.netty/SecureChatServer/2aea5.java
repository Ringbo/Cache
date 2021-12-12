diff --git a/example/src/main/java/io/netty/example/securechat/SecureChatServer.java b/example/src/main/java/io/netty/example/securechat/SecureChatServer.java
index 6dad108..19a9dac 100644
--- a/example/src/main/java/io/netty/example/securechat/SecureChatServer.java
+++ b/example/src/main/java/io/netty/example/securechat/SecureChatServer.java
@@ -31,7 +31,7 @@
         this.port = port;
     }
 
-    public void run() {
+    public void run() throws InterruptedException {
         ServerBootstrap b = new ServerBootstrap();
         try {
             b.eventLoop(new NioEventLoop(), new NioEventLoop())
