diff --git a/services/java/com/android/server/pm/SELinuxMMAC.java b/services/java/com/android/server/pm/SELinuxMMAC.java
index 91de6d8..af7153f 100644
--- a/services/java/com/android/server/pm/SELinuxMMAC.java
+++ b/services/java/com/android/server/pm/SELinuxMMAC.java
@@ -115,7 +115,6 @@
 
     /**
      * Parses an MMAC install policy from a predefined list of locations.
-     * @param none
      * @return boolean indicating whether an install policy was correctly parsed.
      */
     public static boolean readInstallPolicy() {
@@ -125,7 +124,7 @@
 
     /**
      * Parses an MMAC install policy given as an argument.
-     * @param File object representing the path of the policy.
+     * @param policyFile object representing the path of the policy.
      * @return boolean indicating whether the install policy was correctly parsed.
      */
     public static boolean readInstallPolicy(File policyFile) {
@@ -357,8 +356,7 @@
     /**
      * Labels a package based on an seinfo tag from install policy.
      * The label is attached to the ApplicationInfo instance of the package.
-     * @param PackageParser.Package object representing the package
-     *         to labeled.
+     * @param pkg object representing the package to be labeled.
      * @return boolean which determines whether a non null seinfo label
      *         was assigned to the package. A null value simply meaning that
      *         no policy matched.
@@ -426,7 +424,7 @@
         try {
             storedHash = IoUtils.readFileAsByteArray(SEAPP_HASH_FILE);
         } catch (IOException ioe) {
-            Slog.e(TAG, "Error opening " + SEAPP_HASH_FILE + ". Assuming first boot.", ioe);
+            Slog.w(TAG, "Error opening " + SEAPP_HASH_FILE + ". Assuming first boot.");
         }
 
         return (storedHash == null || !MessageDigest.isEqual(storedHash, currentHash));
