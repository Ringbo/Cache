diff --git a/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java b/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
index 481cd87..e56b874 100644
--- a/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
+++ b/src/main/java/com/ning/http/client/providers/netty/NettyAsyncHttpProvider.java
@@ -908,7 +908,7 @@
                             }
                         });
                     } else {
-                        nextRequest(request, future);
+                        nextRequest(newRequest, future);
                     }
                 }
 
