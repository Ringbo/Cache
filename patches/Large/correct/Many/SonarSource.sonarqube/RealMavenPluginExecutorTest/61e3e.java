diff --git a/plugins/sonar-maven-batch-plugin/src/test/java/org/sonar/plugins/maven/RealMavenPluginExecutorTest.java b/plugins/sonar-maven-batch-plugin/src/test/java/org/sonar/plugins/maven/RealMavenPluginExecutorTest.java
index ae359d9..74a9de5 100644
--- a/plugins/sonar-maven-batch-plugin/src/test/java/org/sonar/plugins/maven/RealMavenPluginExecutorTest.java
+++ b/plugins/sonar-maven-batch-plugin/src/test/java/org/sonar/plugins/maven/RealMavenPluginExecutorTest.java
@@ -57,7 +57,7 @@
   public void should_reset_file_system_after_execution() {
     RealMavenPluginExecutor executor = new RealMavenPluginExecutor(null, null) {
       @Override
-      public void concreteExecute(MavenProject pom, String goal) throws Exception {
+      public void concreteExecute(MavenProject pom, String goal) {
         pom.addCompileSourceRoot("src/java");
       }
     };
@@ -76,7 +76,7 @@
   public void should_ignore_non_maven_projects() {
     RealMavenPluginExecutor executor = new RealMavenPluginExecutor(null, null) {
       @Override
-      public void concreteExecute(MavenProject pom, String goal) throws Exception {
+      public void concreteExecute(MavenProject pom, String goal) {
         pom.addCompileSourceRoot("src/java");
       }
     };
