diff --git a/truffle/com.oracle.truffle.sl/src/com/oracle/truffle/sl/parser/SLNodeFactory.java b/truffle/com.oracle.truffle.sl/src/com/oracle/truffle/sl/parser/SLNodeFactory.java
index b9580f7..f9247c5 100644
--- a/truffle/com.oracle.truffle.sl/src/com/oracle/truffle/sl/parser/SLNodeFactory.java
+++ b/truffle/com.oracle.truffle.sl/src/com/oracle/truffle/sl/parser/SLNodeFactory.java
@@ -105,7 +105,7 @@
         protected final LexicalScope outer;
         protected final Map<String, FrameSlot> locals;
 
-        public LexicalScope(LexicalScope outer) {
+        LexicalScope(LexicalScope outer) {
             this.outer = outer;
             this.locals = new HashMap<>();
             if (outer != null) {
