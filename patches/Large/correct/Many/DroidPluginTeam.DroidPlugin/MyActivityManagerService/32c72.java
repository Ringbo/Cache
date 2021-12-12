diff --git a/project/Libraries/DroidPlugin/src/com/morgoo/droidplugin/am/MyActivityManagerService.java b/project/Libraries/DroidPlugin/src/com/morgoo/droidplugin/am/MyActivityManagerService.java
index 9ac2ac4..a49e30b 100644
--- a/project/Libraries/DroidPlugin/src/com/morgoo/droidplugin/am/MyActivityManagerService.java
+++ b/project/Libraries/DroidPlugin/src/com/morgoo/droidplugin/am/MyActivityManagerService.java
@@ -59,7 +59,7 @@
 
     private static final String TAG = MyActivityManagerService.class.getSimpleName();
     private StaticProcessList mStaticProcessList = new StaticProcessList();
-    private RunningProcesList mRunningProcessList = new RunningProcesList();
+    private RunningProcessList mRunningProcessList = new RunningProcessList();
 
     public MyActivityManagerService(Context hostContext) {
         super(hostContext);
@@ -75,11 +75,11 @@
     }
 
     @Override
-    public void onDestory() {
+    public void onDestroy() {
         mRunningProcessList.clear();
         mStaticProcessList.clear();
         runProcessGC();
-        super.onDestory();
+        super.onDestroy();
     }
 
     @Override
@@ -237,13 +237,13 @@
     }
 
     @Override
-    public void onActivityDestory(int callingPid, int callingUid, ActivityInfo stubInfo, ActivityInfo targetInfo) {
+    public void onActivityDestroy(int callingPid, int callingUid, ActivityInfo stubInfo, ActivityInfo targetInfo) {
         mRunningProcessList.removeActivityInfo(callingPid, callingUid, stubInfo, targetInfo);
         runProcessGC();
     }
 
     @Override
-    public void onActivtyOnNewIntent(int callingPid, int callingUid, ActivityInfo stubInfo, ActivityInfo targetInfo, Intent intent) {
+    public void onActivityOnNewIntent(int callingPid, int callingUid, ActivityInfo stubInfo, ActivityInfo targetInfo, Intent intent) {
         mRunningProcessList.addActivityInfo(callingPid, callingUid, stubInfo, targetInfo);
     }
 
@@ -253,7 +253,7 @@
     }
 
     @Override
-    public void onServiceDestory(int callingPid, int callingUid, ServiceInfo stubInfo, ServiceInfo targetInfo) {
+    public void onServiceDestroy(int callingPid, int callingUid, ServiceInfo stubInfo, ServiceInfo targetInfo) {
         mRunningProcessList.removeServiceInfo(callingPid, callingUid, stubInfo, targetInfo);
         runProcessGC();
     }
