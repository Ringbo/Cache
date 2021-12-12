diff --git a/brut.apktool/apktool-lib/src/main/java/brut/androlib/res/data/value/ResArrayValue.java b/brut.apktool/apktool-lib/src/main/java/brut/androlib/res/data/value/ResArrayValue.java
index 749cc05..e5033be 100644
--- a/brut.apktool/apktool-lib/src/main/java/brut/androlib/res/data/value/ResArrayValue.java
+++ b/brut.apktool/apktool-lib/src/main/java/brut/androlib/res/data/value/ResArrayValue.java
@@ -66,8 +66,7 @@
             return null;
         }
         String type = mItems[0].getType();
-        for (int i = 1; i < mItems.length; i++) {
-
+        for (int i = 0; i < mItems.length; i++) {
             if (mItems[i].encodeAsResXmlItemValue().startsWith("@string")) {
                 return "string";
             } else if (mItems[i].encodeAsResXmlItemValue().startsWith("@drawable")) {
