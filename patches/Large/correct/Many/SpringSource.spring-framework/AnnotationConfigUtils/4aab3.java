diff --git a/spring-context/src/main/java/org/springframework/context/annotation/AnnotationConfigUtils.java b/spring-context/src/main/java/org/springframework/context/annotation/AnnotationConfigUtils.java
index e36e5c8..ad0481d 100644
--- a/spring-context/src/main/java/org/springframework/context/annotation/AnnotationConfigUtils.java
+++ b/spring-context/src/main/java/org/springframework/context/annotation/AnnotationConfigUtils.java
@@ -260,7 +260,7 @@
 		}
 	}
 
-	static void processCommonDefinitionAnnotations(AnnotatedBeanDefinition abd) {
+	public static void processCommonDefinitionAnnotations(AnnotatedBeanDefinition abd) {
 		processCommonDefinitionAnnotations(abd, abd.getMetadata());
 	}
 
