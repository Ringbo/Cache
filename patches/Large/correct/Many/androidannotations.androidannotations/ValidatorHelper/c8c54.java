diff --git a/AndroidAnnotations/androidannotations/src/main/java/com/googlecode/androidannotations/helper/ValidatorHelper.java b/AndroidAnnotations/androidannotations/src/main/java/com/googlecode/androidannotations/helper/ValidatorHelper.java
index ec25da3..a1d59e8 100644
--- a/AndroidAnnotations/androidannotations/src/main/java/com/googlecode/androidannotations/helper/ValidatorHelper.java
+++ b/AndroidAnnotations/androidannotations/src/main/java/com/googlecode/androidannotations/helper/ValidatorHelper.java
@@ -888,15 +888,15 @@
 
 			if (!annotationHelper.isPrivate(constructor)) {
 				if (constructor.getParameters().size() != 0) {
-					annotationHelper.printError(element, "%s annotated element should have an empty constructor");
+					annotationHelper.printAnnotationError(element, "%s annotated element should have an empty constructor");
 					valid.invalidate();
 				}
 			} else {
-				annotationHelper.printError(element, "%s annotated element should not have a private constructor");
+				annotationHelper.printAnnotationError(element, "%s annotated element should not have a private constructor");
 				valid.invalidate();
 			}
 		} else {
-			annotationHelper.printError(element, "%s annotated element should have only one constructor");
+			annotationHelper.printAnnotationError(element, "%s annotated element should have only one constructor");
 			valid.invalidate();
 		}
 	}
