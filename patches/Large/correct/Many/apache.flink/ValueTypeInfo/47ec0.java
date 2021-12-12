diff --git a/flink-java/src/main/java/org/apache/flink/api/java/typeutils/ValueTypeInfo.java b/flink-java/src/main/java/org/apache/flink/api/java/typeutils/ValueTypeInfo.java
index b3c25e4..2e40ff9 100644
--- a/flink-java/src/main/java/org/apache/flink/api/java/typeutils/ValueTypeInfo.java
+++ b/flink-java/src/main/java/org/apache/flink/api/java/typeutils/ValueTypeInfo.java
@@ -96,10 +96,10 @@
 		}
 		
 		if (CopyableValue.class.isAssignableFrom(type)) {
-			return (TypeComparator<T>) new ValueComparator(sortOrderAscending, type);
+			return (TypeComparator<T>) new CopyableValueComparator(sortOrderAscending, type);
 		}
 		else {
-			return (TypeComparator<T>) new CopyableValueComparator(sortOrderAscending, type);
+			return (TypeComparator<T>) new ValueComparator(sortOrderAscending, type);
 		}
 	}
 	
