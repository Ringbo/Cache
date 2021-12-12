diff --git a/app/src/test/java/com/termux/terminal/TextStyleTest.java b/app/src/test/java/com/termux/terminal/TextStyleTest.java
index 5edc66a..2a4a89a 100644
--- a/app/src/test/java/com/termux/terminal/TextStyleTest.java
+++ b/app/src/test/java/com/termux/terminal/TextStyleTest.java
@@ -34,7 +34,7 @@
 	public void testEncodingStrikeThrough() {
 		int encoded = TextStyle.encode(TextStyle.COLOR_INDEX_FOREGROUND, TextStyle.COLOR_INDEX_BACKGROUND,
 				TextStyle.CHARACTER_ATTRIBUTE_STRIKETHROUGH);
-		assertTrue((TextStyle.decodeEffect(encoded) | TextStyle.CHARACTER_ATTRIBUTE_STRIKETHROUGH) != 0);
+		assertTrue((TextStyle.decodeEffect(encoded) & TextStyle.CHARACTER_ATTRIBUTE_STRIKETHROUGH) != 0);
 	}
 
 	public void testEncodingProtected() {
