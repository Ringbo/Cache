diff --git a/subprojects/ide/src/main/java/org/gradle/plugins/ide/internal/resolver/DefaultIdeDependencyResolver.java b/subprojects/ide/src/main/java/org/gradle/plugins/ide/internal/resolver/DefaultIdeDependencyResolver.java
index e73836c..05341d1 100644
--- a/subprojects/ide/src/main/java/org/gradle/plugins/ide/internal/resolver/DefaultIdeDependencyResolver.java
+++ b/subprojects/ide/src/main/java/org/gradle/plugins/ide/internal/resolver/DefaultIdeDependencyResolver.java
@@ -167,7 +167,7 @@
         List<IdeLocalFileDependency> ideLocalFileDependencies = new ArrayList<IdeLocalFileDependency>();
 
         for (SelfResolvingDependency externalDependency : externalDependencies) {
-            Set<File> resolvedFiles = externalDependency.resolve();
+            Set<File> resolvedFiles = externalDependency.resolve(configuration.isTransitive());
 
             for (File resolvedFile : resolvedFiles) {
                 IdeLocalFileDependency ideLocalFileDependency = new IdeLocalFileDependency(resolvedFile);
@@ -188,7 +188,7 @@
         for (Dependency dependency : configuration.getAllDependencies()) {
             if(!visited.contains(dependency)){
                 visited.add(dependency);
-                if(dependency instanceof ProjectDependency) {
+                if(dependency instanceof ProjectDependency && configuration.isTransitive()) {
                     findAllExternalDependencies(externalDependencies, visited, getTargetConfiguration((ProjectDependency) dependency));
                 } else if (dependency instanceof SelfResolvingDependency) {
                     externalDependencies.add((SelfResolvingDependency) dependency);
