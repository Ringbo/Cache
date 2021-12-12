diff --git a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenPluginCompletionAndResolutionTest.java b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenPluginCompletionAndResolutionTest.java
index 1eae05e..1bab1b3 100644
--- a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenPluginCompletionAndResolutionTest.java
+++ b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenPluginCompletionAndResolutionTest.java
@@ -868,7 +868,7 @@
                      "  </plugins>" +
                      "</build>");
 
-    assertCompletionVariants(myProjectPom);
+    assertCompletionVariants(myProjectPom, "combine.children", "combine.self");
   }
 
   public void testWorksWithPropertiesInPluginId() throws Throwable {
