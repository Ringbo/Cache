diff --git a/realm/realm-library/src/androidTest/java/io/realm/RealmTests.java b/realm/realm-library/src/androidTest/java/io/realm/RealmTests.java
index 528b9e1..5e65a02 100644
--- a/realm/realm-library/src/androidTest/java/io/realm/RealmTests.java
+++ b/realm/realm-library/src/androidTest/java/io/realm/RealmTests.java
@@ -1983,9 +1983,7 @@
         assertTrue(Realm.deleteRealm(configuration));
 
         // Directory should be empty now
-        // FIXME: .note file is the named pipe for OS android notification. Just don't delete it until we figure out
-        // one single daemon thread for notification.
-        assertEquals(/*0*/1, tempDir.listFiles().length);
+        assertEquals(0, tempDir.listFiles().length);
     }
 
     // Test that all methods that require a transaction (ie. any function that mutates Realm data)
