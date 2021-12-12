diff --git a/ambari-server/src/test/java/org/apache/ambari/server/controller/AmbariManagementControllerImplTest.java b/ambari-server/src/test/java/org/apache/ambari/server/controller/AmbariManagementControllerImplTest.java
index 42e3b10..5838001 100644
--- a/ambari-server/src/test/java/org/apache/ambari/server/controller/AmbariManagementControllerImplTest.java
+++ b/ambari-server/src/test/java/org/apache/ambari/server/controller/AmbariManagementControllerImplTest.java
@@ -560,10 +560,10 @@
     expect(injector.getInstance(Gson.class)).andReturn(null);
     expect(injector.getInstance(MaintenanceStateHelper.class)).andReturn(null);
     expect(injector.getInstance(KerberosHelper.class)).andReturn(kerberosHelper);
-    expect(clusterRequest.getClusterName()).andReturn("clusterNew").times(4);
+    expect(clusterRequest.getClusterName()).andReturn("clusterNew").times(3);
     expect(clusterRequest.getClusterId()).andReturn(1L).times(6);
     expect(clusters.getClusterById(1L)).andReturn(cluster).times(2);
-    expect(cluster.getClusterName()).andReturn("clusterOld").times(2);
+    expect(cluster.getClusterName()).andReturn("clusterOld").times(1);
 
     cluster.addSessionAttributes(anyObject(Map.class));
     expectLastCall().once();
@@ -676,7 +676,7 @@
     expect(injector.getInstance(KerberosHelper.class)).andReturn(kerberosHelper);
     expect(clusterRequest.getClusterId()).andReturn(1L).times(6);
     expect(clusters.getClusterById(1L)).andReturn(cluster).times(2);
-    expect(cluster.getClusterName()).andReturn("cluster").times(2);
+    expect(cluster.getClusterName()).andReturn("cluster").times(1);
 
     cluster.addSessionAttributes(anyObject(Map.class));
     expectLastCall().once();
@@ -719,7 +719,7 @@
     expect(clusterRequest.getClusterId()).andReturn(1L).times(6);
     expect(clusterRequest.getSecurityType()).andReturn(SecurityType.KERBEROS).anyTimes();
     expect(clusters.getClusterById(1L)).andReturn(cluster).times(2);
-    expect(cluster.getClusterName()).andReturn("cluster").times(2);
+    expect(cluster.getClusterName()).andReturn("cluster").times(1);
     expect(cluster.getSecurityType()).andReturn(SecurityType.KERBEROS).anyTimes();
 
     cluster.addSessionAttributes(anyObject(Map.class));
@@ -766,7 +766,7 @@
     expect(clusterRequest.getClusterId()).andReturn(1L).times(6);
     expect(clusterRequest.getSecurityType()).andReturn(SecurityType.KERBEROS).anyTimes();
     expect(clusters.getClusterById(1L)).andReturn(cluster).times(2);
-    expect(cluster.getClusterName()).andReturn("cluster").times(2);
+    expect(cluster.getClusterName()).andReturn("cluster").times(1);
     expect(cluster.getSecurityType()).andReturn(SecurityType.NONE).anyTimes();
 
     cluster.addSessionAttributes(anyObject(Map.class));
@@ -847,7 +847,7 @@
     expect(clusterRequest.getClusterId()).andReturn(1L).times(6);
     expect(clusterRequest.getSecurityType()).andReturn(SecurityType.NONE).anyTimes();
     expect(clusters.getClusterById(1L)).andReturn(cluster).times(2);
-    expect(cluster.getClusterName()).andReturn("cluster").times(2);
+    expect(cluster.getClusterName()).andReturn("cluster").times(1);
     expect(cluster.getSecurityType()).andReturn(SecurityType.KERBEROS).anyTimes();
 
     cluster.addSessionAttributes(anyObject(Map.class));
@@ -902,7 +902,7 @@
     expect(clusterRequest.getSecurityType()).andReturn(SecurityType.NONE).anyTimes();
     expect(clusters.getClusterById(1L)).andReturn(cluster).times(2);
     expect(cluster.getResourceId()).andReturn(1L).times(3);
-    expect(cluster.getClusterName()).andReturn("cluster").times(2);
+    expect(cluster.getClusterName()).andReturn("cluster").times(1);
     expect(cluster.getSecurityType()).andReturn(SecurityType.KERBEROS).anyTimes();
     expect(cluster.getCurrentClusterVersion()).andReturn(null).anyTimes();
     expect(cluster.getCurrentStackVersion()).andReturn(null).anyTimes();
@@ -966,10 +966,10 @@
     expect(injector.getInstance(Gson.class)).andReturn(null);
     expect(injector.getInstance(MaintenanceStateHelper.class)).andReturn(null);
     expect(injector.getInstance(KerberosHelper.class)).andReturn(createNiceMock(KerberosHelper.class));
-    expect(clusterRequest.getClusterName()).andReturn("clusterNew").times(4);
+    expect(clusterRequest.getClusterName()).andReturn("clusterNew").times(3);
     expect(clusterRequest.getClusterId()).andReturn(1L).times(6);
     expect(clusters.getClusterById(1L)).andReturn(cluster).times(2);
-    expect(cluster.getClusterName()).andReturn("clusterOld").times(2);
+    expect(cluster.getClusterName()).andReturn("clusterOld").times(1);
     cluster.setClusterName("clusterNew");
     expectLastCall().andThrow(new RollbackException());
 
