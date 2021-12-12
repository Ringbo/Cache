diff --git a/auth/src/main/java/com/firebase/ui/auth/util/GoogleApiHelper.java b/auth/src/main/java/com/firebase/ui/auth/util/GoogleApiHelper.java
index 2354f3a..61882c8 100644
--- a/auth/src/main/java/com/firebase/ui/auth/util/GoogleApiHelper.java
+++ b/auth/src/main/java/com/firebase/ui/auth/util/GoogleApiHelper.java
@@ -46,7 +46,10 @@
 
     @Override
     public void onConnected(@Nullable Bundle bundle) {
-        mGoogleApiConnectionTask.setResult(bundle);
+        // onConnected might be called multiple times, but we don't want to unregister listeners
+        // because extenders might be relying on each onConnected call. Instead, we just ignore future
+        // calls to onConnected or onConnectionFailed by using a `trySomething` strategy.
+        mGoogleApiConnectionTask.trySetResult(bundle);
     }
 
     @Override
@@ -56,7 +59,7 @@
 
     @Override
     public void onConnectionFailed(@NonNull ConnectionResult result) {
-        mGoogleApiConnectionTask.setException(new ConnectException(result.toString()));
+        mGoogleApiConnectionTask.trySetException(new ConnectException(result.toString()));
     }
 
     protected static final class TaskResultCaptor<R extends Result> implements ResultCallback<R> {
