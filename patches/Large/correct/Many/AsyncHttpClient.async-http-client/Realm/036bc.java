diff --git a/api/src/main/java/org/asynchttpclient/Realm.java b/api/src/main/java/org/asynchttpclient/Realm.java
index 6fe0096..1d602b5 100644
--- a/api/src/main/java/org/asynchttpclient/Realm.java
+++ b/api/src/main/java/org/asynchttpclient/Realm.java
@@ -32,7 +32,7 @@
  */
 public class Realm {
 
-    private static final String NC = "00000001";
+    private static final String DEFAULT_NC = "00000001";
 
     private final String principal;
     private final String password;
@@ -263,7 +263,7 @@
         private String response = "";
         private String opaque = "";
         private String qop = "auth";
-        private String nc = "00000001";
+        private String nc = DEFAULT_NC;
         private String cnonce = "";
         private Uri uri;
         private String methodName = "GET";
@@ -565,7 +565,7 @@
             
             if (isNonEmpty(qop)) {
                 //qop ="auth" or "auth-int"
-                sb.append(NC)//
+                sb.append(nc)//
                         .append(':')//
                         .append(cnonce)//
                         .append(':')//
