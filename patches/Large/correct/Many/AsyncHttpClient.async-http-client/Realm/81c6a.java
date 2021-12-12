diff --git a/src/main/java/com/ning/http/client/Realm.java b/src/main/java/com/ning/http/client/Realm.java
index 09b57b2..5a9c22d 100644
--- a/src/main/java/com/ning/http/client/Realm.java
+++ b/src/main/java/com/ning/http/client/Realm.java
@@ -153,7 +153,7 @@
         return result;
     }
 
-    public class Builder {
+    public static class Builder {
 
         private String principal = "";
         private String password = "";
