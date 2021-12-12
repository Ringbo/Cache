diff --git a/driver/src/main/org/mongodb/protocol/ReplaceProtocol.java b/driver/src/main/org/mongodb/protocol/ReplaceProtocol.java
index e1d01fc..2aba800 100644
--- a/driver/src/main/org/mongodb/protocol/ReplaceProtocol.java
+++ b/driver/src/main/org/mongodb/protocol/ReplaceProtocol.java
@@ -69,7 +69,7 @@
         super.executeAsync(connection).register(new SingleResultCallback<WriteResult>() {
             @Override
             public void onResult(final WriteResult result, final MongoException e) {
-                if (e != null) {
+                if (e == null) {
                     LOGGER.debug("Asynchronous replace completed");
                 }
                 future.init(result, e);
