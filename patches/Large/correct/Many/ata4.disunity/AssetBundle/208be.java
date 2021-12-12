diff --git a/src/info/ata4/unity/asset/AssetBundle.java b/src/info/ata4/unity/asset/AssetBundle.java
index 357c056..fb70d05 100644
--- a/src/info/ata4/unity/asset/AssetBundle.java
+++ b/src/info/ata4/unity/asset/AssetBundle.java
@@ -68,7 +68,7 @@
         this.bb = bb;
         DataInputReader in = new DataInputReader(new ByteBufferInput(bb));
 
-        String header = in.readStringNull(8);
+        String header = in.readStringFixed(8);
         switch (header) {
             case SIGNATURE_RAW:
                 compressed = false;
