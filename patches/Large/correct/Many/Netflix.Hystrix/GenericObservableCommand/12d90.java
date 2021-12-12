diff --git a/hystrix-contrib/hystrix-javanica/src/main/java/com/netflix/hystrix/contrib/javanica/command/GenericObservableCommand.java b/hystrix-contrib/hystrix-javanica/src/main/java/com/netflix/hystrix/contrib/javanica/command/GenericObservableCommand.java
index 15ab1d9..d664942 100644
--- a/hystrix-contrib/hystrix-javanica/src/main/java/com/netflix/hystrix/contrib/javanica/command/GenericObservableCommand.java
+++ b/hystrix-contrib/hystrix-javanica/src/main/java/com/netflix/hystrix/contrib/javanica/command/GenericObservableCommand.java
@@ -85,7 +85,7 @@
     protected Observable resumeWithFallback() {
         if (commandActions.hasFallbackAction()) {
             MetaHolder metaHolder = commandActions.getFallbackAction().getMetaHolder();
-            Throwable cause = getFailedExecutionException();
+            Throwable cause = getExecutionException();
             if (cause instanceof CommandActionExecutionException) {
                 cause = cause.getCause();
             }
