diff --git a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenDependencyCompletionAndResolutionTest.java b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenDependencyCompletionAndResolutionTest.java
index 91a59d6..34a2183 100644
--- a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenDependencyCompletionAndResolutionTest.java
+++ b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenDependencyCompletionAndResolutionTest.java
@@ -636,7 +636,7 @@
                      "  </dependency>" +
                      "</dependencies>");
 
-    assertCompletionVariants(myProjectPom, "jar", "test-jar", "pom", "ear", "ejb", "ejb-client", "war", "bundle");
+    assertCompletionVariants(myProjectPom, "jar", "test-jar", "pom", "ear", "ejb", "ejb-client", "war", "bundle", "jboss-har");
   }
 
   public void testDoNotHighlightUnknownType() throws Throwable {
