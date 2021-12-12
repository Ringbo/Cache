diff --git a/jodd-core/src/test/java/jodd/util/MimeTypesTest.java b/jodd-core/src/test/java/jodd/util/MimeTypesTest.java
index a2dd009..2251709 100644
--- a/jodd-core/src/test/java/jodd/util/MimeTypesTest.java
+++ b/jodd-core/src/test/java/jodd/util/MimeTypesTest.java
@@ -27,7 +27,7 @@
 	public void testFind() {
 		String[] extensionArray = MimeTypes.findExtensionsByMimeTypes("image/jpeg", false);
 
-		String extensions = StringUtil.toString(extensionArray) + ',';
+		String extensions = ArraysUtil.toString(extensionArray) + ',';
 
 		assertEquals(3, extensionArray.length);
 
@@ -45,7 +45,7 @@
 	public void testFindWithWildcards() {
 		String[] extensionArray = MimeTypes.findExtensionsByMimeTypes("image/*", true);
 
-		String extensions = StringUtil.toString(extensionArray) + ',';
+		String extensions = ArraysUtil.toString(extensionArray) + ',';
 
 		assertTrue(extensions.length() > 3);
 
