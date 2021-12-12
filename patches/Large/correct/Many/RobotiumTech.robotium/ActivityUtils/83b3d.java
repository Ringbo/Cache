diff --git a/robotium-solo/src/main/java/com/robotium/solo/ActivityUtils.java b/robotium-solo/src/main/java/com/robotium/solo/ActivityUtils.java
index 5688ef9..6b4af56 100644
--- a/robotium-solo/src/main/java/com/robotium/solo/ActivityUtils.java
+++ b/robotium-solo/src/main/java/com/robotium/solo/ActivityUtils.java
@@ -149,7 +149,7 @@
 			public void run() {
 				while (shouldRegisterActivities()) {
 					
-					Activity activity = activityMonitor.waitForActivity();
+					Activity activity = activityMonitor.waitForActivityWithTimeout(2000);
 
 					if(activity != null){
 						if (activitiesStoredInActivityStack.remove(activity.toString())){
