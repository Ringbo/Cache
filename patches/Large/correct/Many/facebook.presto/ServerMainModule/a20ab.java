diff --git a/presto-main/src/main/java/com/facebook/presto/server/ServerMainModule.java b/presto-main/src/main/java/com/facebook/presto/server/ServerMainModule.java
index 30d74dc..013f482 100644
--- a/presto-main/src/main/java/com/facebook/presto/server/ServerMainModule.java
+++ b/presto-main/src/main/java/com/facebook/presto/server/ServerMainModule.java
@@ -199,7 +199,7 @@
         httpClientBinder(binder).bindHttpClient("exchange", ForExchange.class)
                 .withTracing()
                 .withConfigDefaults(config -> {
-                    config.setIdleTimeout(new Duration(2, SECONDS));
+                    config.setIdleTimeout(new Duration(30, SECONDS));
                     config.setRequestTimeout(new Duration(10, SECONDS));
                     config.setMaxConnectionsPerServer(250);
                 });
@@ -219,7 +219,7 @@
         httpClientBinder(binder).bindHttpClient("scheduler", ForScheduler.class)
                 .withTracing()
                 .withConfigDefaults(config -> {
-                    config.setIdleTimeout(new Duration(2, SECONDS));
+                    config.setIdleTimeout(new Duration(30, SECONDS));
                     config.setRequestTimeout(new Duration(10, SECONDS));
                     config.setMaxConnectionsPerServer(250);
                 });
@@ -229,7 +229,7 @@
         httpClientBinder(binder).bindHttpClient("memoryManager", ForMemoryManager.class)
                 .withTracing()
                 .withConfigDefaults(config -> {
-                    config.setIdleTimeout(new Duration(2, SECONDS));
+                    config.setIdleTimeout(new Duration(30, SECONDS));
                     config.setRequestTimeout(new Duration(10, SECONDS));
                 });
 
@@ -316,7 +316,7 @@
         httpClientBinder(binder).bindHttpClient("execute", ForExecute.class)
                 .withTracing()
                 .withConfigDefaults(config -> {
-                    config.setIdleTimeout(new Duration(2, SECONDS));
+                    config.setIdleTimeout(new Duration(30, SECONDS));
                     config.setRequestTimeout(new Duration(10, SECONDS));
                 });
 
