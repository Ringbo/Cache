diff --git a/substratevm/src/com.oracle.svm.core.genscavenge/src/com/oracle/svm/core/genscavenge/ObjectHeaderImpl.java b/substratevm/src/com.oracle.svm.core.genscavenge/src/com/oracle/svm/core/genscavenge/ObjectHeaderImpl.java
index 6f49c45..bb25c4b 100644
--- a/substratevm/src/com.oracle.svm.core.genscavenge/src/com/oracle/svm/core/genscavenge/ObjectHeaderImpl.java
+++ b/substratevm/src/com.oracle.svm.core.genscavenge/src/com/oracle/svm/core/genscavenge/ObjectHeaderImpl.java
@@ -593,7 +593,7 @@
     /** Log an object header. */
     public Log objectHeaderToLog(Object obj, Log log) {
         log.string("  obj: ").hex(Word.objectToUntrackedPointer(obj));
-        final UnsignedWord header = ObjectHeaderImpl.readHeaderBitsFromObjectCarefully(obj);
+        final UnsignedWord header = ObjectHeaderImpl.readHeaderFromObjectCarefully(obj);
         final DynamicHub hub = ObjectHeader.dynamicHubFromObjectHeader(header);
         log.string("  header: ").hex(header)
                         .string("  hub:").hex(Word.objectToUntrackedPointer(hub))
