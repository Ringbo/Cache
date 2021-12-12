diff --git a/modules/portal/portal-servlet-jsp-compiler/src/main/java/com/liferay/portal/servlet/jsp/compiler/internal/BaseJavaFileObject.java b/modules/portal/portal-servlet-jsp-compiler/src/main/java/com/liferay/portal/servlet/jsp/compiler/internal/BaseJavaFileObject.java
index 5cdbd16..9f3d943 100644
--- a/modules/portal/portal-servlet-jsp-compiler/src/main/java/com/liferay/portal/servlet/jsp/compiler/internal/BaseJavaFileObject.java
+++ b/modules/portal/portal-servlet-jsp-compiler/src/main/java/com/liferay/portal/servlet/jsp/compiler/internal/BaseJavaFileObject.java
@@ -58,9 +58,7 @@
 	}
 
 	@Override
-	public CharSequence getCharContent(boolean ignoreEncodingErrors)
-		throws IOException {
-
+	public CharSequence getCharContent(boolean ignoreEncodingErrors) {
 		throw new UnsupportedOperationException();
 	}
 
@@ -97,23 +95,26 @@
 		return false;
 	}
 
+	/**
+	 * @throws IOException 
+	 */
 	@Override
 	public InputStream openInputStream() throws IOException {
 		throw new UnsupportedOperationException();
 	}
 
 	@Override
-	public OutputStream openOutputStream() throws IOException {
+	public OutputStream openOutputStream() {
 		throw new UnsupportedOperationException();
 	}
 
 	@Override
-	public Reader openReader(boolean ignoreEncodingErrors) throws IOException {
+	public Reader openReader(boolean ignoreEncodingErrors) {
 		throw new UnsupportedOperationException();
 	}
 
 	@Override
-	public Writer openWriter() throws IOException {
+	public Writer openWriter() {
 		throw new UnsupportedOperationException();
 	}
 
