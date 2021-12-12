diff --git a/third-party/java/dx-from-kitkat/src/com/android/dx/rop/cst/CstType.java b/third-party/java/dx-from-kitkat/src/com/android/dx/rop/cst/CstType.java
index 870fcb4..9642508 100644
--- a/third-party/java/dx-from-kitkat/src/com/android/dx/rop/cst/CstType.java
+++ b/third-party/java/dx-from-kitkat/src/com/android/dx/rop/cst/CstType.java
@@ -24,8 +24,8 @@
  */
 public final class CstType extends TypedConstant {
     /** {@code non-null;} map of interned types */
-    private static final HashMap<Type, CstType> interns =
-        new HashMap<Type, CstType>(100);
+    private static final HashMap<String, CstType> interns =
+        new HashMap<String, CstType>(100);
 
     /** {@code non-null;} instance corresponding to the class {@code Object} */
     public static final CstType OBJECT = intern(Type.OBJECT);
@@ -123,11 +123,11 @@
      */
     public static CstType intern(Type type) {
         synchronized (interns) {
-            CstType cst = interns.get(type);
+            CstType cst = interns.get(type.getDescriptor());
 
             if (cst == null) {
                 cst = new CstType(type);
-                interns.put(type, cst);
+                interns.put(type.getDescriptor(), cst);
             }
 
             return cst;
