diff --git a/src/test/java/com/github/dockerjava/core/command/StartContainerCmdImplTest.java b/src/test/java/com/github/dockerjava/core/command/StartContainerCmdImplTest.java
index 70108ae..6408399 100644
--- a/src/test/java/com/github/dockerjava/core/command/StartContainerCmdImplTest.java
+++ b/src/test/java/com/github/dockerjava/core/command/StartContainerCmdImplTest.java
@@ -253,10 +253,10 @@
 				.getExposedPorts()), contains(tcp22, tcp23));
 
 		assertThat(inspectContainerResponse.getNetworkSettings().getPorts()
-				.getBindings().get(tcp22)[0].getHostPort(), is(notNullValue()));
+				.getBindings().get(tcp22)[0].getHostPort(), is(not(equalTo(tcp22.getPort()))));
 
 		assertThat(inspectContainerResponse.getNetworkSettings().getPorts()
-				.getBindings().get(tcp23)[0], is(notNullValue()));
+				.getBindings().get(tcp23)[0].getHostPort(), is(not(equalTo(tcp23.getPort()))));
 
 	}
 
