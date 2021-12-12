diff --git a/driver-compat/src/main/com/mongodb/ReflectionDBObject.java b/driver-compat/src/main/com/mongodb/ReflectionDBObject.java
index 92230ab..03ff3b4 100644
--- a/driver-compat/src/main/com/mongodb/ReflectionDBObject.java
+++ b/driver-compat/src/main/com/mongodb/ReflectionDBObject.java
@@ -74,7 +74,7 @@
     /**
      * Gets the _id
      *
-     * @return
+     * @return the _id of this document
      */
     public Object get_id() {
         return _id;
@@ -105,20 +105,18 @@
     }
 
     /**
-     * ReflectionDBObjects can't be partial
+     * ReflectionDBObjects can't be partial.
+     * This operation is not supported.
      */
     public void markAsPartialObject() {
         throw new RuntimeException("ReflectionDBObjects can't be partial");
     }
 
     /**
-     * can't remove from a ReflectionDBObject
-     *
-     * @param key
-     * @return
+     * This operation is not supported.
      */
     public Object removeField(final String key) {
-        throw new RuntimeException("can't remove from a ReflectionDBObject");
+        throw new UnsupportedOperationException("can't remove from a ReflectionDBObject");
     }
 
     JavaWrapper getWrapper() {
@@ -256,10 +254,10 @@
     }
 
     /**
-     * Returns the wrapper if this object can be assigned from this class
+     * Returns the wrapper if this object can be assigned from this class.
      *
-     * @param c
-     * @return
+     * @param c the class to be wrapped
+     * @return the wrapper
      */
     public static JavaWrapper getWrapperIfReflectionObject(final Class c) {
         if (ReflectionDBObject.class.isAssignableFrom(c)) {
@@ -271,8 +269,8 @@
     /**
      * Returns an existing Wrapper instance associated with a class, or creates a new one.
      *
-     * @param c
-     * @return
+     * @param c the class to be wrapped
+     * @return the wrapped
      */
     public static JavaWrapper getWrapper(final Class c) {
         JavaWrapper w = _wrappers.get(c);
