diff --git a/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/impl/TckLanguage.java b/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/impl/TckLanguage.java
index 42a85c7..0e3ad94 100644
--- a/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/impl/TckLanguage.java
+++ b/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/impl/TckLanguage.java
@@ -106,7 +106,7 @@
     private static final class MultiplyNode extends RootNode implements TruffleObject, ForeignAccess.Factory {
         private final Source code;
 
-        public MultiplyNode(Source toParse) {
+        MultiplyNode(Source toParse) {
             super(TckLanguage.class, null, null);
             this.code = toParse;
         }
