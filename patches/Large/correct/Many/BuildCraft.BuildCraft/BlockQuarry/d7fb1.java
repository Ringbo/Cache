diff --git a/common/buildcraft/factory/BlockQuarry.java b/common/buildcraft/factory/BlockQuarry.java
index e475973..430b039 100644
--- a/common/buildcraft/factory/BlockQuarry.java
+++ b/common/buildcraft/factory/BlockQuarry.java
@@ -63,7 +63,7 @@
 		if (j == 0 && i == 3)
 			return textureFront;
 
-		if (i == j)
+		if (i == j && i>1) // Front can't be top or bottom.
 			return textureFront;
 
 		switch (i) {
