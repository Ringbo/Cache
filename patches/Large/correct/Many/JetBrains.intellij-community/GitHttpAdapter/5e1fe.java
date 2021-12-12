diff --git a/plugins/git4idea/src/git4idea/jgit/GitHttpAdapter.java b/plugins/git4idea/src/git4idea/jgit/GitHttpAdapter.java
index f5ef78f..6c12175 100644
--- a/plugins/git4idea/src/git4idea/jgit/GitHttpAdapter.java
+++ b/plugins/git4idea/src/git4idea/jgit/GitHttpAdapter.java
@@ -65,11 +65,11 @@
 
   private static final Pattern HTTP_URL_WITH_USERNAME_AND_PASSWORD = Pattern.compile("http(s?)://([^\\s^@:]+):([^\\s^@:]+)@.*");
 
-  public static boolean isHttpUrlWithoutUserCredentials(@NotNull String url) {
-    // if username & password are specified in the url, give it to the native Git
+  public static boolean shouldUseJGit(@NotNull String url) {
     if (!url.startsWith("http")) {
       return false;
     }
+    // if username & password are specified in the url, give it to the native Git
     if (HTTP_URL_WITH_USERNAME_AND_PASSWORD.matcher(url).matches()) {
       return false;
     }
@@ -79,11 +79,11 @@
       return !netrcData.hasAuthDataForUrl(url);
     }
     catch (FileNotFoundException e) {
-      return false;
+      return true;
     }
     catch (IOException e) {
       LOG.warn("Couldn't read netrc file", e);
-      return false;
+      return true;
     }
   }
 
