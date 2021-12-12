diff --git a/src/main/java/com/owncloud/android/features/FeatureList.java b/src/main/java/com/owncloud/android/features/FeatureList.java
index 728c3d1..414aee5 100644
--- a/src/main/java/com/owncloud/android/features/FeatureList.java
+++ b/src/main/java/com/owncloud/android/features/FeatureList.java
@@ -41,7 +41,7 @@
 
     private static final int VERSION_1_0_0 = 10000099;
     private static final int VERSION_3_0_0 = 30000099;
-    private static final int VERSION_3_2_0 = 30020000;
+    private static final int VERSION_3_3_0 = 30030099;
     private static final int BETA_VERSION_0 = 0;
 
     static public ArrayList<FeatureItem> get(boolean isMultiAccount) {
@@ -70,10 +70,10 @@
                 R.string.whats_new_ipv6_content, VERSION_3_0_0,
                 BETA_VERSION_0, SHOW_ON_UPGRADE, false, false));
 
-        // 3.2.0
+        // 3.3.0
         featuresList.add(new FeatureItem(R.drawable.whats_new_device_credentials,
                 R.string.whats_new_device_credentials_title, R.string.whats_new_device_credentials_content,
-                VERSION_3_2_0, BETA_VERSION_0, SHOW_ON_UPGRADE, false, false));
+                VERSION_3_3_0, BETA_VERSION_0, SHOW_ON_UPGRADE, false, false));
 
         return featuresList;
     }
