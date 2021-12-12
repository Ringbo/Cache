diff --git a/library/src/com/WazaBe/HoloEverywhere/Setting.java b/library/src/com/WazaBe/HoloEverywhere/Setting.java
index e5e92d6..228da9d 100644
--- a/library/src/com/WazaBe/HoloEverywhere/Setting.java
+++ b/library/src/com/WazaBe/HoloEverywhere/Setting.java
@@ -63,7 +63,7 @@
 
 		public void detach() {
 			if (setting != null) {
-				setting.attach(this);
+				setting.detach(this);
 			}
 		}
 
