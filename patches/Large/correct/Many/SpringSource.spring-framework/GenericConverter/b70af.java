diff --git a/spring-core/src/main/java/org/springframework/core/convert/converter/GenericConverter.java b/spring-core/src/main/java/org/springframework/core/convert/converter/GenericConverter.java
index 11bc294..09d3b10 100644
--- a/spring-core/src/main/java/org/springframework/core/convert/converter/GenericConverter.java
+++ b/spring-core/src/main/java/org/springframework/core/convert/converter/GenericConverter.java
@@ -67,7 +67,7 @@
 	/**
 	 * Holder for a source-to-target class pair.
 	 */
-	public static final class ConvertiblePair {
+	final class ConvertiblePair {
 
 		private final Class<?> sourceType;
 
@@ -102,7 +102,7 @@
 				return false;
 			}
 			ConvertiblePair otherPair = (ConvertiblePair) other;
-			return (this.sourceType.equals(otherPair.sourceType) && this.targetType.equals(otherPair.targetType));
+			return (this.sourceType == otherPair.sourceType && this.targetType == otherPair.targetType);
 		}
 
 		@Override
