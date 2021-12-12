diff --git a/WordPress/src/main/java/org/wordpress/android/ui/publicize/adapters/PublicizeServiceAdapter.java b/WordPress/src/main/java/org/wordpress/android/ui/publicize/adapters/PublicizeServiceAdapter.java
index 507f8f3..f9fbd55 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/publicize/adapters/PublicizeServiceAdapter.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/publicize/adapters/PublicizeServiceAdapter.java
@@ -136,7 +136,7 @@
     }
 
     private boolean isHiddenService(PublicizeService service) {
-        boolean shouldHideGooglePlus = service.getId().equals(PublicizeConstants.GOOGLE_PLUS_ID) || mShouldHideGPlus;
+        boolean shouldHideGooglePlus = service.getId().equals(PublicizeConstants.GOOGLE_PLUS_ID) && mShouldHideGPlus;
         boolean isFacebook = service.getId().equals(PublicizeConstants.FACEBOOK_ID);
 
         return shouldHideGooglePlus || isFacebook;
