diff --git a/java/org/apache/catalina/realm/RealmBase.java b/java/org/apache/catalina/realm/RealmBase.java
index 644cd2f..321697f 100644
--- a/java/org/apache/catalina/realm/RealmBase.java
+++ b/java/org/apache/catalina/realm/RealmBase.java
@@ -546,9 +546,9 @@
 
         // Check each defined security constraint
         String uri = request.getRequestPathMB().toString();
-        // Bug47080 - in rare cases this may be null
+        // Bug47080 - in rare cases this may be null or ""
         // Mapper treats as '/' do the same to prevent NPE
-        if (uri == null) {
+        if (uri == null || uri.length() == 0) {
             uri = "/";
         }
 
@@ -580,7 +580,8 @@
                 }
 
                 for(int k=0; k < patterns.length; k++) {
-                    if(uri.equals(patterns[k])) {
+                    // Exact match including special case for the context root.
+                    if(uri.equals(patterns[k]) || patterns[k].length() == 0 && uri.equals("/")) {
                         found = true;
                         if(collection[j].findMethod(method)) {
                             if(results == null) {
