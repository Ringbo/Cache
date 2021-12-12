diff --git a/src/main/org/codehaus/groovy/classgen/asm/BytecodeHelper.java b/src/main/org/codehaus/groovy/classgen/asm/BytecodeHelper.java
index 268a610..3f2e905 100644
--- a/src/main/org/codehaus/groovy/classgen/asm/BytecodeHelper.java
+++ b/src/main/org/codehaus/groovy/classgen/asm/BytecodeHelper.java
@@ -56,7 +56,7 @@
     }
 
     public static String getMethodDescriptor(ClassNode returnType, Parameter[] parameters) {
-        StringBuffer buffer = new StringBuffer("(");
+        StringBuilder buffer = new StringBuilder("(");
         for (int i = 0; i < parameters.length; i++) {
             buffer.append(getTypeDescription(parameters[i].getType()));
         }
@@ -80,7 +80,7 @@
      */
     public static String getMethodDescriptor(Class returnType, Class[] paramTypes) {
         // lets avoid class loading
-        StringBuffer buffer = new StringBuffer("(");
+        StringBuilder buffer = new StringBuilder("(");
         for (int i = 0; i < paramTypes.length; i++) {
             buffer.append(getTypeDescription(paramTypes[i]));
         }
@@ -105,7 +105,7 @@
      * @return the ASM type description for class loading
      */
     public static String getClassLoadingTypeDescription(ClassNode c) {
-        StringBuffer buf = new StringBuffer();
+        StringBuilder buf = new StringBuilder();
         boolean array = false;
         while (true) {
             if (c.isArray()) {
@@ -144,7 +144,7 @@
      * @return the ASM type description
      */
     private static String getTypeDescription(ClassNode c, boolean end) {
-        StringBuffer buf = new StringBuffer();
+        StringBuilder buf = new StringBuilder();
         ClassNode d = c;
         while (true) {
             if (ClassHelper.isPrimitiveType(d)) {
@@ -367,7 +367,7 @@
 
         if (generics == null && !hasGenerics(param) && !hasGenerics(returnType)) return null;
 
-        StringBuffer ret = new StringBuffer(100);
+        StringBuilder ret = new StringBuilder(100);
         getGenericsTypeSpec(ret, generics);
 
         GenericsType[] paramTypes = new GenericsType[param.length];
@@ -402,7 +402,7 @@
     public static String getGenericsSignature(ClassNode node) {
         if (!usesGenericsInClassSignature(node)) return null;
         GenericsType[] genericsTypes = node.getGenericsTypes();
-        StringBuffer ret = new StringBuffer(100);
+        StringBuilder ret = new StringBuilder(100);
         getGenericsTypeSpec(ret, genericsTypes);
         GenericsType extendsPart = new GenericsType(node.getUnresolvedSuperClass(false));
         writeGenericsBounds(ret, extendsPart, true);
@@ -414,7 +414,7 @@
         return ret.toString();
     }
 
-    private static void getGenericsTypeSpec(StringBuffer ret, GenericsType[] genericsTypes) {
+    private static void getGenericsTypeSpec(StringBuilder ret, GenericsType[] genericsTypes) {
         if (genericsTypes == null) return;
         ret.append('<');
         for (int i = 0; i < genericsTypes.length; i++) {
@@ -429,7 +429,7 @@
     public static String getGenericsBounds(ClassNode type) {
         GenericsType[] genericsTypes = type.getGenericsTypes();
         if (genericsTypes == null) return null;
-        StringBuffer ret = new StringBuffer(100);
+        StringBuilder ret = new StringBuilder(100);
         if (type.isGenericsPlaceHolder()) {
             addSubTypes(ret, type.getGenericsTypes(), "", "");
         } else {
@@ -440,7 +440,7 @@
         return ret.toString();
     }
 
-    private static void writeGenericsBoundType(StringBuffer ret, ClassNode printType, boolean writeInterfaceMarker) {
+    private static void writeGenericsBoundType(StringBuilder ret, ClassNode printType, boolean writeInterfaceMarker) {
         if (writeInterfaceMarker && printType.isInterface()) ret.append(":");
         if (printType.equals(ClassHelper.OBJECT_TYPE) && printType.getGenericsTypes() != null) {
             ret.append("T");
@@ -454,7 +454,7 @@
         }
     }
 
-    private static void writeGenericsBounds(StringBuffer ret, GenericsType type, boolean writeInterfaceMarker) {
+    private static void writeGenericsBounds(StringBuilder ret, GenericsType type, boolean writeInterfaceMarker) {
         if (type.getUpperBounds() != null) {
             ClassNode[] bounds = type.getUpperBounds();
             for (int i = 0; i < bounds.length; i++) {
@@ -467,7 +467,7 @@
         }
     }
 
-    private static void addSubTypes(StringBuffer ret, GenericsType[] types, String start, String end) {
+    private static void addSubTypes(StringBuilder ret, GenericsType[] types, String start, String end) {
         if (types == null) return;
         ret.append(start);
         for (int i = 0; i < types.length; i++) {
