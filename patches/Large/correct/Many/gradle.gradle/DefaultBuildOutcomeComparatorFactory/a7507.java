diff --git a/subprojects/migration/src/main/groovy/org/gradle/api/plugins/migration/model/compare/internal/DefaultBuildOutcomeComparatorFactory.java b/subprojects/migration/src/main/groovy/org/gradle/api/plugins/migration/model/compare/internal/DefaultBuildOutcomeComparatorFactory.java
index 8aca4f2..2f52660 100644
--- a/subprojects/migration/src/main/groovy/org/gradle/api/plugins/migration/model/compare/internal/DefaultBuildOutcomeComparatorFactory.java
+++ b/subprojects/migration/src/main/groovy/org/gradle/api/plugins/migration/model/compare/internal/DefaultBuildOutcomeComparatorFactory.java
@@ -36,7 +36,7 @@
         }
     }
 
-    void registerComparator(BuildOutcomeComparator<?, ?> comparator) {
+    public void registerComparator(BuildOutcomeComparator<?, ?> comparator) {
         comparators.put(comparator.getComparedType(), comparator);
     }
 }
