diff --git a/spring-test-mvc/src/main/java/org/springframework/test/web/client/RequestMatcherClientHttpRequest.java b/spring-test-mvc/src/main/java/org/springframework/test/web/client/RequestMatcherClientHttpRequest.java
index b53caad..a0553cf 100644
--- a/spring-test-mvc/src/main/java/org/springframework/test/web/client/RequestMatcherClientHttpRequest.java
+++ b/spring-test-mvc/src/main/java/org/springframework/test/web/client/RequestMatcherClientHttpRequest.java
@@ -73,7 +73,7 @@
 
 		setResponse(this.responseCreator.createResponse(this));
 
-		return super.execute();
+		return super.executeInternal();
 	}
 
 }
