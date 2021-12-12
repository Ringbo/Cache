diff --git a/driver/src/main/org/mongodb/protocol/InsertProtocol.java b/driver/src/main/org/mongodb/protocol/InsertProtocol.java
index 30ddc2f..d8d6055 100644
--- a/driver/src/main/org/mongodb/protocol/InsertProtocol.java
+++ b/driver/src/main/org/mongodb/protocol/InsertProtocol.java
@@ -67,7 +67,7 @@
         super.executeAsync(connection).register(new SingleResultCallback<WriteResult>() {
             @Override
             public void onResult(final WriteResult result, final MongoException e) {
-                if (e != null) {
+                if (e == null) {
                     LOGGER.debug("Asynchronous insert completed");
                 }
                 future.init(result, e);
