diff --git a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenPluginCompletionAndResolutionTest.java b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenPluginCompletionAndResolutionTest.java
index 237d538..9e5d7a8 100644
--- a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenPluginCompletionAndResolutionTest.java
+++ b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenPluginCompletionAndResolutionTest.java
@@ -89,7 +89,7 @@
                      "  </plugins>" +
                      "</build>");
 
-    assertCompletionVariants(myProjectPom, "2.0.2");
+    assertCompletionVariants(myProjectPom, "RELEASE", "LATEST", "2.0.2");
   }
 
   public void testArtifactWithoutGroupCompletion() throws Exception {
@@ -127,7 +127,7 @@
                      "  </plugins>" +
                      "</build>");
 
-    assertCompletionVariants(myProjectPom, "2.0.2");
+    assertCompletionVariants(myProjectPom, "RELEASE", "LATEST", "2.0.2");
   }
 
   public void testResolvingPlugins() throws Exception {
