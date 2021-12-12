diff --git a/subprojects/base-services/src/main/java/org/gradle/internal/reflect/JavaReflectionUtil.java b/subprojects/base-services/src/main/java/org/gradle/internal/reflect/JavaReflectionUtil.java
index f464d5c..07077af 100644
--- a/subprojects/base-services/src/main/java/org/gradle/internal/reflect/JavaReflectionUtil.java
+++ b/subprojects/base-services/src/main/java/org/gradle/internal/reflect/JavaReflectionUtil.java
@@ -517,7 +517,7 @@
         private final WeakReference<Class<?>>[] parameterTypes;
         private final int paramCount;
         private final boolean[] isPrimitive;
-        private final WeakReference<Class<?>>[] wrappedParameterTypes;
+        private final Class<?>[] wrappedParameterTypes;
 
         @SuppressWarnings("unchecked")
         public CachedConstructor(Constructor<?> ctor) {
@@ -525,12 +525,12 @@
             this.parameterTypes = weakReference(ctor.getParameterTypes());
             this.paramCount = this.parameterTypes.length;
             this.isPrimitive = new boolean[paramCount];
-            this.wrappedParameterTypes = new WeakReference[paramCount];
+            this.wrappedParameterTypes = new Class[paramCount];
             for (int i = 0; i < paramCount; i++) {
                 WeakReference<Class<?>> parameterType = parameterTypes[i];
                 boolean primitive = parameterType.get().isPrimitive();
                 this.isPrimitive[i] = primitive;
-                this.wrappedParameterTypes[i] = primitive ? new WeakReference<Class<?>>(getWrapperTypeForPrimitiveType(parameterType.get())) : parameterType;
+                this.wrappedParameterTypes[i] = primitive ? getWrapperTypeForPrimitiveType(parameterType.get()) : null;
             }
         }
 
@@ -549,9 +549,12 @@
             }
             for (int i = 0; i < paramCount; i++) {
                 Object param = params[i];
+                // There's no need for a null check below because the parameter types are referenced
+                // by the class that uses them, so cannot be collected if the class itself is not
+                // collected.
                 Class<?> parameterType = parameterTypes[i].get();
                 if (isPrimitive[i]) {
-                    if (!wrappedParameterTypes[i].get().isInstance(param)) {
+                    if (!wrappedParameterTypes[i].isInstance(param)) {
                         return false;
                     }
                 } else {
