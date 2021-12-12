diff --git a/realm-annotations-processor/src/test/resources/io/realm/AllTypesRealmProxy.java b/realm-annotations-processor/src/test/resources/io/realm/AllTypesRealmProxy.java
index 94d0838..2e2a2da 100644
--- a/realm-annotations-processor/src/test/resources/io/realm/AllTypesRealmProxy.java
+++ b/realm-annotations-processor/src/test/resources/io/realm/AllTypesRealmProxy.java
@@ -31,85 +31,85 @@
 
     @Override
     public String getColumnString() {
-        realm.assertThread();
+        realm.checkIfValid();
         return (java.lang.String) row.getString(Realm.columnIndices.get("AllTypes").get("columnString"));
     }
 
     @Override
     public void setColumnString(String value) {
-        realm.assertThread();
+        realm.checkIfValid();
         row.setString(Realm.columnIndices.get("AllTypes").get("columnString"), (String) value);
     }
 
     @Override
     public long getColumnLong() {
-        realm.assertThread();
+        realm.checkIfValid();
         return (long) row.getLong(Realm.columnIndices.get("AllTypes").get("columnLong"));
     }
 
     @Override
     public void setColumnLong(long value) {
-        realm.assertThread();
+        realm.checkIfValid();
         row.setLong(Realm.columnIndices.get("AllTypes").get("columnLong"), (long) value);
     }
 
     @Override
     public float getColumnFloat() {
-        realm.assertThread();
+        realm.checkIfValid();
         return (float) row.getFloat(Realm.columnIndices.get("AllTypes").get("columnFloat"));
     }
 
     @Override
     public void setColumnFloat(float value) {
-        realm.assertThread();
+        realm.checkIfValid();
         row.setFloat(Realm.columnIndices.get("AllTypes").get("columnFloat"), (float) value);
     }
 
     @Override
     public double getColumnDouble() {
-        realm.assertThread();
+        realm.checkIfValid();
         return (double) row.getDouble(Realm.columnIndices.get("AllTypes").get("columnDouble"));
     }
 
     @Override
     public void setColumnDouble(double value) {
-        realm.assertThread();
+        realm.checkIfValid();
         row.setDouble(Realm.columnIndices.get("AllTypes").get("columnDouble"), (double) value);
     }
 
     @Override
     public boolean isColumnBoolean() {
-        realm.assertThread();
+        realm.checkIfValid();
         return (boolean) row.getBoolean(Realm.columnIndices.get("AllTypes").get("columnBoolean"));
     }
 
     @Override
     public void setColumnBoolean(boolean value) {
-        realm.assertThread();
+        realm.checkIfValid();
         row.setBoolean(Realm.columnIndices.get("AllTypes").get("columnBoolean"), (boolean) value);
     }
 
     @Override
     public java.util.Date getColumnDate() {
-        realm.assertThread();
+        realm.checkIfValid();
         return (java.util.Date) row.getDate(Realm.columnIndices.get("AllTypes").get("columnDate"));
     }
 
     @Override
     public void setColumnDate(java.util.Date value) {
-        realm.assertThread();
+        realm.checkIfValid();
         row.setDate(Realm.columnIndices.get("AllTypes").get("columnDate"), (Date) value);
     }
 
     @Override
     public byte[] getColumnBinary() {
-        realm.assertThread();
+        realm.checkIfValid();
         return (byte[]) row.getBinaryByteArray(Realm.columnIndices.get("AllTypes").get("columnBinary"));
     }
 
     @Override
     public void setColumnBinary(byte[] value) {
-        realm.assertThread();
+        realm.checkIfValid();
         row.setBinaryByteArray(Realm.columnIndices.get("AllTypes").get("columnBinary"), (byte[]) value);
     }
 
