diff --git a/spring-cloud-netflix-core/src/main/java/org/springframework/cloud/netflix/zuul/filters/post/SendResponseFilter.java b/spring-cloud-netflix-core/src/main/java/org/springframework/cloud/netflix/zuul/filters/post/SendResponseFilter.java
index d00adec..f92b716 100644
--- a/spring-cloud-netflix-core/src/main/java/org/springframework/cloud/netflix/zuul/filters/post/SendResponseFilter.java
+++ b/spring-cloud-netflix-core/src/main/java/org/springframework/cloud/netflix/zuul/filters/post/SendResponseFilter.java
@@ -184,12 +184,12 @@
 			}
 		}
 		RequestContext ctx = RequestContext.getCurrentContext();
-		Integer contentLength = ctx.getOriginContentLength();
+		Long contentLength = ctx.getOriginContentLength();
 		// Only inserts Content-Length if origin provides it and origin response is not
 		// gzipped
 		if (SET_CONTENT_LENGTH.get()) {
 			if (contentLength != null && !ctx.getResponseGZipped()) {
-				servletResponse.setContentLength(contentLength);
+				servletResponse.setContentLength(contentLength.intValue());
 			}
 		}
 	}
