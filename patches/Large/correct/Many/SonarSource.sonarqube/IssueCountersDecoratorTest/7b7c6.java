diff --git a/plugins/sonar-core-plugin/src/test/java/org/sonar/plugins/core/issue/IssueCountersDecoratorTest.java b/plugins/sonar-core-plugin/src/test/java/org/sonar/plugins/core/issue/IssueCountersDecoratorTest.java
index af6dfb4..572f983 100644
--- a/plugins/sonar-core-plugin/src/test/java/org/sonar/plugins/core/issue/IssueCountersDecoratorTest.java
+++ b/plugins/sonar-core-plugin/src/test/java/org/sonar/plugins/core/issue/IssueCountersDecoratorTest.java
@@ -111,7 +111,7 @@
 
   @Test
   public void should_be_depended_upon_metric() {
-    assertThat(decorator.generatesIssuesMetrics()).hasSize(16);
+    assertThat(decorator.generatesIssuesMetrics()).hasSize(14);
   }
 
   @Test
