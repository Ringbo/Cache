diff --git a/core/java/android/app/IActivityManager.java b/core/java/android/app/IActivityManager.java
index 5037e3e..80ba3eb 100644
--- a/core/java/android/app/IActivityManager.java
+++ b/core/java/android/app/IActivityManager.java
@@ -136,7 +136,7 @@
             ActivityManager.TaskDescription description, Bitmap thumbnail) throws RemoteException;
     public Point getAppTaskThumbnailSize() throws RemoteException;
     public List<RunningTaskInfo> getTasks(int maxNum, int flags) throws RemoteException;
-    public List<ActivityManager.RecentTaskInfo> getRecentTasks(int maxNum,
+    public ParceledListSlice<ActivityManager.RecentTaskInfo> getRecentTasks(int maxNum,
             int flags, int userId) throws RemoteException;
     public ActivityManager.TaskThumbnail getTaskThumbnail(int taskId) throws RemoteException;
     public List<RunningServiceInfo> getServices(int maxNum, int flags) throws RemoteException;
