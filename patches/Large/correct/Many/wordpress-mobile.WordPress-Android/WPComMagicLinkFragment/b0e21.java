diff --git a/WordPress/src/main/java/org/wordpress/android/ui/accounts/login/WPComMagicLinkFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/accounts/login/WPComMagicLinkFragment.java
index 659f527..2ee0f49 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/accounts/login/WPComMagicLinkFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/accounts/login/WPComMagicLinkFragment.java
@@ -65,9 +65,9 @@
     }
 
     // TODO: Rename method, update argument and hook method into UI event
-    public void onButtonPressed(Uri uri) {
+    public void onButtonPressed(Boolean shouldSendMagicLink) {
         if (mListener != null) {
-            mListener.onFragmentInteraction(uri);
+            mListener.onFragmentInteraction(shouldSendMagicLink);
         }
     }
 
