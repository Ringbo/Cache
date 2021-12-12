diff --git a/fabric/fabric-commands/src/main/java/io/fabric8/commands/ContainerInfoAction.java b/fabric/fabric-commands/src/main/java/io/fabric8/commands/ContainerInfoAction.java
index c872b40..4b4d4f7 100644
--- a/fabric/fabric-commands/src/main/java/io/fabric8/commands/ContainerInfoAction.java
+++ b/fabric/fabric-commands/src/main/java/io/fabric8/commands/ContainerInfoAction.java
@@ -59,7 +59,7 @@
 		Container container = fabricService.getContainer(containerName);
 
 		System.out.println(String.format(FORMAT, "Name:", container.getId()));
-		System.out.println(String.format(FORMAT, "Version:", container.getVersion()));
+		System.out.println(String.format(FORMAT, "Version:", container.getVersionId()));
 		System.out.println(String.format(FORMAT, "Connected:", container.isAlive()));
         System.out.println(String.format(FORMAT, "Type:", emptyIfNull(container.getType())));
         Long processId = container.getProcessId();
