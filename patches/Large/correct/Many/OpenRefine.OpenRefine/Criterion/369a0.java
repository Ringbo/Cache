diff --git a/src/main/java/com/metaweb/gridworks/sorting/Criterion.java b/src/main/java/com/metaweb/gridworks/sorting/Criterion.java
index e5793a1..f6127be 100644
--- a/src/main/java/com/metaweb/gridworks/sorting/Criterion.java
+++ b/src/main/java/com/metaweb/gridworks/sorting/Criterion.java
@@ -33,7 +33,7 @@
 			blankPosition = obj.getInt("blankPosition");
 		}
 		if (obj.has("errorPosition") && !obj.isNull("errorPosition")) {
-			blankPosition = obj.getInt("errorPosition");
+			errorPosition = obj.getInt("errorPosition");
 		}
 		
 		if (obj.has("reverse") && !obj.isNull("reverse")) {
