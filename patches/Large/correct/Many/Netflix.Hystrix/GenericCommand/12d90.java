diff --git a/hystrix-contrib/hystrix-javanica/src/main/java/com/netflix/hystrix/contrib/javanica/command/GenericCommand.java b/hystrix-contrib/hystrix-javanica/src/main/java/com/netflix/hystrix/contrib/javanica/command/GenericCommand.java
index 1db909b..84fa2a4 100644
--- a/hystrix-contrib/hystrix-javanica/src/main/java/com/netflix/hystrix/contrib/javanica/command/GenericCommand.java
+++ b/hystrix-contrib/hystrix-javanica/src/main/java/com/netflix/hystrix/contrib/javanica/command/GenericCommand.java
@@ -71,7 +71,7 @@
                     @Override
                     Object execute() {
                         MetaHolder metaHolder = commandAction.getMetaHolder();
-                        Object[] args = createArgsForFallback(metaHolder, getFailedExecutionException());
+                        Object[] args = createArgsForFallback(metaHolder, getExecutionException());
                         return commandAction.executeWithArgs(commandAction.getMetaHolder().getFallbackExecutionType(), args);
                     }
                 });
