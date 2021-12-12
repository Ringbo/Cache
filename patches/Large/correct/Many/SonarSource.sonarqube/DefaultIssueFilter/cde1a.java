diff --git a/sonar-core/src/main/java/org/sonar/core/issue/DefaultIssueFilter.java b/sonar-core/src/main/java/org/sonar/core/issue/DefaultIssueFilter.java
index 7b72bf6..03ec5da 100644
--- a/sonar-core/src/main/java/org/sonar/core/issue/DefaultIssueFilter.java
+++ b/sonar-core/src/main/java/org/sonar/core/issue/DefaultIssueFilter.java
@@ -147,7 +147,7 @@
   }
 
   @VisibleForTesting
-  Map<String, Object> dataAsMap(String data) {
+  final Map<String, Object> dataAsMap(String data) {
     Map<String, Object> map = newHashMap();
 
     Iterable<String> keyValues = Splitter.on(DefaultIssueFilter.SEPARATOR).split(data);
@@ -168,7 +168,7 @@
   }
 
   @VisibleForTesting
-  String mapAsdata(Map<String, Object> map) {
+  final String mapAsdata(Map<String, Object> map) {
     StringBuilder stringBuilder = new StringBuilder();
 
     for (Map.Entry<String, Object> entries : map.entrySet()){
