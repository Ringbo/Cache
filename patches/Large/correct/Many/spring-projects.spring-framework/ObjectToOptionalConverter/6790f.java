diff --git a/spring-core/src/main/java/org/springframework/core/convert/support/ObjectToOptionalConverter.java b/spring-core/src/main/java/org/springframework/core/convert/support/ObjectToOptionalConverter.java
index 67d2ce1..824a691 100644
--- a/spring-core/src/main/java/org/springframework/core/convert/support/ObjectToOptionalConverter.java
+++ b/spring-core/src/main/java/org/springframework/core/convert/support/ObjectToOptionalConverter.java
@@ -69,7 +69,7 @@
 		}
 		else {
 			Object target = this.conversionService.convert(source, sourceType, new GenericTypeDescriptor(targetType));
-			return Optional.of(target);
+			return Optional.ofNullable(target);
 		}
 	}
 
