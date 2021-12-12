diff --git a/WordPress/src/main/java/org/wordpress/android/ui/people/PeopleManagementActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/people/PeopleManagementActivity.java
index b6050ae..ca4271a 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/people/PeopleManagementActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/people/PeopleManagementActivity.java
@@ -43,7 +43,7 @@
             PeopleListFragment peopleListFragment = PeopleListFragment.newInstance(localBlogId);
 
             getFragmentManager().beginTransaction()
-                    .add(android.R.id.content, peopleListFragment)
+                    .add(android.R.id.content, peopleListFragment, KEY_PEOPLE_LIST_FRAGMENT)
                     .commit();
         }
 
@@ -120,7 +120,7 @@
         }
         if (!personDetailFragment.isAdded()) {
             getFragmentManager().beginTransaction()
-                    .replace(android.R.id.content, personDetailFragment)
+                    .replace(android.R.id.content, personDetailFragment, KEY_PERSON_DETAIL_FRAGMENT)
                     .addToBackStack(null)
                     .commit();
         }
