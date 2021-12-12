diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/utils/ClickListener.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/utils/ClickListener.java
index 54411d9..9ed55d5 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/utils/ClickListener.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/utils/ClickListener.java
@@ -38,7 +38,7 @@
 	private int pressedButton = -1;
 	private int button;
 	private boolean pressed, over, cancelled;
-	private float visualPressedTime;
+	private long visualPressedTime;
 	private long tapCountInterval = (long)(0.4f * 1000000000l);
 	private int tapCount;
 	private long lastTapTime;
@@ -61,7 +61,7 @@
 		pressedButton = button;
 		touchDownX = x;
 		touchDownY = y;
-		visualPressedTime = TimeUtils.nanoTime() + visualPressedDuration * 1000000000;
+		visualPressedTime = TimeUtils.millis() + (long)(visualPressedDuration * 1000);
 		return true;
 	}
 
@@ -147,7 +147,7 @@
 	public boolean isVisualPressed () {
 		if (pressed) return true;
 		if (visualPressedTime <= 0) return false;
-		if (visualPressedTime > TimeUtils.nanoTime() && Gdx.graphics.isContinuousRendering()) return true;
+		if (visualPressedTime > TimeUtils.millis() && Gdx.graphics.isContinuousRendering()) return true;
 		visualPressedTime = 0;
 		return false;
 	}
