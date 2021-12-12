diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ErrorHandlingConfigurationResolver.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ErrorHandlingConfigurationResolver.java
index 0424a1b..0430ef5 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ErrorHandlingConfigurationResolver.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ErrorHandlingConfigurationResolver.java
@@ -60,7 +60,7 @@
     public void resolveBuildDependencies(ConfigurationInternal configuration, ResolverResults results) {
         try {
             delegate.resolveBuildDependencies(configuration, results);
-        } catch (Throwable e) {
+        } catch (Exception e) {
             results.failed(wrapException(e, configuration));
             BrokenResolvedConfiguration broken = new BrokenResolvedConfiguration(e, configuration);
             results.artifactsResolved(broken, broken);
@@ -71,7 +71,7 @@
     public void resolveGraph(ConfigurationInternal configuration, ResolverResults results) throws ResolveException {
         try {
             delegate.resolveGraph(configuration, results);
-        } catch (Throwable e) {
+        } catch (Exception e) {
             results.failed(wrapException(e, configuration));
             BrokenResolvedConfiguration broken = new BrokenResolvedConfiguration(e, configuration);
             results.artifactsResolved(broken, broken);
@@ -86,7 +86,7 @@
     public void resolveArtifacts(ConfigurationInternal configuration, ResolverResults results) throws ResolveException {
         try {
             delegate.resolveArtifacts(configuration, results);
-        } catch (Throwable e) {
+        } catch (Exception e) {
             BrokenResolvedConfiguration broken = new BrokenResolvedConfiguration(e, configuration);
             results.artifactsResolved(broken, broken);
             return;
@@ -125,7 +125,7 @@
         public Set<ResolvedArtifact> getArtifacts(Spec<? super Dependency> dependencySpec) {
             try {
                 return lenientConfiguration.getArtifacts(dependencySpec);
-            } catch (Throwable e) {
+            } catch (Exception e) {
                 throw wrapException(e, resolveContext);
             }
         }
@@ -134,7 +134,7 @@
         public Set<ResolvedDependency> getFirstLevelModuleDependencies() {
             try {
                 return lenientConfiguration.getFirstLevelModuleDependencies();
-            } catch (Throwable e) {
+            } catch (Exception e) {
                 throw wrapException(e, resolveContext);
             }
         }
@@ -143,7 +143,7 @@
         public Set<ResolvedDependency> getFirstLevelModuleDependencies(Spec<? super Dependency> dependencySpec) {
             try {
                 return lenientConfiguration.getFirstLevelModuleDependencies(dependencySpec);
-            } catch (Throwable e) {
+            } catch (Exception e) {
                 throw wrapException(e, resolveContext);
             }
         }
@@ -152,7 +152,7 @@
         public Set<ResolvedDependency> getAllModuleDependencies() {
             try {
                 return lenientConfiguration.getAllModuleDependencies();
-            } catch (Throwable e) {
+            } catch (Exception e) {
                 throw wrapException(e, resolveContext);
             }
         }
@@ -161,7 +161,7 @@
         public Set<UnresolvedDependency> getUnresolvedModuleDependencies() {
             try {
                 return lenientConfiguration.getUnresolvedModuleDependencies();
-            } catch (Throwable e) {
+            } catch (Exception e) {
                 throw wrapException(e, resolveContext);
             }
         }
@@ -179,7 +179,7 @@
         public Set<File> getFiles(Spec<? super Dependency> dependencySpec) {
             try {
                 return lenientConfiguration.getFiles(dependencySpec);
-            } catch (Throwable e) {
+            } catch (Exception e) {
                 throw wrapException(e, resolveContext);
             }
         }
@@ -197,7 +197,7 @@
         public ResolvedComponentResult getRoot() {
             try {
                 return resolutionResult.getRoot();
-            } catch (Throwable e) {
+            } catch (Exception e) {
                 throw wrapException(e, resolveContext);
             }
         }
@@ -209,7 +209,7 @@
         public Set<? extends DependencyResult> getAllDependencies() {
             try {
                 return resolutionResult.getAllDependencies();
-            } catch (Throwable e) {
+            } catch (Exception e) {
                 throw wrapException(e, resolveContext);
             }
         }
@@ -221,7 +221,7 @@
         public Set<ResolvedComponentResult> getAllComponents() {
             try {
                 return resolutionResult.getAllComponents();
-            } catch (Throwable e) {
+            } catch (Exception e) {
                 throw wrapException(e, resolveContext);
             }
         }
@@ -252,7 +252,7 @@
         public LenientConfiguration getLenientConfiguration() {
             try {
                 return new ErrorHandlingLenientConfiguration(resolvedConfiguration.getLenientConfiguration(), configuration);
-            } catch (Throwable e) {
+            } catch (Exception e) {
                 throw wrapException(e, configuration);
             }
         }
@@ -260,7 +260,7 @@
         public void rethrowFailure() throws ResolveException {
             try {
                 resolvedConfiguration.rethrowFailure();
-            } catch (Throwable e) {
+            } catch (Exception e) {
                 throw wrapException(e, configuration);
             }
         }
@@ -277,7 +277,7 @@
         public Set<File> getFiles(Spec<? super Dependency> dependencySpec) throws ResolveException {
             try {
                 return resolvedConfiguration.getFiles(dependencySpec);
-            } catch (Throwable e) {
+            } catch (Exception e) {
                 throw wrapException(e, configuration);
             }
         }
@@ -285,7 +285,7 @@
         public Set<ResolvedDependency> getFirstLevelModuleDependencies() throws ResolveException {
             try {
                 return resolvedConfiguration.getFirstLevelModuleDependencies();
-            } catch (Throwable e) {
+            } catch (Exception e) {
                 throw wrapException(e, configuration);
             }
         }
@@ -293,7 +293,7 @@
         public Set<ResolvedDependency> getFirstLevelModuleDependencies(Spec<? super Dependency> dependencySpec) throws ResolveException {
             try {
                 return resolvedConfiguration.getFirstLevelModuleDependencies(dependencySpec);
-            } catch (Throwable e) {
+            } catch (Exception e) {
                 throw wrapException(e, configuration);
             }
         }
@@ -301,7 +301,7 @@
         public Set<ResolvedArtifact> getResolvedArtifacts() throws ResolveException {
             try {
                 return resolvedConfiguration.getResolvedArtifacts();
-            } catch (Throwable e) {
+            } catch (Exception e) {
                 throw wrapException(e, configuration);
             }
         }
