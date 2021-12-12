diff --git a/src/biz/bokhorst/xprivacy/XSensorManager.java b/src/biz/bokhorst/xprivacy/XSensorManager.java
index da86fa0..cfa6f07 100644
--- a/src/biz/bokhorst/xprivacy/XSensorManager.java
+++ b/src/biz/bokhorst/xprivacy/XSensorManager.java
@@ -114,14 +114,14 @@
 				|| type == Sensor.TYPE_ROTATION_VECTOR) {
 			if (isRestricted(param, "rotation"))
 				return true;
-		} else if (type == Sensor.TYPE_AMBIENT_TEMPERATURE) {
+		} else if (type == Sensor.TYPE_TEMPERATURE || type == Sensor.TYPE_AMBIENT_TEMPERATURE) {
 			if (isRestricted(param, "temperature"))
 				return true;
 		} else if (type == Sensor.TYPE_STEP_COUNTER || type == Sensor.TYPE_STEP_DETECTOR) {
 			if (isRestricted(param, "step"))
 				return true;
 		} else
-			Util.log(this, Log.WARN, "Unknown sensor type=" + type);
+			Util.log(this, Log.ERROR, "Unknown sensor type=" + type);
 		return false;
 	}
 }
