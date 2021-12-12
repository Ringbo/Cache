diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Label.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Label.java
index f1f5e6a..b182ba1 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Label.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Label.java
@@ -34,7 +34,7 @@
 public class Label extends Widget {
 	private LabelStyle style;
 	private final TextBounds bounds = new TextBounds();
-	private String text;
+	private CharSequence text;
 	private BitmapFontCache cache;
 	private float prefWidth, prefHeight;
 	private int labelAlign = Align.LEFT;
@@ -46,27 +46,27 @@
 		this("", skin);
 	}
 
-	public Label (String text, Skin skin) {
+	public Label (CharSequence text, Skin skin) {
 		this(text, skin.getStyle(LabelStyle.class), null);
 	}
 
 	/** Creates a label, using a {@link LabelStyle} that has a BitmapFont with the specified name from the skin and the specified
 	 * color. */
-	public Label (String text, String fontName, Color color, Skin skin) {
+	public Label (CharSequence text, String fontName, Color color, Skin skin) {
 		this(text, new LabelStyle(skin.getFont(fontName), color), null);
 	}
 
 	/** Creates a label, using a {@link LabelStyle} that has a BitmapFont with the specified name and the specified color from the
 	 * skin. */
-	public Label (String text, String fontName, String colorName, Skin skin) {
+	public Label (CharSequence text, String fontName, String colorName, Skin skin) {
 		this(text, new LabelStyle(skin.getFont(fontName), skin.getColor(colorName)), null);
 	}
 
-	public Label (String text, LabelStyle style) {
+	public Label (CharSequence text, LabelStyle style) {
 		this(text, style, null);
 	}
 
-	public Label (String text, LabelStyle style, String name) {
+	public Label (CharSequence text, LabelStyle style, String name) {
 		super(name);
 		if (text == null) text = "";
 		this.text = text;
@@ -91,7 +91,7 @@
 		return style;
 	}
 
-	public void setText (String text) {
+	public void setText (CharSequence text) {
 		if (text == null) throw new IllegalArgumentException("text cannot be null.");
 		if (text.equals(this.text)) return;
 		this.text = text;
@@ -99,7 +99,7 @@
 		invalidateHierarchy();
 	}
 
-	public String getText () {
+	public CharSequence getText () {
 		return text;
 	}
 
