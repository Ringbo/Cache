diff --git a/source/com/intellij/openapi/module/impl/ModuleManagerImpl.java b/source/com/intellij/openapi/module/impl/ModuleManagerImpl.java
index 29d6fc0..41ca365 100644
--- a/source/com/intellij/openapi/module/impl/ModuleManagerImpl.java
+++ b/source/com/intellij/openapi/module/impl/ModuleManagerImpl.java
@@ -234,7 +234,7 @@
         }
       };
 
-      if (app.isDispatchThread()) {
+      if (app.isDispatchThread() || app.isHeadlessEnvironment()) {
         swingRunnable.run();
       }
       else {
@@ -530,7 +530,7 @@
               });
             }
           };
-          if (app.isDispatchThread()) {
+          if (app.isDispatchThread() || app.isHeadlessEnvironment()) {
             swingRunnable.run();
           }
           else {
