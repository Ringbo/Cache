diff --git a/core/src/main/java/io/undertow/attribute/SecureExchangeAttribute.java b/core/src/main/java/io/undertow/attribute/SecureExchangeAttribute.java
index 4bb1d87..baf6133 100644
--- a/core/src/main/java/io/undertow/attribute/SecureExchangeAttribute.java
+++ b/core/src/main/java/io/undertow/attribute/SecureExchangeAttribute.java
@@ -30,7 +30,7 @@
 
     @Override
     public String readAttribute(HttpServerExchange exchange) {
-        return Boolean.toString(exchange.getProtocol().equals("https"));
+        return Boolean.toString(exchange.getProtocol().equalToString("https"));
     }
 
     @Override
