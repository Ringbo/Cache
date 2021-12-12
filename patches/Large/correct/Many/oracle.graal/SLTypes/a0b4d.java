diff --git a/graal/com.oracle.truffle.sl/src/com/oracle/truffle/sl/nodes/SLTypes.java b/graal/com.oracle.truffle.sl/src/com/oracle/truffle/sl/nodes/SLTypes.java
index b28e884..c8c51af 100644
--- a/graal/com.oracle.truffle.sl/src/com/oracle/truffle/sl/nodes/SLTypes.java
+++ b/graal/com.oracle.truffle.sl/src/com/oracle/truffle/sl/nodes/SLTypes.java
@@ -44,7 +44,7 @@
      * singleton} instance.
      */
     @TypeCheck
-    public boolean isSLNull(Object value) {
+    public static boolean isSLNull(Object value) {
         return value == SLNull.SINGLETON;
     }
 
@@ -54,7 +54,7 @@
      * because we know that there is only a {@link SLNull#SINGLETON singleton} instance.
      */
     @TypeCast
-    public SLNull asSLNull(Object value) {
+    public static SLNull asSLNull(Object value) {
         assert isSLNull(value);
         return SLNull.SINGLETON;
     }
@@ -67,7 +67,7 @@
      * {@link BigInteger} arithmetic for values that fit into a 64-bit primitive value.
      */
     @ImplicitCast
-    public BigInteger castBigInteger(long value) {
+    public static BigInteger castBigInteger(long value) {
         return BigInteger.valueOf(value);
     }
 }
