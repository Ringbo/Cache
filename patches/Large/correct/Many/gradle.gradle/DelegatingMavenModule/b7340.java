diff --git a/subprojects/internal-integ-testing/src/main/groovy/org/gradle/test/fixtures/maven/DelegatingMavenModule.java b/subprojects/internal-integ-testing/src/main/groovy/org/gradle/test/fixtures/maven/DelegatingMavenModule.java
index 3ac7150..6ef8096 100644
--- a/subprojects/internal-integ-testing/src/main/groovy/org/gradle/test/fixtures/maven/DelegatingMavenModule.java
+++ b/subprojects/internal-integ-testing/src/main/groovy/org/gradle/test/fixtures/maven/DelegatingMavenModule.java
@@ -48,7 +48,7 @@
     }
 
     @Override
-    public MavenModule dependsOnModules(String... dependencyArtifactIds) {
+    public T dependsOnModules(String... dependencyArtifactIds) {
         backingModule.dependsOnModules(dependencyArtifactIds);
         return t();
     }
@@ -66,13 +66,13 @@
     }
 
     @Override
-    public MavenModule dependsOn(Module module) {
+    public T dependsOn(Module module) {
         backingModule.dependsOn(module);
         return t();
     }
 
     @Override
-    public MavenModule dependsOn(Map<String, ?> attributes, Module module) {
+    public T dependsOn(Map<String, ?> attributes, Module module) {
         backingModule.dependsOn(attributes, module);
         return t();
     }
