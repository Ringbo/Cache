diff --git a/aether-dependency-resolver/src/org/jetbrains/idea/maven/aether/ArtifactRepositoryManager.java b/aether-dependency-resolver/src/org/jetbrains/idea/maven/aether/ArtifactRepositoryManager.java
index b0fd2a6..9c808fc 100644
--- a/aether-dependency-resolver/src/org/jetbrains/idea/maven/aether/ArtifactRepositoryManager.java
+++ b/aether-dependency-resolver/src/org/jetbrains/idea/maven/aether/ArtifactRepositoryManager.java
@@ -275,18 +275,18 @@
    * @param constraint - version or range constraint of original library
    * @return resulting relaxed constraint to select annotations artifact.
    */
-  private Set<VersionConstraint> relaxForAnnotations(VersionConstraint constraint) {
+  private static Set<VersionConstraint> relaxForAnnotations(VersionConstraint constraint) {
     String annotationsConstraint = constraint.toString();
 
     final Version version = constraint.getVersion();
     if (version != null) {
-      final String major = version.toString().split("\\.|-|_")[0];
+      final String major = version.toString().split("[.\\-_]")[0];
       annotationsConstraint = "[" + major + ", " + version.toString() + "-an10000]";
     }
 
     final VersionRange range = constraint.getRange();
     if (range != null) {
-      final String majorLower = range.getLowerBound().getVersion().toString().split("\\.|-|_")[0];
+      final String majorLower = range.getLowerBound().getVersion().toString().split("[.\\-_]")[0];
 
       String upper = range.getUpperBound().isInclusive()
                      ? range.getUpperBound().toString() + "-an10000]"
