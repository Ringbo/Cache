diff --git a/modules/cpr/src/main/java/org/atmosphere/container/TomcatWebSocketUtil.java b/modules/cpr/src/main/java/org/atmosphere/container/TomcatWebSocketUtil.java
index eee7ba8..6fb40b8 100644
--- a/modules/cpr/src/main/java/org/atmosphere/container/TomcatWebSocketUtil.java
+++ b/modules/cpr/src/main/java/org/atmosphere/container/TomcatWebSocketUtil.java
@@ -160,7 +160,7 @@
             }
             return action;
         } catch (Exception ex) {
-            logger.error("", ex);
+            logger.warn("", ex);
         }
         return Action.CANCELLED;
     }
