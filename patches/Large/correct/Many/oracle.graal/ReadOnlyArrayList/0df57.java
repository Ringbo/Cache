diff --git a/truffle/com.oracle.truffle.api.interop/src/com/oracle/truffle/api/interop/impl/ReadOnlyArrayList.java b/truffle/com.oracle.truffle.api.interop/src/com/oracle/truffle/api/interop/impl/ReadOnlyArrayList.java
index f5409bb..d710f2f 100644
--- a/truffle/com.oracle.truffle.api.interop/src/com/oracle/truffle/api/interop/impl/ReadOnlyArrayList.java
+++ b/truffle/com.oracle.truffle.api.interop/src/com/oracle/truffle/api/interop/impl/ReadOnlyArrayList.java
@@ -236,7 +236,7 @@
     private final class LI implements ListIterator<T>, Iterator<T> {
         private int index;
 
-        public LI(int index) {
+        LI(int index) {
             this.index = index;
         }
 
