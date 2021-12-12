diff --git a/realm/src/main/java/io/realm/Realm.java b/realm/src/main/java/io/realm/Realm.java
index 2bfabbf..f1c8555 100644
--- a/realm/src/main/java/io/realm/Realm.java
+++ b/realm/src/main/java/io/realm/Realm.java
@@ -920,7 +920,7 @@
         }
 
         // Object is already in this Realm
-        if (object.realm.id == this.id) {
+        if (object.realm != null && object.realm.id == this.id) {
             return object;
         }
 
