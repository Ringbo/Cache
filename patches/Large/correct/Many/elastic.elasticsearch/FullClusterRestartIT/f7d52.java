diff --git a/qa/full-cluster-restart/src/test/java/org/elasticsearch/xpack/restart/FullClusterRestartIT.java b/qa/full-cluster-restart/src/test/java/org/elasticsearch/xpack/restart/FullClusterRestartIT.java
index 0833d81..21de7cb 100644
--- a/qa/full-cluster-restart/src/test/java/org/elasticsearch/xpack/restart/FullClusterRestartIT.java
+++ b/qa/full-cluster-restart/src/test/java/org/elasticsearch/xpack/restart/FullClusterRestartIT.java
@@ -251,7 +251,7 @@
     public void testSqlFailsOnIndexWithTwoTypes() throws IOException {
         // TODO this isn't going to trigger until we backport to 6.1
         assumeTrue("It is only possible to build an index that sql doesn't like before 6.0.0",
-                oldClusterVersion.onOrAfter(Version.V_6_0_0_alpha1));
+                oldClusterVersion.before(Version.V_6_0_0_alpha1));
         if (runningAgainstOldCluster) {
             client().performRequest("POST", "/testsqlfailsonindexwithtwotypes/type1", emptyMap(),
                     new StringEntity("{}", ContentType.APPLICATION_JSON));
