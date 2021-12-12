diff --git a/src/core/lombok/eclipse/handlers/EclipseHandlerUtil.java b/src/core/lombok/eclipse/handlers/EclipseHandlerUtil.java
index c513580..11f31c9 100644
--- a/src/core/lombok/eclipse/handlers/EclipseHandlerUtil.java
+++ b/src/core/lombok/eclipse/handlers/EclipseHandlerUtil.java
@@ -1425,7 +1425,7 @@
 		if (isPrimitive(variable.type)) return null;
 		AllocationExpression exception = new AllocationExpression();
 		setGeneratedBy(exception, source);
-		int partCount = 0;
+		int partCount = 1;
 		String exceptionTypeStr = exceptionType.getExceptionType();
 		for (int i = 0; i < exceptionTypeStr.length(); i++) if (exceptionTypeStr.charAt(i) == '.') partCount++;
 		long[] ps = new long[partCount];
