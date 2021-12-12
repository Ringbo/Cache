diff --git a/fabric/fabric-itests/fabric-pax-exam/src/test/java/org/fusesource/fabric/itests/paxexam/support/ContainerBuilder.java b/fabric/fabric-itests/fabric-pax-exam/src/test/java/org/fusesource/fabric/itests/paxexam/support/ContainerBuilder.java
index 2f58e56..8f1137f 100644
--- a/fabric/fabric-itests/fabric-pax-exam/src/test/java/org/fusesource/fabric/itests/paxexam/support/ContainerBuilder.java
+++ b/fabric/fabric-itests/fabric-pax-exam/src/test/java/org/fusesource/fabric/itests/paxexam/support/ContainerBuilder.java
@@ -55,7 +55,7 @@
         String containerType = System.getProperty(CONTAINER_TYPE_PROPERTY, "child");
         int numberOfContainers = Math.max(minimumNumber, Integer.parseInt(System.getProperty(CONTAINER_NUMBER_PROPERTY, "1")));
 
-        if (maximumNumber < numberOfContainers) {
+        if (maximumNumber < numberOfContainers && maximumNumber != 0) {
             numberOfContainers = minimumNumber;
         }
 
