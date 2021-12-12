diff --git a/core/client/fs/src/main/java/alluxio/client/file/policy/SpecificHostPolicy.java b/core/client/fs/src/main/java/alluxio/client/file/policy/SpecificHostPolicy.java
index 66b8795..faba176 100644
--- a/core/client/fs/src/main/java/alluxio/client/file/policy/SpecificHostPolicy.java
+++ b/core/client/fs/src/main/java/alluxio/client/file/policy/SpecificHostPolicy.java
@@ -36,7 +36,7 @@
    * @param hostname the name of the host
    */
   public SpecificHostPolicy(String hostname) {
-    mHostname = Preconditions.checkNotNull(hostname);
+    mHostname = Preconditions.checkNotNull(hostname, "hostname");
   }
 
   @Override
