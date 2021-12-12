diff --git a/src/test/java/com/google/devtools/build/lib/skyframe/TreeArtifactBuildTest.java b/src/test/java/com/google/devtools/build/lib/skyframe/TreeArtifactBuildTest.java
index 5239f06..b2359d9 100644
--- a/src/test/java/com/google/devtools/build/lib/skyframe/TreeArtifactBuildTest.java
+++ b/src/test/java/com/google/devtools/build/lib/skyframe/TreeArtifactBuildTest.java
@@ -138,7 +138,7 @@
     TouchingTestAction actionOne = new TouchingTestAction(outOneFileOne, outOneFileTwo);
     registerAction(actionOne);
 
-    Artifact normalOutput = createDerivedArtifact("normal/out");
+    final Artifact normalOutput = createDerivedArtifact("normal/out");
     Action testAction = new TestAction(
         TestAction.NO_EFFECT, ImmutableList.of(outOne), ImmutableList.of(normalOutput)) {
       @Override
