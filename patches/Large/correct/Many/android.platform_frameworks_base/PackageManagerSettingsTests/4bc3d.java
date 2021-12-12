diff --git a/services/tests/servicestests/src/com/android/server/pm/PackageManagerSettingsTests.java b/services/tests/servicestests/src/com/android/server/pm/PackageManagerSettingsTests.java
index 6a471fe..a3f3a5d 100644
--- a/services/tests/servicestests/src/com/android/server/pm/PackageManagerSettingsTests.java
+++ b/services/tests/servicestests/src/com/android/server/pm/PackageManagerSettingsTests.java
@@ -157,7 +157,7 @@
         settings.writeLPr();
 
         // Create Settings again to make it read from the new files
-        settings = new Settings(getContext(), getContext().getFilesDir(), new Object());
+        settings = new Settings(getContext().getFilesDir(), new Object());
         assertEquals(true, settings.readLPw(null, null, 0, false));
 
         PackageSetting ps = settings.peekPackageLPr(PACKAGE_NAME_2);
@@ -168,7 +168,7 @@
     public void testEnableDisable() {
         // Write the package files and make sure they're parsed properly the first time
         writeOldFiles();
-        Settings settings = new Settings(getContext(), getContext().getFilesDir(), new Object());
+        Settings settings = new Settings(getContext().getFilesDir(), new Object());
         assertEquals(true, settings.readLPw(null, null, 0, false));
 
         // Enable/Disable a package
