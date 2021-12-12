diff --git a/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/issue/IssueTracking.java b/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/issue/IssueTracking.java
index b433614..871239e 100644
--- a/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/issue/IssueTracking.java
+++ b/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/issue/IssueTracking.java
@@ -114,7 +114,7 @@
     HashedSequence<StringText> hashedSource = HashedSequence.wrap(new StringText(source), StringTextComparator.IGNORE_WHITESPACE);
     HashedSequenceComparator<StringText> hashedComparator = new HashedSequenceComparator<StringText>(StringTextComparator.IGNORE_WHITESPACE);
 
-    ViolationTrackingBlocksRecognizer rec = new ViolationTrackingBlocksRecognizer(hashedReference, hashedSource, hashedComparator);
+    IssueTrackingBlocksRecognizer rec = new IssueTrackingBlocksRecognizer(hashedReference, hashedSource, hashedComparator);
 
     Multimap<Integer, DefaultIssue> newIssuesByLines = newIssuesByLines(newIssues, rec, result);
     Multimap<Integer, IssueDto> lastIssuesByLines = lastIssuesByLines(result.unmatched(), rec);
@@ -220,7 +220,7 @@
     }
   }
 
-  private Multimap<Integer, DefaultIssue> newIssuesByLines(Collection<DefaultIssue> newIssues, ViolationTrackingBlocksRecognizer rec, IssueTrackingResult result) {
+  private Multimap<Integer, DefaultIssue> newIssuesByLines(Collection<DefaultIssue> newIssues, IssueTrackingBlocksRecognizer rec, IssueTrackingResult result) {
     Multimap<Integer, DefaultIssue> newIssuesByLines = LinkedHashMultimap.create();
     for (DefaultIssue newIssue : newIssues) {
       if (isNotAlreadyMapped(newIssue, result) && rec.isValidLineInSource(newIssue.line())) {
@@ -230,7 +230,7 @@
     return newIssuesByLines;
   }
 
-  private Multimap<Integer, IssueDto> lastIssuesByLines(Collection<IssueDto> lastIssues, ViolationTrackingBlocksRecognizer rec) {
+  private Multimap<Integer, IssueDto> lastIssuesByLines(Collection<IssueDto> lastIssues, IssueTrackingBlocksRecognizer rec) {
     Multimap<Integer, IssueDto> lastIssuesByLines = LinkedHashMultimap.create();
     for (IssueDto pastIssue : lastIssues) {
       if (rec.isValidLineInReference(pastIssue.getLine())) {
