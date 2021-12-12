diff --git a/core/src/main/java/io/undertow/server/HttpServerExchange.java b/core/src/main/java/io/undertow/server/HttpServerExchange.java
index aa7b629..8837fb9 100644
--- a/core/src/main/java/io/undertow/server/HttpServerExchange.java
+++ b/core/src/main/java/io/undertow/server/HttpServerExchange.java
@@ -613,7 +613,7 @@
             host = NetworkUtils.formatPossibleIpv6Address(address.getHostString());
             int port = address.getPort();
             if (!((getRequestScheme().equals("http") && port == 80)
-                    || (getRequestScheme().equals("https") && port == 8080))) {
+                    || (getRequestScheme().equals("https") && port == 443))) {
                 host = host + ":" + port;
             }
         }
