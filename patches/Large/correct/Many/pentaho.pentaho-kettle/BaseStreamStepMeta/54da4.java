diff --git a/engine/src/main/java/org/pentaho/di/trans/streaming/common/BaseStreamStepMeta.java b/engine/src/main/java/org/pentaho/di/trans/streaming/common/BaseStreamStepMeta.java
index 0b5d3d0..9331682 100644
--- a/engine/src/main/java/org/pentaho/di/trans/streaming/common/BaseStreamStepMeta.java
+++ b/engine/src/main/java/org/pentaho/di/trans/streaming/common/BaseStreamStepMeta.java
@@ -156,7 +156,7 @@
         if ( !subMeta.getSteps().stream().anyMatch( subStepMeta -> subStepMeta.getName().equals( realSubStepName ) ) ) {
           remarks.add( new CheckResult(
             CheckResultInterface.TYPE_RESULT_ERROR,
-            BaseMessages.getString( PKG, "BaseStreamStepMeta.CheckResult.ResultStepMissing", realSubStepName ),
+            BaseMessages.getString( PKG, "BaseStreamStepMeta.CheckResult.ResultStepMissing", subMeta.getName(), realSubStepName ),
             stepMeta ) );
         }
       }
@@ -225,7 +225,7 @@
             } );
         } else {
           throw new RuntimeException(
-            BaseMessages.getString( PKG, "BaseStreamStepMeta.CheckResult.ResultStepMissing", realSubStepName ) );
+            BaseMessages.getString( PKG, "BaseStreamStepMeta.CheckResult.ResultStepMissing", transMeta.getName(), realSubStepName ) );
         }
       }
     } catch ( KettleException e ) {
