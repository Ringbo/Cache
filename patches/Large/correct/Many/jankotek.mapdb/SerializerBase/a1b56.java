diff --git a/src/main/java/net/kotek/jdbm/SerializerBase.java b/src/main/java/net/kotek/jdbm/SerializerBase.java
index 26cd7c8..78e7ab2 100644
--- a/src/main/java/net/kotek/jdbm/SerializerBase.java
+++ b/src/main/java/net/kotek/jdbm/SerializerBase.java
@@ -193,7 +193,7 @@
             else if (val == 1)
                 out.write(BYTE_1);
             else {
-                out.write(SHORT_FULL);
+                out.write(BYTE_FULL);
                 out.writeByte(val);
             }
             return;
