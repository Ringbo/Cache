diff --git a/plugins/sonar-maven-batch-plugin/src/main/java/org/sonar/plugins/maven/DefaultMavenPluginExecutor.java b/plugins/sonar-maven-batch-plugin/src/main/java/org/sonar/plugins/maven/DefaultMavenPluginExecutor.java
index a47dfc8..1b7f96a 100644
--- a/plugins/sonar-maven-batch-plugin/src/main/java/org/sonar/plugins/maven/DefaultMavenPluginExecutor.java
+++ b/plugins/sonar-maven-batch-plugin/src/main/java/org/sonar/plugins/maven/DefaultMavenPluginExecutor.java
@@ -92,7 +92,7 @@
         .toString();
   }
 
-  public void concreteExecute(MavenProject pom, String goal) throws SecurityException {
+  public void concreteExecute(MavenProject pom, String goal) {
     Method executeMethod = null;
     for (Method m : lifecycleExecutor.getClass().getMethods()) {
       if ("execute".equals(m.getName())) {
