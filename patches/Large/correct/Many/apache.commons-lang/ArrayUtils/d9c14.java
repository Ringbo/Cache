diff --git a/src/java/org/apache/commons/lang/ArrayUtils.java b/src/java/org/apache/commons/lang/ArrayUtils.java
index 82e2739..773003c 100644
--- a/src/java/org/apache/commons/lang/ArrayUtils.java
+++ b/src/java/org/apache/commons/lang/ArrayUtils.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2005 The Apache Software Foundation.
+ * Copyright 2002-2006 The Apache Software Foundation.
  * 
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -2317,14 +2317,12 @@
     /**
      * <p>Converts an array of primitive chars to objects.</p>
      *
-     * <p><strong>This is method is not in ArrayUtils.</strong></p>
-     *
      * <p>This method returns <code>null</code> for a <code>null</code> input array.</p>
      * 
      * @param array a <code>char</code> array
      * @return a <code>Character</code> array, <code>null</code> if null array input
      */
-    public static Object[] toObject(char[] array) {
+    public static Character[] toObject(char[] array) {
         if ( array == null ) {
             return null;
         }else if( array.length == 0 ){
