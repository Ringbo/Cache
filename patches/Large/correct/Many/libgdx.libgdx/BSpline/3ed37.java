diff --git a/gdx/src/com/badlogic/gdx/math/BSpline.java b/gdx/src/com/badlogic/gdx/math/BSpline.java
index f922f10..ed10a41 100644
--- a/gdx/src/com/badlogic/gdx/math/BSpline.java
+++ b/gdx/src/com/badlogic/gdx/math/BSpline.java
@@ -90,7 +90,7 @@
 		final float t2 = u * u;
 		final float t3 = t2 * u;
 		out.set(points[i]).scl(1.5f * t2 - 2 * u);
-		if (continuous || i > 0) out.add(tmp.set(points[(n + i - 1) % n]).scl(0.5f * (1 - u) * (1 - u)));
+		if (continuous || i > 0) out.add(tmp.set(points[(n + i - 1) % n]).scl(-0.5f * dt * dt));
 		if (continuous || i < (n - 1)) out.add(tmp.set(points[(i + 1) % n]).scl(-1.5f * t2 + u + 0.5f));
 		if (continuous || i < (n - 2)) out.add(tmp.set(points[(i + 2) % n]).scl(0.5f * t2));
 		return out;
