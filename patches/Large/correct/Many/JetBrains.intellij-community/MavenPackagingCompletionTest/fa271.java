diff --git a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenPackagingCompletionTest.java b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenPackagingCompletionTest.java
index e98eb0f..b495e61 100644
--- a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenPackagingCompletionTest.java
+++ b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenPackagingCompletionTest.java
@@ -27,7 +27,7 @@
 
                      "<packaging><caret></packaging>");
 
-    assertCompletionVariants(myProjectPom, "jar", "pom", "war", "ejb", "ejb-client", "ear", "bundle");
+    assertCompletionVariants(myProjectPom, "jar", "pom", "war", "ejb", "ejb-client", "ear", "bundle", "maven-plugin");
   }
 
   public void testDoNotHighlightUnknownPackagingTypes() throws Throwable {
