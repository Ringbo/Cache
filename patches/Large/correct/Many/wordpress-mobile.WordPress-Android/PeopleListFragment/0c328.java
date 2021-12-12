diff --git a/WordPress/src/main/java/org/wordpress/android/ui/people/PeopleListFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/people/PeopleListFragment.java
index cb8b0c9..da44b53 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/people/PeopleListFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/people/PeopleListFragment.java
@@ -349,7 +349,8 @@
                 } else {
                     peopleViewHolder.txtUsername.setVisibility(View.GONE);
                 }
-                if (person.getPersonType() == Person.PersonType.USER) {
+                if (person.getPersonType() == Person.PersonType.USER
+                        || person.getPersonType() == Person.PersonType.VIEWER) {
                     peopleViewHolder.txtSubscribed.setVisibility(View.GONE);
                 } else {
                     peopleViewHolder.txtSubscribed.setVisibility(View.VISIBLE);
