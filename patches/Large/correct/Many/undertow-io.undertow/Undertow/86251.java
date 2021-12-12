diff --git a/core/src/main/java/io/undertow/Undertow.java b/core/src/main/java/io/undertow/Undertow.java
index 7e64d24..1f8bd22 100644
--- a/core/src/main/java/io/undertow/Undertow.java
+++ b/core/src/main/java/io/undertow/Undertow.java
@@ -169,7 +169,7 @@
                     AcceptingChannel<? extends StreamConnection> server = worker.createStreamConnectionServer(new InetSocketAddress(Inet4Address.getByName(listener.host), listener.port), acceptListener, socketOptionsWithOverrides);
                     server.resumeAccepts();
                     channels.add(server);
-                    listenerInfo.add(new ListenerInfo("ajp", server.getLocalAddress(), openListener, null, channel));
+                    listenerInfo.add(new ListenerInfo("ajp", server.getLocalAddress(), openListener, null, server));
                 } else {
                     OptionMap undertowOptions = OptionMap.builder().set(UndertowOptions.BUFFER_PIPELINED_DATA, true).addAll(serverOptions).getMap();
                     boolean http2 = serverOptions.get(UndertowOptions.ENABLE_HTTP2, false);
@@ -192,7 +192,7 @@
                         AcceptingChannel<? extends StreamConnection> server = worker.createStreamConnectionServer(new InetSocketAddress(Inet4Address.getByName(listener.host), listener.port), acceptListener, socketOptionsWithOverrides);
                         server.resumeAccepts();
                         channels.add(server);
-                        listenerInfo.add(new ListenerInfo("http", server.getLocalAddress(), openListener, null, channel));
+                        listenerInfo.add(new ListenerInfo("http", server.getLocalAddress(), openListener, null, server));
                     } else if (listener.type == ListenerType.HTTPS) {
                         OpenListener openListener;
 
@@ -236,7 +236,7 @@
 
                         sslServer.resumeAccepts();
                         channels.add(sslServer);
-                        listenerInfo.add(new ListenerInfo("https", sslServer.getLocalAddress(), openListener, xnioSsl, channel));
+                        listenerInfo.add(new ListenerInfo("https", sslServer.getLocalAddress(), openListener, xnioSsl, sslServer));
                     }
                 }
 
