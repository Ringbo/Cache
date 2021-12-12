diff --git a/common/buildcraft/core/robots/AIRobotRecharge.java b/common/buildcraft/core/robots/AIRobotRecharge.java
index d308e0b..1a1940b 100755
--- a/common/buildcraft/core/robots/AIRobotRecharge.java
+++ b/common/buildcraft/core/robots/AIRobotRecharge.java
@@ -37,7 +37,7 @@
 	public void update() {
 		PipeTransportPower powerProvider = (PipeTransportPower) ((DockingStation) robot.getDockingStation()).getPipe().pipe.transport;
 
-		int amount = robot.getBattery().receiveEnergy(1000, false);
+		int amount = robot.getBattery().receiveEnergy(1000, true);
 		
 		powerProvider.requestEnergy(robot.getDockingStation().side(), amount);
 		
