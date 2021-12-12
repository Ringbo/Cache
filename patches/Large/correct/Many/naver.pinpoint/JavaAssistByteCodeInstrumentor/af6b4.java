diff --git a/src/main/java/com/profiler/interceptor/bci/JavaAssistByteCodeInstrumentor.java b/src/main/java/com/profiler/interceptor/bci/JavaAssistByteCodeInstrumentor.java
index ac51f11..584378d 100644
--- a/src/main/java/com/profiler/interceptor/bci/JavaAssistByteCodeInstrumentor.java
+++ b/src/main/java/com/profiler/interceptor/bci/JavaAssistByteCodeInstrumentor.java
@@ -56,7 +56,7 @@
     public void checkLibrary(ClassLoader classLoader, String javassistClassName) {
 		// TODO Util로 뽑을까?
 		boolean findClass = findClass(javassistClassName);
-		if (findClass) {
+		if (!findClass) {
 			return;
 		}
 		loadClassLoaderLibraries(classLoader);
