diff --git a/python/educational-core/src/com/jetbrains/edu/learning/StudySerializationUtils.java b/python/educational-core/src/com/jetbrains/edu/learning/StudySerializationUtils.java
index dda547c..4558d4c 100644
--- a/python/educational-core/src/com/jetbrains/edu/learning/StudySerializationUtils.java
+++ b/python/educational-core/src/com/jetbrains/edu/learning/StudySerializationUtils.java
@@ -542,7 +542,7 @@
         return stepOptions;
       }
 
-      private JsonObject convertToThirdVersion(JsonObject stepOptionsJson) {
+      private static JsonObject convertToThirdVersion(JsonObject stepOptionsJson) {
         if (!stepOptionsJson.has(LAST_SUBTASK)) return stepOptionsJson;
         final int lastSubtaskIndex = stepOptionsJson.get(LAST_SUBTASK).getAsInt();
         if (lastSubtaskIndex == 0) return stepOptionsJson;
@@ -554,7 +554,7 @@
           }
         }
         final JsonArray descriptions = stepOptionsJson.getAsJsonArray(TEXTS);
-        if (descriptions.size() > 0) {
+        if (descriptions != null && descriptions.size() > 0) {
           final JsonObject fileWrapper = descriptions.get(0).getAsJsonObject();
           if (fileWrapper.has(NAME)) {
             replaceWithSubtask(fileWrapper);
@@ -563,7 +563,7 @@
         return stepOptionsJson;
       }
 
-      private void replaceWithSubtask(JsonObject fileWrapper) {
+      private static void replaceWithSubtask(JsonObject fileWrapper) {
         final String file = fileWrapper.get(NAME).getAsString();
         final String extension = FileUtilRt.getExtension(file);
         final String name = FileUtil.getNameWithoutExtension(file);
