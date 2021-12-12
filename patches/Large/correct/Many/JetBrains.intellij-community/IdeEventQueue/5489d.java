diff --git a/platform/platform-impl/src/com/intellij/ide/IdeEventQueue.java b/platform/platform-impl/src/com/intellij/ide/IdeEventQueue.java
index d9fd70f..acce4d2 100644
--- a/platform/platform-impl/src/com/intellij/ide/IdeEventQueue.java
+++ b/platform/platform-impl/src/com/intellij/ide/IdeEventQueue.java
@@ -405,7 +405,7 @@
             runnable.run();
           }
           catch (Exception exc) {
-            LOG.info(exc);
+            LOG.error(exc);
           }
         });
     }
