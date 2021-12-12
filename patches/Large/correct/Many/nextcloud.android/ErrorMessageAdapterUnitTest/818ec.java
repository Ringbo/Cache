diff --git a/src/test/java/com/owncloud/android/utils/ErrorMessageAdapterUnitTest.java b/src/test/java/com/owncloud/android/utils/ErrorMessageAdapterUnitTest.java
index 42b8779..1a9b171 100644
--- a/src/test/java/com/owncloud/android/utils/ErrorMessageAdapterUnitTest.java
+++ b/src/test/java/com/owncloud/android/utils/ErrorMessageAdapterUnitTest.java
@@ -1,4 +1,4 @@
-/**
+/*
  *   ownCloud Android client application
  *
  *   @author David A. Velasco
@@ -58,7 +58,7 @@
     private final static String ACCOUNT_TYPE = "nextcloud";
 
     @Mock
-    Resources mMockResources;
+    private Resources mMockResources;
 
     @Test
     public void getErrorCauseMessageForForbiddenRemoval() {
@@ -73,7 +73,7 @@
         // ... when method under test is called ...
         String errorMessage = ErrorMessageAdapter.getErrorCauseMessage(
             new RemoteOperationResult(RemoteOperationResult.ResultCode.FORBIDDEN),
-                new RemoveFileOperation(PATH_TO_DELETE, false, account, MainApp.getAppContext()),
+                new RemoveFileOperation(PATH_TO_DELETE, false, account, false, MainApp.getAppContext()),
             mMockResources
         );
 
