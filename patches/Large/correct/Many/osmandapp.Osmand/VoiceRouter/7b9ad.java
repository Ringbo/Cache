diff --git a/OsmAnd/src/net/osmand/plus/routing/VoiceRouter.java b/OsmAnd/src/net/osmand/plus/routing/VoiceRouter.java
index 08ae6ab..8a27303 100644
--- a/OsmAnd/src/net/osmand/plus/routing/VoiceRouter.java
+++ b/OsmAnd/src/net/osmand/plus/routing/VoiceRouter.java
@@ -236,12 +236,12 @@
 			}
 			
 			
-		} else if (alarm.getTime() == AlarmInfo.SPEED_CAMERA) {
+		} else if (alarm.getType() == AlarmInfo.SPEED_CAMERA) {
 			if (router.getSettings().SPEAK_SPEED_CAMERA.get() && ms - lastAnnouncedSpeedCamera > 100 * 1000) {
 				CommandBuilder p = getNewCommandPlayerToPlay();
 				if (p != null) {
 					lastAnnouncedSpeedCamera = ms;
-					p.speedAlarm().play();
+					p.attention(alarm.getType()+"").play();
 				}
 			}
 		} else {
@@ -249,7 +249,7 @@
 				CommandBuilder p = getNewCommandPlayerToPlay();
 				if (p != null) {
 					lastAnnouncedWarning = ms;
-					p.speedAlarm().play();
+					p.attention(alarm.getType()+"").play();
 				}
 			}
 		}
