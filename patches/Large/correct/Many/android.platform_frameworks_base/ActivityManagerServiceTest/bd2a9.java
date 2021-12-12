diff --git a/services/tests/servicestests/src/com/android/server/am/ActivityManagerServiceTest.java b/services/tests/servicestests/src/com/android/server/am/ActivityManagerServiceTest.java
index 25d2875..c70d1e1 100644
--- a/services/tests/servicestests/src/com/android/server/am/ActivityManagerServiceTest.java
+++ b/services/tests/servicestests/src/com/android/server/am/ActivityManagerServiceTest.java
@@ -360,7 +360,7 @@
      */
     @Test
     public void testDispatchUids_dispatchNeededChanges() throws RemoteException {
-        when(mAppOpsService.checkOperation(AppOpsManager.OP_GET_USAGE_STATS, Process.myUid(), null))
+        when(mAppOpsService.noteOperation(AppOpsManager.OP_GET_USAGE_STATS, Process.myUid(), null))
                 .thenReturn(AppOpsManager.MODE_ALLOWED);
 
         final int[] changesToObserve = {
