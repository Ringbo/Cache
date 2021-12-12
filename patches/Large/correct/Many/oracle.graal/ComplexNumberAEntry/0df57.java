diff --git a/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/ComplexNumberAEntry.java b/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/ComplexNumberAEntry.java
index 4b0da19..20f7ef5 100644
--- a/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/ComplexNumberAEntry.java
+++ b/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/ComplexNumberAEntry.java
@@ -32,7 +32,7 @@
     private final ComplexNumbersA numbers;
     private final int index;
 
-    public ComplexNumberAEntry(ComplexNumbersA numbers, int index) {
+    ComplexNumberAEntry(ComplexNumbersA numbers, int index) {
         this.numbers = numbers;
         this.index = index;
     }
