diff --git a/WordPress/src/main/java/org/wordpress/android/models/Person.java b/WordPress/src/main/java/org/wordpress/android/models/Person.java
index f7be041..1dc203a 100644
--- a/WordPress/src/main/java/org/wordpress/android/models/Person.java
+++ b/WordPress/src/main/java/org/wordpress/android/models/Person.java
@@ -53,7 +53,7 @@
             String displayName = json.optString("nice_name");
             String avatarUrl = json.optString("avatar_URL");
             // We don't support multiple roles, so the first role is picked just as it's in Calypso
-            String role = json.optJSONArray("roles").optString(0);
+            String role = json.getJSONArray("roles").optString(0);
 
             return new Person(personID, siteID, localTableBlogId, username, firstName, lastName, displayName, avatarUrl, role);
         } catch (JSONException e) {
