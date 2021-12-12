diff --git a/src/web/org/codehaus/groovy/grails/web/pages/GSPResponseWriter.java b/src/web/org/codehaus/groovy/grails/web/pages/GSPResponseWriter.java
index acf5751..e614d17 100644
--- a/src/web/org/codehaus/groovy/grails/web/pages/GSPResponseWriter.java
+++ b/src/web/org/codehaus/groovy/grails/web/pages/GSPResponseWriter.java
@@ -157,7 +157,7 @@
 	 * @param max
 	 * @return  A GSPResponseWriter instance
 	 */
-	static GSPResponseWriter getInstance(Writer target, int max) {
+	public static GSPResponseWriter getInstance(Writer target, int max) {
 		return new GSPResponseWriter(target, new CharArrayWriter(max), max);
 	} // getInstance()
 
