diff --git a/pinot-common/src/main/java/com/linkedin/pinot/common/data/Schema.java b/pinot-common/src/main/java/com/linkedin/pinot/common/data/Schema.java
index 6e39ad9..2b3bb84 100644
--- a/pinot-common/src/main/java/com/linkedin/pinot/common/data/Schema.java
+++ b/pinot-common/src/main/java/com/linkedin/pinot/common/data/Schema.java
@@ -273,7 +273,7 @@
                   fieldSpec.getDefaultNullValue();
                   break;
                 default:
-                  ctxLogger.error("Unsupported data type: {} in dimension/time field: {}", dataType, fieldName);
+                ctxLogger.info("Unsupported data type: {} in DIMENSION/TIME field: {}", dataType, fieldName);
                   isValid = false;
                   break;
               }
@@ -288,18 +288,19 @@
                   fieldSpec.getDefaultNullValue();
                   break;
                 default:
-                  ctxLogger.error("Unsupported data type: {} in metric field: {}", dataType, fieldName);
+                ctxLogger.info("Unsupported data type: {} in METRIC field: {}", dataType, fieldName);
                   isValid = false;
                   break;
               }
               break;
             default:
-              ctxLogger.error("Unsupported field type: {} for field: {}", dataType, fieldName);
+            ctxLogger.info("Unsupported field type: {} for field: {}", dataType, fieldName);
               isValid = false;
               break;
           }
         } catch (Exception e) {
-          ctxLogger.error("Caught exception while validating {} field {} dataType {}", fieldType, fieldName, dataType, e);
+        ctxLogger.info("Caught exception while validating field: {} with field type: {}, data type: {}, {}", fieldName,
+            fieldType, dataType, e.getMessage());
           isValid = false;
         }
       }
