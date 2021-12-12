diff --git a/src/main/org/codehaus/groovy/runtime/InvokerHelper.java b/src/main/org/codehaus/groovy/runtime/InvokerHelper.java
index cfee722..de265e5 100644
--- a/src/main/org/codehaus/groovy/runtime/InvokerHelper.java
+++ b/src/main/org/codehaus/groovy/runtime/InvokerHelper.java
@@ -564,7 +564,10 @@
 
 
     /**
-     * A helper method to format the arguments types as a comma-separated list
+     * A helper method to format the arguments types as a comma-separated list.
+     *
+     * @param arguments the type to process
+     * @return the string representation of the type
      */
     public static String toTypeString(Object[] arguments) {
         if (arguments == null) {
@@ -582,9 +585,12 @@
 
     /**
      * A helper method to return the string representation of a map with bracket boundaries "[" and "]".
+     *
+     * @param arg the map to process
+     * @return the string representation of the map
      */
     public static String toMapString(Map arg) {
-        return format(arg, true);
+        return format(arg, false);
         /*if (arg == null) {
             return "null";
         }
@@ -611,6 +617,9 @@
 
     /**
      * A helper method to return the string representation of a list with bracket boundaries "[" and "]".
+     *
+     * @param arg the collection to process
+     * @return the string representation of the collection
      */
     public static String toListString(Collection arg) {
         if (arg == null) {
@@ -629,15 +638,18 @@
             else
                 buffer.append(", ");
             Object elem = iter.next();
-            buffer.append(format(elem, true));
+            buffer.append(format(elem, false));
         }
         buffer.append(ebdry);
         return buffer.toString();
     }
 
     /**
-     * A helper method to return the string representation of an arrray of objects
+     * A helper method to return the string representation of an array of objects
      * with brace boundaries "{" and "}".
+     *
+     * @param arguments the array to process
+     * @return the string representation of the array
      */
     public static String toArrayString(Object[] arguments) {
         if (arguments == null) {
@@ -650,7 +662,7 @@
             if (i > 0) {
                 argBuf.append(", ");
             }
-            argBuf.append(format(arguments[i], true));
+            argBuf.append(format(arguments[i], false));
         }
         argBuf.append(ebdry);
         return argBuf.toString();
