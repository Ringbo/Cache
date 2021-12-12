diff --git a/test/com/facebook/buck/android/DummyRDotJavaTest.java b/test/com/facebook/buck/android/DummyRDotJavaTest.java
index 8b2b161..b18867a 100644
--- a/test/com/facebook/buck/android/DummyRDotJavaTest.java
+++ b/test/com/facebook/buck/android/DummyRDotJavaTest.java
@@ -64,7 +64,7 @@
     ActionGraphBuilder graphBuilder = new TestActionGraphBuilder();
     SourcePathRuleFinder ruleFinder = new SourcePathRuleFinder(graphBuilder);
     SourcePathResolver pathResolver = DefaultSourcePathResolver.from(ruleFinder);
-    BuildRule resourceRule1 =
+    AndroidResource resourceRule1 =
         graphBuilder.addToIndex(
             AndroidResourceRuleBuilder.newBuilder()
                 .setRuleFinder(ruleFinder)
@@ -73,7 +73,7 @@
                 .setRes(FakeSourcePath.of("android_res/com/example/res1"))
                 .build());
     setAndroidResourceBuildOutput(resourceRule1);
-    BuildRule resourceRule2 =
+    AndroidResource resourceRule2 =
         graphBuilder.addToIndex(
             AndroidResourceRuleBuilder.newBuilder()
                 .setRuleFinder(ruleFinder)
@@ -89,8 +89,7 @@
             buildTarget,
             filesystem,
             ruleFinder,
-            ImmutableSet.of(
-                (HasAndroidResourceDeps) resourceRule1, (HasAndroidResourceDeps) resourceRule2),
+            ImmutableSet.of(resourceRule1, resourceRule2),
             new JavacToJarStepFactory(
                 DEFAULT_JAVAC, ANDROID_JAVAC_OPTIONS, ExtraClasspathProvider.EMPTY),
             /* forceFinalResourceIds */ false,
@@ -121,7 +120,7 @@
     String genFolder = Paths.get("buck-out/gen/java/base/").toString();
 
     List<String> sortedSymbolsFiles =
-        Stream.of((AndroidResource) resourceRule1, (AndroidResource) resourceRule2)
+        Stream.of(resourceRule1, resourceRule2)
             .map(Object::toString)
             .collect(ImmutableList.toImmutableList());
     ImmutableSortedSet<Path> javaSourceFiles =
