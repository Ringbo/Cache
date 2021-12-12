diff --git a/presto-main/src/main/java/com/facebook/presto/server/CoordinatorModule.java b/presto-main/src/main/java/com/facebook/presto/server/CoordinatorModule.java
index 72d86e5..b53bad2 100644
--- a/presto-main/src/main/java/com/facebook/presto/server/CoordinatorModule.java
+++ b/presto-main/src/main/java/com/facebook/presto/server/CoordinatorModule.java
@@ -162,7 +162,7 @@
         httpClientBinder(binder).bindHttpClient("node-manager", ForGracefulShutdown.class)
                 .withTracing()
                 .withConfigDefaults(config -> {
-                    config.setIdleTimeout(new Duration(2, SECONDS));
+                    config.setIdleTimeout(new Duration(30, SECONDS));
                     config.setRequestTimeout(new Duration(10, SECONDS));
                 });
 
