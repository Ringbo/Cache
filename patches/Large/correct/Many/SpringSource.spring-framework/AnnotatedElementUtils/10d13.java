diff --git a/spring-core/src/main/java/org/springframework/core/annotation/AnnotatedElementUtils.java b/spring-core/src/main/java/org/springframework/core/annotation/AnnotatedElementUtils.java
index e4554b2..0d80658 100644
--- a/spring-core/src/main/java/org/springframework/core/annotation/AnnotatedElementUtils.java
+++ b/spring-core/src/main/java/org/springframework/core/annotation/AnnotatedElementUtils.java
@@ -189,7 +189,7 @@
 	public static AnnotationAttributes findAnnotationAttributes(AnnotatedElement element,
 			Class<? extends Annotation> annotationType) {
 		Assert.notNull(annotationType, "annotationType must not be null");
-		return findAnnotationAttributes(element, annotationType.getName(), true, true, true, true, false, false);
+		return findAnnotationAttributes(element, annotationType.getName());
 	}
 
 	/**
@@ -209,7 +209,7 @@
 	 * not found
 	 */
 	public static AnnotationAttributes findAnnotationAttributes(AnnotatedElement element, String annotationType) {
-		return findAnnotationAttributes(element, annotationType, true, true, true, true, false, false);
+		return findAnnotationAttributes(element, annotationType, false, false);
 	}
 
 	/**
@@ -697,6 +697,14 @@
 		}
 	}
 
+	/**
+	 * {@link Processor} that gets the {@code AnnotationAttributes} for the
+	 * target annotation during the {@link #process} phase and then merges
+	 * annotation attributes from lower levels in the annotation hierarchy
+	 * during the {@link #postProcess} phase.
+	 * @see AnnotationUtils#getAnnotationAttributes(Annotation)
+	 * @since 4.2
+	 */
 	private static class MergeAnnotationAttributesProcessor implements Processor<AnnotationAttributes> {
 
 		private final boolean classValuesAsString;
