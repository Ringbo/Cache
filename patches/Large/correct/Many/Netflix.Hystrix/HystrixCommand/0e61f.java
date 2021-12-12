diff --git a/hystrix-core/src/main/java/com/netflix/hystrix/HystrixCommand.java b/hystrix-core/src/main/java/com/netflix/hystrix/HystrixCommand.java
index 454b051..8a0de54 100755
--- a/hystrix-core/src/main/java/com/netflix/hystrix/HystrixCommand.java
+++ b/hystrix-core/src/main/java/com/netflix/hystrix/HystrixCommand.java
@@ -4398,7 +4398,7 @@
             protected Boolean run() {
                 System.out.println("***** running");
                 try {
-                    Thread.sleep(timeout * 2);
+                    Thread.sleep(timeout * 10);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
