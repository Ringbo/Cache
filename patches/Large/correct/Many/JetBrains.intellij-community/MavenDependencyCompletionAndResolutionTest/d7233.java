diff --git a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenDependencyCompletionAndResolutionTest.java b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenDependencyCompletionAndResolutionTest.java
index 23b4584..0cc5588 100644
--- a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenDependencyCompletionAndResolutionTest.java
+++ b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenDependencyCompletionAndResolutionTest.java
@@ -403,7 +403,7 @@
                      "</dependencies>");
 
     String filePath = myIndicesFixture.getRepositoryHelper().getTestDataPath("local1/junit/junit/4.0/junit-4.0.pom");
-    VirtualFile f = LocalFileSystem.getInstance().findFileByPath(filePath);
+    VirtualFile f = LocalFileSystem.getInstance().refreshAndFindFileByPath(filePath);
     assertResolved(myProjectPom, findPsiFile(f));
   }
 
@@ -422,7 +422,7 @@
                      "</dependencies>");
 
     String filePath = myIndicesFixture.getRepositoryHelper().getTestDataPath("local1/junit/junit/4.0/junit-4.0.pom");
-    VirtualFile f = LocalFileSystem.getInstance().findFileByPath(filePath);
+    VirtualFile f = LocalFileSystem.getInstance().refreshAndFindFileByPath(filePath);
     assertResolved(myProjectPom, findPsiFile(f));
   }
 
@@ -472,7 +472,7 @@
                      "  </dependency>" +
                      "</dependencies>");
 
-    assertResolved(myProjectPom, findPsiFile(LocalFileSystem.getInstance().findFileByPath(libPath)));
+    assertResolved(myProjectPom, findPsiFile(LocalFileSystem.getInstance().refreshAndFindFileByPath(libPath)));
     checkHighlighting();
   }
 
