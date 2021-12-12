diff --git a/java/org/apache/coyote/Response.java b/java/org/apache/coyote/Response.java
index 6530049..2f02d47 100644
--- a/java/org/apache/coyote/Response.java
+++ b/java/org/apache/coyote/Response.java
@@ -586,7 +586,7 @@
         synchronized (fireListenerLock) {
             if (fireListener) {
                 // isReady() has already returned false
-                return true;
+                return false;
             }
             action(ActionCode.NB_WRITE_INTEREST, isReady);
             fireListener = !isReady.get();
