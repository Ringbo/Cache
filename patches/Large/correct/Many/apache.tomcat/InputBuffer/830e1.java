diff --git a/java/org/apache/catalina/connector/InputBuffer.java b/java/org/apache/catalina/connector/InputBuffer.java
index 15b7932..ffbeb81 100644
--- a/java/org/apache/catalina/connector/InputBuffer.java
+++ b/java/org/apache/catalina/connector/InputBuffer.java
@@ -295,7 +295,7 @@
 
 
     boolean isBlocking() {
-        return coyoteRequest.getReadListener() != null;
+        return coyoteRequest.getReadListener() == null;
     }
 
 
