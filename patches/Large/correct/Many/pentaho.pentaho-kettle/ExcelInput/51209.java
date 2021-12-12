diff --git a/src/org/pentaho/di/trans/steps/excelinput/ExcelInput.java b/src/org/pentaho/di/trans/steps/excelinput/ExcelInput.java
index 5b3e8cf..4f29194 100644
--- a/src/org/pentaho/di/trans/steps/excelinput/ExcelInput.java
+++ b/src/org/pentaho/di/trans/steps/excelinput/ExcelInput.java
@@ -205,14 +205,14 @@
                             r[rowcolumn] = targetMeta.convertData(sourceMetaCopy, string);
 							break;
 						default:
-                            r[rowcolumn] = targetMeta.convertData(sourceMeta, r[rowcolumn]);
+                            r[rowcolumn] = targetMeta.convertData(sourceMetaCopy, r[rowcolumn]);
 							break;
 						}
 						break;
 					// Use case: we find a date: convert it using the supplied format to String...
 					//
 					default:
-                        r[rowcolumn] = targetMeta.convertData(sourceMeta, r[rowcolumn]);
+                        r[rowcolumn] = targetMeta.convertData(sourceMetaCopy, r[rowcolumn]);
 					}
 				}
 			}
