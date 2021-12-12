diff --git a/portal-service/src/com/liferay/portal/kernel/util/ArrayUtil.java b/portal-service/src/com/liferay/portal/kernel/util/ArrayUtil.java
index b6b74a5..06f31e2 100644
--- a/portal-service/src/com/liferay/portal/kernel/util/ArrayUtil.java
+++ b/portal-service/src/com/liferay/portal/kernel/util/ArrayUtil.java
@@ -1646,14 +1646,14 @@
 		return aArray;
 	}
 
-	public static double[] toDoubleArray(Collection<Double> collection) {
+	public static double[] toDoubleArray(Collection<? extends Number> collection) {
 		double[] newArray = new double[collection.size()];
 
 		if (collection instanceof List) {
-			List<Double> list = (List<Double>)collection;
+			List<Number> list = (List<Number>)collection;
 
 			for (int i = 0; i < list.size(); i++) {
-				Double value = list.get(i);
+				Number value = list.get(i);
 
 				newArray[i] = value.doubleValue();
 			}
@@ -1661,10 +1661,10 @@
 		else {
 			int i = 0;
 
-			Iterator<Double> iterator = collection.iterator();
+			Iterator<? extends Number> iterator = collection.iterator();
 
 			while (iterator.hasNext()) {
-				Double value = iterator.next();
+				Number value = iterator.next();
 
 				newArray[i++] = value.doubleValue();
 			}
@@ -1673,14 +1673,14 @@
 		return newArray;
 	}
 
-	public static float[] toFloatArray(Collection<Float> collection) {
+	public static float[] toFloatArray(Collection<? extends Number> collection) {
 		float[] newArray = new float[collection.size()];
 
 		if (collection instanceof List) {
-			List<Float> list = (List<Float>)collection;
+			List<Number> list = (List<Number>)collection;
 
 			for (int i = 0; i < list.size(); i++) {
-				Float value = list.get(i);
+				Number value = list.get(i);
 
 				newArray[i] = value.floatValue();
 			}
@@ -1688,10 +1688,10 @@
 		else {
 			int i = 0;
 
-			Iterator<Float> iterator = collection.iterator();
+			Iterator<? extends Number> iterator = collection.iterator();
 
 			while (iterator.hasNext()) {
-				Float value = iterator.next();
+				Number value = iterator.next();
 
 				newArray[i++] = value.floatValue();
 			}
@@ -1700,14 +1700,14 @@
 		return newArray;
 	}
 
-	public static int[] toIntArray(Collection<Integer> collection) {
+	public static int[] toIntArray(Collection<? extends Number> collection) {
 		int[] newArray = new int[collection.size()];
 
 		if (collection instanceof List) {
-			List<Integer> list = (List<Integer>)collection;
+			List<Number> list = (List<Number>)collection;
 
 			for (int i = 0; i < list.size(); i++) {
-				Integer value = list.get(i);
+				Number value = list.get(i);
 
 				newArray[i] = value.intValue();
 			}
@@ -1715,10 +1715,10 @@
 		else {
 			int i = 0;
 
-			Iterator<Integer> iterator = collection.iterator();
+			Iterator<? extends Number> iterator = collection.iterator();
 
 			while (iterator.hasNext()) {
-				Integer value = iterator.next();
+				Number value = iterator.next();
 
 				newArray[i++] = value.intValue();
 			}
@@ -1727,14 +1727,14 @@
 		return newArray;
 	}
 
-	public static long[] toLongArray(Collection<Long> collection) {
+	public static long[] toLongArray(Collection<? extends Number> collection) {
 		long[] newArray = new long[collection.size()];
 
 		if (collection instanceof List) {
-			List<Long> list = (List<Long>)collection;
+			List<Number> list = (List<Number>)collection;
 
 			for (int i = 0; i < list.size(); i++) {
-				Long value = list.get(i);
+				Number value = list.get(i);
 
 				newArray[i] = value.longValue();
 			}
@@ -1742,10 +1742,10 @@
 		else {
 			int i = 0;
 
-			Iterator<Long> iterator = collection.iterator();
+			Iterator<? extends Number> iterator = collection.iterator();
 
 			while (iterator.hasNext()) {
-				Long value = iterator.next();
+				Number value = iterator.next();
 
 				newArray[i++] = value.longValue();
 			}
