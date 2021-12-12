diff --git a/src/com/owncloud/android/authentication/AuthenticatorActivity.java b/src/com/owncloud/android/authentication/AuthenticatorActivity.java
index 48ec34e..5dce251 100644
--- a/src/com/owncloud/android/authentication/AuthenticatorActivity.java
+++ b/src/com/owncloud/android/authentication/AuthenticatorActivity.java
@@ -206,7 +206,7 @@
      */
     @Override
     protected void onCreate(Bundle savedInstanceState) {
-        //Log_OC.wtf(TAG,  "onCreate init");
+        //Log_OC.e(TAG,  "onCreate init");
         super.onCreate(savedInstanceState);
 
         // Workaround, for fixing a problem with Android Library Suppor v7 19
@@ -286,7 +286,7 @@
         /// initialize block to be moved to single Fragment to retrieve and validate credentials 
         initAuthorizationPreFragment(savedInstanceState);
 
-        //Log_OC.wtf(TAG,  "onCreate end");
+        //Log_OC.e(TAG,  "onCreate end");
     }
 
     private void initAuthTokenType() {
@@ -603,7 +603,7 @@
      */
     @Override
     protected void onSaveInstanceState(Bundle outState) {
-        //Log_OC.wtf(TAG, "onSaveInstanceState init" );
+        //Log_OC.e(TAG, "onSaveInstanceState init" );
         super.onSaveInstanceState(outState);
 
         /// global state
@@ -643,7 +643,7 @@
         }
         mAsyncTask = null;
 
-        //Log_OC.wtf(TAG, "onSaveInstanceState end" );
+        //Log_OC.e(TAG, "onSaveInstanceState end" );
     }
 
     @Override
@@ -760,7 +760,7 @@
                 queryParameters);
         
         if (mOperationsServiceBinder != null) {
-            //Log_OC.wtf(TAG, "getting access token..." );
+            //Log_OC.e(TAG, "getting access token..." );
             mWaitingForOpId = mOperationsServiceBinder.queueNewOperation(getServerInfoIntent);
         }
     }
@@ -837,7 +837,7 @@
             if (mOperationsServiceBinder != null) {
                 mWaitingForOpId = mOperationsServiceBinder.queueNewOperation(getServerInfoIntent);
             } else {
-              Log_OC.wtf(TAG, "Server check tried with OperationService unbound!" );
+              Log_OC.e(TAG, "Server check tried with OperationService unbound!" );
             }
             
         } else {
@@ -1887,7 +1887,7 @@
 
 
     private void doOnResumeAndBound() {
-        //Log_OC.wtf(TAG, "registering to listen for operation callbacks" );
+        //Log_OC.e(TAG, "registering to listen for operation callbacks" );
         mOperationsServiceBinder.addOperationListener(AuthenticatorActivity.this, mHandler);
         if (mWaitingForOpId <= Integer.MAX_VALUE) {
             mOperationsServiceBinder.dispatchResultIfFinished((int)mWaitingForOpId, this);
