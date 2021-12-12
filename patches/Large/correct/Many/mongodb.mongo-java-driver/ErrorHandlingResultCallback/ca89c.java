diff --git a/driver-core/src/main/com/mongodb/internal/async/ErrorHandlingResultCallback.java b/driver-core/src/main/com/mongodb/internal/async/ErrorHandlingResultCallback.java
index 4f588d0..b1276a8 100644
--- a/driver-core/src/main/com/mongodb/internal/async/ErrorHandlingResultCallback.java
+++ b/driver-core/src/main/com/mongodb/internal/async/ErrorHandlingResultCallback.java
@@ -48,7 +48,7 @@
         try {
             wrapped.onResult(result, t);
         } catch (Throwable e) {
-            logger.warn("Callback onResult call produced an error", e);
+            logger.error("Callback onResult call produced an error", e);
         }
     }
 
