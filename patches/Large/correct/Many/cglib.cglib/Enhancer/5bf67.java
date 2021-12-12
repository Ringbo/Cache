diff --git a/src/proxy/net/sf/cglib/Enhancer.java b/src/proxy/net/sf/cglib/Enhancer.java
index 1789e0f..bbcf0e0 100644
--- a/src/proxy/net/sf/cglib/Enhancer.java
+++ b/src/proxy/net/sf/cglib/Enhancer.java
@@ -91,7 +91,7 @@
  * @see MethodInterceptor
  * @see Factory
  * @author Juozas Baliuka <a href="mailto:baliuka@mwm.lt">baliuka@mwm.lt</a>
- * @version $Id: Enhancer.java,v 1.47 2003/09/09 17:08:08 herbyderby Exp $
+ * @version $Id: Enhancer.java,v 1.48 2003/09/09 18:01:36 herbyderby Exp $
  */
 public class Enhancer {
     private static final FactoryCache cache = new FactoryCache(Enhancer.class);
@@ -123,7 +123,7 @@
      * Helper method, has same effect as <pre>return enhance(cls, interfaces, ih, null, null);</pre>
      * @see #enhance(Class, Class[], MethodInterceptor, ClassLoader, Method, MethodFilter)
      */
-    public static Object enhance(Class cls, Class interfaces[], Callback callback) {
+    public static Factory enhance(Class cls, Class interfaces[], Callback callback) {
         return enhanceHelper(cls, interfaces, callback, null, null);
     }
 
@@ -131,7 +131,7 @@
      * Helper method, has same effect as <pre>return enhance(cls, interfaces, ih, loader, null);</pre>
      * @see #enhance(Class, Class[], MethodInterceptor, ClassLoader, Method, MethodFilter)
      */
-    public static Object enhance(Class cls, Class interfaces[], Callback callback, ClassLoader loader) {
+    public static Factory enhance(Class cls, Class interfaces[], Callback callback, ClassLoader loader) {
         return enhanceHelper(cls, interfaces, callback, loader, null);
     } 
 
@@ -148,7 +148,7 @@
      * interfaces, plus the CGLIB Factory interface.
      * @see Factory
      */
-    public static Object enhance(Class cls, Class[] interfaces, Callbacks callbacks,
+    public static Factory enhance(Class cls, Class[] interfaces, Callbacks callbacks,
                                  ClassLoader loader, CallbackFilter filter) {
         return enhanceHelper(cls, interfaces, callbacks, loader, filter);
     }
@@ -179,7 +179,7 @@
                       });
     }
 
-    private static Object enhanceHelper(Class cls,
+    private static Factory enhanceHelper(Class cls,
                                         Class[] interfaces,
                                         final Callback callback,
                                         ClassLoader loader,
@@ -195,14 +195,14 @@
         return enhanceHelper(cls, interfaces, callbacks, loader, filter);
     }
     
-    private static Object enhanceHelper(Class cls,
+    private static Factory enhanceHelper(Class cls,
                                         final Class[] interfaces,
                                         final Callbacks callbacks,
                                         ClassLoader loader,
                                         final CallbackFilter filter) {
         final Class base = (cls == null) ? Object.class : cls;
         Object key = KEY_FACTORY.newInstance(base, interfaces, filter);
-        return cache.get(loader, key, new FactoryCache.AbstractCallback() {
+        return (Factory)cache.get(loader, key, new FactoryCache.AbstractCallback() {
             public BasicCodeGenerator newGenerator() {
                 return new EnhancerGenerator(base, interfaces, filter, callbacks);
             }
