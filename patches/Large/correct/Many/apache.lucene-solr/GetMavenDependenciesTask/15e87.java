diff --git a/lucene/tools/src/java/org/apache/lucene/dependencies/GetMavenDependenciesTask.java b/lucene/tools/src/java/org/apache/lucene/dependencies/GetMavenDependenciesTask.java
index 4e642ee..45a9d11 100644
--- a/lucene/tools/src/java/org/apache/lucene/dependencies/GetMavenDependenciesTask.java
+++ b/lucene/tools/src/java/org/apache/lucene/dependencies/GetMavenDependenciesTask.java
@@ -640,7 +640,7 @@
       // Pattern.compile("(lucene|solr)/build/(.*)/classes/java");
       String artifact = matcher.group(2);
       artifact = artifact.replace('/', '-');
-      artifact = artifact.replace("(?<!solr-)analysis-", "analyzers-");
+      artifact = artifact.replaceAll("(?<!solr-)analysis-", "analyzers-");
       if ("lucene".equals(matcher.group(1))) {
         artifactId.append("lucene-");
       }
