diff --git a/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/atom/CheckResult.java b/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/atom/CheckResult.java
index 6b1e215..2bca61c 100644
--- a/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/atom/CheckResult.java
+++ b/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/atom/CheckResult.java
@@ -29,7 +29,7 @@
   private final List<ChangeAnalysis> checkResults;
   private final long latestDiffId;
 
-  public CheckResult(List<ChangeAnalysis> checkResults, long latestDiffId) {
+  CheckResult(List<ChangeAnalysis> checkResults, long latestDiffId) {
     this.checkResults = Objects.requireNonNull(checkResults);
     if (latestDiffId < 0) {
       throw new IllegalArgumentException("latestDiffId must be >= 0: " + latestDiffId);
