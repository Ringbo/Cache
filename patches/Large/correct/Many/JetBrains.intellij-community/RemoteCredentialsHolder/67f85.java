diff --git a/platform/platform-impl/src/com/intellij/remote/RemoteCredentialsHolder.java b/platform/platform-impl/src/com/intellij/remote/RemoteCredentialsHolder.java
index f5005e0..ace6689 100644
--- a/platform/platform-impl/src/com/intellij/remote/RemoteCredentialsHolder.java
+++ b/platform/platform-impl/src/com/intellij/remote/RemoteCredentialsHolder.java
@@ -247,11 +247,11 @@
           setPassword(null);
           setStorePassword(false);
           setPassphrase(credentials.getPasswordAsString());
-          setStorePassphrase(memoryOnly);
+          setStorePassphrase(!memoryOnly);
         }
         else {
           setPassword(credentials.getPasswordAsString());
-          setStorePassword(memoryOnly);
+          setStorePassword(!memoryOnly);
           setPassphrase(null);
           setStorePassphrase(false);
         }
