diff --git a/spring-boot-admin-server/src/main/java/de/codecentric/boot/admin/zuul/filters/route/SimpleHostRoutingFilter.java b/spring-boot-admin-server/src/main/java/de/codecentric/boot/admin/zuul/filters/route/SimpleHostRoutingFilter.java
index 5d7cabb..803f72c 100644
--- a/spring-boot-admin-server/src/main/java/de/codecentric/boot/admin/zuul/filters/route/SimpleHostRoutingFilter.java
+++ b/spring-boot-admin-server/src/main/java/de/codecentric/boot/admin/zuul/filters/route/SimpleHostRoutingFilter.java
@@ -282,7 +282,7 @@
 		int contentLength = request.getContentLength();
 		InputStreamEntity entity = new InputStreamEntity(requestEntity, contentLength,
 				request.getContentType() != null
-						? ContentType.create(request.getContentType()) : null);
+						? ContentType.parse(request.getContentType()) : null);
 		switch (verb.toUpperCase()) {
 		case "POST":
 			HttpPost httpPost = new HttpPost(uri + this.helper.getQueryString(params));
