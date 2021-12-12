diff --git a/integration/yarn/src/main/java/alluxio/yarn/ContainerAllocator.java b/integration/yarn/src/main/java/alluxio/yarn/ContainerAllocator.java
index 7b45f96..e4aa39f 100644
--- a/integration/yarn/src/main/java/alluxio/yarn/ContainerAllocator.java
+++ b/integration/yarn/src/main/java/alluxio/yarn/ContainerAllocator.java
@@ -145,7 +145,7 @@
     Priority priority;
     if (mPreferredHost != null) {
       hosts = new String[]{mPreferredHost};
-      relaxLocality = !mPreferredHost.equals("localhost");
+      relaxLocality = mPreferredHost.equals("localhost");
       priority = Priority.newInstance(100);
     } else {
       hosts = getPotentialWorkerHosts();
