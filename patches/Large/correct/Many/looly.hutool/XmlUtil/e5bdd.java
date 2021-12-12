diff --git a/hutool-core/src/main/java/cn/hutool/core/util/XmlUtil.java b/hutool-core/src/main/java/cn/hutool/core/util/XmlUtil.java
index 23b614f..80e57dd 100644
--- a/hutool-core/src/main/java/cn/hutool/core/util/XmlUtil.java
+++ b/hutool-core/src/main/java/cn/hutool/core/util/XmlUtil.java
@@ -501,16 +501,15 @@
 	 * 将可序列化的对象转换为XML写入文件，已经存在的文件将被覆盖<br>
 	 * Writes serializable object to a XML file. Existing file will be overwritten
 	 * 
-	 * @param <T> 对象类型
 	 * @param dest 目标文件
-	 * @param t 对象
+	 * @param bean 对象
 	 * @throws IOException IO异常
 	 */
-	public static <T> void writeObjectAsXml(File dest, T t) throws IOException {
+	public static void writeObjectAsXml(File dest, Object bean) throws IOException {
 		XMLEncoder xmlenc = null;
 		try {
 			xmlenc = new XMLEncoder(FileUtil.getOutputStream(dest));
-			xmlenc.writeObject(t);
+			xmlenc.writeObject(bean);
 		} finally {
 			// 关闭XMLEncoder会相应关闭OutputStream
 			IoUtil.close(xmlenc);
