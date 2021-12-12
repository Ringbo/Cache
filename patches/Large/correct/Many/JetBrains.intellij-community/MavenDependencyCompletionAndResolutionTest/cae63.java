diff --git a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenDependencyCompletionAndResolutionTest.java b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenDependencyCompletionAndResolutionTest.java
index 34a2183..ffd540d 100644
--- a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenDependencyCompletionAndResolutionTest.java
+++ b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenDependencyCompletionAndResolutionTest.java
@@ -636,7 +636,7 @@
                      "  </dependency>" +
                      "</dependencies>");
 
-    assertCompletionVariants(myProjectPom, "jar", "test-jar", "pom", "ear", "ejb", "ejb-client", "war", "bundle", "jboss-har");
+    assertCompletionVariants(myProjectPom, "jar", "test-jar", "pom", "ear", "ejb", "ejb-client", "war", "bundle", "jboss-har", "jboss-sar");
   }
 
   public void testDoNotHighlightUnknownType() throws Throwable {
