diff --git a/byte-buddy-dep/src/main/java/net/bytebuddy/instrumentation/method/bytecode/bind/annotation/Morph.java b/byte-buddy-dep/src/main/java/net/bytebuddy/instrumentation/method/bytecode/bind/annotation/Morph.java
index a2059a8..6afa01d 100644
--- a/byte-buddy-dep/src/main/java/net/bytebuddy/instrumentation/method/bytecode/bind/annotation/Morph.java
+++ b/byte-buddy-dep/src/main/java/net/bytebuddy/instrumentation/method/bytecode/bind/annotation/Morph.java
@@ -127,7 +127,7 @@
             }
             Instrumentation.SpecialMethodInvocation specialMethodInvocation;
             TypeDescription typeDescription = annotation.getValue(DEFAULT_TARGET, TypeDescription.class);
-            if (!typeDescription.represents(void.class) && annotation.getValue(DEFAULT_METHOD, Boolean.class)) {
+            if (typeDescription.represents(void.class) && !annotation.getValue(DEFAULT_METHOD, Boolean.class)) {
                 specialMethodInvocation = instrumentationTarget.invokeSuper(source, Instrumentation.Target.MethodLookup.Default.EXACT);
             } else {
                 specialMethodInvocation = (typeDescription.represents(void.class)
