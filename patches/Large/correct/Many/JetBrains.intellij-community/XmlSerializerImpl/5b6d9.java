diff --git a/util/src/com/intellij/util/xmlb/XmlSerializerImpl.java b/util/src/com/intellij/util/xmlb/XmlSerializerImpl.java
index 23daade..efc7893 100644
--- a/util/src/com/intellij/util/xmlb/XmlSerializerImpl.java
+++ b/util/src/com/intellij/util/xmlb/XmlSerializerImpl.java
@@ -15,7 +15,7 @@
 class XmlSerializerImpl {
 
   private SerializationFilter filter;
-  private Map<Pair<Class, Accessor>, Binding> myBindings = new HashMap<Pair<Class, Accessor>, Binding>();
+  private Map<Pair<Type, Accessor>, Binding> myBindings = new HashMap<Pair<Type, Accessor>, Binding>();
 
 
   public XmlSerializerImpl(SerializationFilter filter) {
@@ -60,7 +60,7 @@
 
 
   private Binding _getClassBinding(Class<?> aClass, Type originalType, final Accessor accessor) {
-    final Pair<Class, Accessor> p = new Pair<Class, Accessor>(aClass, accessor);
+    final Pair<Type, Accessor> p = new Pair<Type, Accessor>(originalType, accessor);
 
     Binding binding = myBindings.get(p);
 
