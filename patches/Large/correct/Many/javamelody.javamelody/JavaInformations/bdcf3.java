diff --git a/javamelody-core/src/main/java/net/bull/javamelody/internal/model/JavaInformations.java b/javamelody-core/src/main/java/net/bull/javamelody/internal/model/JavaInformations.java
index c1ad5c6..9327478 100644
--- a/javamelody-core/src/main/java/net/bull/javamelody/internal/model/JavaInformations.java
+++ b/javamelody-core/src/main/java/net/bull/javamelody/internal/model/JavaInformations.java
@@ -248,8 +248,9 @@
 	private static long buildOpenFileDescriptorCount() {
 		try {
 			return MBeansAccessor.getLongFromOperatingSystem("OpenFileDescriptorCount");
-		} catch (final Error e) {
-			// pour issue 16 (using jsvc on ubuntu or debian)
+		} catch (final Throwable e) { // NOPMD
+			// pour issues 16, 779 (using jsvc on ubuntu or debian)
+			// a priori, InternalError est catchée par le MBeanServer et encapsulé en RuntimeErrorException
 			return -1;
 		}
 	}
@@ -257,8 +258,9 @@
 	private static long buildMaxFileDescriptorCount() {
 		try {
 			return MBeansAccessor.getLongFromOperatingSystem("MaxFileDescriptorCount");
-		} catch (final Error e) {
-			// pour issue 16 (using jsvc on ubuntu or debian)
+		} catch (final Throwable e) { // NOPMD
+			// pour issues 16, 779 (using jsvc on ubuntu or debian)
+			// a priori, InternalError est catchée par le MBeanServer et encapsulé en RuntimeErrorException
 			return -1;
 		}
 	}
