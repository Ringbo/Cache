diff --git a/components/fabric8-arquillian/src/main/java/io/fabric8/arquillian/kubernetes/await/SessionPodsAreReady.java b/components/fabric8-arquillian/src/main/java/io/fabric8/arquillian/kubernetes/await/SessionPodsAreReady.java
index c1f65f0..39b944f 100644
--- a/components/fabric8-arquillian/src/main/java/io/fabric8/arquillian/kubernetes/await/SessionPodsAreReady.java
+++ b/components/fabric8-arquillian/src/main/java/io/fabric8/arquillian/kubernetes/await/SessionPodsAreReady.java
@@ -60,7 +60,10 @@
                 result = false;
                 PodStatus podStatus = pod.getStatus();
                 int restartCount = 0;
-                if (podStatus != null) {
+
+                // Skip waiting for "Succeeded" pods, since could see pods like s2i builds
+                // that are done.  see: OSFUSE-317
+                if (podStatus != null && !"Succeeded".equals(podStatus.getPhase()) ) {
                     List<ContainerStatus> containerStatuses = podStatus.getContainerStatuses();
                     for (ContainerStatus containerStatus : containerStatuses) {
                         if (restartCount == 0) {
