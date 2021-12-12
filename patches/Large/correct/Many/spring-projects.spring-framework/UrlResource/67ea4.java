diff --git a/spring-core/src/main/java/org/springframework/core/io/UrlResource.java b/spring-core/src/main/java/org/springframework/core/io/UrlResource.java
index c3d440c..02baa97 100644
--- a/spring-core/src/main/java/org/springframework/core/io/UrlResource.java
+++ b/spring-core/src/main/java/org/springframework/core/io/UrlResource.java
@@ -243,7 +243,7 @@
 	 */
 	@Override
 	public String getFilename() {
-		return StringUtils.getFilename(this.url.getPath());
+		return StringUtils.getFilename(this.cleanedUrl.getPath());
 	}
 
 	/**
