diff --git a/plugins/gradle/src/org/jetbrains/plugins/gradle/service/project/GradleProjectResolver.java b/plugins/gradle/src/org/jetbrains/plugins/gradle/service/project/GradleProjectResolver.java
index 142e0ae..8a2ffaa 100644
--- a/plugins/gradle/src/org/jetbrains/plugins/gradle/service/project/GradleProjectResolver.java
+++ b/plugins/gradle/src/org/jetbrains/plugins/gradle/service/project/GradleProjectResolver.java
@@ -357,7 +357,7 @@
 
   @NotNull
   public static GradleProjectResolverExtension createProjectResolverChain(@Nullable final GradleExecutionSettings settings) {
-    final GradleProjectResolverExtension projectResolverChain;
+    GradleProjectResolverExtension projectResolverChain;
     if (settings != null) {
       List<ClassHolder<? extends GradleProjectResolverExtension>> extensionClasses = settings.getResolverExtensions();
 
