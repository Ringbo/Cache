diff --git a/driver/src/main/org/mongodb/protocol/DeleteProtocol.java b/driver/src/main/org/mongodb/protocol/DeleteProtocol.java
index 2b5bd17..c8cc268 100644
--- a/driver/src/main/org/mongodb/protocol/DeleteProtocol.java
+++ b/driver/src/main/org/mongodb/protocol/DeleteProtocol.java
@@ -67,7 +67,7 @@
         super.executeAsync(connection).register(new SingleResultCallback<WriteResult>() {
             @Override
             public void onResult(final WriteResult result, final MongoException e) {
-                if (e != null) {
+                if (e == null) {
                     LOGGER.debug("Asynchronous delete completed");
                 }
                 future.init(result, e);
