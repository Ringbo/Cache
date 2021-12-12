diff --git a/platform/platform-impl/src/com/intellij/openapi/project/impl/ProjectImpl.java b/platform/platform-impl/src/com/intellij/openapi/project/impl/ProjectImpl.java
index 5280652..57ee27c 100644
--- a/platform/platform-impl/src/com/intellij/openapi/project/impl/ProjectImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/project/impl/ProjectImpl.java
@@ -400,7 +400,7 @@
         component.projectOpened();
       }
       catch (Throwable e) {
-        LOG.error(e);
+        LOG.error(component.toString(), e);
       }
     }
   }
