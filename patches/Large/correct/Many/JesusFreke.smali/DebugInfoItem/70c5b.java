diff --git a/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/raw/DebugInfoItem.java b/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/raw/DebugInfoItem.java
index 1d3f4af..1ddd4ac 100644
--- a/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/raw/DebugInfoItem.java
+++ b/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/raw/DebugInfoItem.java
@@ -63,7 +63,7 @@
                     out.indent();
                     for (int i=0; i<parametersSize; i++) {
                         int paramaterIndex = reader.readSmallUleb128() - 1;
-                        out.annotateTo(reader.getOffset(),
+                        out.annotateTo(reader.getOffset(), "%s",
                                 StringIdItem.getOptionalReferenceAnnotation(dexFile, paramaterIndex, true));
                     }
                     out.deindent();
