diff --git a/mvp/src/main/java/com/hannesdorfmann/mosby/mvp/delegate/ActivityMvpDelegateImpl.java b/mvp/src/main/java/com/hannesdorfmann/mosby/mvp/delegate/ActivityMvpDelegateImpl.java
index 90193be..cc39369 100644
--- a/mvp/src/main/java/com/hannesdorfmann/mosby/mvp/delegate/ActivityMvpDelegateImpl.java
+++ b/mvp/src/main/java/com/hannesdorfmann/mosby/mvp/delegate/ActivityMvpDelegateImpl.java
@@ -106,14 +106,14 @@
   @Override public Object onRetainCustomNonConfigurationInstance() {
 
     P presenter = delegateCallback.shouldInstanceBeRetained() ? delegateCallback.getPresenter() : null;
-    Object nonMosbyConfiguraionInstance =
+    Object nonMosbyConfigurationInstance =
         delegateCallback.onRetainNonMosbyCustomNonConfigurationInstance();
 
-    if (presenter == null && nonMosbyConfiguraionInstance == null) {
+    if (presenter == null && nonMosbyConfigurationInstance == null) {
       return null;
     }
 
-    return new ActivityMvpNonConfigurationInstances<>(presenter, nonMosbyConfiguraionInstance);
+    return new ActivityMvpNonConfigurationInstances<>(presenter, nonMosbyConfigurationInstance);
   }
 
   @Override public Object getNonMosbyLastCustomNonConfigurationInstance() {
