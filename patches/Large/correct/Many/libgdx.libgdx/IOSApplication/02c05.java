diff --git a/backends/gdx-backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/IOSApplication.java b/backends/gdx-backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/IOSApplication.java
index 5495aee..9012832 100644
--- a/backends/gdx-backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/IOSApplication.java
+++ b/backends/gdx-backend-robovm/src/com/badlogic/gdx/backends/iosrobovm/IOSApplication.java
@@ -431,12 +431,12 @@
 		return new Clipboard() {
 			@Override
 			public void setContents (String content) {
-				UIPasteboard.getGeneral().setString(content);
+				UIPasteboard.getGeneralPasteboard().setString(content);
 			}
 
 			@Override
 			public String getContents () {
-				return UIPasteboard.getGeneral().getString();
+				return UIPasteboard.getGeneralPasteboard().getString();
 			}
 		};
 	}
