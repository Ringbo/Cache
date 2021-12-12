diff --git a/realm/src/main/java/io/realm/RealmObject.java b/realm/src/main/java/io/realm/RealmObject.java
index 524a4d2..28a5891 100644
--- a/realm/src/main/java/io/realm/RealmObject.java
+++ b/realm/src/main/java/io/realm/RealmObject.java
@@ -51,6 +51,6 @@
         if (realm == null) {
             throw new IllegalStateException("Object malformed: missing Realm. Make sure to instantiate RealmObjects with Realm.createObject()");
         }
-        row.getTable().remove(row.getIndex());
+        row.getTable().moveLastOver(row.getIndex());
     }
 }
