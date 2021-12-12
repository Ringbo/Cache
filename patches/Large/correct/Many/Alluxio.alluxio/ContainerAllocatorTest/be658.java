diff --git a/integration/yarn/src/test/java/alluxio/yarn/ContainerAllocatorTest.java b/integration/yarn/src/test/java/alluxio/yarn/ContainerAllocatorTest.java
index 33214f3..38e78c0 100644
--- a/integration/yarn/src/test/java/alluxio/yarn/ContainerAllocatorTest.java
+++ b/integration/yarn/src/test/java/alluxio/yarn/ContainerAllocatorTest.java
@@ -115,7 +115,7 @@
             @Override
             public boolean matches(Object o) {
               ContainerRequest request = (ContainerRequest) o;
-              if (request.getRelaxLocality() == false
+              if (request.getRelaxLocality() == true
                   && request.getNodes().size() == 1
                   && request.getNodes().get(0).equals("localhost")) {
                 return true;
