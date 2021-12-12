diff --git a/platform/platform-impl/src/com/intellij/idea/StartupUtil.java b/platform/platform-impl/src/com/intellij/idea/StartupUtil.java
index dcd26c9..01e01ba 100644
--- a/platform/platform-impl/src/com/intellij/idea/StartupUtil.java
+++ b/platform/platform-impl/src/com/intellij/idea/StartupUtil.java
@@ -221,7 +221,7 @@
         log.info("Using \"FocusKiller\" library to prevent focus stealing.");
       }
       catch (Throwable t) {
-        log.warn("\"FocusKiller\" library not found or there were problems loading it.", t);
+        log.info("\"FocusKiller\" library not found or there were problems loading it.", t);
       }
     }
   }
