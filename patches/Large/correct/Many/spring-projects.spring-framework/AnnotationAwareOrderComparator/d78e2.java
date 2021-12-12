diff --git a/spring-core/src/main/java/org/springframework/core/annotation/AnnotationAwareOrderComparator.java b/spring-core/src/main/java/org/springframework/core/annotation/AnnotationAwareOrderComparator.java
index ec4471b..ca496f8 100644
--- a/spring-core/src/main/java/org/springframework/core/annotation/AnnotationAwareOrderComparator.java
+++ b/spring-core/src/main/java/org/springframework/core/annotation/AnnotationAwareOrderComparator.java
@@ -107,7 +107,7 @@
 		}
 		Integer priority = OrderUtils.getPriority(obj.getClass());
 		if (priority == null && obj instanceof DecoratingProxy) {
-			priority = OrderUtils.getOrder(((DecoratingProxy) obj).getDecoratedClass());
+			priority = OrderUtils.getPriority(((DecoratingProxy) obj).getDecoratedClass());
 		}
 		return priority;
 	}
