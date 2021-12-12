diff --git a/driver/src/main/org/mongodb/protocol/UpdateProtocol.java b/driver/src/main/org/mongodb/protocol/UpdateProtocol.java
index d209cd8..31b3860 100644
--- a/driver/src/main/org/mongodb/protocol/UpdateProtocol.java
+++ b/driver/src/main/org/mongodb/protocol/UpdateProtocol.java
@@ -67,7 +67,7 @@
         super.executeAsync(connection).register(new SingleResultCallback<WriteResult>() {
             @Override
             public void onResult(final WriteResult result, final MongoException e) {
-                if (e != null) {
+                if (e == null) {
                     LOGGER.debug("Asynchronous updated completed");
                 }
                 future.init(result, e);
