diff --git a/byte-buddy-dep/src/main/java/net/bytebuddy/dynamic/scaffold/MethodRegistry.java b/byte-buddy-dep/src/main/java/net/bytebuddy/dynamic/scaffold/MethodRegistry.java
index 1e4f278..4484cd1 100644
--- a/byte-buddy-dep/src/main/java/net/bytebuddy/dynamic/scaffold/MethodRegistry.java
+++ b/byte-buddy-dep/src/main/java/net/bytebuddy/dynamic/scaffold/MethodRegistry.java
@@ -22,7 +22,7 @@
 public interface MethodRegistry {
 
     /**
-     * Prepends the given instrumentation configuration to this method registry, i.e. this configuration is applied first.
+     * Prepends the given method definition to this method registry, i.e. this configuration is applied first.
      *
      * @param methodMatcher            A matcher to identify all entries that are to be matched.
      * @param handler                  The handler to instrument any matched method.
@@ -34,7 +34,7 @@
                            MethodAttributeAppender.Factory attributeAppenderFactory);
 
     /**
-     * Appends the given instrumentation configuration to this method registry, i.e. this configuration is applied last.
+     * Appends the given method definition to this method registry, i.e. this configuration is applied last.
      *
      * @param methodMatcher            A matcher to identify all entries that are to be matched.
      * @param handler                  The handler to instrument any matched method.
@@ -129,14 +129,14 @@
         class ForImplementation implements Handler {
 
             /**
-             * The instrumentation to apply.
+             * The implementation to apply.
              */
             private final Implementation implementation;
 
             /**
-             * Creates a new handler for instrumenting a method with byte code.
+             * Creates a new handler for implementing a method with byte code.
              *
-             * @param implementation The instrumentation to apply.
+             * @param implementation The implementation to apply.
              */
             public ForImplementation(Implementation implementation) {
                 this.implementation = implementation;
@@ -181,7 +181,7 @@
                 private final ByteCodeAppender byteCodeAppender;
 
                 /**
-                 * Creates a new compiled instrumentation.
+                 * Creates a new compiled handler for a method implementation.
                  *
                  * @param byteCodeAppender The byte code appender to apply.
                  */
@@ -402,7 +402,7 @@
         public MethodRegistry.Prepared prepare(InstrumentedType instrumentedType,
                                                MethodLookupEngine methodLookupEngine,
                                                LatentMethodMatcher methodFilter) {
-            Map<MethodDescription, Entry> instrumentations = new HashMap<MethodDescription, Entry>();
+            Map<MethodDescription, Entry> implementations = new HashMap<MethodDescription, Entry>();
             Set<Handler> handlers = new HashSet<Handler>(entries.size());
             int helperMethodIndex = instrumentedType.getDeclaredMethods().size();
             for (Entry entry : entries) {
@@ -410,24 +410,24 @@
                     instrumentedType = entry.getHandler().prepare(instrumentedType);
                     MethodList helperMethods = instrumentedType.getDeclaredMethods();
                     for (MethodDescription helperMethod : helperMethods.subList(helperMethodIndex, helperMethods.size())) {
-                        instrumentations.put(helperMethod, entry);
+                        implementations.put(helperMethod, entry);
                     }
                     helperMethodIndex = helperMethods.size();
                 }
             }
             MethodLookupEngine.Finding finding = methodLookupEngine.process(instrumentedType);
-            ElementMatcher<? super MethodDescription> instrumented = (ElementMatcher<? super MethodDescription>) not(anyOf(instrumentations.keySet()))
+            ElementMatcher<? super MethodDescription> instrumented = (ElementMatcher<? super MethodDescription>) not(anyOf(implementations.keySet()))
                     .and(methodFilter.resolve(instrumentedType));
             List<MethodDescription> methodDescriptions = join(typeInitializerOf(instrumentedType), finding.getInvokableMethods().filter(instrumented));
             for (MethodDescription methodDescription : methodDescriptions) {
                 for (Entry entry : entries) {
                     if (entry.resolve(instrumentedType).matches(methodDescription)) {
-                        instrumentations.put(methodDescription, entry);
+                        implementations.put(methodDescription, entry);
                         break;
                     }
                 }
             }
-            return new Prepared(instrumentations,
+            return new Prepared(implementations,
                     instrumentedType.getLoadedTypeInitializer(),
                     instrumentedType.getTypeInitializer(),
                     finding);
