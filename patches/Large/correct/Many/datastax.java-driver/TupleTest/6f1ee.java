diff --git a/driver-core/src/test/java/com/datastax/driver/core/TupleTest.java b/driver-core/src/test/java/com/datastax/driver/core/TupleTest.java
index f5a6e6b..f04b832 100644
--- a/driver-core/src/test/java/com/datastax/driver/core/TupleTest.java
+++ b/driver-core/src/test/java/com/datastax/driver/core/TupleTest.java
@@ -315,7 +315,7 @@
             session.execute(String.format("CREATE TABLE mytable (k int PRIMARY KEY, %s)", Joiner.on(',').join(values)));
 
 
-            int i = 1;
+            int i = 0;
             // test tuple<list<datatype>>
             for (DataType datatype : DATA_TYPE_PRIMITIVES) {
                 // create tuple
@@ -344,7 +344,7 @@
                 ArrayList<DataType> dataTypes = new ArrayList<DataType>();
                 ArrayList<Object> createdValues = new ArrayList<Object>();
 
-                dataTypes.add(DataType.list(datatype));
+                dataTypes.add(DataType.set(datatype));
                 createdValues.add(new HashSet<Object>(Arrays.asList(SAMPLE_DATA.get(datatype))));
 
                 TupleType t = new TupleType(dataTypes);
@@ -369,7 +369,7 @@
                 HashMap<Object, Object> hm = new HashMap<Object, Object>();
                 hm.put(SAMPLE_DATA.get(datatype), SAMPLE_DATA.get(datatype));
 
-                dataTypes.add(DataType.list(datatype));
+                dataTypes.add(DataType.map(datatype, datatype));
                 createdValues.add(hm);
 
                 TupleType t = new TupleType(dataTypes);
