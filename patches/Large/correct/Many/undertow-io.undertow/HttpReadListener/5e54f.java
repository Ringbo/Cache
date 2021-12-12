diff --git a/core/src/main/java/io/undertow/server/protocol/http/HttpReadListener.java b/core/src/main/java/io/undertow/server/protocol/http/HttpReadListener.java
index cec0a80..35c5030 100644
--- a/core/src/main/java/io/undertow/server/protocol/http/HttpReadListener.java
+++ b/core/src/main/java/io/undertow/server/protocol/http/HttpReadListener.java
@@ -114,7 +114,7 @@
                     } catch (IOException e) {
                         UndertowLogger.REQUEST_IO_LOGGER.debug("Error reading request", e);
                         // fuck it, it's all ruined
-                        IoUtils.safeClose(channel);
+                        IoUtils.safeClose(connection);
                         return;
                     }
                     return;
