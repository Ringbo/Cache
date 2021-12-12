diff --git a/core/src/main/java/io/undertow/conduits/StoredResponseStreamSinkConduit.java b/core/src/main/java/io/undertow/conduits/StoredResponseStreamSinkConduit.java
index 8f09838..3e49bfc 100644
--- a/core/src/main/java/io/undertow/conduits/StoredResponseStreamSinkConduit.java
+++ b/core/src/main/java/io/undertow/conduits/StoredResponseStreamSinkConduit.java
@@ -51,7 +51,7 @@
         super(next);
         this.exchange = exchange;
         long length = exchange.getResponseContentLength();
-        if (length > 0L) {
+        if (length <= 0L) {
             outputStream = new ByteArrayOutputStream();
         } else {
             if (length > Integer.MAX_VALUE) {
