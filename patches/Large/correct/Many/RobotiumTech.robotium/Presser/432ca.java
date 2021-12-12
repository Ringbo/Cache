diff --git a/robotium-solo/src/main/java/com/jayway/android/robotium/solo/Presser.java b/robotium-solo/src/main/java/com/jayway/android/robotium/solo/Presser.java
index 8c516aa..95e8b5e 100755
--- a/robotium-solo/src/main/java/com/jayway/android/robotium/solo/Presser.java
+++ b/robotium-solo/src/main/java/com/jayway/android/robotium/solo/Presser.java
@@ -61,14 +61,14 @@
 				RobotiumUtils.sleep(300);
 				inst.sendKeyDownUpSync(KeyEvent.KEYCODE_DPAD_RIGHT);
 			}
-		} else if (index >= 3 && index <= 5) {
+		} else if (index >= 3 && index < 5) {
 			inst.sendKeyDownUpSync(KeyEvent.KEYCODE_DPAD_DOWN);	
 			
 			for (int i = 3; i < index; i++) {
 				RobotiumUtils.sleep(300);
 				inst.sendKeyDownUpSync(KeyEvent.KEYCODE_DPAD_RIGHT);
 			}
-		} else if (index > 5) {
+		} else if (index >= 5) {
 			inst.sendKeyDownUpSync(KeyEvent.KEYCODE_DPAD_DOWN);	
 			inst.sendKeyDownUpSync(KeyEvent.KEYCODE_DPAD_DOWN);	
 			
