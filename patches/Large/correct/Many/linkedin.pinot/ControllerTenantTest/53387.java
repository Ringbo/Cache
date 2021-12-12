diff --git a/pinot-controller/src/test/java/com/linkedin/pinot/controller/helix/ControllerTenantTest.java b/pinot-controller/src/test/java/com/linkedin/pinot/controller/helix/ControllerTenantTest.java
index 9b062bd..109dc09 100644
--- a/pinot-controller/src/test/java/com/linkedin/pinot/controller/helix/ControllerTenantTest.java
+++ b/pinot-controller/src/test/java/com/linkedin/pinot/controller/helix/ControllerTenantTest.java
@@ -83,7 +83,7 @@
     for (int i = 0; i < 4; i++) {
       String brokerTag = "colocated_" + i;
       final String res =
-          sendDeleteRequest(ControllerRequestURLBuilder.baseUrl(CONTROLLER_BASE_API_URL).forBrokerTenantCreate(
+          sendDeleteRequest(ControllerRequestURLBuilder.baseUrl(CONTROLLER_BASE_API_URL).forBrokerTenantDelete(
               brokerTag));
       System.out.println(res);
       System.out.println(_helixAdmin.getInstancesInClusterWithTag(HELIX_CLUSTER_NAME,
@@ -124,7 +124,7 @@
               .size(), 20 - i);
     }
     res =
-        sendDeleteRequest(ControllerRequestURLBuilder.baseUrl(CONTROLLER_BASE_API_URL).forBrokerTenantCreate(brokerTag));
+        sendDeleteRequest(ControllerRequestURLBuilder.baseUrl(CONTROLLER_BASE_API_URL).forBrokerTenantDelete(brokerTag));
     System.out.println(res);
     System.out.println(_helixAdmin.getInstancesInClusterWithTag(HELIX_CLUSTER_NAME,
         CommonConstants.Helix.UNTAGGED_BROKER_INSTANCE).size());
@@ -155,7 +155,7 @@
     for (int i = 0; i < 4; i++) {
       String serverTag = "serverTag_" + i;
       final String res =
-          sendDeleteRequest(ControllerRequestURLBuilder.baseUrl(CONTROLLER_BASE_API_URL).forServerTenantCreate(
+          sendDeleteRequest(ControllerRequestURLBuilder.baseUrl(CONTROLLER_BASE_API_URL).forServerTenantDelete(
               serverTag));
       System.out.println(res);
       System.out.println(_helixAdmin.getInstancesInClusterWithTag(HELIX_CLUSTER_NAME,
@@ -199,7 +199,7 @@
               .size(), 20 - i);
     }
     res =
-        sendDeleteRequest(ControllerRequestURLBuilder.baseUrl(CONTROLLER_BASE_API_URL).forServerTenantCreate(serverTag));
+        sendDeleteRequest(ControllerRequestURLBuilder.baseUrl(CONTROLLER_BASE_API_URL).forServerTenantDelete(serverTag));
     System.out.println(res);
     Assert.assertEquals(_helixAdmin.getInstancesInClusterWithTag(HELIX_CLUSTER_NAME, serverTag + "_OFFLINE").size(), 0);
     Assert
@@ -251,7 +251,7 @@
     for (int i = 0; i < 4; i++) {
       String brokerTag = "colocated_" + i;
       res =
-          sendDeleteRequest(ControllerRequestURLBuilder.baseUrl(CONTROLLER_BASE_API_URL).forBrokerTenantCreate(
+          sendDeleteRequest(ControllerRequestURLBuilder.baseUrl(CONTROLLER_BASE_API_URL).forBrokerTenantDelete(
               brokerTag));
       System.out.println(res);
       System.out.println(_helixAdmin.getInstancesInClusterWithTag(HELIX_CLUSTER_NAME,
@@ -305,7 +305,7 @@
     for (int i = 0; i < 4; i++) {
       String serverTag = "serverTag_" + i;
       res =
-          sendDeleteRequest(ControllerRequestURLBuilder.baseUrl(CONTROLLER_BASE_API_URL).forServerTenantCreate(
+          sendDeleteRequest(ControllerRequestURLBuilder.baseUrl(CONTROLLER_BASE_API_URL).forServerTenantDelete(
               serverTag));
       System.out.println(res);
       Assert.assertEquals(_helixAdmin.getInstancesInClusterWithTag(HELIX_CLUSTER_NAME, serverTag + "_OFFLINE").size(),
