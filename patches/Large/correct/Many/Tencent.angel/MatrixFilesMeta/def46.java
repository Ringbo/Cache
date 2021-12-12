diff --git a/angel-ps/core/src/main/java/com/tencent/angel/model/output/format/MatrixFilesMeta.java b/angel-ps/core/src/main/java/com/tencent/angel/model/output/format/MatrixFilesMeta.java
index d32b3af..8baac5c 100644
--- a/angel-ps/core/src/main/java/com/tencent/angel/model/output/format/MatrixFilesMeta.java
+++ b/angel-ps/core/src/main/java/com/tencent/angel/model/output/format/MatrixFilesMeta.java
@@ -237,7 +237,7 @@
     try {
       int length = input.readInt();
       byte[] b = new byte[length];
-      input.read(b);
+      input.readFully(b);
       String js = new String(b, "utf-8");
       JSONObject jsonObject = new JSONObject(js);
       matrixId = jsonObject.getInt("matrixId");
