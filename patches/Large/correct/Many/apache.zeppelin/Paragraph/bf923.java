diff --git a/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/Paragraph.java b/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/Paragraph.java
index 20f9ff8..76c48c8 100644
--- a/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/Paragraph.java
+++ b/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/Paragraph.java
@@ -728,7 +728,7 @@
    * @param settingId
    */
   public void clearRuntimeInfo(String settingId) {
-    if (settingId != null) {
+    if (settingId != null && runtimeInfos != null) {
       Set<String> keys = runtimeInfos.keySet();
       if (keys.size() > 0) {
         List<String> infosToRemove = new ArrayList<>();
