diff --git a/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/Note.java b/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/Note.java
index b6c8b29..1f4a508 100644
--- a/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/Note.java
+++ b/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/Note.java
@@ -113,7 +113,7 @@
 
   private String getDefaultInterpreterName() {
     Optional<InterpreterSetting> settingOptional = replLoader.getDefaultInterpreterSetting();
-    return settingOptional.isPresent() ? settingOptional.get().getName() : StringUtils.EMPTY;
+    return settingOptional.isPresent() ? settingOptional.get().getGroup() : StringUtils.EMPTY;
   }
 
   void putDefaultReplName() {
