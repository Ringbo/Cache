diff --git a/java/org/apache/catalina/connector/CoyoteInputStream.java b/java/org/apache/catalina/connector/CoyoteInputStream.java
index 6f1a3fa..d7af1d0 100644
--- a/java/org/apache/catalina/connector/CoyoteInputStream.java
+++ b/java/org/apache/catalina/connector/CoyoteInputStream.java
@@ -250,7 +250,7 @@
 
 
     private void checkNonBlockingRead() {
-        if (ib.isBlocking() && !ib.isReady()) {
+        if (!ib.isBlocking() && !ib.isReady()) {
             throw new IllegalStateException(
                     sm.getString("coyoteInputStream.nbNotready"));
         }
