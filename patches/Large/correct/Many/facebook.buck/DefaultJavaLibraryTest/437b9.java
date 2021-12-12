diff --git a/test/com/facebook/buck/jvm/java/DefaultJavaLibraryTest.java b/test/com/facebook/buck/jvm/java/DefaultJavaLibraryTest.java
index 5753073..8d92d1d 100644
--- a/test/com/facebook/buck/jvm/java/DefaultJavaLibraryTest.java
+++ b/test/com/facebook/buck/jvm/java/DefaultJavaLibraryTest.java
@@ -149,9 +149,9 @@
     Path src = Paths.get(folder, "Main.java");
     tmp.newFile(src.toString());
 
-    BuildRule libraryRule =
+    DefaultJavaLibrary libraryRule =
         AndroidLibraryBuilder.createBuilder(buildTarget).addSrc(src).build(graphBuilder);
-    DefaultJavaLibrary javaLibrary = (DefaultJavaLibrary) libraryRule;
+    DefaultJavaLibrary javaLibrary = libraryRule;
 
     BuildContext context = createBuildContext();
 
@@ -1327,11 +1327,11 @@
   @Test
   public void testWhenNoJavacIsProvidedAJavacInMemoryStepIsAdded() {
     BuildTarget libraryOneTarget = BuildTargetFactory.newInstance("//:libone");
-    BuildRule rule =
+    DefaultJavaLibrary rule =
         createJavaLibraryBuilder(libraryOneTarget)
             .addSrc(Paths.get("java/src/com/libone/Bar.java"))
             .build(graphBuilder);
-    DefaultJavaLibrary buildRule = (DefaultJavaLibrary) rule;
+    DefaultJavaLibrary buildRule = rule;
     ImmutableList<Step> steps =
         buildRule.getBuildSteps(
             FakeBuildContext.withSourcePathResolver(
