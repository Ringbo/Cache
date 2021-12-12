diff --git a/OsmAnd/src/net/osmand/render/OsmandRenderer.java b/OsmAnd/src/net/osmand/render/OsmandRenderer.java
index 3166946..5d641eb 100644
--- a/OsmAnd/src/net/osmand/render/OsmandRenderer.java
+++ b/OsmAnd/src/net/osmand/render/OsmandRenderer.java
@@ -829,7 +829,7 @@
 					canvas.drawPath(path, paint);
 				}
 			}
-			if (obj.getName() != null) {
+			if (obj.getName() != null && obj.getName().length() > 0) {
 				String name = obj.getName();
 				String ref = null;
 				if(name.charAt(0) == MapRenderingTypes.REF_CHAR){
@@ -845,7 +845,7 @@
 						}
 					}
 				}
-				if(ref != null){
+				if(ref != null && ref.trim().length() > 0){
 					rc.clearText();
 					ref = render.renderObjectText(ref, pair.tag, pair.value, rc, true);
 					TextDrawInfo text = new TextDrawInfo(ref);
@@ -858,7 +858,7 @@
 					
 				}
 				
-				if(name != null && name.length() > 0){
+				if(name != null && name.trim().length() > 0){
 					rc.clearText();
 					name = render.renderObjectText(name, pair.tag, pair.value, rc, false);
 					if (rc.textSize > 0) {
