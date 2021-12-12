diff --git a/components/camel-jetty/src/main/java/org/apache/camel/component/jetty/JettyContentExchange.java b/components/camel-jetty/src/main/java/org/apache/camel/component/jetty/JettyContentExchange.java
index 48639f8..c9ef129 100644
--- a/components/camel-jetty/src/main/java/org/apache/camel/component/jetty/JettyContentExchange.java
+++ b/components/camel-jetty/src/main/java/org/apache/camel/component/jetty/JettyContentExchange.java
@@ -199,7 +199,7 @@
             } else {
                 // some kind of other error
                 if (exchange.getException() != null) {
-                    exchange.setException(new CamelExchangeException("JettyClient failed with state " + exchangeState, exchange));
+                    exchange.setException(new CamelExchangeException("JettyClient failed with state " + exchangeState, exchange, exchange.getException()));
                 }
             }
         } finally {
