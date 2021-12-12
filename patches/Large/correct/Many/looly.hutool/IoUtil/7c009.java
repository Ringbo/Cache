diff --git a/hutool-core/src/main/java/com/xiaoleilu/hutool/io/IoUtil.java b/hutool-core/src/main/java/com/xiaoleilu/hutool/io/IoUtil.java
index 692cc89..2504fcf 100644
--- a/hutool-core/src/main/java/com/xiaoleilu/hutool/io/IoUtil.java
+++ b/hutool-core/src/main/java/com/xiaoleilu/hutool/io/IoUtil.java
@@ -471,7 +471,7 @@
 	 * @throws IOException IO异常
 	 */
 	public static String readHex28Lower(InputStream in) throws IOException {
-		return readHex(in, 28, false);
+		return readHex(in, 28, true);
 	}
 
 	/**
