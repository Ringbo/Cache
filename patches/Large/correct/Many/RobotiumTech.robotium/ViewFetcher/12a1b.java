diff --git a/robotium-solo/src/main/java/com/robotium/solo/ViewFetcher.java b/robotium-solo/src/main/java/com/robotium/solo/ViewFetcher.java
index cf3d6b6..de2a949 100644
--- a/robotium-solo/src/main/java/com/robotium/solo/ViewFetcher.java
+++ b/robotium-solo/src/main/java/com/robotium/solo/ViewFetcher.java
@@ -136,7 +136,8 @@
 			if (view != null){ 
 				String nameOfClass = view.getClass().getName();
 				if(nameOfClass.equals("com.android.internal.policy.impl.PhoneWindow$DecorView") || nameOfClass
-						.equals("com.android.internal.policy.impl.MultiPhoneWindow$MultiPhoneDecorView")) {
+						.equals("com.android.internal.policy.impl.MultiPhoneWindow$MultiPhoneDecorView") || 
+						nameOfClass.equals("com.android.internal.policy.PhoneWindow$DecorView")) {
 					decorViews[i] = view;
 					i++;
 				}
