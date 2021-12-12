diff --git a/hystrix-contrib/hystrix-javanica/src/main/java/com/netflix/hystrix/contrib/javanica/command/BatchHystrixCommand.java b/hystrix-contrib/hystrix-javanica/src/main/java/com/netflix/hystrix/contrib/javanica/command/BatchHystrixCommand.java
index 39529e4..ac6217f 100644
--- a/hystrix-contrib/hystrix-javanica/src/main/java/com/netflix/hystrix/contrib/javanica/command/BatchHystrixCommand.java
+++ b/hystrix-contrib/hystrix-javanica/src/main/java/com/netflix/hystrix/contrib/javanica/command/BatchHystrixCommand.java
@@ -72,7 +72,7 @@
                     Object execute() {
                         MetaHolder metaHolder = commandAction.getMetaHolder();
                         Object[] args = toArgs(getCollapsedRequests());
-                        args = createArgsForFallback(args, metaHolder, getFailedExecutionException());
+                        args = createArgsForFallback(args, metaHolder, getExecutionException());
                         return commandAction.executeWithArgs(commandAction.getMetaHolder().getFallbackExecutionType(), args);
                     }
                 });
