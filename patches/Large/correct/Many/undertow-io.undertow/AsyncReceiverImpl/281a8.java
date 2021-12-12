diff --git a/core/src/main/java/io/undertow/io/AsyncReceiverImpl.java b/core/src/main/java/io/undertow/io/AsyncReceiverImpl.java
index 08b51bd..df12674 100644
--- a/core/src/main/java/io/undertow/io/AsyncReceiverImpl.java
+++ b/core/src/main/java/io/undertow/io/AsyncReceiverImpl.java
@@ -439,11 +439,11 @@
                                                     return;
                                                 }
                                             }
-                                        } catch (final IOException e) {
+                                        } catch (final Exception e) {
                                             Connectors.executeRootHandler(new HttpHandler() {
                                                 @Override
                                                 public void handleRequest(HttpServerExchange exchange) throws Exception {
-                                                    error.error(exchange, e);
+                                                    error.error(exchange, new IOException(e));
                                                 }
                                             }, exchange);
                                             return;
