diff --git a/spring-cloud-netflix-core/src/main/java/org/springframework/cloud/netflix/zuul/filters/SimpleRouteLocator.java b/spring-cloud-netflix-core/src/main/java/org/springframework/cloud/netflix/zuul/filters/SimpleRouteLocator.java
index 18d2591..483599f 100644
--- a/spring-cloud-netflix-core/src/main/java/org/springframework/cloud/netflix/zuul/filters/SimpleRouteLocator.java
+++ b/spring-cloud-netflix-core/src/main/java/org/springframework/cloud/netflix/zuul/filters/SimpleRouteLocator.java
@@ -199,7 +199,7 @@
 			// do nothing
 		}
 
-		log.debug("adjustedPath=" + path);
+		log.debug("adjustedPath=" + adjustedPath);
 		return adjustedPath;
 	}
 
