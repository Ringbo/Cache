diff --git a/services/tests/servicestests/src/com/android/server/pm/PackageManagerSettingsTests.java b/services/tests/servicestests/src/com/android/server/pm/PackageManagerSettingsTests.java
index 5f93e6f..0f531b7 100644
--- a/services/tests/servicestests/src/com/android/server/pm/PackageManagerSettingsTests.java
+++ b/services/tests/servicestests/src/com/android/server/pm/PackageManagerSettingsTests.java
@@ -139,7 +139,7 @@
         // Write the package files and make sure they're parsed properly the first time
         writeOldFiles();
         Settings settings = new Settings(getContext(), getContext().getFilesDir());
-        assertEquals(true, settings.readLPw(null));
+        assertEquals(true, settings.readLPw(null, 0, false));
         assertNotNull(settings.peekPackageLPr(PACKAGE_NAME_3));
         assertNotNull(settings.peekPackageLPr(PACKAGE_NAME_1));
 
@@ -157,11 +157,11 @@
         // Write the package files and make sure they're parsed properly the first time
         writeOldFiles();
         Settings settings = new Settings(getContext(), getContext().getFilesDir());
-        assertEquals(true, settings.readLPw(null));
+        assertEquals(true, settings.readLPw(null, 0, false));
 
         // Create Settings again to make it read from the new files
         settings = new Settings(getContext(), getContext().getFilesDir());
-        assertEquals(true, settings.readLPw(null));
+        assertEquals(true, settings.readLPw(null, 0, false));
 
         PackageSetting ps = settings.peekPackageLPr(PACKAGE_NAME_2);
         assertEquals(COMPONENT_ENABLED_STATE_DISABLED_USER, ps.getEnabled(0));
@@ -172,7 +172,7 @@
         // Write the package files and make sure they're parsed properly the first time
         writeOldFiles();
         Settings settings = new Settings(getContext(), getContext().getFilesDir());
-        assertEquals(true, settings.readLPw(null));
+        assertEquals(true, settings.readLPw(null, 0, false));
 
         // Enable/Disable a package
         PackageSetting ps = settings.peekPackageLPr(PACKAGE_NAME_1);
