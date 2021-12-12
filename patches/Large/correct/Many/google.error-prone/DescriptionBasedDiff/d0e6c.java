diff --git a/check_api/src/main/java/com/google/errorprone/apply/DescriptionBasedDiff.java b/check_api/src/main/java/com/google/errorprone/apply/DescriptionBasedDiff.java
index 6d34e79..0e704ba 100644
--- a/check_api/src/main/java/com/google/errorprone/apply/DescriptionBasedDiff.java
+++ b/check_api/src/main/java/com/google/errorprone/apply/DescriptionBasedDiff.java
@@ -99,7 +99,7 @@
     importsToRemove.addAll(fix.getImportsToRemove());
     for (Replacement replacement : fix.getReplacements(endPositions)) {
       try {
-        replacements.add(replacement);
+        replacements.add(replacement, Replacements.CoalescePolicy.EXISTING_FIRST);
       } catch (IllegalArgumentException iae) {
         if (!ignoreOverlappingFixes) {
           throw iae;
