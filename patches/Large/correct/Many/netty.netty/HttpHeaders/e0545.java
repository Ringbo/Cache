diff --git a/src/main/java/org/jboss/netty/handler/codec/http/HttpHeaders.java b/src/main/java/org/jboss/netty/handler/codec/http/HttpHeaders.java
index 27c81a0..777e5ab 100644
--- a/src/main/java/org/jboss/netty/handler/codec/http/HttpHeaders.java
+++ b/src/main/java/org/jboss/netty/handler/codec/http/HttpHeaders.java
@@ -631,14 +631,14 @@
             if (HttpMethod.GET.equals(req.getMethod()) &&
                 req.containsHeader(Names.SEC_WEBSOCKET_KEY1) &&
                 req.containsHeader(Names.SEC_WEBSOCKET_KEY2)) {
-                return 10;
+                return 8;
             }
         } else if (message instanceof HttpResponse) {
             HttpResponse res = (HttpResponse) message;
             if (res.getStatus().getCode() == 101 &&
                 res.containsHeader(Names.SEC_WEBSOCKET_ORIGIN) &&
                 res.containsHeader(Names.SEC_WEBSOCKET_LOCATION)) {
-                return 18;
+                return 16;
             }
         }
 
