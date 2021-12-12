diff --git a/moco-runner/src/main/java/com/github/dreamhead/moco/parser/model/RequestSetting.java b/moco-runner/src/main/java/com/github/dreamhead/moco/parser/model/RequestSetting.java
index b11c948..18230cd 100644
--- a/moco-runner/src/main/java/com/github/dreamhead/moco/parser/model/RequestSetting.java
+++ b/moco-runner/src/main/java/com/github/dreamhead/moco/parser/model/RequestSetting.java
@@ -16,7 +16,7 @@
     private Map<String, TextContainer> queries;
     private Map<String, TextContainer> cookies;
 
-    public Object getUri() {
+    public TextContainer getUri() {
         return uri;
     }
 
