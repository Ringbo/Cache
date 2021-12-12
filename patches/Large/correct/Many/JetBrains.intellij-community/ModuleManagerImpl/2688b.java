diff --git a/platform/projectModel-impl/src/com/intellij/openapi/module/impl/ModuleManagerImpl.java b/platform/projectModel-impl/src/com/intellij/openapi/module/impl/ModuleManagerImpl.java
index 07ec229..b448de5 100644
--- a/platform/projectModel-impl/src/com/intellij/openapi/module/impl/ModuleManagerImpl.java
+++ b/platform/projectModel-impl/src/com/intellij/openapi/module/impl/ModuleManagerImpl.java
@@ -338,7 +338,7 @@
           public void run() {
             Disposer.dispose(module);
           }
-        });
+        }, module.getDisposed());
       }
     }
 
