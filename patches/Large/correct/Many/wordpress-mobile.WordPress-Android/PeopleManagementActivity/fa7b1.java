diff --git a/WordPress/src/main/java/org/wordpress/android/ui/people/PeopleManagementActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/people/PeopleManagementActivity.java
index 5a23488..2eb93af 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/people/PeopleManagementActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/people/PeopleManagementActivity.java
@@ -123,11 +123,9 @@
         }
         if (!personDetailFragment.isAdded()) {
             FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
-            fragmentTransaction.setCustomAnimations(R.animator.fragment_slide_in_from_right,
-                    R.animator.fragment_slide_out_to_left,
-                    R.animator.fragment_slide_in_from_left,
+            fragmentTransaction.setCustomAnimations(R.animator.fragment_slide_in_from_right, 0, 0,
                     R.animator.fragment_slide_out_to_right);
-            fragmentTransaction.replace(R.id.fragment_container, personDetailFragment, KEY_PERSON_DETAIL_FRAGMENT);
+            fragmentTransaction.add(R.id.fragment_container, personDetailFragment, KEY_PERSON_DETAIL_FRAGMENT);
             fragmentTransaction.addToBackStack(null);
             fragmentTransaction.commit();
         }
