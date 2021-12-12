diff --git a/components/kubernetes-assertions/src/test/java/io/fabric8/kubernetes/assertions/ExampleTest.java b/components/kubernetes-assertions/src/test/java/io/fabric8/kubernetes/assertions/ExampleTest.java
index a70bdf1..44a73d0 100644
--- a/components/kubernetes-assertions/src/test/java/io/fabric8/kubernetes/assertions/ExampleTest.java
+++ b/components/kubernetes-assertions/src/test/java/io/fabric8/kubernetes/assertions/ExampleTest.java
@@ -39,15 +39,15 @@
         expectedLabels.put("foo", "bar");
 
         final Pod pod = new Pod();
-        pod.setId(expectedId);
+        pod.setName(expectedId);
         pod.setLabels(expectedLabels);
 
-        assertThat(pod).hasId(expectedId).hasLabels(expectedLabels);
+        assertThat(pod).hasName(expectedId).hasLabels(expectedLabels);
 
         assertAssertionError(new Block() {
             @Override
             public void invoke() throws Exception {
-                assertThat(pod).hasId("cheese");
+                assertThat(pod).hasName("cheese");
             }
         });
 
