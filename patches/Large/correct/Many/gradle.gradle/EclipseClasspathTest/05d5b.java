diff --git a/subprojects/gradle-plugins/src/test/groovy/org/gradle/api/tasks/ide/eclipse/EclipseClasspathTest.java b/subprojects/gradle-plugins/src/test/groovy/org/gradle/api/tasks/ide/eclipse/EclipseClasspathTest.java
index 0ce4c6c..6694cea 100644
--- a/subprojects/gradle-plugins/src/test/groovy/org/gradle/api/tasks/ide/eclipse/EclipseClasspathTest.java
+++ b/subprojects/gradle-plugins/src/test/groovy/org/gradle/api/tasks/ide/eclipse/EclipseClasspathTest.java
@@ -63,7 +63,7 @@
     @Before
     public void setUp() {
         super.setUp();
-        expectedSrcDirs = WrapUtil.<Object>toList("src/main/java", "src/main/resources");
+        expectedSrcDirs = WrapUtil.<Object>toList("src/main/java", "src/main/java", "src/main/resources");
         expectedTestSrcDirs = WrapUtil.<Object>toList("src/test/java", "src/test/resources");
         createProjectDirs(expectedSrcDirs, expectedTestSrcDirs);
         projectDependencyMock = context.mock(DefaultProjectDependency.class);
