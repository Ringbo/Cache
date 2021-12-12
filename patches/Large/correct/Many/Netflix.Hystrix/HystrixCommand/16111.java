diff --git a/hystrix-core/src/main/java/com/netflix/hystrix/HystrixCommand.java b/hystrix-core/src/main/java/com/netflix/hystrix/HystrixCommand.java
index bc6b8eb..3917814 100755
--- a/hystrix-core/src/main/java/com/netflix/hystrix/HystrixCommand.java
+++ b/hystrix-core/src/main/java/com/netflix/hystrix/HystrixCommand.java
@@ -303,8 +303,9 @@
      * Implement this method with code to be executed when {@link #execute()} or {@link #queue()} are invoked.
      * 
      * @return R response type
+     * @throws Exception if command execution fails
      */
-    protected abstract R run();
+    protected abstract R run() throws Exception;
 
     /**
      * If {@link #execute()} or {@link #queue()} fails in any way then this method will be invoked to provide an opportunity to return a fallback response.
