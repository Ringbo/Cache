diff --git a/spring-core/src/main/java/org/springframework/core/annotation/AnnotatedElementUtils.java b/spring-core/src/main/java/org/springframework/core/annotation/AnnotatedElementUtils.java
index 5c3fd57..6acc562 100644
--- a/spring-core/src/main/java/org/springframework/core/annotation/AnnotatedElementUtils.java
+++ b/spring-core/src/main/java/org/springframework/core/annotation/AnnotatedElementUtils.java
@@ -55,7 +55,8 @@
  * <p><strong>Get semantics</strong> are limited to searching for annotations
  * that are either <em>present</em> on an {@code AnnotatedElement} (i.e.,
  * declared locally or {@linkplain java.lang.annotation.Inherited inherited})
- * or declared within the annotation hierarchy above an {@code AnnotatedElement}.
+ * or declared within the annotation hierarchy <em>above</em> an
+ * {@code AnnotatedElement}.
  *
  * <p><strong>Find semantics</strong> are much more exhaustive, providing
  * <em>get semantics</em> plus support for the following:
@@ -183,7 +184,7 @@
 	/**
 	 * Determine if an annotation of the specified {@code annotationType}
 	 * is <em>present</em> on the supplied {@link AnnotatedElement} or
-	 * within the annotation hierarchy above the specified element.
+	 * within the annotation hierarchy <em>above</em> the specified element.
 	 *
 	 * <p>If this method returns {@code true}, then {@link #getAnnotationAttributes}
 	 * will return a non-null value.
@@ -210,15 +211,13 @@
 	}
 
 	/**
-	 * Get annotation attributes of the specified {@code annotationType}
-	 * in the annotation hierarchy of the supplied {@link AnnotatedElement}
-	 * and merge the results into an {@link AnnotationAttributes} map.
+	 * Get the first annotation of the specified {@code annotationType} within
+	 * the annotation hierarchy <em>above</em> the supplied {@code element} and
+	 * merge that annotation's attributes with <em>matching</em> attributes from
+	 * annotations in lower levels of the annotation hierarchy.
 	 *
-	 * <p>Delegates to {@link #getAnnotationAttributes(AnnotatedElement, String, boolean, boolean)},
+	 * <p>This method delegates to {@link #getAnnotationAttributes(AnnotatedElement, String, boolean, boolean)},
 	 * supplying {@code false} for {@code classValuesAsString} and {@code nestedAnnotationsAsMap}.
-	 *
-	 * <p>This method follows <em>get semantics</em> as described in the
-	 * {@linkplain AnnotatedElementUtils class-level Javadoc}.
 	 *
 	 * @param element the annotated element; never {@code null}
 	 * @param annotationType the fully qualified class name of the annotation
@@ -228,15 +227,26 @@
 	 * @see #getAnnotationAttributes(AnnotatedElement, String, boolean, boolean)
 	 * @see #findAnnotationAttributes(AnnotatedElement, Class)
 	 * @see #findAnnotationAttributes(AnnotatedElement, String)
+	 * @see #getAllAnnotationAttributes(AnnotatedElement, String)
 	 */
 	public static AnnotationAttributes getAnnotationAttributes(AnnotatedElement element, String annotationType) {
 		return getAnnotationAttributes(element, annotationType, false, false);
 	}
 
 	/**
-	 * Get annotation attributes of the specified {@code annotationType}
-	 * in the annotation hierarchy of the supplied {@link AnnotatedElement}
-	 * and merge the results into an {@link AnnotationAttributes} map.
+	 * Get the first annotation of the specified {@code annotationType} within
+	 * the annotation hierarchy <em>above</em> the supplied {@code element} and
+	 * merge that annotation's attributes with <em>matching</em> attributes from
+	 * annotations in lower levels of the annotation hierarchy.
+	 *
+	 * <p>Attributes from lower levels in the annotation hierarchy override
+	 * attributes of the same name from higher levels.
+	 *
+	 * <p>In contrast to {@link #getAllAnnotationAttributes}, the search
+	 * algorithm used by this method will stop searching the annotation
+	 * hierarchy once the first annotation of the specified
+	 * {@code annotationType} has been found. As a consequence, additional
+	 * annotations of the specified {@code annotationType} will be ignored.
 	 *
 	 * <p>This method follows <em>get semantics</em> as described in the
 	 * {@linkplain AnnotatedElementUtils class-level Javadoc}.
@@ -247,13 +257,14 @@
 	 * @param classValuesAsString whether to convert Class references into
 	 * Strings or to preserve them as Class references
 	 * @param nestedAnnotationsAsMap whether to convert nested Annotation
-	 * instances into {@link AnnotationAttributes} maps or to preserve them
+	 * instances into {@code AnnotationAttributes} maps or to preserve them
 	 * as Annotation instances
 	 * @return the merged {@code AnnotationAttributes}, or {@code null} if
 	 * not found
 	 * @see #findAnnotationAttributes(AnnotatedElement, Class)
 	 * @see #findAnnotationAttributes(AnnotatedElement, String)
 	 * @see #findAnnotationAttributes(AnnotatedElement, String, boolean, boolean)
+	 * @see #getAllAnnotationAttributes(AnnotatedElement, String, boolean, boolean)
 	 */
 	public static AnnotationAttributes getAnnotationAttributes(AnnotatedElement element, String annotationType,
 			boolean classValuesAsString, boolean nestedAnnotationsAsMap) {
@@ -262,13 +273,13 @@
 	}
 
 	/**
-	 * Find annotation attributes of the specified {@code annotationType}
-	 * within annotation hierarchies <em>above</em> the supplied
-	 * {@link AnnotatedElement} and merge the results into an
-	 * {@link AnnotationAttributes} map.
+	 * Find the first annotation of the specified {@code annotationType} within
+	 * the annotation hierarchy <em>above</em> the supplied {@code element} and
+	 * merge that annotation's attributes with <em>matching</em> attributes from
+	 * annotations in lower levels of the annotation hierarchy.
 	 *
-	 * <p>This method follows <em>find semantics</em> as described in the
-	 * {@linkplain AnnotatedElementUtils class-level Javadoc}.
+	 * <p>This method delegates to {@link #findAnnotationAttributes(AnnotatedElement, String, boolean, boolean)}
+	 * supplying {@code false} for {@code classValuesAsString} and {@code nestedAnnotationsAsMap}.
 	 *
 	 * @param element the annotated element; never {@code null}
 	 * @param annotationType the annotation type to find; never {@code null}
@@ -281,17 +292,17 @@
 	public static AnnotationAttributes findAnnotationAttributes(AnnotatedElement element,
 			Class<? extends Annotation> annotationType) {
 		Assert.notNull(annotationType, "annotationType must not be null");
-		return findAnnotationAttributes(element, annotationType.getName());
+		return findAnnotationAttributes(element, annotationType.getName(), false, false);
 	}
 
 	/**
-	 * Find annotation attributes of the specified {@code annotationType}
-	 * within annotation hierarchies <em>above</em> the supplied
-	 * {@link AnnotatedElement} and merge the results into an
-	 * {@link AnnotationAttributes} map.
+	 * Find the first annotation of the specified {@code annotationType} within
+	 * the annotation hierarchy <em>above</em> the supplied {@code element} and
+	 * merge that annotation's attributes with <em>matching</em> attributes from
+	 * annotations in lower levels of the annotation hierarchy.
 	 *
-	 * <p>This method follows <em>find semantics</em> as described in the
-	 * {@linkplain AnnotatedElementUtils class-level Javadoc}.
+	 * <p>This method delegates to {@link #findAnnotationAttributes(AnnotatedElement, String, boolean, boolean)}
+	 * supplying {@code false} for {@code classValuesAsString} and {@code nestedAnnotationsAsMap}.
 	 *
 	 * @param element the annotated element; never {@code null}
 	 * @param annotationType the fully qualified class name of the annotation
@@ -307,10 +318,19 @@
 	}
 
 	/**
-	 * Find annotation attributes of the specified {@code annotationType}
-	 * within annotation hierarchies <em>above</em> the supplied
-	 * {@link AnnotatedElement} and merge the results into an
-	 * {@link AnnotationAttributes} map.
+	 * Find the first annotation of the specified {@code annotationType} within
+	 * the annotation hierarchy <em>above</em> the supplied {@code element} and
+	 * merge that annotation's attributes with <em>matching</em> attributes from
+	 * annotations in lower levels of the annotation hierarchy.
+	 *
+	 * <p>Attributes from lower levels in the annotation hierarchy override
+	 * attributes of the same name from higher levels.
+	 *
+	 * <p>In contrast to {@link #getAllAnnotationAttributes}, the search
+	 * algorithm used by this method will stop searching the annotation
+	 * hierarchy once the first annotation of the specified
+	 * {@code annotationType} has been found. As a consequence, additional
+	 * annotations of the specified {@code annotationType} will be ignored.
 	 *
 	 * <p>This method follows <em>find semantics</em> as described in the
 	 * {@linkplain AnnotatedElementUtils class-level Javadoc}.
@@ -321,7 +341,7 @@
 	 * @param classValuesAsString whether to convert Class references into
 	 * Strings or to preserve them as Class references
 	 * @param nestedAnnotationsAsMap whether to convert nested Annotation
-	 * instances into {@link AnnotationAttributes} maps or to preserve them
+	 * instances into {@code AnnotationAttributes} maps or to preserve them
 	 * as Annotation instances
 	 * @return the merged {@code AnnotationAttributes}, or {@code null} if
 	 * not found
@@ -337,10 +357,10 @@
 	}
 
 	/**
-	 * Find annotation attributes of the specified {@code annotationType}
-	 * within annotation hierarchies <em>above</em> the supplied
-	 * {@link AnnotatedElement} and merge the results into an
-	 * {@link AnnotationAttributes} map.
+	 * Find the first annotation of the specified {@code annotationType} within
+	 * the annotation hierarchy <em>above</em> the supplied {@code element} and
+	 * merge that annotation's attributes with <em>matching</em> attributes from
+	 * annotations in lower levels of the annotation hierarchy.
 	 *
 	 * @param element the annotated element; never {@code null}
 	 * @param annotationType the fully qualified class name of the annotation
@@ -356,7 +376,7 @@
 	 * @param classValuesAsString whether to convert Class references into
 	 * Strings or to preserve them as Class references
 	 * @param nestedAnnotationsAsMap whether to convert nested Annotation
-	 * instances into {@link AnnotationAttributes} maps or to preserve them
+	 * instances into {@code AnnotationAttributes} maps or to preserve them
 	 * as Annotation instances
 	 * @return the merged {@code AnnotationAttributes}, or {@code null} if
 	 * not found
@@ -415,7 +435,7 @@
 	 * @param classValuesAsString whether to convert Class references into
 	 * Strings or to preserve them as Class references
 	 * @param nestedAnnotationsAsMap whether to convert nested Annotation
-	 * instances into {@link AnnotationAttributes} maps or to preserve them
+	 * instances into {@code AnnotationAttributes} maps or to preserve them
 	 * as Annotation instances
 	 * @return a {@link MultiValueMap} keyed by attribute name, containing
 	 * the annotation attributes from all annotations found, or {@code null}
