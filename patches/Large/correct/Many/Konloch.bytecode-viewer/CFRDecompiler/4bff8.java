diff --git a/src/main/java/the/bytecode/club/bytecodeviewer/decompilers/CFRDecompiler.java b/src/main/java/the/bytecode/club/bytecodeviewer/decompilers/CFRDecompiler.java
index a647f8c..04709ec 100644
--- a/src/main/java/the/bytecode/club/bytecodeviewer/decompilers/CFRDecompiler.java
+++ b/src/main/java/the/bytecode/club/bytecodeviewer/decompilers/CFRDecompiler.java
@@ -195,7 +195,7 @@
                     e1.analyseTop(dcCommonState);
                     TypeUsageCollector collectingDumper = new TypeUsageCollector(e1);
                     e1.collectTypeUsages(collectingDumper);
-                    d = new FileDumper(output.toAbsolutePath().toString(), e1.getClassType(), summaryDumper, collectingDumper.getTypeUsageInformation(), options, illegalIdentifierDump);
+                    d = new FileDumper(output.toAbsolutePath().toString(), true, e1.getClassType(), summaryDumper, collectingDumper.getTypeUsageInformation(), options, illegalIdentifierDump);
                     e1.dump(d);
                     d.print("\n");
                     d.print("\n");
