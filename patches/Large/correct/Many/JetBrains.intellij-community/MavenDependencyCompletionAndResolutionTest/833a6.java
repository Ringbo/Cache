diff --git a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenDependencyCompletionAndResolutionTest.java b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenDependencyCompletionAndResolutionTest.java
index d51530c..23b4584 100644
--- a/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenDependencyCompletionAndResolutionTest.java
+++ b/plugins/maven/src/test/java/org/jetbrains/idea/maven/dom/MavenDependencyCompletionAndResolutionTest.java
@@ -533,7 +533,7 @@
                      "  </dependency>" +
                      "</dependencies>");
 
-    assertResolved(myProjectPom, findPsiFile(LocalFileSystem.getInstance().findFileByPath(libPath)));
+    assertResolved(myProjectPom, findPsiFile(LocalFileSystem.getInstance().refreshAndFindFileByPath(libPath)));
     checkHighlighting();
   }
 
@@ -554,7 +554,7 @@
                      "  </dependency>" +
                      "</dependencies>");
 
-    assertResolved(myProjectPom, findPsiFile(LocalFileSystem.getInstance().findFileByPath(libPath)));
+    assertResolved(myProjectPom, findPsiFile(LocalFileSystem.getInstance().refreshAndFindFileByPath(libPath)));
     checkHighlighting();
   }
 
@@ -576,7 +576,7 @@
     assertNotNull(action);
 
     String libPath = myIndicesFixture.getRepositoryHelper().getTestDataPath("local1/junit/junit/4.0/junit-4.0.jar");
-    VirtualFile libFile = LocalFileSystem.getInstance().findFileByPath(libPath);
+    VirtualFile libFile = LocalFileSystem.getInstance().refreshAndFindFileByPath(libPath);
 
     MyFileChooserFactory factory = new MyFileChooserFactory();
     factory.setFiles(new VirtualFile[]{libFile});
