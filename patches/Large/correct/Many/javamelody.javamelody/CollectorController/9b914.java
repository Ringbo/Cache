diff --git a/javamelody-core/src/main/java/net/bull/javamelody/internal/web/CollectorController.java b/javamelody-core/src/main/java/net/bull/javamelody/internal/web/CollectorController.java
index d8aaf3e..404c783 100644
--- a/javamelody-core/src/main/java/net/bull/javamelody/internal/web/CollectorController.java
+++ b/javamelody-core/src/main/java/net/bull/javamelody/internal/web/CollectorController.java
@@ -432,7 +432,8 @@
 		} else {
 			final PrintWriter writer = createWriterFromOutputStream(resp);
 			final String partToRedirectTo;
-			if (HttpParameter.CACHE_ID.getParameterFrom(req) == null) {
+			if (HttpParameter.CACHE_ID.getParameterFrom(req) == null
+					|| HttpParameter.PART.getParameterFrom(req) == null) {
 				partToRedirectTo = HttpParameter.PART.getParameterFrom(req);
 			} else {
 				partToRedirectTo = HttpParameter.PART.getParameterFrom(req) + '&'
