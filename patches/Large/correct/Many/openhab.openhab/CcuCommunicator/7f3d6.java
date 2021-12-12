diff --git a/bundles/binding/org.openhab.binding.homematic/src/main/java/org/openhab/binding/homematic/internal/communicator/CcuCommunicator.java b/bundles/binding/org.openhab.binding.homematic/src/main/java/org/openhab/binding/homematic/internal/communicator/CcuCommunicator.java
index 3eb189c..a9b8f7b 100644
--- a/bundles/binding/org.openhab.binding.homematic/src/main/java/org/openhab/binding/homematic/internal/communicator/CcuCommunicator.java
+++ b/bundles/binding/org.openhab.binding.homematic/src/main/java/org/openhab/binding/homematic/internal/communicator/CcuCommunicator.java
@@ -329,7 +329,7 @@
 			if (bindingConfig.getAction() == BindingAction.RELOAD_VARIABLES) {
 				stateHolder.reloadVariables();
 			} else if (bindingConfig.getAction() == BindingAction.RELOAD_DATAPOINTS) {
-				stateHolder.reloadVariables();
+				stateHolder.reloadDatapoints();
 			} else {
 				logger.warn("Unknown action {}", bindingConfig.getAction());
 			}
