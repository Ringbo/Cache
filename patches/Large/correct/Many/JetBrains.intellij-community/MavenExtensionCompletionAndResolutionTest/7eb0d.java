diff --git a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenExtensionCompletionAndResolutionTest.java b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenExtensionCompletionAndResolutionTest.java
index 17f4591..8b3d41e 100644
--- a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenExtensionCompletionAndResolutionTest.java
+++ b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenExtensionCompletionAndResolutionTest.java
@@ -54,7 +54,7 @@
                      "  </extensions>" +
                      "</build>");
 
-    assertCompletionVariants(myProjectPom, "test", "org.apache.maven.plugins", "org.codehaus.mojo");
+    assertCompletionVariants(myProjectPom, "org.codehaus.plexus", "test", "org.apache.maven.plugins", "org.codehaus.mojo", "intellij.test");
   }
 
   public void testArtifactIdCompletion() throws Exception {
