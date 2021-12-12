diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/BaseCheckTestSupport.java b/src/test/java/com/puppycrawl/tools/checkstyle/BaseCheckTestSupport.java
index 5e89671..a1e40a6 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/BaseCheckTestSupport.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/BaseCheckTestSupport.java
@@ -343,7 +343,7 @@
         final Map<String, ValueDifference<List<String>>> differingViolations =
             violationDifferences.entriesDiffering();
 
-        final StringBuilder message = new StringBuilder();
+        final StringBuilder message = new StringBuilder(256);
         if (!missingViolations.isEmpty()) {
             message.append("missing violations: ").append(missingViolations);
         }
