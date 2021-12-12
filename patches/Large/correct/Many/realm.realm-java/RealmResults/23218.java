diff --git a/realm/src/main/java/io/realm/RealmResults.java b/realm/src/main/java/io/realm/RealmResults.java
index 05508a9..6b292da 100644
--- a/realm/src/main/java/io/realm/RealmResults.java
+++ b/realm/src/main/java/io/realm/RealmResults.java
@@ -109,7 +109,7 @@
      */
     @Override
     public int indexOf(Object o) {
-        throw new NoSuchMethodError();
+        throw new NoSuchMethodError("indexOf is not supported on RealmResults");
     }
 
     /**
