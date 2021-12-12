diff --git a/platform/testFramework/src/com/intellij/testFramework/fixtures/LightPlatformCodeInsightFixtureTestCase.java b/platform/testFramework/src/com/intellij/testFramework/fixtures/LightPlatformCodeInsightFixtureTestCase.java
index cfaf4d3..47205a5 100644
--- a/platform/testFramework/src/com/intellij/testFramework/fixtures/LightPlatformCodeInsightFixtureTestCase.java
+++ b/platform/testFramework/src/com/intellij/testFramework/fixtures/LightPlatformCodeInsightFixtureTestCase.java
@@ -40,8 +40,7 @@
 public abstract class LightPlatformCodeInsightFixtureTestCase extends UsefulTestCase {
   @SuppressWarnings("JUnitTestCaseWithNonTrivialConstructors")
   public LightPlatformCodeInsightFixtureTestCase() {
-    //PlatformTestCase.autodetectPlatformPrefix();
-    PlatformTestCase.initPlatformLangPrefix();
+    PlatformTestCase.autodetectPlatformPrefix();
   }
 
   protected CodeInsightTestFixture myFixture;
