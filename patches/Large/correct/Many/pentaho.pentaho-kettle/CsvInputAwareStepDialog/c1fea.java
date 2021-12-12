diff --git a/ui/src/main/java/org/pentaho/di/ui/trans/step/common/CsvInputAwareStepDialog.java b/ui/src/main/java/org/pentaho/di/ui/trans/step/common/CsvInputAwareStepDialog.java
index f39057f..4341a4b 100644
--- a/ui/src/main/java/org/pentaho/di/ui/trans/step/common/CsvInputAwareStepDialog.java
+++ b/ui/src/main/java/org/pentaho/di/ui/trans/step/common/CsvInputAwareStepDialog.java
@@ -75,7 +75,7 @@
       return fieldNames;
     }
     final String delimiter = getTransMeta().environmentSubstitute( meta.getDelimiter() );
-    final String enclosure = getTransMeta().environmentSubstitute( meta.getEncoding() );
+    final String enclosure = getTransMeta().environmentSubstitute( meta.getEnclosure() );
 
     final EncodingType encodingType = EncodingType.guessEncodingType( reader.getEncoding() );
 
