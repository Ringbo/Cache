diff --git a/src/org/geometerplus/android/fbreader/FBReader.java b/src/org/geometerplus/android/fbreader/FBReader.java
index 0dc63be..50c6f47 100644
--- a/src/org/geometerplus/android/fbreader/FBReader.java
+++ b/src/org/geometerplus/android/fbreader/FBReader.java
@@ -55,7 +55,7 @@
 
 		@Override
 		public void onShow() {
-			if (FBReader.Instance != null) {
+			if (FBReader.Instance != null && myControlPanel != null) {
 				FBReader.Instance.setupNavigation(myControlPanel);
 			}
 		}
@@ -63,7 +63,7 @@
 		@Override
 		public void updateStates() {
 			super.updateStates();
-			if (!NavigateDragging && FBReader.Instance != null) {
+			if (!NavigateDragging && FBReader.Instance != null && myControlPanel != null) {
 				FBReader.Instance.setupNavigation(myControlPanel);
 			}
 		}
