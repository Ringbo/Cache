diff --git a/jetty-websocket/websocket-servlet/src/main/java/org/eclipse/jetty/websocket/servlet/WebSocketServletFactory.java b/jetty-websocket/websocket-servlet/src/main/java/org/eclipse/jetty/websocket/servlet/WebSocketServletFactory.java
index 72c1478..93d8377 100644
--- a/jetty-websocket/websocket-servlet/src/main/java/org/eclipse/jetty/websocket/servlet/WebSocketServletFactory.java
+++ b/jetty-websocket/websocket-servlet/src/main/java/org/eclipse/jetty/websocket/servlet/WebSocketServletFactory.java
@@ -44,7 +44,7 @@
             try
             {
                 Class<? extends WebSocketServletFactory> wsClazz =
-                        (Class<? extends WebSocketServletFactory>) Class.forName(DEFAULT_IMPL);
+                        (Class<? extends WebSocketServletFactory>) Class.forName(DEFAULT_IMPL,true,Thread.currentThread().getContextClassLoader());
                 Constructor<? extends WebSocketServletFactory> ctor = wsClazz.getDeclaredConstructor(new Class<?>[]{ServletContext.class, WebSocketPolicy.class});
                 return ctor.newInstance(ctx, policy);
             }
