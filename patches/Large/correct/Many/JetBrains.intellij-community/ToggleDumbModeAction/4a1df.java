diff --git a/platform/platform-impl/src/com/intellij/internal/ToggleDumbModeAction.java b/platform/platform-impl/src/com/intellij/internal/ToggleDumbModeAction.java
index 9fb1170..7ab71da 100644
--- a/platform/platform-impl/src/com/intellij/internal/ToggleDumbModeAction.java
+++ b/platform/platform-impl/src/com/intellij/internal/ToggleDumbModeAction.java
@@ -64,7 +64,7 @@
         public void canceled() {
         }
       };
-      DumbServiceImpl.getInstance(project).queueCacheUpdate(Arrays.asList(updater));
+      DumbServiceImpl.getInstance(project).queueCacheUpdateInDumbMode(Arrays.asList(updater));
     }
   }
 
