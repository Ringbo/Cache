diff --git a/portal-service/src/com/liferay/portal/kernel/servlet/filters/invoker/InvokerFilter.java b/portal-service/src/com/liferay/portal/kernel/servlet/filters/invoker/InvokerFilter.java
index 2d1672b..f690574 100644
--- a/portal-service/src/com/liferay/portal/kernel/servlet/filters/invoker/InvokerFilter.java
+++ b/portal-service/src/com/liferay/portal/kernel/servlet/filters/invoker/InvokerFilter.java
@@ -247,7 +247,7 @@
 			uri = uri.substring(_contextPath.length());
 		}
 
-		return HttpUtil.removePathParamters(uri);
+		return HttpUtil.removeParameters(uri);
 	}
 
 	protected HttpServletRequest handleNonSerializableRequest(
