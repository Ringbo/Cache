diff --git a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/vm/HashLanguage.java b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/vm/HashLanguage.java
index 390be3b..2a0255f 100644
--- a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/vm/HashLanguage.java
+++ b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/vm/HashLanguage.java
@@ -92,7 +92,7 @@
         private final Source code;
         private final int id;
 
-        public HashNode(HashLanguage hash, Source code) {
+        HashNode(HashLanguage hash, Source code) {
             super(hash.getClass(), null, null);
             this.code = code;
             id = ++counter;
