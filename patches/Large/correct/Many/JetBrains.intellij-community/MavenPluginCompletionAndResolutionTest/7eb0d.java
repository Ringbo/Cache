diff --git a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenPluginCompletionAndResolutionTest.java b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenPluginCompletionAndResolutionTest.java
index 11c3fce7..827f5ac 100644
--- a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenPluginCompletionAndResolutionTest.java
+++ b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenPluginCompletionAndResolutionTest.java
@@ -43,7 +43,7 @@
                   "<version>1</version>");
   }
 
-  @Bombed(year = 2013, month = Calendar.APRIL, day = 25, user = "sergey.evdokimov")
+  @Bombed(year = 2014, month = Calendar.APRIL, day = 25, user = "sergey.evdokimov")
   public void testGroupIdCompletion() throws Exception {
     createProjectPom("<groupId>test</groupId>" +
                      "<artifactId>project</artifactId>" +
@@ -57,7 +57,7 @@
                      "  </plugins>" +
                      "</build>");
 
-    assertCompletionVariants(myProjectPom, "test", "org.apache.maven.plugins", "org.codehaus.mojo");
+    assertCompletionVariants(myProjectPom, "org.codehaus.plexus", "intellij.test", "test", "org.apache.maven.plugins", "org.codehaus.mojo");
   }
 
   @Bombed(year = 2013, month = Calendar.APRIL, day = 25, user = "sergey.evdokimov")
