diff --git a/plugins/meta-inject-plugin/src/main/java/org/pentaho/di/ui/trans/steps/metainject/MetaInjectDialog.java b/plugins/meta-inject-plugin/src/main/java/org/pentaho/di/ui/trans/steps/metainject/MetaInjectDialog.java
index 4b136b8..2ff34d2 100644
--- a/plugins/meta-inject-plugin/src/main/java/org/pentaho/di/ui/trans/steps/metainject/MetaInjectDialog.java
+++ b/plugins/meta-inject-plugin/src/main/java/org/pentaho/di/ui/trans/steps/metainject/MetaInjectDialog.java
@@ -906,7 +906,7 @@
     }
 
     wTargetFile.setText( Const.NVL( metaInjectMeta.getTargetFile(), "" ) );
-    wNoExecution.setSelection( metaInjectMeta.isNoExecution() );
+    wNoExecution.setSelection( !metaInjectMeta.isNoExecution() );
 
     wStreamingSourceStep.setText( Const.NVL(
       metaInjectMeta.getStreamSourceStep() == null ? null : metaInjectMeta.getStreamSourceStep().getName(), "" ) );
@@ -1136,7 +1136,7 @@
     }
 
     metaInjectMeta.setTargetFile( wTargetFile.getText() );
-    metaInjectMeta.setNoExecution( wNoExecution.getSelection() );
+    metaInjectMeta.setNoExecution( !wNoExecution.getSelection() );
 
     metaInjectMeta.setStreamSourceStep( transMeta.findStep( wStreamingSourceStep.getText() ) );
     metaInjectMeta.setStreamTargetStepname( wStreamingTargetStep.getText() );
