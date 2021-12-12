diff --git a/sonar-core/src/test/java/org/sonar/core/rule/RuleKeyFunctionsTest.java b/sonar-core/src/test/java/org/sonar/core/rule/RuleKeyFunctionsTest.java
index cf430a1..46ac1d8 100644
--- a/sonar-core/src/test/java/org/sonar/core/rule/RuleKeyFunctionsTest.java
+++ b/sonar-core/src/test/java/org/sonar/core/rule/RuleKeyFunctionsTest.java
@@ -32,7 +32,7 @@
 public class RuleKeyFunctionsTest {
 
   @Test
-  public void stringToRuleKey() throws Exception {
+  public void stringToRuleKey() {
     Collection<String> strings = Arrays.asList("js:S001", "java:S002");
     List<RuleKey> keys = from(strings).transform(RuleKeyFunctions.stringToRuleKey()).toList();
 
@@ -40,7 +40,7 @@
   }
 
   @Test
-  public void on_static_methods() throws Exception {
+  public void on_static_methods() {
     assertThat(TestUtils.hasOnlyPrivateConstructors(RuleKeyFunctions.class)).isTrue();
   }
 }
