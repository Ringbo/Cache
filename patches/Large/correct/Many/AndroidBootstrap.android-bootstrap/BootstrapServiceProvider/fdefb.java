diff --git a/app/src/main/java/com/donnfelker/android/bootstrap/BootstrapServiceProvider.java b/app/src/main/java/com/donnfelker/android/bootstrap/BootstrapServiceProvider.java
index 6d03c8e..75797ff 100644
--- a/app/src/main/java/com/donnfelker/android/bootstrap/BootstrapServiceProvider.java
+++ b/app/src/main/java/com/donnfelker/android/bootstrap/BootstrapServiceProvider.java
@@ -29,6 +29,6 @@
      * @throws AccountsException
      */
     public BootstrapService getService(Activity activity) throws IOException, AccountsException {
-        return new BootstrapService(keyProvider.getAuthKey(), userAgentProvider);
+        return new BootstrapService(keyProvider.getAuthKey(activity), userAgentProvider);
     }
 }
