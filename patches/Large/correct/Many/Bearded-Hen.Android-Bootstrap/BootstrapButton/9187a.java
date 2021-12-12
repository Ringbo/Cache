diff --git a/AndroidBootstrap/src/com/beardedhen/androidbootstrap/BootstrapButton.java b/AndroidBootstrap/src/com/beardedhen/androidbootstrap/BootstrapButton.java
index 374d004..6d1a831 100644
--- a/AndroidBootstrap/src/com/beardedhen/androidbootstrap/BootstrapButton.java
+++ b/AndroidBootstrap/src/com/beardedhen/androidbootstrap/BootstrapButton.java
@@ -172,7 +172,7 @@
 		
 		int layoutWidth = 0;
 		if(a.getString(R.styleable.BootstrapButton_android_layout_width) != null) {
-			layoutWidth = a.getInt(R.styleable.BootstrapButton_android_layout_width, 0);
+			layoutWidth = a.getLayoutDimension(R.styleable.BootstrapButton_android_layout_width, 0);
 		}
 		
 		//works even if it's fill_parent or match_parent 
