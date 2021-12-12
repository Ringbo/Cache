diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/runner/execution/MavenRunConfigurationType.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/runner/execution/MavenRunConfigurationType.java
index e90f42d..5c361c1 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/runner/execution/MavenRunConfigurationType.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/runner/execution/MavenRunConfigurationType.java
@@ -37,7 +37,7 @@
   /**
    * reflection
    */
-  MavenRunConfigurationType() {
+  public MavenRunConfigurationType() {
     myFactory = new ConfigurationFactory(this) {
       public RunConfiguration createTemplateConfiguration(Project project) {
         return new MavenRunConfiguration(project, this, "");
