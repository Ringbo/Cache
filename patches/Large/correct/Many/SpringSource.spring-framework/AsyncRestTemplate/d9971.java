diff --git a/spring-web/src/main/java/org/springframework/web/client/AsyncRestTemplate.java b/spring-web/src/main/java/org/springframework/web/client/AsyncRestTemplate.java
index 8adf574..eb6b523 100644
--- a/spring-web/src/main/java/org/springframework/web/client/AsyncRestTemplate.java
+++ b/spring-web/src/main/java/org/springframework/web/client/AsyncRestTemplate.java
@@ -666,7 +666,7 @@
 				}
 				return convertResponse(response);
 			}
-			catch (IOException ex) {
+			catch (Throwable ex) {
 				throw new ExecutionException(ex);
 			}
 			finally {
