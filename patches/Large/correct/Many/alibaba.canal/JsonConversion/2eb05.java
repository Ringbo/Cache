diff --git a/dbsync/src/main/java/com/taobao/tddl/dbsync/binlog/JsonConversion.java b/dbsync/src/main/java/com/taobao/tddl/dbsync/binlog/JsonConversion.java
index b4b1ad7..251e458 100644
--- a/dbsync/src/main/java/com/taobao/tddl/dbsync/binlog/JsonConversion.java
+++ b/dbsync/src/main/java/com/taobao/tddl/dbsync/binlog/JsonConversion.java
@@ -52,23 +52,24 @@
     public static final int  VALUE_ENTRY_SIZE_SMALL  = (1 + SMALL_OFFSET_SIZE);
     public static final int  VALUE_ENTRY_SIZE_LARGE  = (1 + LARGE_OFFSET_SIZE);
 
-    public static Json_Value parse_value(int type, LogBuffer buffer, long len) {
+    public static Json_Value parse_value(int type, LogBuffer buffer, long len, String charsetName) {
         buffer = buffer.duplicate(buffer.position(), (int) len);
         switch (type) {
             case JSONB_TYPE_SMALL_OBJECT:
-                return parse_array_or_object(Json_enum_type.OBJECT, buffer, len, false);
+                return parse_array_or_object(Json_enum_type.OBJECT, buffer, len, false, charsetName);
             case JSONB_TYPE_LARGE_OBJECT:
-                return parse_array_or_object(Json_enum_type.OBJECT, buffer, len, true);
+                return parse_array_or_object(Json_enum_type.OBJECT, buffer, len, true, charsetName);
             case JSONB_TYPE_SMALL_ARRAY:
-                return parse_array_or_object(Json_enum_type.ARRAY, buffer, len, false);
+                return parse_array_or_object(Json_enum_type.ARRAY, buffer, len, false, charsetName);
             case JSONB_TYPE_LARGE_ARRAY:
-                return parse_array_or_object(Json_enum_type.ARRAY, buffer, len, true);
+                return parse_array_or_object(Json_enum_type.ARRAY, buffer, len, true, charsetName);
             default:
-                return parse_scalar(type, buffer, len);
+                return parse_scalar(type, buffer, len, charsetName);
         }
     }
 
-    private static Json_Value parse_array_or_object(Json_enum_type type, LogBuffer buffer, long len, boolean large) {
+    private static Json_Value parse_array_or_object(Json_enum_type type, LogBuffer buffer, long len, boolean large,
+                                                    String charsetName) {
         long offset_size = large ? LARGE_OFFSET_SIZE : SMALL_OFFSET_SIZE;
         if (len < 2 * offset_size) {
             throw new IllegalArgumentException("illegal json data");
@@ -95,7 +96,7 @@
         return large ? buffer.getUint32() : buffer.getUint16();
     }
 
-    private static Json_Value parse_scalar(int type, LogBuffer buffer, long len) {
+    private static Json_Value parse_scalar(int type, LogBuffer buffer, long len, String charsetName) {
         switch (type) {
             case JSONB_TYPE_LITERAL:
                 /* purecov: inspected */
@@ -146,12 +147,12 @@
                     }
                 }
 
-                if (str_len == 0 || len < n + str_len) {
+                if (len < n + str_len) {
                     throw new IllegalArgumentException("illegal json data");
                 }
                 return new Json_Value(Json_enum_type.STRING, buffer.rewind()
                     .forward((int) n)
-                    .getFixString((int) str_len));
+                    .getFixString((int) str_len, charsetName));
             case JSONB_TYPE_OPAQUE:
                 /*
                  * There should always be at least one byte, which tells the
@@ -237,7 +238,7 @@
             this.m_large = large;
         }
 
-        public String key(int i) {
+        public String key(int i, String charsetName) {
             m_data.rewind();
             int offset_size = m_large ? LARGE_OFFSET_SIZE : SMALL_OFFSET_SIZE;
             int key_entry_size = m_large ? KEY_ENTRY_SIZE_LARGE : KEY_ENTRY_SIZE_SMALL;
@@ -250,10 +251,10 @@
             // entry, always two
             // bytes.
             long key_length = m_data.getUint16();
-            return m_data.rewind().forward((int) key_offset).getFixString((int) key_length);
+            return m_data.rewind().forward((int) key_offset).getFixString((int) key_length, charsetName);
         }
 
-        public Json_Value element(int i) {
+        public Json_Value element(int i, String charsetName) {
             m_data.rewind();
             int offset_size = m_large ? LARGE_OFFSET_SIZE : SMALL_OFFSET_SIZE;
             int key_entry_size = m_large ? KEY_ENTRY_SIZE_LARGE : KEY_ENTRY_SIZE_SMALL;
@@ -266,13 +267,13 @@
             int type = m_data.forward(entry_offset).getUint8();
             if (type == JSONB_TYPE_INT16 || type == JSONB_TYPE_UINT16 || type == JSONB_TYPE_LITERAL
                 || (m_large && (type == JSONB_TYPE_INT32 || type == JSONB_TYPE_UINT32))) {
-                return parse_scalar(type, m_data, value_entry_size - 1);
+                return parse_scalar(type, m_data, value_entry_size - 1, charsetName);
             }
             int value_offset = (int) read_offset_or_size(m_data, m_large);
-            return parse_value(type, m_data.rewind().forward(value_offset), (int) m_length - value_offset);
+            return parse_value(type, m_data.rewind().forward(value_offset), (int) m_length - value_offset, charsetName);
         }
 
-        public StringBuilder toJsonString(StringBuilder buf) {
+        public StringBuilder toJsonString(StringBuilder buf, String charsetName) {
             switch (m_type) {
                 case OBJECT:
                     buf.append("{");
@@ -280,9 +281,9 @@
                         if (i > 0) {
                             buf.append(", ");
                         }
-                        buf.append('"').append(key(i)).append('"');
+                        buf.append('"').append(key(i, charsetName)).append('"');
                         buf.append(": ");
-                        element(i).toJsonString(buf);
+                        element(i, charsetName).toJsonString(buf, charsetName);
                     }
                     buf.append("}");
                     break;
@@ -292,7 +293,7 @@
                         if (i > 0) {
                             buf.append(", ");
                         }
-                        element(i).toJsonString(buf);
+                        element(i, charsetName).toJsonString(buf, charsetName);
                     }
                     buf.append("]");
                     break;
@@ -361,7 +362,7 @@
                         }
                         buf.append('"').append(text).append('"');
                     } else {
-                        text = m_data.getFixString((int) m_length);
+                        text = m_data.getFixString((int) m_length, charsetName);
                         buf.append('"').append(text).append('"');
                     }
 
