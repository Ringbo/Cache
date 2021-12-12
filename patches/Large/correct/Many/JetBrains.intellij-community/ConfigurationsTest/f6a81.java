diff --git a/java/java-tests/testSrc/com/intellij/execution/ConfigurationsTest.java b/java/java-tests/testSrc/com/intellij/execution/ConfigurationsTest.java
index cab5a01..5311dc1 100644
--- a/java/java-tests/testSrc/com/intellij/execution/ConfigurationsTest.java
+++ b/java/java-tests/testSrc/com/intellij/execution/ConfigurationsTest.java
@@ -420,7 +420,7 @@
 
   private JavaParameters checkCanRun(RuntimeConfiguration configuration) throws ExecutionException {
     final RunProfileState state;
-    state = configuration.getState(MOCK_EXECUTOR, new ExecutionEnvironment(new MockProfile(), myProject, null));
+    state = configuration.getState(MOCK_EXECUTOR, new ExecutionEnvironment(new MockProfile(), MOCK_EXECUTOR, myProject, null));
     assertNotNull(state);
     assertTrue(state instanceof JavaCommandLine);
     if (state instanceof TestPackage) {
@@ -464,7 +464,7 @@
     }
 
     final RunProfileState state = configuration
-      .getState(MOCK_EXECUTOR, new ExecutionEnvironment(new MockProfile(), myProject, null));
+      .getState(MOCK_EXECUTOR, new ExecutionEnvironment(new MockProfile(), MOCK_EXECUTOR, myProject, null));
     assertTrue(state instanceof JavaCommandLine);
 
     try {
