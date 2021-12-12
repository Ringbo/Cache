diff --git a/subprojects/migration/src/main/groovy/org/gradle/api/plugins/migration/model/compare/internal/BuildComparisonSpecFactory.java b/subprojects/migration/src/main/groovy/org/gradle/api/plugins/migration/model/compare/internal/BuildComparisonSpecFactory.java
index f5ecea7..60bffee 100644
--- a/subprojects/migration/src/main/groovy/org/gradle/api/plugins/migration/model/compare/internal/BuildComparisonSpecFactory.java
+++ b/subprojects/migration/src/main/groovy/org/gradle/api/plugins/migration/model/compare/internal/BuildComparisonSpecFactory.java
@@ -32,7 +32,7 @@
         this.associator = associator;
     }
 
-    BuildComparisonSpec createSpec(Set<BuildOutcome> from, Set<BuildOutcome> to) {
+    public BuildComparisonSpec createSpec(Set<BuildOutcome> from, Set<BuildOutcome> to) {
         BuildComparisonSpecBuilder builder = new DefaultBuildComparisonSpecBuilder();
 
         Set<BuildOutcome> toCopy = new HashSet<BuildOutcome>(to);
