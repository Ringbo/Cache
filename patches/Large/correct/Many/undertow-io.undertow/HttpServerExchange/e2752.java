diff --git a/core/src/main/java/io/undertow/server/HttpServerExchange.java b/core/src/main/java/io/undertow/server/HttpServerExchange.java
index d6c73f5..3ea0bd4 100644
--- a/core/src/main/java/io/undertow/server/HttpServerExchange.java
+++ b/core/src/main/java/io/undertow/server/HttpServerExchange.java
@@ -1871,7 +1871,7 @@
             if(isFinished()) {
                 return false;
             }
-            return anyAreClear(state, FLAG_SHOULD_RESUME_READS) || super.isReadResumed();
+            return anyAreSet(state, FLAG_SHOULD_RESUME_READS) || super.isReadResumed();
         }
 
         @Override
