diff --git a/src/main/java/io/vertx/core/impl/VertxImpl.java b/src/main/java/io/vertx/core/impl/VertxImpl.java
index 4ddb162..a1a3e9a 100644
--- a/src/main/java/io/vertx/core/impl/VertxImpl.java
+++ b/src/main/java/io/vertx/core/impl/VertxImpl.java
@@ -174,7 +174,7 @@
                 if (resultHandler != null) {
                   resultHandler.handle(Future.failedFuture(asyncResult.cause()));
                 } else {
-                  log.error(ar.cause());
+                  log.error(asyncResult.cause());
                 }
              }
             });
@@ -182,7 +182,7 @@
             if (resultHandler != null) {
               resultHandler.handle(Future.failedFuture(ar2.cause()));
             } else {
-              log.error(ar.cause());
+              log.error(ar2.cause());
             }
           }
         });
