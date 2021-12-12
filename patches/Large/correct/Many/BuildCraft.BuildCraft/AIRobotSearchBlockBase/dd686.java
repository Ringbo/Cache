diff --git a/common/buildcraft/robots/ai/AIRobotSearchBlockBase.java b/common/buildcraft/robots/ai/AIRobotSearchBlockBase.java
index 3d12817..e5da69e 100644
--- a/common/buildcraft/robots/ai/AIRobotSearchBlockBase.java
+++ b/common/buildcraft/robots/ai/AIRobotSearchBlockBase.java
@@ -36,7 +36,7 @@
 		blockScanner = new PathFindingSearch(robot.worldObj, new BlockIndex(
 				robot), blockIter, pathFound, 96, robot
 				.getZoneToWork());
-		blockScannerJob = new IterableAlgorithmRunner(blockScanner, 40000);
+		blockScannerJob = new IterableAlgorithmRunner(blockScanner);
 		blockScannerJob.start();
 	}
 
