diff --git a/src/main/java/org/elasticsearch/common/Strings.java b/src/main/java/org/elasticsearch/common/Strings.java
index c1a2e70..f8d5bfb 100644
--- a/src/main/java/org/elasticsearch/common/Strings.java
+++ b/src/main/java/org/elasticsearch/common/Strings.java
@@ -789,7 +789,7 @@
      */
     public static Locale parseLocaleString(String localeString) {
         String[] parts = tokenizeToStringArray(localeString, "_ ", false, false);
-        String language = (parts.length > 0 ? parts[0] : "");
+        String language = (parts.length != 0 ? parts[0] : "");
         String country = (parts.length > 1 ? parts[1] : "");
         String variant = "";
         if (parts.length >= 2) {
