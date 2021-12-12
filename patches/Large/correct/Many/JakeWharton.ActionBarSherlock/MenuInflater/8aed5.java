diff --git a/library/src/android/support/v4/view/MenuInflater.java b/library/src/android/support/v4/view/MenuInflater.java
index f32a2aa..d8a0728 100644
--- a/library/src/android/support/v4/view/MenuInflater.java
+++ b/library/src/android/support/v4/view/MenuInflater.java
@@ -435,7 +435,7 @@
         private Method mMethod;
 
         public InflatedOnMenuItemClickListener(String methodName) {
-            final Class<?> localClass = MenuInflater.this.getClass();
+            final Class<?> localClass = mContext.getClass();
             try {
                 mMethod = localClass.getMethod(methodName, PARAM_TYPES);
             } catch (Exception e) {
@@ -453,7 +453,7 @@
             final Object[] params = new Object[] { item };
             try {
                 if (mMethod.getReturnType() == Boolean.TYPE) {
-                    return (Boolean)mMethod.invoke(MenuInflater.this, params);
+                    return (Boolean)mMethod.invoke(mContext, params);
                 }
                 return false;
             } catch (Exception e) {
