diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/AbstractModuleTestSupport.java b/src/test/java/com/puppycrawl/tools/checkstyle/AbstractModuleTestSupport.java
index 728ba20..c053c89 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/AbstractModuleTestSupport.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/AbstractModuleTestSupport.java
@@ -249,7 +249,7 @@
         final Map<String, MapDifference.ValueDifference<List<String>>> differingViolations =
                 violationDifferences.entriesDiffering();
 
-        final StringBuilder message = new StringBuilder();
+        final StringBuilder message = new StringBuilder(256);
         if (!missingViolations.isEmpty()) {
             message.append("missing violations: ").append(missingViolations);
         }
