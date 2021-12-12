diff --git a/common/buildcraft/robotics/ai/AIRobotSearchBlockBase.java b/common/buildcraft/robotics/ai/AIRobotSearchBlockBase.java
index 16f3473..de0c954 100644
--- a/common/buildcraft/robotics/ai/AIRobotSearchBlockBase.java
+++ b/common/buildcraft/robotics/ai/AIRobotSearchBlockBase.java
@@ -36,7 +36,7 @@
 		blockScanner = new PathFindingSearch(robot.worldObj, new BlockIndex(
 				robot), blockIter, pathFound, 96, robot
 				.getZoneToWork());
-		blockScannerJob = new IterableAlgorithmRunner(blockScanner, 40000);
+		blockScannerJob = new IterableAlgorithmRunner(blockScanner);
 		blockScannerJob.start();
 	}
 
