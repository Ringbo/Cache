diff --git a/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/Paragraph.java b/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/Paragraph.java
index 4e02fb1..bc53887 100644
--- a/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/Paragraph.java
+++ b/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/Paragraph.java
@@ -208,7 +208,7 @@
 
   public List<InterpreterCompletion> completion(String buffer, int cursor) {
     String replName = getRequiredReplName(buffer);
-    if (replName != null) {
+    if (replName != null && cursor > replName.length()) {
       cursor -= replName.length() + 1;
     }
     String body = getScriptBody(buffer);
