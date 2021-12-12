diff --git a/realm/realm-library/src/androidTest/java/io/realm/RealmTests.java b/realm/realm-library/src/androidTest/java/io/realm/RealmTests.java
index 37aaa12..a4ddd7f 100644
--- a/realm/realm-library/src/androidTest/java/io/realm/RealmTests.java
+++ b/realm/realm-library/src/androidTest/java/io/realm/RealmTests.java
@@ -3821,7 +3821,7 @@
                 return name.matches("realm_.*cv");
             }
         });
-        assertEquals(1, files.length);
+        assertEquals(2, files.length);
 
         // Tests if it works when the namedPipeDir and the named pipe files already exist.
         realmOnExternalStorage = Realm.getInstance(config);
