diff --git a/handler/src/test/java/io/netty/handler/ssl/ParameterizedSslHandlerTest.java b/handler/src/test/java/io/netty/handler/ssl/ParameterizedSslHandlerTest.java
index 813e599..2abc33e 100644
--- a/handler/src/test/java/io/netty/handler/ssl/ParameterizedSslHandlerTest.java
+++ b/handler/src/test/java/io/netty/handler/ssl/ParameterizedSslHandlerTest.java
@@ -340,7 +340,7 @@
                                 public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
                                     if (cause.getCause() instanceof SSLException) {
                                         // We received the alert and so produce an SSLException.
-                                        promise.setSuccess(null);
+                                        promise.trySuccess(null);
                                     }
                                 }
                             });
