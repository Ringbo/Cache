diff --git a/jetty-server/src/main/java/org/eclipse/jetty/server/AsyncContextState.java b/jetty-server/src/main/java/org/eclipse/jetty/server/AsyncContextState.java
index 4d82b13..f2f489a 100644
--- a/jetty-server/src/main/java/org/eclipse/jetty/server/AsyncContextState.java
+++ b/jetty-server/src/main/java/org/eclipse/jetty/server/AsyncContextState.java
@@ -68,7 +68,7 @@
             @Override
             public void onError(AsyncEvent event) throws IOException
             {
-                listener.onComplete(new AsyncEvent(event.getAsyncContext(),request,response,event.getThrowable()));
+                listener.onError(new AsyncEvent(event.getAsyncContext(),request,response,event.getThrowable()));
             }
             
             @Override
