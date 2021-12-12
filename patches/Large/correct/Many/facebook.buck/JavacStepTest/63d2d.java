diff --git a/test/com/facebook/buck/jvm/java/JavacStepTest.java b/test/com/facebook/buck/jvm/java/JavacStepTest.java
index dc100fb..b5cd49e 100644
--- a/test/com/facebook/buck/jvm/java/JavacStepTest.java
+++ b/test/com/facebook/buck/jvm/java/JavacStepTest.java
@@ -223,7 +223,7 @@
   public void bootclasspathResolvedToAbsolutePath() throws Exception {
     FakeJavac fakeJavac = new FakeJavac();
     BuildRuleResolver buildRuleResolver =
-        new DefaultBuildRuleResolver(
+        new SingleThreadedBuildRuleResolver(
             TargetGraph.EMPTY, new DefaultTargetNodeToBuildRuleTransformer());
     SourcePathRuleFinder ruleFinder = new SourcePathRuleFinder(buildRuleResolver);
     SourcePathResolver sourcePathResolver = DefaultSourcePathResolver.from(ruleFinder);
