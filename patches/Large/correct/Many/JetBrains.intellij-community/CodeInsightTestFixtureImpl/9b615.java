diff --git a/platform/testFramework/src/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java b/platform/testFramework/src/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java
index a433cca..f188bfd 100644
--- a/platform/testFramework/src/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java
+++ b/platform/testFramework/src/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java
@@ -407,7 +407,7 @@
   @Override
   public long checkHighlighting(final boolean checkWarnings, final boolean checkInfos, final boolean checkWeakWarnings, boolean ignoreExtraHighlighting) {
     try {
-      return collectAndCheckHighlighting(checkWarnings, checkInfos, checkWeakWarnings);
+      return collectAndCheckHighlighting(checkWarnings, checkInfos, checkWeakWarnings, ignoreExtraHighlighting);
     }
     catch (Exception e) {
       throw new RuntimeException(e);
@@ -1501,8 +1501,7 @@
   private long collectAndCheckHighlighting(boolean checkWarnings, boolean checkInfos, boolean checkWeakWarnings, 
                                            boolean ignoreExtraHighlighting) throws Exception {
     ExpectedHighlightingData data = new ExpectedHighlightingData(myEditor.getDocument(), 
-                                                                 checkWarnings, checkWeakWarnings, ignoreExtraHighlighting, 
-                                                                 checkInfos, getHostFile());
+                                                                 checkWarnings, checkWeakWarnings, checkInfos, ignoreExtraHighlighting, getHostFile());
     data.init();
     return collectAndCheckHighlighting(data);
   }
