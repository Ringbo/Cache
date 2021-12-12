diff --git a/AndroidAnnotations/androidannotations/src/main/java/org/androidannotations/AndroidAnnotationProcessor.java b/AndroidAnnotations/androidannotations/src/main/java/org/androidannotations/AndroidAnnotationProcessor.java
index 2186080..5cebaef 100644
--- a/AndroidAnnotations/androidannotations/src/main/java/org/androidannotations/AndroidAnnotationProcessor.java
+++ b/AndroidAnnotations/androidannotations/src/main/java/org/androidannotations/AndroidAnnotationProcessor.java
@@ -266,7 +266,7 @@
 		Iterator<? extends TypeElement> iterator = annotations.iterator();
 		if (iterator.hasNext()) {
 			Element element = roundEnv.getElementsAnnotatedWith(iterator.next()).iterator().next();
-			LOGGER.error("Something went wront : {}", errorMessage, element);
+			LOGGER.error("Something went wront : {}", element, errorMessage);
 		} else {
 			LOGGER.error("Something went wront : {}", errorMessage);
 		}
