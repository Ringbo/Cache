diff --git a/core/java/android/util/proto/ProtoOutputStream.java b/core/java/android/util/proto/ProtoOutputStream.java
index adf4938..480abc1 100644
--- a/core/java/android/util/proto/ProtoOutputStream.java
+++ b/core/java/android/util/proto/ProtoOutputStream.java
@@ -1593,7 +1593,7 @@
         assertNotCompacted();
         final int id = checkFieldId(fieldId, FIELD_COUNT_REPEATED | FIELD_TYPE_FIXED64);
 
-        writeRepeatedFixed64(id, val);
+        writeRepeatedFixed64Impl(id, val);
     }
 
     private void writeRepeatedFixed64Impl(int id, long val) {
@@ -1720,7 +1720,7 @@
         assertNotCompacted();
         final int id = checkFieldId(fieldId, FIELD_COUNT_REPEATED | FIELD_TYPE_SFIXED64);
 
-        writeRepeatedSFixed64(id, val);
+        writeRepeatedSFixed64Impl(id, val);
     }
 
     private void writeRepeatedSFixed64Impl(int id, long val) {
@@ -1785,7 +1785,7 @@
         assertNotCompacted();
         final int id = checkFieldId(fieldId, FIELD_COUNT_REPEATED | FIELD_TYPE_BOOL);
 
-        writeRepeatedBool(id, val);
+        writeRepeatedBoolImpl(id, val);
     }
 
     private void writeRepeatedBoolImpl(int id, boolean val) {
