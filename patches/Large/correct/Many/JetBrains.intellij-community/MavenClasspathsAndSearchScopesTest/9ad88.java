diff --git a/plugins/maven/src/test/java/org/jetbrains/idea/maven/execution/MavenClasspathsAndSearchScopesTest.java b/plugins/maven/src/test/java/org/jetbrains/idea/maven/execution/MavenClasspathsAndSearchScopesTest.java
index 11f7fdb..b01ee71 100644
--- a/plugins/maven/src/test/java/org/jetbrains/idea/maven/execution/MavenClasspathsAndSearchScopesTest.java
+++ b/plugins/maven/src/test/java/org/jetbrains/idea/maven/execution/MavenClasspathsAndSearchScopesTest.java
@@ -535,7 +535,9 @@
                                        getProjectPath() + "/m2/src/main/java",
                                        getRepositoryPath() + "/junit/junit/4.0/junit-4.0.jar");
     assertRuntimeProductionSearchScope("m1",
-                                       getProjectPath() + "/m1/src/main/java");
+                                       getProjectPath() + "/m1/src/main/java",
+                                       getProjectPath() + "/m2/src/main/java",
+                                       getRepositoryPath() + "/junit/junit/4.0/junit-4.0.jar");
     assertAllTestsSearchScope("m1",
                               getProjectPath() + "/m1/src/main/java",
                               getProjectPath() + "/m1/src/test/java",
@@ -683,7 +685,8 @@
                                        getProjectPath() + "/m2/src/main/java",
                                        getRepositoryPath() + "/jmock/jmock/1.0/jmock-1.0.jar");
     assertRuntimeProductionSearchScope("m2",
-                                       getProjectPath() + "/m2/src/main/java");
+                                       getProjectPath() + "/m2/src/main/java",
+                                       getRepositoryPath() + "/jmock/jmock/1.0/jmock-1.0.jar");
     assertAllTestsSearchScope("m2",
                               getProjectPath() + "/m2/src/main/java",
                               getProjectPath() + "/m2/src/test/java",
