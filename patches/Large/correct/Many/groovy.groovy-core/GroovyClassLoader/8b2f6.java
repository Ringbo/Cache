diff --git a/src/main/groovy/lang/GroovyClassLoader.java b/src/main/groovy/lang/GroovyClassLoader.java
index 10ded04..c84966b 100644
--- a/src/main/groovy/lang/GroovyClassLoader.java
+++ b/src/main/groovy/lang/GroovyClassLoader.java
@@ -269,7 +269,7 @@
      * @return the main class defined in the given script
      */
     public Class parseClass(GroovyCodeSource codeSource, boolean shouldCacheSource) throws CompilationFailedException {
-        synchronized (classCache) {
+        synchronized (this) {
             Class answer = (Class) sourceCache.get(codeSource.getName());
             if (answer!=null) return answer;
             
@@ -493,7 +493,7 @@
      */    
     protected Class getClassCacheEntry(String name) {
         if (name==null) return null;
-        synchronized (classCache) {
+        synchronized (this) {
             return (Class) classCache.get(name);
         }
     }
@@ -506,7 +506,7 @@
      * @see #clearCache()
      */
     protected void setClassCacheEntry(Class cls) {
-        synchronized (classCache) {
+        synchronized (this) {
             classCache.put(cls.getName(),cls);
         }
     }    
@@ -519,7 +519,7 @@
      * @see #clearCache()
      */
     protected void removeClassCacheEntry(String name) {
-        synchronized (classCache) {
+        synchronized (this) {
             classCache.remove(name);
         }
     }    
@@ -639,7 +639,7 @@
         if (lookupScriptFiles) {
             // synchronize on cache, as we want only one compilation
             // at the same time
-            synchronized (classCache) {
+            synchronized (this) {
                 // try groovy file
                 try {
                     // check if recompilation already happend.
@@ -833,7 +833,7 @@
      * @return all classes loaded by this class loader
      */
     public Class[] getLoadedClasses() {
-        synchronized (classCache) {
+        synchronized (this) {
             return (Class[]) classCache.values().toArray(new Class[0]);
         }
     }
@@ -845,7 +845,7 @@
      * @see #removeClassCacheEntry(String)
      */    
     public void clearCache() {
-        synchronized (classCache) {
+        synchronized (this) {
             classCache.clear();
         }
     }
