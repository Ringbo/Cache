diff --git a/library/src/main/java/com/db/chart/renderer/AxisRenderer.java b/library/src/main/java/com/db/chart/renderer/AxisRenderer.java
index 216ac0f..e1ab2b5 100644
--- a/library/src/main/java/com/db/chart/renderer/AxisRenderer.java
+++ b/library/src/main/java/com/db/chart/renderer/AxisRenderer.java
@@ -317,7 +317,7 @@
 		}
 
 		// Set max Y axis label in case isn't already there
-		if (result.get(result.size() - 1) < max) result.add(max);
+		if (result.get(result.size() - 1) < max) result.add(pos);
 
 		return result;
 	}
