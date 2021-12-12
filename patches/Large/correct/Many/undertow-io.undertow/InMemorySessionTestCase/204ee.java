diff --git a/core/src/test/java/io/undertow/server/handlers/session/InMemorySessionTestCase.java b/core/src/test/java/io/undertow/server/handlers/session/InMemorySessionTestCase.java
index 20dd683..bb9d3f5 100644
--- a/core/src/test/java/io/undertow/server/handlers/session/InMemorySessionTestCase.java
+++ b/core/src/test/java/io/undertow/server/handlers/session/InMemorySessionTestCase.java
@@ -112,7 +112,7 @@
 
         try {
             final SessionCookieConfig sessionConfig = new SessionCookieConfig();
-            final SessionAttachmentHandler handler = new SessionAttachmentHandler(new InMemorySessionManager("", 1), sessionConfig);
+            final SessionAttachmentHandler handler = new SessionAttachmentHandler(new InMemorySessionManager("", 1, true), sessionConfig);
             handler.setNext(new HttpHandler() {
                 @Override
                 public void handleRequest(final HttpServerExchange exchange) throws Exception {
