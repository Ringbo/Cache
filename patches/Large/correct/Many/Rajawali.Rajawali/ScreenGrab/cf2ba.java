diff --git a/src/rajawali/util/ScreenGrab.java b/src/rajawali/util/ScreenGrab.java
index 6dd0d23..8379435 100644
--- a/src/rajawali/util/ScreenGrab.java
+++ b/src/rajawali/util/ScreenGrab.java
@@ -32,8 +32,9 @@
 	 * @param width		the image width
 	 * @param height	the image height
 	 * @param name		the file name
+	 * @throws FileNotFoundException 
 	 */
-	public static void saveAsImage(int width, int height, String name)
+	public static void saveAsImage(int width, int height, String name) throws FileNotFoundException
 	{
 		saveAsImage(0, 0, width, height, name, CompressFormat.PNG, 100);
 	}
@@ -48,8 +49,9 @@
 	 * @param name				the file name
 	 * @param compressFormat	the compression format {@link CompressFormat}
 	 * @param quality			the compression quality
+	 * @throws FileNotFoundException 
 	 */
-	public static void saveAsImage(int x, int y, int width, int height, String name, CompressFormat compressFormat, int quality) {
+	public static void saveAsImage(int x, int y, int width, int height, String name, CompressFormat compressFormat, int quality) throws FileNotFoundException {
 		Bitmap bmp = getPixelsFromBuffer(x, y, width, height);
 		try {
 			File file = new File(Environment.getExternalStorageDirectory() + "/", name);
@@ -72,7 +74,7 @@
 				e.printStackTrace();
 			}
 		} catch (FileNotFoundException e) {
-			e.printStackTrace();
+			throw(e);
 		}
 	}
 
@@ -85,7 +87,7 @@
 	 * @param height
 	 * @return
 	 */
-	private static Bitmap getPixelsFromBuffer(int x, int y, int width, int height) {
+	public static Bitmap getPixelsFromBuffer(int x, int y, int width, int height) {
 		int b[] = new int[width * (y + height)];
 		int bt[] = new int[width * height];
 		IntBuffer ib = IntBuffer.wrap(b);
