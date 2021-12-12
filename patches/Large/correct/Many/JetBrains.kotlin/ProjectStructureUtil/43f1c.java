diff --git a/idea/idea-analysis/src/org/jetbrains/kotlin/idea/project/ProjectStructureUtil.java b/idea/idea-analysis/src/org/jetbrains/kotlin/idea/project/ProjectStructureUtil.java
index cd75d93..3cbda09 100644
--- a/idea/idea-analysis/src/org/jetbrains/kotlin/idea/project/ProjectStructureUtil.java
+++ b/idea/idea-analysis/src/org/jetbrains/kotlin/idea/project/ProjectStructureUtil.java
@@ -67,7 +67,7 @@
 
     @Nullable
     private static TargetPlatform getPlatformConfiguredInFacet(@NotNull Module module) {
-        KotlinFacetSettings settings = KotlinFacetSettingsProvider.Companion.getInstance(module.getProject()).getSettings(module);
+        KotlinFacetSettings settings = KotlinFacetSettingsProvider.Companion.getInstance(module.getProject()).getInitializedSettings(module);
         TargetPlatformKind<?> kind = settings.getTargetPlatformKind();
         if (kind instanceof TargetPlatformKind.Jvm) {
             return JvmPlatform.INSTANCE;
