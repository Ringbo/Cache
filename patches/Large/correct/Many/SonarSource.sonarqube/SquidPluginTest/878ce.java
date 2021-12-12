diff --git a/plugins/sonar-squid-java-plugin/src/test/java/org/sonar/plugins/squid/SquidPluginTest.java b/plugins/sonar-squid-java-plugin/src/test/java/org/sonar/plugins/squid/SquidPluginTest.java
index cd3341b..12a6cbe 100644
--- a/plugins/sonar-squid-java-plugin/src/test/java/org/sonar/plugins/squid/SquidPluginTest.java
+++ b/plugins/sonar-squid-java-plugin/src/test/java/org/sonar/plugins/squid/SquidPluginTest.java
@@ -29,8 +29,8 @@
 public class SquidPluginTest {
 
   @Test
-  public void justForCoverage() {
+  public void coverageForFun() {
     assertThat(new SquidPlugin().getKey(), not(nullValue()));
-    assertThat(new SquidPlugin().getExtensions().size(), is(3));
+    assertThat(new SquidPlugin().getExtensions().size(), is(4));
   }
 }
