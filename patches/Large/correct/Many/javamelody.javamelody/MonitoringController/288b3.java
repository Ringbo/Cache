diff --git a/javamelody-core/src/main/java/net/bull/javamelody/MonitoringController.java b/javamelody-core/src/main/java/net/bull/javamelody/MonitoringController.java
index 191afa5..639ebea 100644
--- a/javamelody-core/src/main/java/net/bull/javamelody/MonitoringController.java
+++ b/javamelody-core/src/main/java/net/bull/javamelody/MonitoringController.java
@@ -206,7 +206,12 @@
 		// on teste CompressionServletResponseWrapper car il peut déjà être mis dans le serveur de collecte
 		// par CollectorServlet.doCompressedPart
 		if (isCompressionSupported(httpRequest)
-				&& !(httpResponse instanceof CompressionServletResponseWrapper)) {
+				&& !(httpResponse instanceof CompressionServletResponseWrapper)
+				// this checks if another filter already compress the stream,
+				// in which case we must not compress a second time,
+				// in particular for org.kohsuke.stapler.compression.CompressionFilter
+				// from https://github.com/stapler/stapler in Jenkins (issue JENKINS-14050)
+				&& !(httpResponse.getClass().getSimpleName().startsWith("Compression"))) {
 			// comme la page html peut être volumineuse avec toutes les requêtes sql et http
 			// on compresse le flux de réponse en gzip à partir de 4 Ko
 			// (à moins que la compression http ne soit pas supportée
