diff --git a/dubbo-remoting/dubbo-remoting-mina/src/main/java/org/apache/dubbo/remoting/transport/mina/MinaClient.java b/dubbo-remoting/dubbo-remoting-mina/src/main/java/org/apache/dubbo/remoting/transport/mina/MinaClient.java
index 552becd..23296f7 100644
--- a/dubbo-remoting/dubbo-remoting-mina/src/main/java/org/apache/dubbo/remoting/transport/mina/MinaClient.java
+++ b/dubbo-remoting/dubbo-remoting-mina/src/main/java/org/apache/dubbo/remoting/transport/mina/MinaClient.java
@@ -78,7 +78,7 @@
             cfg.setThreadModel(ThreadModel.MANUAL);
             cfg.getSessionConfig().setTcpNoDelay(true);
             cfg.getSessionConfig().setKeepAlive(true);
-            int timeout = getTimeout();
+            int timeout = getConnectTimeout();
             cfg.setConnectTimeout(timeout < 1000 ? 1 : timeout / 1000);
             // set codec.
             connector.getFilterChain().addLast("codec", new ProtocolCodecFilter(new MinaCodecAdapter(getCodec(), getUrl(), this)));
@@ -135,10 +135,10 @@
             }
         });
         try {
-            finish.await(getTimeout(), TimeUnit.MILLISECONDS);
+            finish.await(getConnectTimeout(), TimeUnit.MILLISECONDS);
         } catch (InterruptedException e) {
             throw new RemotingException(this, "client(url: " + getUrl() + ") failed to connect to server " + getRemoteAddress() + " client-side timeout "
-                    + getTimeout() + "ms (elapsed: " + (System.currentTimeMillis() - start)
+                    + getConnectTimeout() + "ms (elapsed: " + (System.currentTimeMillis() - start)
                     + "ms) from netty client " + NetUtils.getLocalHost() + " using dubbo version "
                     + Version.getVersion() + ", cause: " + e.getMessage(), e);
         }
