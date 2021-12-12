diff --git a/bigbluebutton-apps/src/main/java/org/bigbluebutton/conference/service/whiteboard/Page.java b/bigbluebutton-apps/src/main/java/org/bigbluebutton/conference/service/whiteboard/Page.java
index 3d08434..cadc7fa 100755
--- a/bigbluebutton-apps/src/main/java/org/bigbluebutton/conference/service/whiteboard/Page.java
+++ b/bigbluebutton-apps/src/main/java/org/bigbluebutton/conference/service/whiteboard/Page.java
@@ -60,7 +60,7 @@
 	}
 	
 	public void undo() {
-		if (annotations.isEmpty()) {
+		if (!annotations.isEmpty()) {
 			annotations.remove(annotations.size() - 1);
 		}
 	}
