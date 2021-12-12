diff --git a/example/src/main/java/io/netty/example/securechat/SecureChatServerHandler.java b/example/src/main/java/io/netty/example/securechat/SecureChatServerHandler.java
index 5421956..0e599fb 100644
--- a/example/src/main/java/io/netty/example/securechat/SecureChatServerHandler.java
+++ b/example/src/main/java/io/netty/example/securechat/SecureChatServerHandler.java
@@ -47,10 +47,10 @@
                 new GenericFutureListener<Future<Channel>>() {
             @Override
             public void operationComplete(Future<Channel> future) throws Exception {
-                ctx.write(
+                ctx.writeAndFlush(
                         "Welcome to " + InetAddress.getLocalHost().getHostName() +
                         " secure chat service!\n");
-                ctx.write(
+                ctx.writeAndFlush(
                         "Your session is protected by " +
                         ctx.pipeline().get(SslHandler.class).engine().getSession().getCipherSuite() +
                         " cipher suite.\n");
@@ -65,10 +65,10 @@
         // Send the received message to all channels but the current one.
         for (Channel c: channels) {
             if (c != ctx.channel()) {
-                c.write("[" + ctx.channel().remoteAddress() + "] " +
+                c.writeAndFlush("[" + ctx.channel().remoteAddress() + "] " +
                         msg + '\n');
             } else {
-                c.write("[you] " + msg + '\n');
+                c.writeAndFlush("[you] " + msg + '\n');
             }
         }
 
