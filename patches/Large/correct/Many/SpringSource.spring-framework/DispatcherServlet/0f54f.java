diff --git a/spring-webmvc/src/main/java/org/springframework/web/servlet/DispatcherServlet.java b/spring-webmvc/src/main/java/org/springframework/web/servlet/DispatcherServlet.java
index 4dbb945..6650dec 100644
--- a/spring-webmvc/src/main/java/org/springframework/web/servlet/DispatcherServlet.java
+++ b/spring-webmvc/src/main/java/org/springframework/web/servlet/DispatcherServlet.java
@@ -962,7 +962,7 @@
 					return;
 				}
 
-				applyDefaultViewName(request, mv);
+				applyDefaultViewName(processedRequest, mv);
 				mappedHandler.applyPostHandle(processedRequest, response, mv);
 			}
 			catch (Exception ex) {
