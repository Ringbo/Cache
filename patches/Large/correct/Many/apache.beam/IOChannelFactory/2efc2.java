diff --git a/sdks/java/core/src/main/java/org/apache/beam/sdk/util/IOChannelFactory.java b/sdks/java/core/src/main/java/org/apache/beam/sdk/util/IOChannelFactory.java
index c89c7ad..ae6c507 100644
--- a/sdks/java/core/src/main/java/org/apache/beam/sdk/util/IOChannelFactory.java
+++ b/sdks/java/core/src/main/java/org/apache/beam/sdk/util/IOChannelFactory.java
@@ -98,5 +98,5 @@
    * Where the {@code other} path has a root component then resolution is highly implementation
    * dependent and therefore unspecified.
    */
-  public String resolve(String path, String other) throws IOException;
+  String resolve(String path, String other) throws IOException;
 }
