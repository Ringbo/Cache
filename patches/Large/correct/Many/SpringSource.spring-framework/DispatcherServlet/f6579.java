diff --git a/spring-webmvc/src/main/java/org/springframework/web/servlet/DispatcherServlet.java b/spring-webmvc/src/main/java/org/springframework/web/servlet/DispatcherServlet.java
index 5155fd9..e18f57e 100644
--- a/spring-webmvc/src/main/java/org/springframework/web/servlet/DispatcherServlet.java
+++ b/spring-webmvc/src/main/java/org/springframework/web/servlet/DispatcherServlet.java
@@ -972,7 +972,7 @@
 			catch (Exception ex) {
 				dispatchException = ex;
 			}
-			catch (Error err) {
+			catch (Throwable err) {
 				// As of 4.3, we're processing Errors thrown from handler methods as well,
 				// making them available for @ExceptionHandler methods and other scenarios.
 				dispatchException = new NestedServletException("Handler dispatch failed", err);
@@ -982,7 +982,7 @@
 		catch (Exception ex) {
 			triggerAfterCompletion(processedRequest, response, mappedHandler, ex);
 		}
-		catch (Error err) {
+		catch (Throwable err) {
 			triggerAfterCompletion(processedRequest, response, mappedHandler,
 					new NestedServletException("Handler processing failed", err));
 		}
