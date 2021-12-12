diff --git a/contrib/storage-hive/core/src/main/java/org/apache/drill/exec/store/hive/HiveRecordReader.java b/contrib/storage-hive/core/src/main/java/org/apache/drill/exec/store/hive/HiveRecordReader.java
index 69c50ea..8c400ea 100644
--- a/contrib/storage-hive/core/src/main/java/org/apache/drill/exec/store/hive/HiveRecordReader.java
+++ b/contrib/storage-hive/core/src/main/java/org/apache/drill/exec/store/hive/HiveRecordReader.java
@@ -541,7 +541,7 @@
       Decimal9Holder holder = new Decimal9Holder();
       holder.scale = scale;
       holder.precision = precision;
-      holder.value = DecimalUtility.getDecimal9FromBigDecimal(bigDecimal, precision, scale);
+      holder.value = DecimalUtility.getDecimal9FromBigDecimal(bigDecimal, scale, precision);
       Decimal9Vector v = (Decimal9Vector) vector;
       for (int j = 0; j < recordCount; j++) {
         v.getMutator().setSafe(j, holder);
@@ -550,7 +550,7 @@
       Decimal18Holder holder = new Decimal18Holder();
       holder.scale = scale;
       holder.precision = precision;
-      holder.value = DecimalUtility.getDecimal18FromBigDecimal(bigDecimal, precision, scale);
+      holder.value = DecimalUtility.getDecimal18FromBigDecimal(bigDecimal, scale, precision);
       Decimal18Vector v = (Decimal18Vector) vector;
       for (int j = 0; j < recordCount; j++) {
         v.getMutator().setSafe(j, holder);
