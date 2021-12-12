diff --git a/gdx/src/com/badlogic/gdx/backends/desktop/JoglGraphics.java b/gdx/src/com/badlogic/gdx/backends/desktop/JoglGraphics.java
index 0ae3c84..dac4d51 100644
--- a/gdx/src/com/badlogic/gdx/backends/desktop/JoglGraphics.java
+++ b/gdx/src/com/badlogic/gdx/backends/desktop/JoglGraphics.java
@@ -224,7 +224,7 @@
 		}
 		else
 		{
-			if( minor < 5 )
+			if( major == 1 && minor < 5 )
 			{
 				gl10 = new JoglGL10( graphicPanel.getGL() );
 			}
