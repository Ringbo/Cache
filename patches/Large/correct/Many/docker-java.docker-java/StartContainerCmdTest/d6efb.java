diff --git a/src/test/java/com/github/dockerjava/client/command/StartContainerCmdTest.java b/src/test/java/com/github/dockerjava/client/command/StartContainerCmdTest.java
index 4ea95fe..5bb2425 100644
--- a/src/test/java/com/github/dockerjava/client/command/StartContainerCmdTest.java
+++ b/src/test/java/com/github/dockerjava/client/command/StartContainerCmdTest.java
@@ -116,10 +116,10 @@
 				contains(tcp22, tcp23));
 
 		assertThat(inspectContainerResponse.getHostConfig().getPortBindings().getBindings().get(tcp22),
-				is(equalTo(Ports.Binding("0.0.0.0", 11022))));
+				is(equalTo(Ports.Binding(11022))));
 
 		assertThat(inspectContainerResponse.getHostConfig().getPortBindings().getBindings().get(tcp23),
-				is(equalTo(Ports.Binding("0.0.0.0", 11023))));
+				is(equalTo(Ports.Binding(11023))));
 
 		tmpContainers.add(container.getId());
 	}
