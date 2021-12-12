diff --git a/src/com/cctintl/c3dfx/controls/C3DDrawer.java b/src/com/cctintl/c3dfx/controls/C3DDrawer.java
index 3c1cfe2..9b5e007 100644
--- a/src/com/cctintl/c3dfx/controls/C3DDrawer.java
+++ b/src/com/cctintl/c3dfx/controls/C3DDrawer.java
@@ -113,7 +113,7 @@
 		// content listener for mouse hold on a side
 		this.content.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) -> { 
 			double width = 0 ;
-			long valid = callBacks.parallelStream().filter(callback->!callback.call(null)).count();
+			long valid = callBacks.stream().filter(callback->!callback.call(null)).count();
 			if(directionProperty.get().equals(DrawerDirection.RIGHT)) width = content.getWidth();
 			if(width + directionProperty.get().doubleValue() * e.getX() < activeOffset && (content.getCursor() == Cursor.DEFAULT || content.getCursor() == null) && valid == 0)
 				holdTimer.play(); 
