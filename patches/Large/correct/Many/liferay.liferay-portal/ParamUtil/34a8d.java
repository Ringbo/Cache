diff --git a/portal-service/src/com/liferay/portal/kernel/util/ParamUtil.java b/portal-service/src/com/liferay/portal/kernel/util/ParamUtil.java
index a71c142..f798b23d 100644
--- a/portal-service/src/com/liferay/portal/kernel/util/ParamUtil.java
+++ b/portal-service/src/com/liferay/portal/kernel/util/ParamUtil.java
@@ -250,7 +250,7 @@
 		HttpServletRequest request, String param, boolean[] defaultValue) {
 
 		return GetterUtil.getBooleanValues(
-			getParameterValues(request, param), defaultValue);
+			getParameterValues(request, param, null), defaultValue);
 	}
 
 	public static boolean[] getBooleanValues(
@@ -331,7 +331,7 @@
 		Date[] defaultValue) {
 
 		return GetterUtil.getDateValues(
-			getParameterValues(request, param), dateFormat, defaultValue);
+			getParameterValues(request, param, null), dateFormat, defaultValue);
 	}
 
 	public static Date[] getDateValues(
@@ -407,7 +407,7 @@
 		HttpServletRequest request, String param, double[] defaultValue) {
 
 		return GetterUtil.getDoubleValues(
-			getParameterValues(request, param), defaultValue);
+			getParameterValues(request, param, null), defaultValue);
 	}
 
 	public static double[] getDoubleValues(
@@ -476,7 +476,7 @@
 		HttpServletRequest request, String param, float[] defaultValue) {
 
 		return GetterUtil.getFloatValues(
-			getParameterValues(request, param), defaultValue);
+			getParameterValues(request, param, null), defaultValue);
 	}
 
 	public static float[] getFloatValues(
@@ -545,7 +545,7 @@
 		HttpServletRequest request, String param, int[] defaultValue) {
 
 		return GetterUtil.getIntegerValues(
-			getParameterValues(request, param), defaultValue);
+			getParameterValues(request, param, null), defaultValue);
 	}
 
 	public static int[] getIntegerValues(
@@ -614,7 +614,7 @@
 		HttpServletRequest request, String param, long[] defaultValue) {
 
 		return GetterUtil.getLongValues(
-			getParameterValues(request, param), defaultValue);
+			getParameterValues(request, param, null), defaultValue);
 	}
 
 	public static long[] getLongValues(
@@ -720,7 +720,7 @@
 		HttpServletRequest request, String param, short[] defaultValue) {
 
 		return GetterUtil.getShortValues(
-			getParameterValues(request, param), defaultValue);
+			getParameterValues(request, param, null), defaultValue);
 	}
 
 	public static short[] getShortValues(
