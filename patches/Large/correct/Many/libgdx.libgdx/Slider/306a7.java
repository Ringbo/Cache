diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Slider.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Slider.java
index d935c99..e3b85d6 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Slider.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Slider.java
@@ -62,7 +62,7 @@
 	 * @param style the {@link SliderStyle} */
 	public Slider (float min, float max, float steps, boolean vertical, SliderStyle style) {
 		if (min > max) throw new IllegalArgumentException("min must be > max: " + min + " > " + max);
-		if (steps < 0) throw new IllegalArgumentException("steps must be > 0: " + steps);
+		if (steps <= 0) throw new IllegalArgumentException("steps must be > 0: " + steps);
 		setStyle(style);
 		this.min = min;
 		this.max = max;
