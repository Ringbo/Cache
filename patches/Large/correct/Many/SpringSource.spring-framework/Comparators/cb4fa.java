diff --git a/spring-core/src/main/java/org/springframework/util/comparator/Comparators.java b/spring-core/src/main/java/org/springframework/util/comparator/Comparators.java
index 3429f06..70c1faa 100644
--- a/spring-core/src/main/java/org/springframework/util/comparator/Comparators.java
+++ b/spring-core/src/main/java/org/springframework/util/comparator/Comparators.java
@@ -52,7 +52,7 @@
 	 * @see NullSafeComparator#NullSafeComparator(boolean)
 	 */
 	public static <T> Comparator<T> nullsLow(Comparator<T> comparator) {
-		return new NullSafeComparator<>(comparator, false);
+		return new NullSafeComparator<>(comparator, true);
 	}
 
 	/**
