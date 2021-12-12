diff --git a/byte-buddy-dep/src/main/java/net/bytebuddy/dynamic/scaffold/inline/RebaseInstrumentationTarget.java b/byte-buddy-dep/src/main/java/net/bytebuddy/dynamic/scaffold/inline/RebaseInstrumentationTarget.java
index 315f537..327fc45 100644
--- a/byte-buddy-dep/src/main/java/net/bytebuddy/dynamic/scaffold/inline/RebaseInstrumentationTarget.java
+++ b/byte-buddy-dep/src/main/java/net/bytebuddy/dynamic/scaffold/inline/RebaseInstrumentationTarget.java
@@ -13,23 +13,23 @@
 
 public class RebaseInstrumentationTarget extends SubclassInstrumentationTarget {
 
-    protected final MethodRedefinitionResolver methodRedefinitionResolver;
+    protected final MethodFlatteningResolver methodFlatteningResolver;
 
     protected RebaseInstrumentationTarget(MethodLookupEngine.Finding finding,
                                           BridgeMethodResolver.Factory bridgeMethodResolverFactory,
-                                          MethodRedefinitionResolver methodRedefinitionResolver) {
+                                          MethodFlatteningResolver methodFlatteningResolver) {
         super(finding, bridgeMethodResolverFactory);
-        this.methodRedefinitionResolver = methodRedefinitionResolver;
+        this.methodFlatteningResolver = methodFlatteningResolver;
     }
 
     @Override
     protected Instrumentation.SpecialMethodInvocation invokeSuper(MethodDescription methodDescription) {
         return methodDescription.getDeclaringType().equals(typeDescription)
-                ? invocationOf(methodRedefinitionResolver.resolve(methodDescription))
+                ? invocationOf(methodFlatteningResolver.resolve(methodDescription))
                 : super.invokeSuper(methodDescription);
     }
 
-    private Instrumentation.SpecialMethodInvocation invocationOf(MethodRedefinitionResolver.Resolution resolution) {
+    private Instrumentation.SpecialMethodInvocation invocationOf(MethodFlatteningResolver.Resolution resolution) {
         if (!resolution.isRedefined()) {
             throw new IllegalArgumentException("Cannot invoke non-redefined method " + resolution.getResolvedMethod());
         }
@@ -42,12 +42,12 @@
     public boolean equals(Object other) {
         return this == other || !(other == null || getClass() != other.getClass())
                 && super.equals(other)
-                && methodRedefinitionResolver.equals(((RebaseInstrumentationTarget) other).methodRedefinitionResolver);
+                && methodFlatteningResolver.equals(((RebaseInstrumentationTarget) other).methodFlatteningResolver);
     }
 
     @Override
     public int hashCode() {
-        return 31 * super.hashCode() + methodRedefinitionResolver.hashCode();
+        return 31 * super.hashCode() + methodFlatteningResolver.hashCode();
     }
 
     @Override
@@ -56,7 +56,7 @@
                 "typeDescription=" + typeDescription +
                 ", defaultMethods=" + defaultMethods +
                 ", bridgeMethodResolver=" + bridgeMethodResolver +
-                ", methodRedefinitionResolver=" + methodRedefinitionResolver +
+                ", methodRedefinitionResolver=" + methodFlatteningResolver +
                 '}';
     }
 
