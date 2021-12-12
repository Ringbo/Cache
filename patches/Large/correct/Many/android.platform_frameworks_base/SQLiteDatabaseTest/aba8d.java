diff --git a/core/tests/coretests/src/android/database/sqlite/SQLiteDatabaseTest.java b/core/tests/coretests/src/android/database/sqlite/SQLiteDatabaseTest.java
index 4d228c4..b098b5c 100644
--- a/core/tests/coretests/src/android/database/sqlite/SQLiteDatabaseTest.java
+++ b/core/tests/coretests/src/android/database/sqlite/SQLiteDatabaseTest.java
@@ -78,7 +78,7 @@
         try {
             mDatabase.setConnectionPoolSize(0);
             fail("IllegalStateException expected");
-        } catch (IllegalStateException e) {
+        } catch (IllegalArgumentException e) {
             assertTrue(e.getMessage().contains("less than the current max value"));
         }
         // set pool size to a valid value
@@ -88,7 +88,7 @@
         try {
             mDatabase.setConnectionPoolSize(1);
             fail("IllegalStateException expected");
-        } catch (IllegalStateException e) {
+        } catch (IllegalArgumentException e) {
             assertTrue(e.getMessage().contains("less than the current max value"));
         }
     }
