diff --git a/telecomm/java/android/telecomm/CallServiceSelector.java b/telecomm/java/android/telecomm/CallServiceSelector.java
index cfa8eb3..74f05fe 100644
--- a/telecomm/java/android/telecomm/CallServiceSelector.java
+++ b/telecomm/java/android/telecomm/CallServiceSelector.java
@@ -49,13 +49,13 @@
         }
 
         @Override
-        public void select(CallInfo callInfo, List<String> callServiceIds,
+        public void select(CallInfo callInfo, List<CallServiceInfo> callServiceInfos,
                 ICallServiceSelectionResponse response) throws RemoteException {
             // Ensure that we're running with the app's normal permission level
             long ident = Binder.clearCallingIdentity();
             try {
-                response.setSelectedCallServiceIds(
-                        CallServiceSelector.this.select(callInfo, callServiceIds));
+                response.setSelectedCallServiceInfos(
+                        CallServiceSelector.this.select(callInfo, callServiceInfos));
             } finally {
                 Binder.restoreCallingIdentity(ident);
             }
@@ -91,9 +91,10 @@
      * This method is not called on the UI thread and is safe to block.
      *
      * @param callInfo The call being placed using the {@link CallService}s.
-     * @param callServiceIds The IDs of the {@link CallService}s to organize for the call.
-     *
-     * @return A list of prioritized {@link CallService} IDs to use to complete the given call.
+     * @param callServiceInfos The details of the available {@link CallService}s with which to place
+     *         the call.
+     * @return A list of prioritized {@link CallServiceInfo}s to use to complete the given call.
      */
-    protected abstract List<String> select(CallInfo callInfo, List<String> callServiceIds);
+    protected abstract List<CallServiceInfo> select(
+            CallInfo callInfo, List<CallServiceInfo> callServiceInfos);
 }
