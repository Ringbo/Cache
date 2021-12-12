diff --git a/portal-service/src/com/liferay/portal/kernel/servlet/filters/invoker/InvokerFilter.java b/portal-service/src/com/liferay/portal/kernel/servlet/filters/invoker/InvokerFilter.java
index e5b1d5a..5eb214c 100644
--- a/portal-service/src/com/liferay/portal/kernel/servlet/filters/invoker/InvokerFilter.java
+++ b/portal-service/src/com/liferay/portal/kernel/servlet/filters/invoker/InvokerFilter.java
@@ -121,7 +121,7 @@
 		if (invokerFilterHelper != null) {
 			servletContext.removeAttribute(InvokerFilterHelper.class.getName());
 
-			_invokerFilterHelper.destroy();
+			invokerFilterHelper.destroy();
 		}
 	}
 
