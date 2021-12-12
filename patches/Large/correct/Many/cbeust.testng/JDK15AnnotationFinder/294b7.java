diff --git a/src/main/java/org/testng/internal/annotations/JDK15AnnotationFinder.java b/src/main/java/org/testng/internal/annotations/JDK15AnnotationFinder.java
index edfd80b..5b3fc30 100755
--- a/src/main/java/org/testng/internal/annotations/JDK15AnnotationFinder.java
+++ b/src/main/java/org/testng/internal/annotations/JDK15AnnotationFinder.java
@@ -105,7 +105,7 @@
           + annotationClass + "' not found.");
     }
     Annotation annotation = m.getAnnotation(a);
-    return findAnnotation(annotation, annotationClass, m.getDeclaringClass(), null, m,
+    return findAnnotation(m.getDeclaringClass(), annotation, annotationClass, null, null, m,
         new Pair<>(annotation, m));
   }
 
@@ -127,7 +127,7 @@
     if (annotation == null) {
       annotation = testClass.getAnnotation(a);
     }
-    return findAnnotation(annotation, annotationClass, testClass, null, m,
+    return findAnnotation(testClass, annotation, annotationClass, null, null, m,
         new Pair<>(annotation, m));
   }
 
@@ -175,7 +175,7 @@
           + annotationClass + "' not found.");
     }
     Annotation annotation = findAnnotationInSuperClasses(cls, a);
-    return findAnnotation(annotation, annotationClass, cls, null, null,
+    return findAnnotation(cls, annotation, annotationClass, cls, null, null,
         new Pair<>(annotation, annotationClass));
   }
 
@@ -187,18 +187,18 @@
           + annotationClass + "' not found.");
     }
     Annotation annotation = cons.getAnnotation(a);
-    return findAnnotation(annotation, annotationClass, cons.getDeclaringClass(), cons, null,
+    return findAnnotation(cons.getDeclaringClass(), annotation, annotationClass, null, cons, null,
         new Pair<>(annotation, cons));
   }
 
   private Map<Pair<Annotation, ?>, IAnnotation> m_annotations = Maps.newHashMap();
 
-  private <A extends IAnnotation> A findAnnotation(Annotation a,
+  private <A extends IAnnotation> A findAnnotation(Class cls, Annotation a,
       Class<A> annotationClass, Class<?> testClass,
       Constructor<?> testConstructor, Method testMethod, Pair<Annotation, ?> p) {
     IAnnotation result = m_annotations.get(p);
     if (result == null) {
-      result = m_tagFactory.createTag(testClass, a, annotationClass, m_transformer);
+      result = m_tagFactory.createTag(cls, a, annotationClass, m_transformer);
       m_annotations.put(p, result);
       transform(result, testClass, testConstructor, testMethod);
     }
