diff --git a/test/com/facebook/buck/apple/xcode/ProjectGeneratorTest.java b/test/com/facebook/buck/apple/xcode/ProjectGeneratorTest.java
index 63ab3dd..4801b0f 100644
--- a/test/com/facebook/buck/apple/xcode/ProjectGeneratorTest.java
+++ b/test/com/facebook/buck/apple/xcode/ProjectGeneratorTest.java
@@ -644,7 +644,7 @@
     assertEquals(Optional.of("wrapper.cfbundle"), productReference.getExplicitFileType());
 
     assertHasConfigurations(target, "Debug");
-    assertEquals("Should have exact number of build phases", 3, target.getBuildPhases().size());
+    assertEquals("Should have exact number of build phases", 4, target.getBuildPhases().size());
     assertHasSingletonSourcesPhaseWithSourcesAndFlags(
         target, ImmutableMap.of(
         "foo.m", Optional.of("-foo")));
@@ -692,7 +692,7 @@
     assertEquals(Optional.of("wrapper.cfbundle"), productReference.getExplicitFileType());
 
     assertHasConfigurations(target, "Debug");
-    assertEquals("Should have exact number of build phases", 3, target.getBuildPhases().size());
+    assertEquals("Should have exact number of build phases", 4, target.getBuildPhases().size());
     assertHasSingletonSourcesPhaseWithSourcesAndFlags(
         target, ImmutableMap.of(
         "foo.m", Optional.of("-foo")));
