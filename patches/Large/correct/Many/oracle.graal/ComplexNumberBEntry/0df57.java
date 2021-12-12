diff --git a/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/ComplexNumberBEntry.java b/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/ComplexNumberBEntry.java
index f66d51e..305e080 100644
--- a/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/ComplexNumberBEntry.java
+++ b/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/ComplexNumberBEntry.java
@@ -32,7 +32,7 @@
     private final ComplexNumbersB numbers;
     private final int index;
 
-    public ComplexNumberBEntry(ComplexNumbersB numbers, int index) {
+    ComplexNumberBEntry(ComplexNumbersB numbers, int index) {
         this.numbers = numbers;
         this.index = index;
     }
