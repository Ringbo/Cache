diff --git a/apps/actor-android/src/main/java/im/actor/messenger/app/activity/controllers/MainPhoneController.java b/apps/actor-android/src/main/java/im/actor/messenger/app/activity/controllers/MainPhoneController.java
index 5733d55..838bddc 100644
--- a/apps/actor-android/src/main/java/im/actor/messenger/app/activity/controllers/MainPhoneController.java
+++ b/apps/actor-android/src/main/java/im/actor/messenger/app/activity/controllers/MainPhoneController.java
@@ -338,10 +338,11 @@
             public boolean onQueryTextChange(String s) {
                 if (isSearchVisible) {
                     if (s.trim().length() > 0) {
-                        searchDisplay.initSearch(s, false);
+                        searchDisplay.initSearch(s.trim().toLowerCase(), false);
                         searchAdapter.setQuery(s.trim().toLowerCase());
                     } else {
-                        searchDisplay.initEmpty();
+                        searchDisplay.initSearch("search clear crash workaround", false);
+                        //searchDisplay.initEmpty();
                     }
                 }
                 return false;
