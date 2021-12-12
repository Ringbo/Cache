diff --git a/test/com/facebook/buck/jvm/java/JavaLibraryClasspathProviderTest.java b/test/com/facebook/buck/jvm/java/JavaLibraryClasspathProviderTest.java
index dcbb161..037000a 100644
--- a/test/com/facebook/buck/jvm/java/JavaLibraryClasspathProviderTest.java
+++ b/test/com/facebook/buck/jvm/java/JavaLibraryClasspathProviderTest.java
@@ -206,7 +206,7 @@
         ImmutableSet.of(z, c, e),
         JavaLibraryClasspathProvider.getTransitiveClasspathDeps((JavaLibrary) z));
 
-    BuildRule mavenCoord =
+    JavaLibrary mavenCoord =
         new JavaLibraryBuilder(
                 BuildTargetFactory.newInstance("//has:output"),
                 filesystem,
@@ -218,7 +218,7 @@
     assertEquals(
         "Does appear if no output jar but maven coordinate present.",
         ImmutableSet.of(z, c, e, mavenCoord),
-        JavaLibraryClasspathProvider.getTransitiveClasspathDeps((JavaLibrary) mavenCoord));
+        JavaLibraryClasspathProvider.getTransitiveClasspathDeps(mavenCoord));
   }
 
   @Test
