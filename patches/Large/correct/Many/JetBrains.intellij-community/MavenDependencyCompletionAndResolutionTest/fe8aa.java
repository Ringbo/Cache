diff --git a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenDependencyCompletionAndResolutionTest.java b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenDependencyCompletionAndResolutionTest.java
index a4dbebf..ed6665f 100644
--- a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenDependencyCompletionAndResolutionTest.java
+++ b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenDependencyCompletionAndResolutionTest.java
@@ -104,7 +104,7 @@
                      "</dependencies>");
 
     List<String> variants = getCompletionVariants(myProjectPom);
-    assertEquals(Arrays.asList("4.0", "3.8.2", "3.8.1"), variants);
+    assertEquals(Arrays.asList("4.0", "3.8.2", "3.8.1", "RELEASE", "LATEST"), variants);
   }
 
   public void testDoesNotCompleteVersionOnUnknownGroupOrArtifact() throws Exception {
@@ -230,7 +230,7 @@
                     "  </dependency>" +
                     "</dependencies>");
 
-    assertCompletionVariants(m, "1");
+    assertCompletionVariants(m, "RELEASE", "LATEST", "1");
 
     createModulePom("m2", "<groupId>test</groupId>" +
                     "<artifactId>module2</artifactId>" +
