diff --git a/jps-plugin/test/org/jetbrains/kotlin/jps/build/LookupTrackerTestGenerated.java b/jps-plugin/test/org/jetbrains/kotlin/jps/build/LookupTrackerTestGenerated.java
index 71cee46..1ea148f 100644
--- a/jps-plugin/test/org/jetbrains/kotlin/jps/build/LookupTrackerTestGenerated.java
+++ b/jps-plugin/test/org/jetbrains/kotlin/jps/build/LookupTrackerTestGenerated.java
@@ -32,7 +32,7 @@
 @RunWith(JUnit3RunnerWithInners.class)
 public class LookupTrackerTestGenerated extends AbstractLookupTrackerTest {
     public void testAllFilesPresentInLookupTracker() throws Exception {
-        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/lookupTracker"), Pattern.compile("^([^\\.]+)$"), true);
+        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/lookupTracker"), Pattern.compile("^([^\\.]+)$"), false);
     }
 
     @TestMetadata("classifierMembers")
