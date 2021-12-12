diff --git a/Dart/src/com/jetbrains/lang/dart/ide/index/DartImportAndExportIndex.java b/Dart/src/com/jetbrains/lang/dart/ide/index/DartImportAndExportIndex.java
index b8811ef..1fa8afc 100644
--- a/Dart/src/com/jetbrains/lang/dart/ide/index/DartImportAndExportIndex.java
+++ b/Dart/src/com/jetbrains/lang/dart/ide/index/DartImportAndExportIndex.java
@@ -69,7 +69,7 @@
         final int size = DataInputOutputUtil.readINT(in);
         final List<DartImportOrExportInfo> result = new ArrayList<DartImportOrExportInfo>(size);
         for (int i = 0; i < size; ++i) {
-          final DartImportOrExportInfo.Kind kind = DartImportOrExportInfo.Kind.valueOf(in.readUTF());
+          final DartImportOrExportInfo.Kind kind = DartImportOrExportInfo.Kind.valueOf(IOUtil.readUTF(in));
           final String uri = IOUtil.readUTF(in);
           final String prefix = IOUtil.readUTF(in);
           final int showSize = DataInputOutputUtil.readINT(in);
