diff --git a/src/main/java/com/fasterxml/jackson/databind/type/TypeFactory.java b/src/main/java/com/fasterxml/jackson/databind/type/TypeFactory.java
index c02041c..3a39001 100644
--- a/src/main/java/com/fasterxml/jackson/databind/type/TypeFactory.java
+++ b/src/main/java/com/fasterxml/jackson/databind/type/TypeFactory.java
@@ -31,7 +31,7 @@
  *</pre>
  */
 @SuppressWarnings({"rawtypes" })
-public final class TypeFactory
+public class TypeFactory // note: was final in 2.9, removed from 2.10
     implements java.io.Serializable
 {
     private static final long serialVersionUID = 1L;
@@ -171,6 +171,11 @@
         _classLoader = classLoader;
     }
 
+    /**
+     * "Mutant factory" method which will construct a new instance with specified
+     * {@link TypeModifier} added as the first modifier to call (in case there
+     * are multiple registered).
+     */
     public TypeFactory withModifier(TypeModifier mod) 
     {
         LRUMap<Object,JavaType> typeCache = _typeCache;
@@ -188,6 +193,10 @@
         return new TypeFactory(typeCache, _parser, mods, _classLoader);
     }
 
+    /**
+     * "Mutant factory" method which will construct a new instance with specified
+     * {@link ClassLoader} to use by {@link #findClass}.
+     */
     public TypeFactory withClassLoader(ClassLoader classLoader) {
         return new TypeFactory(_typeCache, _parser, _modifiers, classLoader);
     }
