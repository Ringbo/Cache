diff --git a/src/main/java/com/google/devtools/build/lib/packages/Package.java b/src/main/java/com/google/devtools/build/lib/packages/Package.java
index 5c04220..51a496d 100644
--- a/src/main/java/com/google/devtools/build/lib/packages/Package.java
+++ b/src/main/java/com/google/devtools/build/lib/packages/Package.java
@@ -1331,7 +1331,7 @@
      * an InputFile target.
      */
     void createInputFileMaybe(Label label, Location location) {
-      if (label != null && label.getPackageFragment().equals(pkg.getNameFragment())) {
+      if (label != null && label.getPackageIdentifier().equals(pkg.getPackageIdentifier())) {
         if (!targets.containsKey(label.getName())) {
           addInputFile(label, location);
         }
