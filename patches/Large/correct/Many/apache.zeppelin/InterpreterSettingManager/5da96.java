diff --git a/zeppelin-zengine/src/main/java/org/apache/zeppelin/interpreter/InterpreterSettingManager.java b/zeppelin-zengine/src/main/java/org/apache/zeppelin/interpreter/InterpreterSettingManager.java
index b141e6b..147f279 100644
--- a/zeppelin-zengine/src/main/java/org/apache/zeppelin/interpreter/InterpreterSettingManager.java
+++ b/zeppelin-zengine/src/main/java/org/apache/zeppelin/interpreter/InterpreterSettingManager.java
@@ -547,7 +547,7 @@
                 setting.getId());
             if (localRepoDir.exists()) {
               try {
-                FileUtils.cleanDirectory(localRepoDir);
+                FileUtils.forceDelete(localRepoDir);
               } catch (FileNotFoundException e) {
                 logger.info("A file that does not exist cannot be deleted, nothing to worry", e);
               }
