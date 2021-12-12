diff --git a/servlet/src/main/java/io/undertow/servlet/util/SavedRequest.java b/servlet/src/main/java/io/undertow/servlet/util/SavedRequest.java
index 7db94de..2e19cea 100644
--- a/servlet/src/main/java/io/undertow/servlet/util/SavedRequest.java
+++ b/servlet/src/main/java/io/undertow/servlet/util/SavedRequest.java
@@ -55,7 +55,7 @@
                 int res = 0;
                 InputStream in = exchange.getInputStream();
                 try {
-                    while ((res = in.read(buffer)) > 0) {
+                    while ((res = in.read(buffer, read, buffer.length - read)) > 0) {
                         read += res;
                         if (read == maxSize) {
                             UndertowLogger.REQUEST_LOGGER.debugf("Request to %s was to large to save", exchange.getRequestURI());
