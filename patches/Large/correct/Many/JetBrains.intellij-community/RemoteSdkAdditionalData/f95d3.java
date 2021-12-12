diff --git a/platform/platform-impl/src/com/intellij/remote/RemoteSdkAdditionalData.java b/platform/platform-impl/src/com/intellij/remote/RemoteSdkAdditionalData.java
index dca7f1a..4cb6707 100644
--- a/platform/platform-impl/src/com/intellij/remote/RemoteSdkAdditionalData.java
+++ b/platform/platform-impl/src/com/intellij/remote/RemoteSdkAdditionalData.java
@@ -37,7 +37,7 @@
    * This method switches to use of ssh-credentials based data
    * @param credentials credentials that specify connection
    */
-  void setSshCredentials(@NotNull RemoteSdkCredentialsHolder credentials);
+  void setSshCredentials(@NotNull RemoteCredentialsHolder credentials);
 
   void setDeploymentConnectionType(@NotNull WebDeploymentCredentialsHolder credentials);
 }
