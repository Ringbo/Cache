diff --git a/platform/testFramework/src/com/intellij/testFramework/fixtures/CodeInsightTestUtil.java b/platform/testFramework/src/com/intellij/testFramework/fixtures/CodeInsightTestUtil.java
index c279454..c0bade0 100644
--- a/platform/testFramework/src/com/intellij/testFramework/fixtures/CodeInsightTestUtil.java
+++ b/platform/testFramework/src/com/intellij/testFramework/fixtures/CodeInsightTestUtil.java
@@ -169,7 +169,7 @@
   public static void doSmartEnterTest(@NotNull final CodeInsightTestFixture fixture,
                                       @NotNull final String before, @NotNull final String after) {
     fixture.configureByFile(before);
-    final List<SmartEnterProcessor> processors = SmartEnterProcessors.INSTANCE.forKey(fixture.getFile().getLanguage());
+    final List<SmartEnterProcessor> processors = SmartEnterProcessors.INSTANCE.allForLanguage(fixture.getFile().getLanguage());
     new WriteCommandAction(fixture.getProject()) {
       @Override
       protected void run(@NotNull Result result) throws Throwable {
