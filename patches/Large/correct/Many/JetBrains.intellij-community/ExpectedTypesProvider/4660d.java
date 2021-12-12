diff --git a/java/java-impl/src/com/intellij/codeInsight/ExpectedTypesProvider.java b/java/java-impl/src/com/intellij/codeInsight/ExpectedTypesProvider.java
index 7637beb..b15c238 100644
--- a/java/java-impl/src/com/intellij/codeInsight/ExpectedTypesProvider.java
+++ b/java/java-impl/src/com/intellij/codeInsight/ExpectedTypesProvider.java
@@ -1094,7 +1094,7 @@
       }
       if (("assertEquals".equals(name) || "assertSame".equals(name)) && method.getParameterList().getParametersCount() == 2 && args.length == 2) {
         ExpectedTypeInfo info = getEqualsType(args[0] == argument ? args[1] : args[0]);
-        if (info != null) {
+        if (info != null && parameterType.isAssignableFrom(info.getDefaultType())) {
           return info.getDefaultType();
         }
       }
