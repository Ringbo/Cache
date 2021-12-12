diff --git a/infrastructures/openshift/src/test/java/org/eclipse/che/workspace/infrastructure/openshift/OpenShiftInternalRuntimeTest.java b/infrastructures/openshift/src/test/java/org/eclipse/che/workspace/infrastructure/openshift/OpenShiftInternalRuntimeTest.java
index f0e7da1..0e479bd 100644
--- a/infrastructures/openshift/src/test/java/org/eclipse/che/workspace/infrastructure/openshift/OpenShiftInternalRuntimeTest.java
+++ b/infrastructures/openshift/src/test/java/org/eclipse/che/workspace/infrastructure/openshift/OpenShiftInternalRuntimeTest.java
@@ -188,7 +188,7 @@
     try {
       internalRuntime.internalStart(emptyMap());
     } catch (Exception rethrow) {
-      verify(project, times(2)).cleanUp();
+      verify(project, times(1)).cleanUp();
       verify(project, never()).services();
       verify(project, never()).routes();
       verify(project, never()).pods();
@@ -206,7 +206,7 @@
     try {
       internalRuntime.internalStart(emptyMap());
     } catch (Exception rethrow) {
-      verify(project, times(2)).cleanUp();
+      verify(project, times(1)).cleanUp();
       verify(project, never()).services();
       verify(project, never()).routes();
       verify(project, never()).pods();
@@ -248,7 +248,7 @@
     try {
       internalRuntime.internalStart(emptyMap());
     } catch (Exception rethrow) {
-      verify(project, times(2)).cleanUp();
+      verify(project, times(1)).cleanUp();
       verify(project, never()).services();
       verify(project, never()).routes();
       verify(project, never()).pods();
@@ -270,7 +270,7 @@
     try {
       internalRuntime.internalStart(emptyMap());
     } catch (Exception rethrow) {
-      verify(project, times(2)).cleanUp();
+      verify(project, times(1)).cleanUp();
       verify(pods, times(1)).create(any());
       verify(routes, times(1)).create(any());
       verify(services, times(1)).create(any());
