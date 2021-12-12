diff --git a/sonar-maven-plugin/src/main/java/org/sonar/maven/SonarMojo.java b/sonar-maven-plugin/src/main/java/org/sonar/maven/SonarMojo.java
index b3bbc9b..f17d1bf 100644
--- a/sonar-maven-plugin/src/main/java/org/sonar/maven/SonarMojo.java
+++ b/sonar-maven-plugin/src/main/java/org/sonar/maven/SonarMojo.java
@@ -181,8 +181,7 @@
         .mask("org.sonar.")
         // Include everything else
         .unmask("");
-      runner.addExtensions(session, getLog(), lifecycleExecutor, artifactFactory, localRepository, artifactMetadataSource, artifactCollector,
-        dependencyTreeBuilder, projectBuilder);
+      runner.addExtensions(session, getLog(), lifecycleExecutor, projectBuilder);
       if (getLog().isDebugEnabled()) {
         runner.setProperty("sonar.verbose", "true");
       }
@@ -300,9 +299,9 @@
 
   private void serializeDep(StringBuilder json, Dependency dependency) {
     json.append("{");
-    json.append("\"k\":");
+    json.append("\"k\":\"");
     json.append(dependency.key());
-    json.append(",\"v\":\"");
+    json.append("\",\"v\":\"");
     json.append(dependency.version());
     json.append("\",\"s\":\"");
     json.append(dependency.scope());
