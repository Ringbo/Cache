diff --git a/sonar-batch/src/main/java/org/sonar/batch/MavenProjectConverter.java b/sonar-batch/src/main/java/org/sonar/batch/MavenProjectConverter.java
index 0018b1c..b50f882 100644
--- a/sonar-batch/src/main/java/org/sonar/batch/MavenProjectConverter.java
+++ b/sonar-batch/src/main/java/org/sonar/batch/MavenProjectConverter.java
@@ -36,7 +36,7 @@
   private MavenProjectConverter() {
   }
 
-  public static ProjectDefinition convert(List<MavenProject> poms) {
+  public static ProjectDefinition convert(List<MavenProject> poms, MavenProject root) {
     Map<String, MavenProject> paths = Maps.newHashMap(); // projects by canonical path
     Map<MavenProject, ProjectDefinition> defs = Maps.newHashMap();
 
@@ -59,10 +59,13 @@
       throw new SonarException(e);
     }
 
-    return defs.get(poms.get(0));
+    return defs.get(root);
   }
 
-  public static ProjectDefinition convert(MavenProject pom) {
+  /**
+   * Visibility has been relaxed for tests.
+   */
+  static ProjectDefinition convert(MavenProject pom) {
     Properties properties = new Properties();
 
     String key = new StringBuilder().append(pom.getGroupId()).append(":").append(pom.getArtifactId()).toString();
