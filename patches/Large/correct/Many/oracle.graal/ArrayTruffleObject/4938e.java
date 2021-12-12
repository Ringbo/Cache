diff --git a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/vm/ArrayTruffleObject.java b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/vm/ArrayTruffleObject.java
index 88bf4f8..1ccc65f 100644
--- a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/vm/ArrayTruffleObject.java
+++ b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/vm/ArrayTruffleObject.java
@@ -126,7 +126,7 @@
     }
 
     private final class IndexNode extends RootNode {
-        public IndexNode() {
+        IndexNode() {
             super(TruffleLanguage.class, null, null);
         }
 
@@ -142,7 +142,7 @@
     }
 
     private final class InvokeNode extends RootNode {
-        public InvokeNode() {
+        InvokeNode() {
             super(TruffleLanguage.class, null, null);
         }
 
@@ -162,7 +162,7 @@
     }
 
     private final class DuplNode extends RootNode {
-        public DuplNode() {
+        DuplNode() {
             super(TruffleLanguage.class, null, null);
         }
 
