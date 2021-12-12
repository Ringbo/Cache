diff --git a/plugins/plugin-docker/che-plugin-openshift-client/src/main/java/org/eclipse/che/plugin/openshift/client/OpenShiftRouteCreator.java b/plugins/plugin-docker/che-plugin-openshift-client/src/main/java/org/eclipse/che/plugin/openshift/client/OpenShiftRouteCreator.java
index af0a5ee..689ffb1 100644
--- a/plugins/plugin-docker/che-plugin-openshift-client/src/main/java/org/eclipse/che/plugin/openshift/client/OpenShiftRouteCreator.java
+++ b/plugins/plugin-docker/che-plugin-openshift-client/src/main/java/org/eclipse/che/plugin/openshift/client/OpenShiftRouteCreator.java
@@ -97,7 +97,7 @@
       final String cheWorkspacesRoutingSuffix,
       final String namespace) {
     if (cheWorkspacesRoutingSuffix != null) {
-      return routeName + "-" + namespace + "." + cheWorkspacesRoutingSuffix;
+      return routeName + "-" + cheWorkspacesRoutingSuffix;
     } else {
       return routeName + "-" + openShiftNamespaceExternalAddress;
     }
