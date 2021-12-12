diff --git a/sonar-core/src/test/java/org/sonar/core/issue/tracking/TrackerTest.java b/sonar-core/src/test/java/org/sonar/core/issue/tracking/TrackerTest.java
index 79a77fb..681c2d3 100644
--- a/sonar-core/src/test/java/org/sonar/core/issue/tracking/TrackerTest.java
+++ b/sonar-core/src/test/java/org/sonar/core/issue/tracking/TrackerTest.java
@@ -159,7 +159,7 @@
   }
 
   @Test
-  public void do_not_fail_if_base_issue_without_line() throws Exception {
+  public void do_not_fail_if_base_issue_without_line() {
     FakeInput baseInput = new FakeInput("H1", "H2");
     Issue base = baseInput.createIssueOnLine(1, RULE_SYSTEM_PRINT, "msg1");
 
@@ -172,7 +172,7 @@
   }
 
   @Test
-  public void do_not_fail_if_raw_issue_without_line() throws Exception {
+  public void do_not_fail_if_raw_issue_without_line() {
     FakeInput baseInput = new FakeInput("H1", "H2");
     Issue base = baseInput.createIssue(RULE_SYSTEM_PRINT, "msg1");
 
@@ -185,7 +185,7 @@
   }
 
   @Test
-  public void do_not_fail_if_raw_line_does_not_exist() throws Exception {
+  public void do_not_fail_if_raw_line_does_not_exist() {
     FakeInput baseInput = new FakeInput();
     FakeInput rawInput = new FakeInput("H1").addIssue(new Issue(200, "H200", RULE_SYSTEM_PRINT, "msg"));
 
@@ -198,7 +198,7 @@
    * SONAR-3072
    */
   @Test
-  public void recognize_blocks_1() throws Exception {
+  public void recognize_blocks_1() {
     FakeInput baseInput = FakeInput.createForSourceLines(
       "package example1;",
       "",
@@ -257,7 +257,7 @@
    * SONAR-3072
    */
   @Test
-  public void recognize_blocks_2() throws Exception {
+  public void recognize_blocks_2() {
     FakeInput baseInput = FakeInput.createForSourceLines(
       "package example2;",
       "",
@@ -298,7 +298,7 @@
   }
 
   @Test
-  public void recognize_blocks_3() throws Exception {
+  public void recognize_blocks_3() {
     FakeInput baseInput = FakeInput.createForSourceLines(
       "package sample;",
       "",
