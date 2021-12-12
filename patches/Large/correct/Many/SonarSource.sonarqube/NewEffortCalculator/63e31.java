diff --git a/server/sonar-server/src/main/java/org/sonar/server/computation/issue/NewEffortCalculator.java b/server/sonar-server/src/main/java/org/sonar/server/computation/issue/NewEffortCalculator.java
index fdb07d5..33bb53f 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/computation/issue/NewEffortCalculator.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/computation/issue/NewEffortCalculator.java
@@ -55,7 +55,7 @@
     return calculateFromChangelog(issue, debtChangelog, period.getSnapshotDate());
   }
 
-  private long calculateFromChangelog(DefaultIssue issue, Collection<IssueChangeDto> debtChangelog, long periodDate) {
+  private static long calculateFromChangelog(DefaultIssue issue, Collection<IssueChangeDto> debtChangelog, long periodDate) {
     List<FieldDiffs> debtDiffs = from(debtChangelog).transform(ToFieldDiffs.INSTANCE).filter(HasDebtChange.INSTANCE).toSortedList(CHANGE_ORDERING);
     FieldDiffs currentChange = issue.currentChange();
     if (currentChange != null && HasDebtChange.INSTANCE.apply(currentChange)) {
