diff --git a/src/main/java/reactor/core/publisher/MonoCompletableFuture.java b/src/main/java/reactor/core/publisher/MonoCompletableFuture.java
index 5059803..e13ed63 100644
--- a/src/main/java/reactor/core/publisher/MonoCompletableFuture.java
+++ b/src/main/java/reactor/core/publisher/MonoCompletableFuture.java
@@ -62,7 +62,7 @@
             } else if (v != null) {
                 sds.complete(v);
             } else {
-                s.onError(new NullPointerException("The future produced a null value"));
+                s.onComplete();
             }
         });
     }
