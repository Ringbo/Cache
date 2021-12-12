diff --git a/components/kubernetes-assertions/src/test/java/io/fabric8/kubernetes/assertions/Example.java b/components/kubernetes-assertions/src/test/java/io/fabric8/kubernetes/assertions/Example.java
index e373062..a0016e9 100644
--- a/components/kubernetes-assertions/src/test/java/io/fabric8/kubernetes/assertions/Example.java
+++ b/components/kubernetes-assertions/src/test/java/io/fabric8/kubernetes/assertions/Example.java
@@ -55,7 +55,7 @@
                 }
             });
 
-            assertThat(client).replicationController("fabric8-console-controller").hasId("fabric8-console-controller");
+            assertThat(client).replicationController("fabric8-console-controller").hasName("fabric8-console-controller");
 
             Map<String, String> consoleLabels = new HashMap<>();
             consoleLabels.put("component", "fabric8Console");
@@ -65,7 +65,7 @@
             assertAssertionError(new Block() {
                 @Override
                 public void invoke() throws Exception {
-                    assertThat(client).replicationController("doesNotExist").hasId("fabric8-console-controller");
+                    assertThat(client).replicationController("doesNotExist").hasName("fabric8-console-controller");
                 }
             });
 
