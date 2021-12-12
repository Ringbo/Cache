diff --git a/examples/introExample/src/main/java/io/realm/examples/intro/RealmIntroExampleActivity.java b/examples/introExample/src/main/java/io/realm/examples/intro/RealmIntroExampleActivity.java
index b0b87fe..105d818 100644
--- a/examples/introExample/src/main/java/io/realm/examples/intro/RealmIntroExampleActivity.java
+++ b/examples/introExample/src/main/java/io/realm/examples/intro/RealmIntroExampleActivity.java
@@ -107,7 +107,7 @@
 
         // Open the default realm. All threads must use it's own reference to the realm.
         // Those can not be transferred across threads.
-        Realm realm = Realm.getInstance(this);
+        Realm realm = Realm.getInstance(this, false);
 
         // Add ten persons in one write transaction
         realm.beginTransaction();
