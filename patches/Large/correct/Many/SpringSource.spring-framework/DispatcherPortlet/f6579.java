diff --git a/spring-webmvc-portlet/src/main/java/org/springframework/web/portlet/DispatcherPortlet.java b/spring-webmvc-portlet/src/main/java/org/springframework/web/portlet/DispatcherPortlet.java
index 9c5add7..3530063 100644
--- a/spring-webmvc-portlet/src/main/java/org/springframework/web/portlet/DispatcherPortlet.java
+++ b/spring-webmvc-portlet/src/main/java/org/springframework/web/portlet/DispatcherPortlet.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2015 the original author or authors.
+ * Copyright 2002-2016 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -687,7 +687,7 @@
 				throw ex;
 			}
 		}
-		catch (Error err) {
+		catch (Throwable err) {
 			PortletException ex =
 					new PortletException("Error occured during request processing: " + err.getMessage(), err);
 			// Trigger after-completion for thrown exception.
@@ -800,7 +800,7 @@
 			triggerAfterRenderCompletion(mappedHandler, interceptorIndex, request, response, ex);
 			throw ex;
 		}
-		catch (Error err) {
+		catch (Throwable err) {
 			PortletException ex =
 					new PortletException("Error occured during request processing: " + err.getMessage(), err);
 			// Trigger after-completion for thrown exception.
@@ -891,7 +891,7 @@
 			triggerAfterResourceCompletion(mappedHandler, interceptorIndex, request, response, ex);
 			throw ex;
 		}
-		catch (Error err) {
+		catch (Throwable err) {
 			PortletException ex =
 					new PortletException("Error occured during request processing: " + err.getMessage(), err);
 			// Trigger after-completion for thrown exception.
@@ -965,7 +965,7 @@
 				throw ex;
 			}
 		}
-		catch (Error err) {
+		catch (Throwable err) {
 			PortletException ex =
 					new PortletException("Error occured during request processing: " + err.getMessage(), err);
 			// Trigger after-completion for thrown exception.
