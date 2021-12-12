diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/issue/RuleTagsCopierTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/issue/RuleTagsCopierTest.java
index becc308..4a41e6d 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/issue/RuleTagsCopierTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/issue/RuleTagsCopierTest.java
@@ -41,7 +41,7 @@
   RuleTagsCopier underTest = new RuleTagsCopier(ruleRepository);
 
   @Test
-  public void copy_tags_if_new_rule() throws Exception {
+  public void copy_tags_if_new_rule() {
     rule.setTags(Sets.newHashSet("bug", "performance"));
     issue.setNew(true);
 
@@ -51,7 +51,7 @@
   }
 
   @Test
-  public void do_not_copy_tags_if_existing_rule() throws Exception {
+  public void do_not_copy_tags_if_existing_rule() {
     rule.setTags(Sets.newHashSet("bug", "performance"));
     issue.setNew(false).setTags(asList("misra"));
 
@@ -61,7 +61,7 @@
   }
 
   @Test
-  public void do_not_copy_tags_if_existing_rule_without_tags() throws Exception {
+  public void do_not_copy_tags_if_existing_rule_without_tags() {
     rule.setTags(Sets.newHashSet("bug", "performance"));
     issue.setNew(false).setTags(Collections.<String>emptyList());
 
