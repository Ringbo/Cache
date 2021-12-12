diff --git a/gdx/src/com/badlogic/gdx/utils/Pools.java b/gdx/src/com/badlogic/gdx/utils/Pools.java
index 798efe1..043a819 100644
--- a/gdx/src/com/badlogic/gdx/utils/Pools.java
+++ b/gdx/src/com/badlogic/gdx/utils/Pools.java
@@ -51,7 +51,7 @@
 		if (objects == null) throw new IllegalArgumentException("objects cannot be null.");
 		for (int i = 0, n = objects.size; i < n; i++) {
 			Object object = objects.get(i);
-			if (objects == null) continue;
+			if (object == null) continue;
 			ReflectionPool pool = typePools.get(object.getClass());
 			if (pool == null) return; // Ignore freeing an object that was never retained.
 			pool.free(object);
