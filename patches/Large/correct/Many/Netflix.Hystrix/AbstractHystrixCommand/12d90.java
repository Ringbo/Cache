diff --git a/hystrix-contrib/hystrix-javanica/src/main/java/com/netflix/hystrix/contrib/javanica/command/AbstractHystrixCommand.java b/hystrix-contrib/hystrix-javanica/src/main/java/com/netflix/hystrix/contrib/javanica/command/AbstractHystrixCommand.java
index 426a984..eb014f1 100644
--- a/hystrix-contrib/hystrix-javanica/src/main/java/com/netflix/hystrix/contrib/javanica/command/AbstractHystrixCommand.java
+++ b/hystrix-contrib/hystrix-javanica/src/main/java/com/netflix/hystrix/contrib/javanica/command/AbstractHystrixCommand.java
@@ -170,7 +170,7 @@
      */
     @Override
     protected T getFallback() {
-        throw new RuntimeException("No fallback available.", getFailedExecutionException());
+        throw new RuntimeException("No fallback available.", getExecutionException());
     }
 
     /**
