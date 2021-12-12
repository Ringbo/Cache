diff --git a/AndroidAnnotations/androidannotations/src/main/java/com/googlecode/androidannotations/processing/EBeanHolder.java b/AndroidAnnotations/androidannotations/src/main/java/com/googlecode/androidannotations/processing/EBeanHolder.java
index ba06c39..1eb26b6 100644
--- a/AndroidAnnotations/androidannotations/src/main/java/com/googlecode/androidannotations/processing/EBeanHolder.java
+++ b/AndroidAnnotations/androidannotations/src/main/java/com/googlecode/androidannotations/processing/EBeanHolder.java
@@ -89,7 +89,7 @@
 			JCodeModel codeModel = eBean.owner();
 			try {
 				refClass = codeModel.ref(fullyQualifiedClassName);
-			} catch (Exception e) {
+			} catch (NoClassDefFoundError ignored) {
 				refClass = codeModel.directClass(fullyQualifiedClassName);
 			}
 			loadedClasses.put(fullyQualifiedClassName, refClass);
