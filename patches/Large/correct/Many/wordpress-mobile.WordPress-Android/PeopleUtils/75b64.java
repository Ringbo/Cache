diff --git a/WordPress/src/main/java/org/wordpress/android/ui/people/utils/PeopleUtils.java b/WordPress/src/main/java/org/wordpress/android/ui/people/utils/PeopleUtils.java
index 4dcf720..3a963d4 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/people/utils/PeopleUtils.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/people/utils/PeopleUtils.java
@@ -31,7 +31,7 @@
                 if (jsonObject != null && callback != null) {
                     try {
                         JSONArray jsonArray = jsonObject.getJSONArray("users");
-                        List<Person> people = peopleListFromJSON(jsonArray, localTableBlogId, false, false);
+                        List<Person> people = peopleListFromJSON(jsonArray, localTableBlogId, false, false, false);
                         int numberOfUsers = jsonObject.optInt("found");
                         boolean isEndOfList = (people.size() + offset) >= numberOfUsers;
                         callback.onSuccess(people, isEndOfList);
@@ -82,7 +82,7 @@
                     try {
                         JSONArray jsonArray = jsonObject.getJSONArray("subscribers");
                         List<Person> people = peopleListFromJSON(jsonArray, localTableBlogId, !isEmailFollower,
-                                isEmailFollower);
+                                isEmailFollower, false);
                         int pageFetched = jsonObject.optInt("page");
                         int numberOfPages = jsonObject.optInt("pages");
                         boolean isEndOfList = page >= numberOfPages || page >= FOLLOWER_PAGE_LIMIT;
@@ -123,7 +123,7 @@
                 if (jsonObject != null && callback != null) {
                     try {
                         JSONArray jsonArray = jsonObject.getJSONArray("viewers");
-                        List<Person> people = peopleListFromJSON(jsonArray, blogId, localTableBlogId, false, false,
+                        List<Person> people = peopleListFromJSON(jsonArray, localTableBlogId, false, false,
                                 true);
                         int numberOfUsers = jsonObject.optInt("found");
                         boolean isEndOfList = (people.size() + offset) >= numberOfUsers;
