diff --git a/modules/test/cobertura-agent/src/com/liferay/cobertura/agent/coveragedata/TouchCollector.java b/modules/test/cobertura-agent/src/com/liferay/cobertura/agent/coveragedata/TouchCollector.java
index 431d73f..38b86f0 100644
--- a/modules/test/cobertura-agent/src/com/liferay/cobertura/agent/coveragedata/TouchCollector.java
+++ b/modules/test/cobertura-agent/src/com/liferay/cobertura/agent/coveragedata/TouchCollector.java
@@ -116,7 +116,8 @@
 		public boolean equals(Object obj) {
 			JumpTouchData jumpTouchData = (JumpTouchData)obj;
 
-			if ((_branch == jumpTouchData._branch) &&
+			if (super.equals(jumpTouchData) &&
+				(_branch == jumpTouchData._branch) &&
 				(_branchNumber == jumpTouchData._branchNumber)) {
 
 				return true;
@@ -201,7 +202,8 @@
 		public boolean equals(Object obj) {
 			SwitchTouchData switchTouchData = (SwitchTouchData)obj;
 
-			if ((_branch == switchTouchData._branch) &&
+			if (super.equals(switchTouchData) &&
+				(_branch == switchTouchData._branch) &&
 				(_switchNumber == switchTouchData._switchNumber)) {
 
 				return true;
