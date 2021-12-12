diff --git a/platform/testFramework/src/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java b/platform/testFramework/src/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java
index 1b97a5b..7a39df6 100644
--- a/platform/testFramework/src/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java
+++ b/platform/testFramework/src/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java
@@ -895,7 +895,7 @@
     };
     final InspectionProfileManager inspectionProfileManager = InspectionProfileManager.getInstance();
     inspectionProfileManager.addProfile(profile);
-    Disposer.register(getProject(), new Disposable() {
+    Disposer.register(getTestRootDisposable(), new Disposable() {
       public void dispose() {
         inspectionProfileManager.deleteProfile(PROFILE);
       }
