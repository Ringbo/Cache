diff --git a/gdx/src/com/badlogic/gdx/utils/PerformanceCounter.java b/gdx/src/com/badlogic/gdx/utils/PerformanceCounter.java
index 4ece8a3..651234d 100644
--- a/gdx/src/com/badlogic/gdx/utils/PerformanceCounter.java
+++ b/gdx/src/com/badlogic/gdx/utils/PerformanceCounter.java
@@ -64,7 +64,7 @@
 	public void tick() {
 		final long t = System.nanoTime();
 		if (lastTick > 0L)
-			tick((lastTick - t) * nano2seconds);
+			tick((t - lastTick) * nano2seconds);
 		lastTick = t;
 	}
 	
@@ -78,7 +78,7 @@
 			return;
 		}
 		
-		time.put(delta);
+		time.put(current);
 		
 		final float currentLoad = delta == 0f ? 0f : current / delta;
 		load.put((delta > 1f) ? currentLoad : delta * currentLoad + (1f - delta) * load.latest);
