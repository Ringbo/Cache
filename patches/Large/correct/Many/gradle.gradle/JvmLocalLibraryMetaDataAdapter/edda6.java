diff --git a/subprojects/platform-jvm/src/main/java/org/gradle/api/internal/resolve/JvmLocalLibraryMetaDataAdapter.java b/subprojects/platform-jvm/src/main/java/org/gradle/api/internal/resolve/JvmLocalLibraryMetaDataAdapter.java
index 52da30a..56797cd 100644
--- a/subprojects/platform-jvm/src/main/java/org/gradle/api/internal/resolve/JvmLocalLibraryMetaDataAdapter.java
+++ b/subprojects/platform-jvm/src/main/java/org/gradle/api/internal/resolve/JvmLocalLibraryMetaDataAdapter.java
@@ -64,7 +64,7 @@
     }
 
     private static List<DependencySpec> collectDependencies(JarBinarySpecInternal binary) {
-        final List<DependencySpec> dependencies = Lists.newArrayList();
+        final List<DependencySpec> dependencies = Lists.newArrayList(binary.getApiDependencies());
         Iterable<LanguageSourceSet> sourceSets = Iterables.concat(binary.getLibrary().getSources().values(), binary.getSources().values());
         for (LanguageSourceSet sourceSet : sourceSets) {
             if (sourceSet instanceof DependentSourceSet) {
