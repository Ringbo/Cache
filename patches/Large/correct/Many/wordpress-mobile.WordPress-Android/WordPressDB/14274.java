diff --git a/WordPress/src/main/java/org/wordpress/android/WordPressDB.java b/WordPress/src/main/java/org/wordpress/android/WordPressDB.java
index 61bde17..d87f0eb 100644
--- a/WordPress/src/main/java/org/wordpress/android/WordPressDB.java
+++ b/WordPress/src/main/java/org/wordpress/android/WordPressDB.java
@@ -323,7 +323,7 @@
             return new Vector<Map<String, Object>>();
         }
         String limitStr = null;
-        if (limit == 0) {
+        if (limit != 0) {
             limitStr = String.valueOf(limit);
         }
         String[] baseFields = new String[]{"id", "blogName", "username", "blogId", "url", "password"};
