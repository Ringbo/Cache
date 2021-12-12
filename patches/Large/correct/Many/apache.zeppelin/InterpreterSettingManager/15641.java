diff --git a/zeppelin-zengine/src/main/java/org/apache/zeppelin/interpreter/InterpreterSettingManager.java b/zeppelin-zengine/src/main/java/org/apache/zeppelin/interpreter/InterpreterSettingManager.java
index 32db89b..f031591 100644
--- a/zeppelin-zengine/src/main/java/org/apache/zeppelin/interpreter/InterpreterSettingManager.java
+++ b/zeppelin-zengine/src/main/java/org/apache/zeppelin/interpreter/InterpreterSettingManager.java
@@ -514,7 +514,8 @@
         }
       }
     } catch (NullPointerException e) {
-      logger.warn("Couldn't get interpreter editor setting");
+      // Use `debug` level because this log occurs frequently
+      logger.debug("Couldn't get interpreter editor setting");
     }
     return editor;
   }
