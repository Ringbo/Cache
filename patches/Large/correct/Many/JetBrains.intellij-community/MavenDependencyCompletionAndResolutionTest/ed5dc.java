diff --git a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenDependencyCompletionAndResolutionTest.java b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenDependencyCompletionAndResolutionTest.java
index ed6665f..11b848a 100644
--- a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenDependencyCompletionAndResolutionTest.java
+++ b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenDependencyCompletionAndResolutionTest.java
@@ -120,7 +120,7 @@
                      "  </dependency>" +
                      "</dependencies>");
 
-    assertCompletionVariants(myProjectPom);
+    assertCompletionVariants(myProjectPom, "RELEASE", "LATEST");
 
     createProjectPom("<groupId>test</groupId>" +
                      "<artifactId>project</artifactId>" +
@@ -134,7 +134,7 @@
                      "  </dependency>" +
                      "</dependencies>");
 
-    assertCompletionVariants(myProjectPom);
+    assertCompletionVariants(myProjectPom, "RELEASE", "LATEST");
   }
 
   public void testDoNotCompleteVersionIfNoGroupIdAndArtifactId() throws Exception {
