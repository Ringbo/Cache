diff --git a/spring-core/src/main/java/org/springframework/util/ConcurrentReferenceHashMap.java b/spring-core/src/main/java/org/springframework/util/ConcurrentReferenceHashMap.java
index d0fdd19..e0b7e02 100644
--- a/spring-core/src/main/java/org/springframework/util/ConcurrentReferenceHashMap.java
+++ b/spring-core/src/main/java/org/springframework/util/ConcurrentReferenceHashMap.java
@@ -387,7 +387,7 @@
 	protected static int calculateShift(int minimumValue, int maximumValue) {
 		int shift = 0;
 		int value = 1;
-		while (value < minimumValue && value < minimumValue) {
+		while (value < minimumValue && value < maximumValue) {
 			value <<= 1;
 			shift++;
 		}
