diff --git a/src/biz/bokhorst/xprivacy/ActivityMain.java b/src/biz/bokhorst/xprivacy/ActivityMain.java
index dbeee18..519b832 100644
--- a/src/biz/bokhorst/xprivacy/ActivityMain.java
+++ b/src/biz/bokhorst/xprivacy/ActivityMain.java
@@ -1144,15 +1144,15 @@
 
 		public void selectAllVisible() {
 			// Look through the visible apps to figure out what to do
-			boolean addThem = false;
+			mSelecting = false;
 			for (int i = 0; i < this.getCount(); i++) {
 				if (!mListAppSelected.contains(this.getItem(i))) {
-					addThem = true;
+					mSelecting = true;
 					break;
 				}
 			}
 
-			if (addThem) {
+			if (mSelecting) {
 				// Add the visible apps not already selected
 				for (int i = 0; i < this.getCount(); i++)
 					if (!mListAppSelected.contains(this.getItem(i)))
