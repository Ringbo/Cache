diff --git a/idea/tests/org/jetbrains/kotlin/idea/navigation/GotoSuperTestGenerated.java b/idea/tests/org/jetbrains/kotlin/idea/navigation/GotoSuperTestGenerated.java
index 8dd99f0..23a7d80 100644
--- a/idea/tests/org/jetbrains/kotlin/idea/navigation/GotoSuperTestGenerated.java
+++ b/idea/tests/org/jetbrains/kotlin/idea/navigation/GotoSuperTestGenerated.java
@@ -22,7 +22,7 @@
 @RunWith(JUnit3RunnerWithInners.class)
 public class GotoSuperTestGenerated extends AbstractGotoSuperTest {
     public void testAllFilesPresentInGotoSuper() throws Exception {
-        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/navigation/gotoSuper"), Pattern.compile("^(.+)\\.test$"), TargetBackend.ANY, true);
+        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/navigation/gotoSuper"), Pattern.compile("^(.+)\\.test$"), TargetBackend.ANY, false);
     }
 
     @TestMetadata("BadPositionLambdaParameter.test")
