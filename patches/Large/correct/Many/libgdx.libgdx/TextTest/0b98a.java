diff --git a/gdx/src/com/badlogic/gdx/tests/TextTest.java b/gdx/src/com/badlogic/gdx/tests/TextTest.java
index 8361cf5..15775fc 100644
--- a/gdx/src/com/badlogic/gdx/tests/TextTest.java
+++ b/gdx/src/com/badlogic/gdx/tests/TextTest.java
@@ -31,7 +31,7 @@
 		if( text == null )
 		{
 			cam = new OrthographicCamera();		
-			font = app.getGraphics().newFont( app.getFiles().getInternalFileHandle( "data/arial.ttf"), 12, FontStyle.Plain, true );
+			font = app.getGraphics().newFont( app.getFiles().getInternalFileHandle( "data/arial.ttf"), 11, FontStyle.Plain, true );
 			text = font.newText( );
 			text.setText( "This is a test\nIt is a multline text!\nyes really!11!111one" );
 			text.setHorizontalAlign( HorizontalAlign.Center );			
