diff --git a/services/core/java/com/android/server/pm/PackageManagerService.java b/services/core/java/com/android/server/pm/PackageManagerService.java
index a8db535..bc28142 100644
--- a/services/core/java/com/android/server/pm/PackageManagerService.java
+++ b/services/core/java/com/android/server/pm/PackageManagerService.java
@@ -8040,7 +8040,7 @@
 
         applyPolicy(pkg, policyFlags);
 
-        assertPackageIsValid(pkg, policyFlags);
+        assertPackageIsValid(pkg, policyFlags, scanFlags);
 
         // Initialize package source and resource directories
         final File scanFile = new File(pkg.codePath);
@@ -8486,7 +8486,7 @@
      *
      * @throws PackageManagerException If the package fails any of the validation checks
      */
-    private void assertPackageIsValid(PackageParser.Package pkg, int policyFlags)
+    private void assertPackageIsValid(PackageParser.Package pkg, int policyFlags, int scanFlags)
             throws PackageManagerException {
         if ((policyFlags & PackageParser.PARSE_ENFORCE_CODE) != 0) {
             assertCodePolicy(pkg);
@@ -8549,7 +8549,7 @@
             // a new system package, we allow the codepath to change from a system location
             // to the user-installed location. If we don't allow this change, any newer,
             // user-installed version of the application will be ignored.
-            if ((policyFlags & SCAN_REQUIRE_KNOWN) != 0) {
+            if ((scanFlags & SCAN_REQUIRE_KNOWN) != 0) {
                 if (mExpectingBetter.containsKey(pkg.packageName)) {
                     logCriticalInfo(Log.WARN,
                             "Relax SCAN_REQUIRE_KNOWN requirement for package " + pkg.packageName);
@@ -8578,7 +8578,7 @@
             // that conflict with existing packages.  Only do this if the
             // package isn't already installed, since we don't want to break
             // things that are installed.
-            if ((policyFlags & SCAN_NEW_INSTALL) != 0) {
+            if ((scanFlags & SCAN_NEW_INSTALL) != 0) {
                 final int N = pkg.providers.size();
                 int i;
                 for (i=0; i<N; i++) {
