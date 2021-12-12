diff --git a/core/src/main/java/io/undertow/server/HttpReadListener.java b/core/src/main/java/io/undertow/server/HttpReadListener.java
index 541ee2b..76af2b9 100644
--- a/core/src/main/java/io/undertow/server/HttpReadListener.java
+++ b/core/src/main/java/io/undertow/server/HttpReadListener.java
@@ -83,7 +83,7 @@
                         res = channel.read(buffer);
                     } catch (IOException e) {
                         UndertowLogger.REQUEST_IO_LOGGER.debug("Error reading request", e);
-                        safeClose(channel);
+                        safeClose(connection);
                         return;
                     }
                 } else {
