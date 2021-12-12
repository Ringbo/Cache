diff --git a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenParentCompletionAndResolutionTest.java b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenParentCompletionAndResolutionTest.java
index c22d06b..0cdc937 100644
--- a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenParentCompletionAndResolutionTest.java
+++ b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenParentCompletionAndResolutionTest.java
@@ -57,7 +57,7 @@
                      "  <artifactId>junit</artifactId>" +
                      "  <version><caret></version>" +
                      "</parent>");
-    assertCompletionVariants(myProjectPom, "3.8.1", "3.8.2", "4.0");
+    assertCompletionVariants(myProjectPom, "3.8.1", "3.8.2", "4.0", "RELEASE", "LATEST");
   }
 
   public void testResolutionInsideTheProject() throws Exception {
